package org.opendatakit.aggregate.client.odktables;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * This is the client-side code of
 * {@link org.opendatakit.aggregate.odktables.entity.Column}
 * @author sudar.sam@gmail.com
 *
 */
public class ColumnClient implements IsSerializable{
  
  public enum ColumnType {
    STRING,
    INTEGER,
    DECIMAL,
    BOOLEAN,
    DATETIME;
  }

  private String tableId;
  private String elementKey;
  private String elementName;
  private ColumnClient.ColumnType elementType;
  private String listChildElementKeys;
  private int isPersisted;
  private String joins;

  @SuppressWarnings("unused")
  private ColumnClient() {
    // necessary for gwt serialization
  }

  /**
   * Create a column. Spaces will be replaced by underscores. The backing 
   * dbName of the column will be the displayName changed to lower case and
   * prepended with an underscore.
   * @param displayName
   * @param type
   */
  public ColumnClient(final String tableId, final String elementKey,
      final String elementName, final ColumnClient.ColumnType elementType,
      final String listChildElementKeys, final int isPersisted, 
      final String joins) {
// ss: not sure what this was.leaving it out for now.
//    String nameToBeEntered = displayName.toLowerCase().replace(" ", "_");
    this.tableId = tableId;
    this.elementKey = elementKey;
    this.elementName = elementName;
    this.elementType = elementType;
    this.listChildElementKeys = listChildElementKeys;
    this.isPersisted = isPersisted;
    this.joins = joins;
  }
  
  public String getTableId() {
    return this.tableId;
  }

  public String getElementKey() {
    return this.elementKey;
  }
  
  public String getElementName() {
    return this.elementName;
  }
  
  public ColumnClient.ColumnType getElementType() {
    return this.elementType;
  }
  
  public String getListChildElementKeys() {
    return this.listChildElementKeys;
  }
  
  public int getIsPersisted() {
    return this.isPersisted;
  }
  
  public String getJoins() {
    return this.joins;
  }
  
  public String toString() {
    return "Column(tableId=" + this.getTableId() 
        + ", elementKey=" + this.getElementKey()
        + ", elementName=" + this.getElementName()
        + ", elementType=" + this.getElementType()
        + ", listChildElementKeys=" + this.getListChildElementKeys()
        + ", isPersisted=" + this.getIsPersisted()
        + ", joins=" + this.getJoins()
        + ")";
  }
}