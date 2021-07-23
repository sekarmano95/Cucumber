package org.pages;

public class PageObjectManager {

	private PageObjectManager() {
	}

	private static PageObjectManager manager;
	private LoginPage loginPage;
	private RegistrationPage registrationPage;

	public static PageObjectManager getManager() {

		return manager == null ? manager = new PageObjectManager() : manager;
		// conditoin? true:false
	}

	public LoginPage getLoginPage() {
		return loginPage == null ? loginPage = new LoginPage() : loginPage;
	}

	public RegistrationPage getRegistrationPage() {
		return registrationPage == null ? registrationPage = new RegistrationPage() : registrationPage;
	}

	public static void main(String[] args) {
		PageObjectManager mn = PageObjectManager.getManager();
		LoginPage l = mn.getLoginPage();
		RegistrationPage r = mn.getRegistrationPage();
		l.getTxtUsername();
		r.getBtnCreate();
	}

}
