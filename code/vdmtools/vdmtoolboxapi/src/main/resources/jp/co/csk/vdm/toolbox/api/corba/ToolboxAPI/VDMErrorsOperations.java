package jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI;


/**
* jp/co/csk/vdm/toolbox/api/corba/ToolboxAPI/VDMErrorsOperations.java .
* IDL-to-Java �R���p�C�� (�|�[�^�u��), �o�[�W���� "3.1" �Ő���
* ������: corba_api.idl
* 2008�N4��21�� 15��58��02�b JST
*/

public interface VDMErrorsOperations 
{
  short NumErr ();
  short NumWarn ();

  // action.
  short GetErrors (jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.ErrorListHolder err);
  short GetWarnings (jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.ErrorListHolder err);
} // interface VDMErrorsOperations
