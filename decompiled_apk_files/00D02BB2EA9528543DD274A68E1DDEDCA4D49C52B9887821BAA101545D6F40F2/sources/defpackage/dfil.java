package defpackage;
/* compiled from: PG */
/* renamed from: dfil  reason: default package */
/* loaded from: classes6.dex */
public final class dfil extends dsqw<dfil, dfik> implements dssk {
    public static final dfil f;
    private static volatile dssr<dfil> g;
    public int a;
    public float b = 42.0f;
    public float c = 42.0f;
    public float d = 14.0f;
    public float e = 139.0f;

    static {
        dfil dfilVar = new dfil();
        f = dfilVar;
        dsqw.cc(dfil.class, dfilVar);
    }

    private dfil() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dfil();
            }
            if (i2 == 4) {
                return new dfik();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfil> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dfil.class) {
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
