package defpackage;
/* compiled from: PG */
/* renamed from: aeob  reason: default package */
/* loaded from: classes2.dex */
final class aeob implements aeoj {
    final /* synthetic */ aeoe a;

    public aeob(aeoe aeoeVar) {
        this.a = aeoeVar;
    }

    @Override // defpackage.aeoj
    public final void a(aehu aehuVar) {
        this.a.Re();
        if (!aehuVar.equals(this.a.i)) {
            if (aeoe.a) {
                aeoe aeoeVar = this.a;
                if (aeoeVar.k == 0) {
                    aeoeVar.k = 1;
                    aeoeVar.d(aehuVar);
                    this.a.Rf();
                    return;
                }
            }
            aeoe aeoeVar2 = this.a;
            if (aeoeVar2.j == 0) {
                aeoeVar2.c(aehuVar, aeoeVar2.d.m(), this.a.d.k());
            } else {
                aeoeVar2.c(aehuVar, aeoeVar2.e.m(), this.a.e.k());
            }
        }
    }

    @Override // defpackage.aeoj
    public final void b() {
        this.a.Re();
        if (aeoe.a) {
            aeoe aeoeVar = this.a;
            if (aeoeVar.k != 1) {
                return;
            }
            aeoeVar.d(aeoeVar.i);
        }
    }
}
