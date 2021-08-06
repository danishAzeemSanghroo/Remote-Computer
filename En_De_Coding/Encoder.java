/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package En_De_Coding;

/**
 *
 * @author Danish
 */
public class Encoder {

	public static String utilitiesEncode(String utility){
		if(utility.equals("Notepad"))return "notepad";
		if(utility.equals("MS Paint"))return "mspaint";
		if(utility.equals("File Explorer"))return "explorer";
		if(utility.equals("Calculator"))return "calc";
                if(utility.equals("Open Request File"))return "certreq";
                if(utility.equals("Character Map"))return "charmap";
                if(utility.equals("Disk Clean Up"))return "cleanmgr";
                if(utility.equals("Commond Prompt"))return "cmd";
                if(utility.equals("Connection Manager Profile Installer"))return "cmstp";
                if(utility.equals("Color Management"))return "colorcpl";
                if(utility.equals("Computer Management"))return "CompMgmtLauncher";
                if(utility.equals("Controls"))return "control";
                if(utility.equals("Stored User Names and Passwords"))return "credwiz";
                if(utility.equals("Cleartype Text Tuner"))return "cttune";
                if(utility.equals("Phone Dialer"))return "dialer";
                if(utility.equals("Protected Content Migration"))return "dpapimig";
                if(utility.equals("Display"))return "DpiScaling";
                if(utility.equals("Window Media Player"))return "dvdplay";
                if(utility.equals("Bluetooth File Transfer"))return "fsquirt";
                if(utility.equals("Fax Cover Page Editer"))return "FXSCOVER";
                if(utility.equals("Intel Graphic"))return "GfxUIEx";
                if(utility.equals("IExpress Wizard"))return "iexpress";
                if(utility.equals("Task Manager"))return "LaunchTM";
                if(utility.equals("Instal or uninstal Display Languages"))return "lpksetup";
                if(utility.equals("Magnify"))return "Magnify";
                if(utility.equals("Windows Mobility Center"))return "mblctr";
                if(utility.equals("Sync Center"))return "mobsync";
                if(utility.equals("Microsoft Support Diagnostic Tool"))return "msdt";
                if(utility.equals("Windows Installer"))return "msiexec";
                if(utility.equals("System Information"))return "msinfo32";
                if(utility.equals("Remote Desktop Connection"))return "mstsc";
                if(utility.equals("Printer Migration"))return "PrintBrmUi";
                if(utility.equals("Resources Moniter"))return "resmon";
                if(utility.equals("Signature Verification"))return "sigverif";
                if(utility.equals("Activation"))return "slui";
                if(utility.equals("Volume Mixture"))return "SndVol";
                if(utility.equals("Snipping Tool"))return "SnippingTool";
                if(utility.equals("User Account Control Settings"))return "UserAccountControlSettings";
               
		return utility;	
	} 
    
}
