package defpackage;
/* compiled from: PG */
/* renamed from: andj  reason: default package */
/* loaded from: classes2.dex */
final class andj implements acyt {
    ddmo a = ddmo.UNKNOWN_EXPANSION;
    final /* synthetic */ andm b;

    public andj(andm andmVar) {
        this.b = andmVar;
    }

    @Override // defpackage.acyt
    public final void a(boolean z) {
        ddmo c = aefy.c(this.b.a);
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
        b.d = dtxl.y;
        b.l(bZ.bK());
        this.b.ae.m(new cjte(deaf.DRAG), b.a());
        this.a = c;
    }

    @Override // defpackage.acyt
    public final void b(int i) {
    }
}
