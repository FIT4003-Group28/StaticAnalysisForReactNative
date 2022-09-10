package defpackage;
/* compiled from: PG */
/* renamed from: dlxg  reason: default package */
/* loaded from: classes6.dex */
public final class dlxg extends dsqw<dlxg, dlxf> implements dssk {
    public static final dlxg e;
    private static volatile dssr<dlxg> g;
    public float a;
    public float b;
    public float c;
    public float d;
    private int f;

    static {
        dlxg dlxgVar = new dlxg();
        e = dlxgVar;
        dsqw.cc(dlxg.class, dlxgVar);
    }

    private dlxg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dlxg();
            }
            if (i2 == 4) {
                return new dlxf();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlxg> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlxg.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
