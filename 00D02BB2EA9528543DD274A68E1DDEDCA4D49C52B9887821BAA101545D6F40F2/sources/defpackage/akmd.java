package defpackage;
/* compiled from: PG */
/* renamed from: akmd  reason: default package */
/* loaded from: classes2.dex */
final class akmd implements acyt {
    ddmo a = ddmo.UNKNOWN_EXPANSION;
    final /* synthetic */ akmg b;

    public akmd(akmg akmgVar) {
        this.b = akmgVar;
    }

    @Override // defpackage.acyt
    public final void a(boolean z) {
        ddmo c = aefy.c(this.b.ae);
        if (!z || this.a == c) {
            return;
        }
        ddmp bZ = ddmq.d.bZ();
        ddmo ddmoVar = this.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddmq ddmqVar = (ddmq) bZ.b;
        ddmqVar.c = ddmoVar.f;
        int i = ddmqVar.a | 2;
        ddmqVar.a = i;
        ddmqVar.b = c.f;
        ddmqVar.a = i | 1;
        cjta b = cjtd.b();
        b.d = dtxo.az;
        b.l(bZ.bK());
        if (this.b.af.c()) {
            b.g(this.b.af.d());
        }
        this.b.ad.m(new cjte(deaf.DRAG), b.a());
        this.a = c;
    }

    @Override // defpackage.acyt
    public final void b(int i) {
    }
}
