package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: bvzd  reason: default package */
/* loaded from: classes4.dex */
final class bvzd implements degu<Map<String, Object>> {
    final /* synthetic */ String a;
    final /* synthetic */ bvze b;

    public bvzd(bvze bvzeVar, String str) {
        this.b = bvzeVar;
        this.a = str;
    }

    private final void c(int i, Map<String, Object> map) {
        String a = map != null ? bvtu.a(map) : "";
        dmcy bZ = dmcz.e.bZ();
        String str = this.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmcz dmczVar = (dmcz) bZ.b;
        str.getClass();
        int i2 = dmczVar.a | 1;
        dmczVar.a = i2;
        dmczVar.b = str;
        dmczVar.c = i - 1;
        int i3 = i2 | 2;
        dmczVar.a = i3;
        a.getClass();
        dmczVar.a = i3 | 4;
        dmczVar.d = a;
        this.b.c.b(bZ.bK(), dmcz.f);
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        c(3, dcdn.k("err", dbsj.e(th.getMessage())));
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Map<String, Object> map) {
        c(1, map);
    }
}
