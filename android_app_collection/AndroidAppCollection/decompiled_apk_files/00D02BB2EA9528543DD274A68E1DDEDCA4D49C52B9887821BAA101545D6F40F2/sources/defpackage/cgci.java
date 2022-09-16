package defpackage;
/* compiled from: PG */
/* renamed from: cgci  reason: default package */
/* loaded from: classes4.dex */
public final class cgci extends dsqw<cgci, cgch> implements dssk {
    public static final cgci d;
    private static volatile dssr<cgci> e;
    public int a;
    public dqwa b;
    public dqam c;

    static {
        cgci cgciVar = new cgci();
        d = cgciVar;
        dsqw.cc(cgci.class, cgciVar);
    }

    private cgci() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new cgci();
            }
            if (i2 == 4) {
                return new cgch();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cgci> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cgci.class) {
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
}
