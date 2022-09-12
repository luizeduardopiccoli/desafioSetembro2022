//package br.com.bean;
//
//import br.com.dominio.Agendamento;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.log4j.Logger;
//import org.ecjfh.dao.AgendamentoDAO;
//import org.ecjfh.model.Agendamento;
//import org.ecjfh.model.Matriz;
//
//public class AgendamentoManagedBean implements java.io.Serializable{
//
//       private static Logger log = Logger.getLogger(AgendamentoManagedBean.class);
//
//       private static final long serialVersionUID = 1L;
//
//       private String selectedId;
//
//       private Agendamento Agendamento;
//       private List<Agendamento> Agendamentos;
//       private List<Matriz> matrizes;
//
//       public Agendamento getAgendamento() {
//             return Agendamento;
//       }
//
//       public void setAgendamento(Agendamento Agendamento) {
//             this.Agendamento = Agendamento;
//       }
//
//
//       public List<Agendamento> getAgendamentos() {
//             return Agendamentos;
//       }
//
//       public void setAgendamentos(List<Agendamento> Agendamentos) {
//             this.Agendamentos = Agendamentos;
//       }
//
//       public List<Matriz> getMatrizes() {
//             return matrizes;
//       }
//
//       public void setMatrizes(List<Matriz> matrizes) {
//             this.matrizes = matrizes;
//       }
//
//    private String getSelectedId() {
//
//       return selectedId;
//
//       }
//
//       private void setMsg(String message) {
//             // TODO Auto-generated method stub
//
//       }
//
//       public void limparAgendamento() {
//
//       log.info("Limpando Agendamento");
//
//       this.Agendamento.setId("");
//       this.Agendamento.setNomeMedico("");
//       this.Agendamento.setEspecialidade("");
//       this.Agendamento.setDia("");
//       this.Agendamento.setHorario("");
//       this.Agendamento.setNomePaciente("");
//       this.Agendamento.setTelefone("");
//       this.Agendamento.setObservacoes(null);
//       
//
//       
//    }
//
//    public String editAgendamento() {
//       log.info("Editando Agendamento "+this.getSelectedCNPJ());
//
//             AgendamentoDAO AgendamentoDAO = new AgendamentoDAO();
//             Agendamento Agendamento = AgendamentoDAO.getAgendamento(this.getSelectedCNPJ());
//
//       if(Agendamento!=null){
//             this.Agendamento.setId(Agendamento.getId());
//             this.Agendamento.setNomeMedico(Agendamento.getNomeMedico());
//             this.Agendamento.setEspecialidade(Agendamento.getEspecialidade());
//             this.Agendamento.setDia(Agendamento.getDia());
//             this.Agendamento.setHorario(Agendamento.getHorario());
//             this.Agendamento.setNomePaciente(Agendamento.getNomePaciente());
//             this.Agendamento.setTelefone(Agendamento.getTelefone());
//             this.Agendamento.setObservacoes(Agendamento.getObservacoes());
//
//       }else{
//             this.setMsg("Agendamento nao encontrado!");
//             log.error("Agendamento nao encontrado!");
//       }
//
//
//       return "update";
//    }
//
//    public String createAgendamento() {
//
//       String str = "index";
//
//       try{
//
//             AgendamentoDAO AgendamentoDAO = new AgendamentoDAO();
//             AgendamentoDAO.createAgendamento(this.Agendamento);
//
//             limparAgendamento();
//             this.setMsg("Agendamento cadastrado!");
//       }catch(Exception e){
//             this.setMsg(e.getMessage());
//             str = "insert";
//             log.error(e);
//       }
//
//       return str;
//    }
//
//       public String deleteAgendamento(){
//
//       log.info("Excluindo Agendamento "+this.getSelectedCNPJ());
//
//       String str = "index";
//
//       try{
//             AgendamentoDAO AgendamentoDAO = new AgendamentoDAO();
//             AgendamentoDAO.deleteAgendamento(this.getSelectedCNPJ());
//
//             limparAgendamento();
//             this.setMsg("Excluído com sucesso!");
//
//       }catch(Exception e){
//             this.setMsg(e.getMessage());
//             log.error(e);
//       }
//
//       return str;
//       }
//
//       public List<AgendamentoManagedBean> getListaMatrizes(){
//
//       log.info("Listando matrizes");
//
//             List<AgendamentoManagedBean> Agendamentos =
//              new ArrayList<AgendamentoManagedBean>();
//
//       try{
//             AgendamentoDAO AgendamentoDAO = new AgendamentoDAO();
//
//             for(Matriz matriz:AgendamentoDAO.listMatrizes()){
//                    AgendamentoManagedBean bean = new AgendamentoManagedBean();
//                    bean.setAgendamento(matriz);
//
//                    Agendamentos.add(bean);
//             }
//
//       }catch(Exception e){
//             this.setMsg(e.getMessage());
//             log.error(e);
//       }
//
//             return Agendamentos;
//       }
//
//       public List<AgendamentoManagedBean> getListaAgendamentos(){
//
//             limparAgendamento();
//
//       log.info("Listando Agendamento");
//
//             List<AgendamentoManagedBean> Agendamentos =
//               new ArrayList<AgendamentoManagedBean>();
//
//       try{
//             AgendamentoDAO AgendamentoDAO = new AgendamentoDAO();
//
//             for(Agendamento Agendamento:AgendamentoDAO.listAgendamentos()){
//
//                    AgendamentoManagedBean bean = new AgendamentoManagedBean();
//                    bean.setAgendamento(Agendamento);
//
//                    Agendamentos.add(bean);
//             }
//
//       }catch(Exception e){
//             this.setMsg(e.getMessage());
//             log.error(e);
//       }
//
//             return Agendamentos;
//       }
//
//       public String updateAgendamento(){
//       String str = "index";
//       try{
//             AgendamentoDAO AgendamentoDAO = new AgendamentoDAO();
//             AgendamentoDAO.updateAgendamento(this.Agendamento);
//
//             limparAgendamento();
//
//             this.setMsg("Atualizado com sucesso!");
//       }catch(Exception e){
//             this.setMsg(e.getMessage());
//             str = "deleteUpdate";
//             log.error(e);
//       }
//
//       return str;
//       }
//}