package com.airbnb.android.react.maps;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
/* compiled from: RegionChangeEvent.java */
/* loaded from: classes.dex */
public class k extends com.facebook.react.uimanager.events.b<k> {

    /* renamed from: a  reason: collision with root package name */
    private final LatLngBounds f1420a;

    /* renamed from: b  reason: collision with root package name */
    private final LatLng f1421b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f1422c;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topChange";
    }

    @Override // com.facebook.react.uimanager.events.b
    public boolean b() {
        return false;
    }

    public k(int i, LatLngBounds latLngBounds, LatLng latLng, boolean z) {
        super(i);
        this.f1420a = latLngBounds;
        this.f1421b = latLng;
        this.f1422c = z;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("continuous", this.f1422c);
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putDouble("latitude", this.f1421b.latitude);
        writableNativeMap2.putDouble("longitude", this.f1421b.longitude);
        writableNativeMap2.putDouble("latitudeDelta", this.f1420a.northeast.latitude - this.f1420a.southwest.latitude);
        writableNativeMap2.putDouble("longitudeDelta", this.f1420a.northeast.longitude - this.f1420a.southwest.longitude);
        writableNativeMap.a("region", writableNativeMap2);
        rCTEventEmitter.receiveEvent(d(), a(), writableNativeMap);
    }
}
