/*
 * generated by Xtext 2.25.0
 */
package msdexam;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class MsdExamStandaloneSetup extends MsdExamStandaloneSetupGenerated {

	public static void doSetup() {
		new MsdExamStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
