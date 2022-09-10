package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: thv  reason: default package */
/* loaded from: classes7.dex */
final class thv implements degu<Map<qdv, dopk>> {
    final /* synthetic */ btlu a;
    final /* synthetic */ boolean b;
    final /* synthetic */ deig c;
    final /* synthetic */ thw d;

    public thv(thw thwVar, btlu btluVar, boolean z, deig deigVar) {
        this.d = thwVar;
        this.a = btluVar;
        this.b = z;
        this.c = deigVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.d.c = null;
        this.c.j(false);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Map<qdv, dopk> map) {
        Map<qdv, dopk> map2 = map;
        this.d.b.a(xcs.b(map2.values()), ckkm.y, ckkm.z);
        this.d.a.h(this.a, map2, this.b);
        this.c.j(true);
    }
}
