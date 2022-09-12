package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: bvty  reason: default package */
/* loaded from: classes4.dex */
final class bvty implements dbrn {
    final /* synthetic */ dssr a;

    public bvty(dssr dssrVar) {
        this.a = dssrVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Object obj2 = ((Map) obj).get("base64data");
        try {
            return (dssj) this.a.j(ddae.e.j(obj2 != null ? obj2.toString() : ""));
        } catch (dsrm e) {
            throw new RuntimeException(e);
        }
    }
}
