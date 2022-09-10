package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: ansn  reason: default package */
/* loaded from: classes2.dex */
final class ansn implements dbrn<Map<String, Object>, Map<String, Object>> {
    final /* synthetic */ anso a;

    public ansn(anso ansoVar) {
        this.a = ansoVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Map<String, Object> a(Map<String, Object> map) {
        Map<String, Object> map2 = map;
        if (map2 == null || !map2.containsKey("lgh_hcc") || !(map2.get("lgh_hcc") instanceof String)) {
            bvoo.h("stringObjectMap must contain %s of type String, but got: %s", "lgh_hcc", map2);
        } else {
            this.a.b.a((String) map2.get("lgh_hcc"));
        }
        return bvwy.a;
    }
}
