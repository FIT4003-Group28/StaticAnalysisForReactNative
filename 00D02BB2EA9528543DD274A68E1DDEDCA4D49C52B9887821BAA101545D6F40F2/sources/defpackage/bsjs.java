package defpackage;
/* compiled from: PG */
/* renamed from: bsjs  reason: default package */
/* loaded from: classes4.dex */
final class bsjs implements aeoj {
    final /* synthetic */ bsjt a;

    public bsjs(bsjt bsjtVar) {
        this.a = bsjtVar;
    }

    @Override // defpackage.aeoj
    public final void a(aehu aehuVar) {
        this.a.q();
        if (!bsjt.a) {
            this.a.p(aehuVar);
            return;
        }
        bsjt bsjtVar = this.a;
        if (bsjtVar.e == 0) {
            bsjtVar.e = 1;
            bsjtVar.f = aehuVar;
            bsjtVar.r();
            return;
        }
        bsjtVar.e = 0;
        bsjtVar.p(new aehu(bsjtVar.f.c, aehuVar.d));
    }

    @Override // defpackage.aeoj
    public final void b() {
        this.a.q();
        bsjt bsjtVar = this.a;
        bsjtVar.f = bsjtVar.g;
        bsjtVar.e = 0;
    }
}
