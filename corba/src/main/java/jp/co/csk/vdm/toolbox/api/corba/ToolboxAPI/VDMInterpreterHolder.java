package jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI;

/**
* jp/co/csk/vdm/toolbox/api/corba/ToolboxAPI/VDMInterpreterHolder.java .
* IDL-to-Java コンパイラ (ポータブル), バージョン "3.1" で生成
* 生成元: corba_api.idl
* 2009年3月16日 10時22分53秒 JST
*/

public final class VDMInterpreterHolder implements org.omg.CORBA.portable.Streamable
{
  public jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMInterpreter value = null;

  public VDMInterpreterHolder ()
  {
  }

  public VDMInterpreterHolder (jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMInterpreter initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMInterpreterHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMInterpreterHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMInterpreterHelper.type ();
  }

}
