package com.space.model;

public class PrepareData {
    // 冷却水参数设置
    private CoolingWaterData coolingWaterData;
    // 阀门状态检测
    private ValveData valveData;

    public CoolingWaterData getCoolingWaterData() {
        return coolingWaterData;
    }

    public void setCoolingWaterData(CoolingWaterData coolingWaterData) {
        this.coolingWaterData = coolingWaterData;
    }

    public ValveData getValveData() {
        return valveData;
    }

    public void setValveData(ValveData valveData) {
        this.valveData = valveData;
    }
}
