package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bouh  reason: default package */
/* loaded from: classes3.dex */
final class bouh implements dbrn<Map<String, Object>, Map<String, Object>> {
    final /* synthetic */ boui a;

    public bouh(boui bouiVar) {
        this.a = bouiVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Map<String, Object> a(@dzsi Map<String, Object> map) {
        GmmLocation a = this.a.a.a();
        if (a == null || a.getAccuracy() < 0.0f || a.getAccuracy() > 20.0f) {
            return bvwy.a;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("lat", Double.valueOf(a.getLatitude()));
        hashMap.put("lng", Double.valueOf(a.getLongitude()));
        return hashMap;
    }
}
