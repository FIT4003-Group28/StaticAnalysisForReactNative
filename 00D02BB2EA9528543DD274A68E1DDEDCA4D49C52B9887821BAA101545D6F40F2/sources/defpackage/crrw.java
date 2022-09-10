package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crrw  reason: default package */
/* loaded from: classes5.dex */
public final class crrw implements amcm {
    final /* synthetic */ crrx a;

    public crrw(crrx crrxVar) {
        this.a = crrxVar;
    }

    @Override // defpackage.amcm
    public final void a(alyh alyhVar, int i, @dzsi alyg alygVar, @dzsi alyg alygVar2) {
        if (i != 0) {
            if (i == 4) {
                return;
            }
            final int i2 = alygVar == null ? 2 : 1;
            synchronized (this.a) {
                crrx crrxVar = this.a;
                if (!crrxVar.k) {
                    return;
                }
                crrxVar.i.b(new Runnable(this, i2) { // from class: crrv
                    private final crrw a;
                    private final int b;

                    {
                        this.a = this;
                        this.b = i2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int q;
                        crrw crrwVar = this.a;
                        int i3 = this.b;
                        crrx crrxVar2 = crrwVar.a;
                        crrxVar2.m--;
                        if (i3 == 1) {
                            crrxVar2.n++;
                        }
                        if (crrxVar2.n == 0) {
                            q = crrxVar2.h.p();
                        } else {
                            q = crrxVar2.h.q();
                        }
                        crrxVar2.l(q);
                    }
                }, bvrj.NAVIGATION_INTERNAL);
                return;
            }
        }
        throw null;
    }
}
