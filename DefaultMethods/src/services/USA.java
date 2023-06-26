package services;

public class USA implements InterestService {

	private double interestRate;

	public USA(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
}