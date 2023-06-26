package services;

public class Br implements InterestService {

	private double interestRate;

	public Br(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
}