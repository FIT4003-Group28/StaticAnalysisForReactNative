package defpackage;
/* compiled from: PG */
/* renamed from: kqx  reason: default package */
/* loaded from: classes7.dex */
final class kqx implements begr {
    final /* synthetic */ String a;
    final /* synthetic */ ksu b;
    final /* synthetic */ krc c;

    public kqx(krc krcVar, String str, ksu ksuVar) {
        this.c = krcVar;
        this.a = str;
        this.b = ksuVar;
    }

    @Override // defpackage.begr
    public final void a(bttu bttuVar, ilo iloVar) {
        krc krcVar = this.c;
        String str = this.a;
        ksu ksuVar = this.b;
        if (dbsj.d(iloVar.n())) {
            krcVar.o();
            return;
        }
        ldm c = ldm.c(iloVar.ai(), str);
        c.p(iloVar);
        ksuVar.a(c);
    }

    @Override // defpackage.begr
    public final void b(bttu bttuVar, ilo iloVar, bttq bttqVar) {
        this.c.o();
    }
}
