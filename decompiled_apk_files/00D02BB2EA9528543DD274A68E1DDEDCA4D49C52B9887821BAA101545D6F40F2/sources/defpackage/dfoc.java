package defpackage;
/* compiled from: PG */
/* renamed from: dfoc  reason: default package */
/* loaded from: classes6.dex */
public final class dfoc extends dsqw<dfoc, dfnz> implements dssk {
    public static final dfoc d;
    private static volatile dssr<dfoc> e;
    public int a;
    public int b;
    public int c;

    static {
        dfoc dfocVar = new dfoc();
        d = dfocVar;
        dsqw.cc(dfoc.class, dfocVar);
    }

    private dfoc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", dfob.a, "c", dfoa.a});
            }
            if (i2 == 3) {
                return new dfoc();
            }
            if (i2 == 4) {
                return new dfnz();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfoc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfoc.class) {
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
