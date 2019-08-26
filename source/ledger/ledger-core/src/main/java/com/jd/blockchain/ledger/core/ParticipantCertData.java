package com.jd.blockchain.ledger.core;

import com.jd.blockchain.crypto.PubKey;
import com.jd.blockchain.ledger.ParticipantNode;
import com.jd.blockchain.ledger.ParticipantNodeState;

/**
 * 参与方证书数据对象；
 * 
 * @author huanghaiquan
 *
 */
public class ParticipantCertData implements ParticipantNode {
	
	private int id;
	private String address;
	private String name;
	private PubKey pubKey;
	private ParticipantNodeState participantNodeState;

	public ParticipantCertData() {
	}

	public ParticipantCertData(ParticipantNode participantNode) {
		this.id = participantNode.getId();
		this.address = participantNode.getAddress();
		this.name = participantNode.getName();
		this.pubKey = participantNode.getPubKey();
		this.participantNodeState = participantNode.getParticipantNodeState();
	}

	public ParticipantCertData(String address, String name, PubKey pubKey) {
		this.address = address;
		this.name = name;
		this.pubKey = pubKey;
	}

	@Override
	public String getAddress() {
		return address;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public PubKey getPubKey() {
		return pubKey;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public ParticipantNodeState getParticipantNodeState() {
		return participantNodeState;
	}

	public void setParticipantNodeState(ParticipantNodeState participantNodeState) {
		this.participantNodeState = participantNodeState;
	}

}