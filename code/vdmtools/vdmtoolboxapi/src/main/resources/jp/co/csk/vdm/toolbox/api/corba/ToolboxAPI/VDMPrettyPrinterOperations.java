package jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI;


/**
* jp/co/csk/vdm/toolbox/api/corba/ToolboxAPI/VDMPrettyPrinterOperations.java .
* IDL-to-Java �R���p�C�� (�|�[�^�u��), �o�[�W���� "3.1" �Ő���
* ������: corba_api.idl
* 2008�N4��21�� 15��58��02�b JST
*/

public interface VDMPrettyPrinterOperations 
{
  boolean PrettyPrint (String name) throws jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.APIError;
  boolean PrettyPrintList (String[] names) throws jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.APIError;
} // interface VDMPrettyPrinterOperations
