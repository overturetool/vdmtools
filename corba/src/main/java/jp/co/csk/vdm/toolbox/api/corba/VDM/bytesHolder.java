package jp.co.csk.vdm.toolbox.api.corba.VDM;


/**
* jp/co/csk/vdm/toolbox/api/corba/VDM/bytesHolder.java .
* IDL-to-Java �R���p�C�� (�|�[�^�u��), �o�[�W���� "3.1" �Ő���
* ������: metaiv_idl.idl
* 2009�N3��16�� 10��22��52�b JST
*/

public final class bytesHolder implements org.omg.CORBA.portable.Streamable
{
  public byte value[] = null;

  public bytesHolder ()
  {
  }

  public bytesHolder (byte[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = jp.co.csk.vdm.toolbox.api.corba.VDM.bytesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    jp.co.csk.vdm.toolbox.api.corba.VDM.bytesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return jp.co.csk.vdm.toolbox.api.corba.VDM.bytesHelper.type ();
  }

}