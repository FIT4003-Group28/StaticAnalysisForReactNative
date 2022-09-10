package defpackage;
/* compiled from: PG */
/* renamed from: dvwm  reason: default package */
/* loaded from: classes.dex */
public final class dvwm extends dsqw<dvwm, dvwj> implements dssk {
    public static final dvwm b;
    private static volatile dssr<dvwm> d;
    private byte c = 2;
    public dsrj<dvwl> a = dssu.b;

    static {
        dvwm dvwmVar = new dvwm();
        b = dvwmVar;
        dsqw.cc(dvwm.class, dvwmVar);
    }

    private dvwm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dvwl.class});
            }
            if (i2 == 3) {
                return new dvwm();
            }
            if (i2 == 4) {
                return new dvwj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.c = b2;
                return null;
            }
            dssr<dvwm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvwm.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }

    public final void c() {
        dsrj<dvwl> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
