package com.baidu.mapapi.map;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class MapBaseIndoorMapInfo {

    /* renamed from: d  reason: collision with root package name */
    private static final String f1606d = "MapBaseIndoorMapInfo";

    /* renamed from: a  reason: collision with root package name */
    String f1607a;

    /* renamed from: b  reason: collision with root package name */
    String f1608b;

    /* renamed from: c  reason: collision with root package name */
    ArrayList<String> f1609c;

    /* loaded from: classes.dex */
    public enum SwitchFloorError {
        SWITCH_OK,
        FLOOR_INFO_ERROR,
        FLOOR_OVERLFLOW,
        FOCUSED_ID_ERROR,
        SWITCH_ERROR
    }

    public MapBaseIndoorMapInfo() {
    }

    public MapBaseIndoorMapInfo(MapBaseIndoorMapInfo mapBaseIndoorMapInfo) {
        this.f1607a = mapBaseIndoorMapInfo.f1607a;
        this.f1608b = mapBaseIndoorMapInfo.f1608b;
        this.f1609c = mapBaseIndoorMapInfo.f1609c;
    }

    public MapBaseIndoorMapInfo(String str, String str2, ArrayList<String> arrayList) {
        this.f1607a = str;
        this.f1608b = str2;
        this.f1609c = arrayList;
    }

    public String getCurFloor() {
        return this.f1608b;
    }

    public ArrayList<String> getFloors() {
        return this.f1609c;
    }

    public String getID() {
        return this.f1607a;
    }
}
