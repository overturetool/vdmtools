package jp.co.csk.vdm.toolbox.api.corba.VDM;


/**
* jp/co/csk/vdm/toolbox/api/corba/VDM/VDMTupleOperations.java .
* IDL-to-Java �R���p�C�� (�|�[�^�u��), �o�[�W���� "3.1" �Ő���
* ������: metaiv_idl.idl
* 2008�N4��21�� 15��58��01�b JST
*/

public interface VDMTupleOperations  extends jp.co.csk.vdm.toolbox.api.corba.VDM.VDMGenericOperations
{
  void SetField (int i, jp.co.csk.vdm.toolbox.api.corba.VDM.VDMGeneric g) throws jp.co.csk.vdm.toolbox.api.corba.VDM.VDMError;
  jp.co.csk.vdm.toolbox.api.corba.VDM.VDMGeneric GetField (int i) throws jp.co.csk.vdm.toolbox.api.corba.VDM.VDMError;
  int Length ();
} // interface VDMTupleOperations
