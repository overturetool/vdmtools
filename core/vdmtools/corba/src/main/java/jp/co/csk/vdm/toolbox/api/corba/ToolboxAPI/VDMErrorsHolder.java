package jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI;

/**
* jp/co/csk/vdm/toolbox/api/corba/ToolboxAPI/VDMErrorsHolder.java .
* IDL-to-Java �R���p�C�� (�|�[�^�u��), �o�[�W���� "3.1" �Ő���
* ������: corba_api.idl
* 2009�N3��16�� 10��22��53�b JST
*/

public final class VDMErrorsHolder implements org.omg.CORBA.portable.Streamable
{
  public jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMErrors value = null;

  public VDMErrorsHolder ()
  {
  }

  public VDMErrorsHolder (jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMErrors initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMErrorsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMErrorsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMErrorsHelper.type ();
  }

}
