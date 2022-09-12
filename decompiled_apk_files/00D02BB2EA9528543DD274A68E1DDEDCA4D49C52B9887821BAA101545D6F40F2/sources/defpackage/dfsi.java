package defpackage;
/* compiled from: PG */
/* renamed from: dfsi  reason: default package */
/* loaded from: classes6.dex */
public final class dfsi extends dsqw<dfsi, dfsh> implements dssk {
    public static final dfsi d;
    private static volatile dssr<dfsi> e;
    public int a;
    public dfsx b;
    public dsrj<dftd> c = dssu.b;

    static {
        dfsi dfsiVar = new dfsi();
        d = dfsiVar;
        dsqw.cc(dfsi.class, dfsiVar);
    }

    private dfsi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", dftd.class});
            }
            if (i2 == 3) {
                return new dfsi();
            }
            if (i2 == 4) {
                return new dfsh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfsi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfsi.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<dftd> dsrjVar = this.c;
        if (!dsrjVar.a()) {
            this.c = dsqw.cl(dsrjVar);
        }
    }
}
