package defpackage;
/* compiled from: PG */
/* renamed from: dvat  reason: default package */
/* loaded from: classes6.dex */
public final class dvat extends dsqw<dvat, dvaq> implements dssk {
    public static final dvat g;
    private static volatile dssr<dvat> i;
    public int a;
    public duzt c;
    public int e;
    public int f;
    private byte h = 2;
    public dsrj<dvas> b = dssu.b;
    public int d = 2;

    static {
        dvat dvatVar = new dvat();
        g = dvatVar;
        dsqw.cc(dvat.class, dvatVar);
    }

    private dvat() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0001\u0001\u0001Л\u0003ဌ\u0001\u0006ဉ\u0000\u0007ဌ\u0002\bဌ\u0003", new Object[]{"a", "b", dvas.class, "d", dqjm.a, "c", "e", dqjq.a, "f", dqkk.a});
            }
            if (i3 == 3) {
                return new dvat();
            }
            if (i3 == 4) {
                return new dvaq();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dvat> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dvat.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }

    public final void c() {
        dsrj<dvas> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
