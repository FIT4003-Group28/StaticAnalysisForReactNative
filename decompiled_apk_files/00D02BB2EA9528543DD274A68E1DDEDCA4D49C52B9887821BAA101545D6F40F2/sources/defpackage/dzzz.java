package defpackage;
/* compiled from: PG */
/* renamed from: dzzz  reason: default package */
/* loaded from: classes.dex */
public final class dzzz extends dsqw<dzzz, dzzy> implements dssk {
    public static final dzzz b;
    private static volatile dssr<dzzz> d;
    private byte c = 2;
    public dsrj<dzzx> a = dssu.b;

    static {
        dzzz dzzzVar = new dzzz();
        b = dzzzVar;
        dsqw.cc(dzzz.class, dzzzVar);
    }

    private dzzz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dzzx.class});
            }
            if (i2 == 3) {
                return new dzzz();
            }
            if (i2 == 4) {
                return new dzzy();
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
            dssr<dzzz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dzzz.class) {
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
        dsrj<dzzx> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
