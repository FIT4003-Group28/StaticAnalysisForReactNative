package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: ansp  reason: default package */
/* loaded from: classes2.dex */
final class ansp implements dbrn<Map<String, Object>, Map<String, Object>> {
    final /* synthetic */ ansq a;

    public ansp(ansq ansqVar) {
        this.a = ansqVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Map<String, Object> a(Map<String, Object> map) {
        Map<String, Object> map2 = map;
        if (map2 == null || !map2.containsKey("mpk_pk") || !(map2.get("mpk_pk") instanceof String)) {
            bvoo.h("stringObjectMap must contain %s of type String, but got: %s", "mpk_pk", map2);
        } else {
            dnwb dnwbVar = (dnwb) bvrs.i((String) map2.get("mpk_pk"), (dssr) dnwb.i.cu(7));
            if (dnwbVar != null) {
                this.a.b.c(dnwbVar);
            }
        }
        return bvwy.a;
    }
}
