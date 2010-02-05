package jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI;

/**
* jp/co/csk/vdm/toolbox/api/corba/ToolboxAPI/ErrorHolder.java .
* IDL-to-Java �R���p�C�� (�|�[�^�u��), �o�[�W���� "3.1" �Ő���
* ������: corba_api.idl
* 2009�N3��16�� 10��22��53�b JST
*/

public final class ErrorHolder implements org.omg.CORBA.portable.Streamable
{
  public jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.Error value = null;

  public ErrorHolder ()
  {
  }

  public ErrorHolder (jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.Error initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.ErrorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.ErrorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.ErrorHelper.type ();
  }

}
