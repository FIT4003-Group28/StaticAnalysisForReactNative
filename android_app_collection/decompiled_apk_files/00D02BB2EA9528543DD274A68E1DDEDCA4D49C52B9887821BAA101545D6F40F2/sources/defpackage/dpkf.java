package defpackage;
/* compiled from: PG */
/* renamed from: dpkf  reason: default package */
/* loaded from: classes6.dex */
public final class dpkf extends dsqw<dpkf, dpjy> implements dssk {
    public static final dpkf g;
    private static volatile dssr<dpkf> i;
    public int a;
    public dpjn b;
    public int d;
    public dpke f;
    private byte h = 2;
    public dsrj<dpjn> c = dssu.b;
    public String e = "";

    static {
        dpkf dpkfVar = new dpkf();
        g = dpkfVar;
        dsqw.cc(dpkf.class, dpkfVar);
    }

    private dpkf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л\u0003ဌ\u0001\u0005ဈ\u0003\bဉ\u0006", new Object[]{"a", "b", "c", dpjn.class, "d", dpjz.a, "e", "f"});
            }
            if (i3 == 3) {
                return new dpkf();
            }
            if (i3 == 4) {
                return new dpjy();
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
            dssr<dpkf> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dpkf.class) {
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
}
