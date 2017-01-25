/*
 * Copyright (c) 2017 Redlink GmbH.
 */
package io.redlink.solrlib.cloud;

/**
 * Created by jakob on 25.01.17.
 */
public class SolrCloudConnectorConfiguration {
    private String zkConnection = "localhost:9983";
    private String prefix = "";
    private int maxShardsPerNode = 1;

    public String getZkConnection() {
        return zkConnection;
    }

    public void setZkConnection(String zkConnection) {
        this.zkConnection = zkConnection;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setMaxShardsPerNode(int maxShardsPerNode) {
        this.maxShardsPerNode = maxShardsPerNode;
    }

    public Integer getMaxShardsPerNode() {
        return maxShardsPerNode;
    }
}
