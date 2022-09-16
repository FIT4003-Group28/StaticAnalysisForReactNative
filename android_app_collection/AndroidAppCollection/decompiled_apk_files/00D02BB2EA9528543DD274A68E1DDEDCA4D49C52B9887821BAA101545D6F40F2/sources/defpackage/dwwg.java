package defpackage;
/* compiled from: PG */
/* renamed from: dwwg  reason: default package */
/* loaded from: classes.dex */
public final class dwwg extends dsqw<dwwg, dwwf> implements dssk {
    public static final dwwg e;
    private static volatile dssr<dwwg> g;
    public boolean a;
    public boolean b;
    public int c = 3;
    public float d = 0.7f;
    private int f;

    static {
        dwwg dwwgVar = new dwwg();
        e = dwwgVar;
        dsqw.cc(dwwg.class, dwwgVar);
    }

    private dwwg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ခ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dwwg();
            }
            if (i2 == 4) {
                return new dwwf();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwwg> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dwwg.class) {
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
