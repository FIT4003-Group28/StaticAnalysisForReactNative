package defpackage;
/* compiled from: PG */
/* renamed from: azlw  reason: default package */
/* loaded from: classes.dex */
public final class azlw<T> extends btrh<T> {
    private final int d;

    public azlw(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            azlv azlvVar = (azlv) this.a;
            if (((anlb) obj).b == 1) {
                return;
            }
            azlvVar.H();
        } else if (i != 1) {
            if (i != 2) {
                azlv azlvVar2 = (azlv) this.a;
                azra azraVar = (azra) obj;
                azlvVar2.c.b(azre.a(azlvVar2.j, azlvVar2.e.a()));
                return;
            }
            final azlv azlvVar3 = (azlv) this.a;
            final azrh azrhVar = (azrh) obj;
            azlvVar3.b.b(new Runnable(azlvVar3, azrhVar) { // from class: azlh
                private final azlv a;
                private final azrh b;

                {
                    this.a = azlvVar3;
                    this.b = azrhVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    azlv azlvVar4 = this.a;
                    if (this.b.a() == 1) {
                        azlvVar4.H();
                    }
                }
            });
        } else {
            final azlv azlvVar4 = (azlv) this.a;
            gds gdsVar = (gds) obj;
            synchronized (azlvVar4.m) {
                azlvVar4.I();
            }
            final btlu btluVar = azlvVar4.j;
            btlu btluVar2 = gdsVar.a;
            if (btlu.g(btluVar, btluVar2)) {
                azlvVar4.j.t();
                return;
            }
            azlvVar4.j = btluVar2;
            btluVar.t();
            btluVar2.t();
            azlvVar4.k = dcdc.e();
            azlvVar4.l = dcax.a;
            azlvVar4.b.b(new Runnable(azlvVar4, btluVar) { // from class: azkw
                private final azlv a;
                private final btlu b;

                {
                    this.a = azlvVar4;
                    this.b = btluVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.C(this.b);
                }
            });
        }
    }
}
