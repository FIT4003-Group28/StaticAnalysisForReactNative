package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: brfy  reason: default package */
/* loaded from: classes4.dex */
final class brfy implements degu<List<brcz>> {
    final /* synthetic */ brgb a;

    public brfy(brgb brgbVar) {
        this.a = brgbVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.h = brgn.NETWORK_ERROR;
        cqkx.p(this.a);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(List<brcz> list) {
        this.a.h = brgn.OPTIONS_LIST;
        this.a.c.clear();
        for (brcz brczVar : list) {
            List<brgm> list2 = this.a.c;
            String b = brczVar.b();
            String c = brczVar.c();
            boolean d = brczVar.d();
            cqhn cqhnVar = this.a.f;
            int a = brczVar.a();
            brgb brgbVar = this.a;
            list2.add(new brfv(b, c, d, cqhnVar, a, brgbVar.a, brgbVar.g));
        }
        cqkx.p(this.a);
    }
}
