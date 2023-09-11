package kbits.kb04.parasol.silver.dto;

import kbits.kb04.parasol.silver.entity.SilverTownDetail;
import lombok.Getter;

@Getter
public class SilverTownDetailResponseDto {
	private long stNo;
	private String address;
	private String stFacility;
	private String stImgUrl;
	private String stName;
	private int stPeriod;
	private String stScale; // 타운 규모(대형/중형/소형)
	private String stType; // 주거 타입(도심/근교/전원)
	private String stUrl;
	private String[] stScaleArr = {"", "대형", "중형", "소형"};
	private String[] stTypeArr = {"", "도심형", "근교형", "전원형"};
	
	private long stdNo;
	private int stdDeposit;
	private int stdMonthlyCost;
	private int stdOccupancy;
	private int stdRoomSize;
	private String stdRoomType;
	
	public SilverTownDetailResponseDto(SilverTownDetail silverTownDetail) {
		super();
		this.stNo = silverTownDetail.getSilverTown().getStNo();
		this.address = silverTownDetail.getSilverTown().getAddress();
		this.stFacility = silverTownDetail.getSilverTown().getStFacility();
		this.stImgUrl = silverTownDetail.getSilverTown().getStImgUrl();
		this.stName = silverTownDetail.getSilverTown().getStName();
		this.stPeriod = silverTownDetail.getSilverTown().getStPeriod();
		this.stScale = stScaleArr[silverTownDetail.getSilverTown().getStScale()];
		this.stType = stTypeArr[silverTownDetail.getSilverTown().getStType()];
		this.stUrl = silverTownDetail.getSilverTown().getStUrl();
		this.stdNo = silverTownDetail.getStdNo();
		this.stdDeposit = silverTownDetail.getStdDeposit();
		this.stdMonthlyCost = silverTownDetail.getStdMonthlyCost();
		this.stdOccupancy = silverTownDetail.getStdOccupancy();
		this.stdRoomSize = silverTownDetail.getStdRoomSize();
		this.stdRoomType = silverTownDetail.getStdRoomType();
	}
	
}
