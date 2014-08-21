package jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI;


/**
* jp/co/csk/vdm/toolbox/api/corba/ToolboxAPI/VDMTypeCheckerOperations.java .
* IDL-to-Java �R���p�C�� (�|�[�^�u��), �o�[�W���� "3.1" �Ő���
* ������: corba_api.idl
* 2009�N3��16�� 10��22��53�b JST
*/

public interface VDMTypeCheckerOperations 
{
  boolean DefTypeCheck ();
  void DefTypeCheck (boolean newDefTypeCheck);

  // false the specification will be 'pos' type checked.
  boolean ExtendedTypeCheck ();

  // false the specification will be 'pos' type checked.
  void ExtendedTypeCheck (boolean newExtendedTypeCheck);

  // Default value = false;
  boolean TypeCheck (String name) throws jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.APIError;

  // type check succeeded.
  boolean TypeCheckList (String[] names) throws jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.APIError;
} // interface VDMTypeCheckerOperations
