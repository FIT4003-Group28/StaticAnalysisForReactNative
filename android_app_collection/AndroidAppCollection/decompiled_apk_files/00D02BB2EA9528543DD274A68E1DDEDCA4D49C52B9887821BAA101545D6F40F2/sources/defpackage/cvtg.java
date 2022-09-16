package defpackage;
/* compiled from: PG */
/* renamed from: cvtg  reason: default package */
/* loaded from: classes5.dex */
public final class cvtg extends dsqw<cvtg, cvtf> implements dssk {
    public static final cvtg f;
    private static volatile dssr<cvtg> g;
    public int a;
    public dsef c;
    public int d;
    public dsrj<dsbc> b = dssu.b;
    public String e = "";

    static {
        cvtg cvtgVar = new cvtg();
        f = cvtgVar;
        dsqw.cc(cvtg.class, cvtgVar);
    }

    private cvtg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဈ\u0002\u0004ဌ\u0001", new Object[]{"a", "b", dsbc.class, "c", "e", "d", drxd.a});
            }
            if (i2 == 3) {
                return new cvtg();
            }
            if (i2 == 4) {
                return new cvtf();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cvtg> dssrVar = g;
            if (dssrVar == null) {
                synchronized (cvtg.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<dsbc> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
