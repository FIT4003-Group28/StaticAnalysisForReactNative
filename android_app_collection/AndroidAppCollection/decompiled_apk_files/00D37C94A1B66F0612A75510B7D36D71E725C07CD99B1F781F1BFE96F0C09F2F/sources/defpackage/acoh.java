package defpackage;
/* compiled from: PG */
/* renamed from: acoh  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acoh implements Runnable {
    public final /* synthetic */ acor a;
    private final /* synthetic */ int b;

    public /* synthetic */ acoh(acor acorVar, int i) {
        this.b = i;
        this.a = acorVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.c(false);
        } else if (i == 1) {
            this.a.c(true);
        } else if (i == 2) {
            acor acorVar = this.a;
            acbt acbtVar = acorVar.n;
            if (acbtVar == null) {
                return;
            }
            acbo acboVar = (acbo) acbtVar;
            if (!acboVar.j()) {
                return;
            }
            acboVar.f(acorVar.k);
        } else if (i != 3) {
            acor acorVar2 = this.a;
            if (!acorVar2.e()) {
                acorVar2.g();
            } else if (!acorVar2.n.d()) {
                acorVar2.g();
            } else if (!acorVar2.m.d()) {
                acorVar2.g();
            } else {
                acorVar2.k.h();
                acorVar2.g = true;
            }
        } else {
            acor acorVar3 = this.a;
            ylr.b();
            ylr.b();
            if (acorVar3.l != null) {
                acorVar3.f();
                acorVar3.l.o();
                acorVar3.l = null;
            }
            acbt acbtVar2 = acorVar3.n;
            if (acbtVar2 != null) {
                ((acbo) acbtVar2).e = null;
                acbtVar2.e();
                acorVar3.n.c();
                acorVar3.n = null;
            }
            acbt acbtVar3 = acorVar3.m;
            if (acbtVar3 == null) {
                return;
            }
            ((acbe) acbtVar3).d = null;
            acbtVar3.e();
            acorVar3.m.c();
            acorVar3.m = null;
        }
    }
}
