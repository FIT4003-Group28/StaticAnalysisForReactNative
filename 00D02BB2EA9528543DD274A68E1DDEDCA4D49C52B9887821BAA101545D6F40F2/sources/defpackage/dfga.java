package defpackage;
/* compiled from: PG */
/* renamed from: dfga  reason: default package */
/* loaded from: classes6.dex */
public final class dfga extends dsqw<dfga, dffz> implements dssk {
    public static final dfga c;
    private static volatile dssr<dfga> d;
    public int a;
    public dugy b;

    static {
        dfga dfgaVar = new dfga();
        c = dfgaVar;
        dsqw.cc(dfga.class, dfgaVar);
    }

    private dfga() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dfga();
            }
            if (i2 == 4) {
                return new dffz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfga> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfga.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
