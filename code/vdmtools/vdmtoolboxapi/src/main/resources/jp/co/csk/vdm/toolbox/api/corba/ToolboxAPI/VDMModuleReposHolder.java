package jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI;

/**
* jp/co/csk/vdm/toolbox/api/corba/ToolboxAPI/VDMModuleReposHolder.java .
* IDL-to-Java コンパイラ (ポータブル), バージョン "3.1" で生成
* 生成元: corba_api.idl
* 2008年4月21日 15時58分02秒 JST
*/

public final class VDMModuleReposHolder implements org.omg.CORBA.portable.Streamable
{
  public jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMModuleRepos value = null;

  public VDMModuleReposHolder ()
  {
  }

  public VDMModuleReposHolder (jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMModuleRepos initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMModuleReposHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMModuleReposHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMModuleReposHelper.type ();
  }

}
