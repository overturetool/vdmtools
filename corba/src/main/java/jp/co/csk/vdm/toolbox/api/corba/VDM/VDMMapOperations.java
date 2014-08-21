package jp.co.csk.vdm.toolbox.api.corba.VDM;


/**
* jp/co/csk/vdm/toolbox/api/corba/VDM/VDMMapOperations.java .
* IDL-to-Java �R���p�C�� (�|�[�^�u��), �o�[�W���� "3.1" �Ő���
* ������: metaiv_idl.idl
* 2009�N3��16�� 10��22��52�b JST
*/

public interface VDMMapOperations  extends jp.co.csk.vdm.toolbox.api.corba.VDM.VDMGenericOperations
{
  void Insert (jp.co.csk.vdm.toolbox.api.corba.VDM.VDMGeneric key, jp.co.csk.vdm.toolbox.api.corba.VDM.VDMGeneric val) throws jp.co.csk.vdm.toolbox.api.corba.VDM.VDMError;
  void ImpModify (jp.co.csk.vdm.toolbox.api.corba.VDM.VDMGeneric key, jp.co.csk.vdm.toolbox.api.corba.VDM.VDMGeneric val);
  jp.co.csk.vdm.toolbox.api.corba.VDM.VDMGeneric Apply (jp.co.csk.vdm.toolbox.api.corba.VDM.VDMGeneric key) throws jp.co.csk.vdm.toolbox.api.corba.VDM.VDMError;
  void ImpOverride (jp.co.csk.vdm.toolbox.api.corba.VDM.VDMMap m);
  int Size ();
  boolean IsEmpty ();
  jp.co.csk.vdm.toolbox.api.corba.VDM.VDMSet Dom ();
  jp.co.csk.vdm.toolbox.api.corba.VDM.VDMSet Rng ();
  boolean DomExists (jp.co.csk.vdm.toolbox.api.corba.VDM.VDMGeneric g);
  void RemElem (jp.co.csk.vdm.toolbox.api.corba.VDM.VDMGeneric g) throws jp.co.csk.vdm.toolbox.api.corba.VDM.VDMError;
  short First (jp.co.csk.vdm.toolbox.api.corba.VDM.VDMGenericHolder g);
  short Next (jp.co.csk.vdm.toolbox.api.corba.VDM.VDMGenericHolder g);
} // interface VDMMapOperations
