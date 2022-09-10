package defpackage;
/* compiled from: PG */
/* renamed from: dfgi  reason: default package */
/* loaded from: classes6.dex */
public final class dfgi extends dsqw<dfgi, dfgh> implements dssk {
    public static final dfgi d;
    private static volatile dssr<dfgi> e;
    public int a;
    public float b;
    public dfgo c;

    static {
        dfgi dfgiVar = new dfgi();
        d = dfgiVar;
        dsqw.cc(dfgi.class, dfgiVar);
    }

    private dfgi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dfgi();
            }
            if (i2 == 4) {
                return new dfgh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfgi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfgi.class) {
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
