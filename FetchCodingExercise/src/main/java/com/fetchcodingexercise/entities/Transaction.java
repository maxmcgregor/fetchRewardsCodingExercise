package com.fetchcodingexercise.entities;

import java.time.LocalDateTime;

//@Entity <-- tag would be uncommented if we were using a sustainable data store
public class Transaction {
	
	private Payer payer;
	
	private LocalDateTime timestamp;

	public Transaction() {
		super();
	}

	public Transaction(Payer payer, LocalDateTime timestamp) {
		super();
		this.payer = payer;
		this.timestamp = timestamp;
	}

	public Payer getPayer() {
		return payer;
	}

	public void setPayer(Payer payer) {
		this.payer = payer;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "Transaction [payer=" + payer + ", timestamp=" + timestamp + "]";
	}	

}
