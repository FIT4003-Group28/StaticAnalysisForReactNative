package com.google.android.apps.gmm.car.vms.databack.storage;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class DataBackDatabase_Impl extends DataBackDatabase {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bn
    public final avz b(ba baVar) {
        bq bqVar = new bq(baVar, new nuh(this), "6936bbb2cac83fecaaf7589cb95c19af", "f4ff3c544663c386dcd55f395376f7d4");
        avw a = avx.a(baVar.b);
        a.b = baVar.c;
        a.c = bqVar;
        return baVar.a.a(a.a());
    }

    @Override // defpackage.bn
    protected final bh c() {
        HashMap hashMap = new HashMap(0);
        new HashMap(0);
        return new bh(this, hashMap, "recent_signs_count", "sensor_observation", "recorded_sensor_observation_event");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bn
    public final Map<Class<?>, List<Class<?>>> d() {
        HashMap hashMap = new HashMap();
        hashMap.put(nui.class, Collections.emptyList());
        hashMap.put(nuk.class, Collections.emptyList());
        hashMap.put(nuj.class, Collections.emptyList());
        return hashMap;
    }

    @Override // defpackage.bn
    public final void e() {
        throw null;
    }
}
