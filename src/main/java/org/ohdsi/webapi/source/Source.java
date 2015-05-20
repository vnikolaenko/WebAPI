/*
 * Copyright 2015 fdefalco.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ohdsi.webapi.source;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author fdefalco
 */
@Entity(name = "Source")
@Table(name="source")
public class Source implements Serializable {
  
  @Id
  @GeneratedValue  
  @Column(name="SOURCE_ID")  
  private int sourceId;
  
  @Column(name="SOURCE_TYPE")  
  private int sourceType;
  
  @Column(name="SOURCE_NAME")  
  private String sourceName;
  
  @Column(name="SOURCE_DIALECT")
  private String sourceDialect;
 
  @Column(name="SOURCE_CONNECTION")  
  private String sourceConnection;
  
  public int getSourceId() {
    return sourceId;
  }

  public void setSourceId(int sourceId) {
    this.sourceId = sourceId;
  }

  public int getSourceType() {
    return sourceType;
  }

  public void setSourceType(int sourceType) {
    this.sourceType = sourceType;
  }

  public String getSourceName() {
    return sourceName;
  }

  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }

  public String getSourceDialect() {
    return sourceDialect;
  }

  public void setSourceDialect(String sourceDialect) {
    this.sourceDialect = sourceDialect;
  }
  
  public String getSourceConnection() {
    return sourceConnection;
  }

  public void setSourceConnection(String sourceConnection) {
    this.sourceConnection = sourceConnection;
  } 

}
