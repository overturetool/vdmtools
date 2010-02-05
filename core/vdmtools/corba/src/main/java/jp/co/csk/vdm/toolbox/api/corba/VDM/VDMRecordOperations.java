package jp.co.csk.vdm.toolbox.api.corba.VDM;


/**
* jp/co/csk/vdm/toolbox/api/corba/VDM/VDMRecordOperations.java .
* IDL-to-Java �R���p�C�� (�|�[�^�u��), �o�[�W���� "3.1" �Ő���
* ������: metaiv_idl.idl
* 2009�N3��16�� 10��22��52�b JST
*/

public interface VDMRecordOperations  extends jp.co.csk.vdm.toolbox.api.corba.VDM.VDMGenericOperations
{
  void SetField (int i, jp.co.csk.vdm.toolbox.api.corba.VDM.VDMGeneric g) throws jp.co.csk.vdm.toolbox.api.corba.VDM.VDMError;
  jp.co.csk.vdm.toolbox.api.corba.VDM.VDMGeneric GetField (int i) throws jp.co.csk.vdm.toolbox.api.corba.VDM.VDMError;
  String GetTag () throws jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.APIError;
  boolean Is (String tag);
  int Length ();
} // interface VDMRecordOperations
