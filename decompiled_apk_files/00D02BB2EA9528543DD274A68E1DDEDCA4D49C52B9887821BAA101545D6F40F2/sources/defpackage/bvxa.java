package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bvxa  reason: default package */
/* loaded from: classes4.dex */
final class bvxa implements dbrn<Map<String, Object>, Map<String, Object>> {
    final /* synthetic */ bvxb a;

    public bvxa(bvxb bvxbVar) {
        this.a = bvxbVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Map<String, Object> a(@dzsi Map<String, Object> map) {
        Map<String, Object> map2 = map;
        HashMap hashMap = new HashMap();
        try {
            dbsk.s(map2);
            Object obj = map2.get("base64data");
            dssj e = this.a.e(this.a.j(ddae.e.j(obj != null ? obj.toString() : "")));
            if (e == null) {
                return null;
            }
            hashMap.put("base64data", ddae.e.i(e.bS()));
            return hashMap;
        } catch (dsrm unused) {
            bvoo.h("Unable to parse request", new Object[0]);
            return hashMap;
        }
    }
}
