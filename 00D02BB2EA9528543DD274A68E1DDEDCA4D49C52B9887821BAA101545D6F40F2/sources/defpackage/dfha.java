package defpackage;
/* compiled from: PG */
/* renamed from: dfha  reason: default package */
/* loaded from: classes6.dex */
public final class dfha extends dsqw<dfha, dfgz> implements dssk {
    public static final dfha b;
    private static volatile dssr<dfha> d;
    public float a;
    private int c;

    static {
        dfha dfhaVar = new dfha();
        b = dfhaVar;
        dsqw.cc(dfha.class, dfhaVar);
    }

    private dfha() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dfha();
            }
            if (i2 == 4) {
                return new dfgz();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfha> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfha.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
