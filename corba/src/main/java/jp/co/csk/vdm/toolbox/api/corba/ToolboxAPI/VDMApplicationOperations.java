package jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI;


/**
* jp/co/csk/vdm/toolbox/api/corba/ToolboxAPI/VDMApplicationOperations.java .
* IDL-to-Java �R���p�C�� (�|�[�^�u��), �o�[�W���� "3.1" �Ő���
* ������: corba_api.idl
* 2009�N3��16�� 10��22��53�b JST
*/

public interface VDMApplicationOperations 
{
  jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.ToolType Tool ();

  // VDM-SL Toolbox or the VDM++ Toolbox.
  short Register ();

  // any calls towards the server.
  void Unregister (short id);

  // the server to free any resources associated with the client.
  jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMProject GetProject ();
  jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMInterpreter GetInterpreter ();
  jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMCodeGenerator GetCodeGenerator ();
  jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMParser GetParser ();
  jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMTypeChecker GetTypeChecker ();
  jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMPrettyPrinter GetPrettyPrinter ();
  jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMErrors GetErrorHandler ();
  jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMModuleRepos GetModuleRepos ();
  jp.co.csk.vdm.toolbox.api.corba.VDM.VDMFactory GetVDMFactory ();
  void PushTag (short id);
  void DestroyTag (short id) throws jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.APIError;
} // interface VDMApplicationOperations
