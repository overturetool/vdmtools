package jp.co.csk.vdm.toolbox.api.corba.VDM;


/**
* jp/co/csk/vdm/toolbox/api/corba/VDM/VDMError.java .
* IDL-to-Java �R���p�C�� (�|�[�^�u��), �o�[�W���� "3.1" �Ő���
* ������: metaiv_idl.idl
* 2009�N3��16�� 10��22��52�b JST
*/

public final class VDMError extends org.omg.CORBA.UserException
{
  public short err = (short)0;

  public VDMError ()
  {
    super(VDMErrorHelper.id());
  } // ctor

  public VDMError (short _err)
  {
    super(VDMErrorHelper.id());
    err = _err;
  } // ctor


  public VDMError (String $reason, short _err)
  {
    super(VDMErrorHelper.id() + "  " + $reason);
    err = _err;
  } // ctor

} // class VDMError
