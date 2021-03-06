/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ohdsi.webapi.cohortdefinition;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author cknoll1
 */
public class AdditionalCriteria implements ICohortExpressionElement {
  @JsonProperty("Criteria")
  public Criteria criteria;  
  
  @JsonProperty("StartWindow")
  public Window startWindow;  

  @JsonProperty("Occurrence")
  public Occurrence occurrence;  

  @Override
  public String accept(ICohortExpressionElementVisitor visitor) {
    return visitor.visit(this);
  }
}
