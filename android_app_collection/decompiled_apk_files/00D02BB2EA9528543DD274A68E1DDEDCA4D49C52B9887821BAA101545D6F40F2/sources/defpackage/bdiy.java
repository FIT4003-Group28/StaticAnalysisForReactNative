package defpackage;
/* compiled from: PG */
/* renamed from: bdiy  reason: default package */
/* loaded from: classes3.dex */
final class bdiy implements bbup {
    final /* synthetic */ bdjc a;

    public bdiy(bdjc bdjcVar) {
        this.a = bdjcVar;
    }

    @Override // defpackage.bbup
    public final void c() {
    }

    public final void d(boolean z) {
        bdjc bdjcVar = this.a;
        bdjcVar.h = z;
        bdjcVar.c.p(!z);
    }

    @Override // defpackage.bbup
    public final void j() {
        this.a.o();
        d(true);
        cqkx.p(this.a);
    }

    @Override // defpackage.bbup
    public final void k(dbsg<bttq> dbsgVar) {
        d(false);
        cqkx.p(this.a);
    }
}
