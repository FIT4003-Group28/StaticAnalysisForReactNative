package defpackage;
/* compiled from: PG */
/* renamed from: ddmg  reason: default package */
/* loaded from: classes6.dex */
public final class ddmg extends dsqw<ddmg, ddmf> implements dssk {
    public static final ddmg f;
    private static volatile dssr<ddmg> g;
    public int a;
    public int b;
    public float c;
    public float d;
    public float e;

    static {
        ddmg ddmgVar = new ddmg();
        f = ddmgVar;
        dsqw.cc(ddmg.class, ddmgVar);
    }

    private ddmg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new ddmg();
            }
            if (i2 == 4) {
                return new ddmf();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddmg> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ddmg.class) {
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
