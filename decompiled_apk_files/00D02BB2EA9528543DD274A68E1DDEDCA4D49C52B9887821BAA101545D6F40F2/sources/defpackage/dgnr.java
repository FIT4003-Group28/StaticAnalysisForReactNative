package defpackage;
/* compiled from: PG */
/* renamed from: dgnr  reason: default package */
/* loaded from: classes6.dex */
public final class dgnr extends dsqw<dgnr, dgnq> implements dssk {
    public static final dgnr f;
    private static volatile dssr<dgnr> g;
    public int a;
    public int b;
    public dgnn c;
    public dnqe d;
    public boolean e;

    static {
        dgnr dgnrVar = new dgnr();
        f = dgnrVar;
        dsqw.cc(dgnr.class, dgnrVar);
    }

    private dgnr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဇ\u0003", new Object[]{"a", "b", dgno.a, "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dgnr();
            }
            if (i2 == 4) {
                return new dgnq();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgnr> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dgnr.class) {
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
}
