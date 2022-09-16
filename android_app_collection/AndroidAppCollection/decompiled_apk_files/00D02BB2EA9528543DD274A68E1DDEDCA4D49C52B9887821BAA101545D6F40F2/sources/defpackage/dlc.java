package defpackage;
/* compiled from: PG */
/* renamed from: dlc  reason: default package */
/* loaded from: classes6.dex */
final class dlc implements Runnable {
    long a = 0;
    final /* synthetic */ dld b;

    public dlc(dld dldVar) {
        this.b = dldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a == 0) {
            this.a = this.b.f.e();
        }
        dld dldVar = this.b;
        int av = dldVar.d.aj().av();
        if ((av != 6 && av != 1) || !dldVar.w || dldVar.q == null) {
            long e = this.b.f.e();
            long j = this.a;
            dld dldVar2 = this.b;
            if (((float) (e - j)) <= dldVar2.h.d) {
                return;
            }
            dldVar2.d.aj().av();
            dld dldVar3 = this.b;
            dldVar3.b(dldVar3.y);
            return;
        }
        dld dldVar4 = this.b;
        dldVar4.b(dldVar4.y);
    }
}
