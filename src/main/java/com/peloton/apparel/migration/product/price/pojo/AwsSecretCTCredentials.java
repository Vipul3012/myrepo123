package com.peloton.apparel.migration.product.price.pojo;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class AwsSecretCTCredentials {
	
	@SerializedName(value = "abc")
	private String abc;
}