package defpackage;
/* compiled from: PG */
/* renamed from: ddwh  reason: default package */
/* loaded from: classes6.dex */
public final class ddwh extends dsqw<ddwh, ddwg> implements dssk {
    public static final ddwh f;
    private static volatile dssr<ddwh> g;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    static {
        ddwh ddwhVar = new ddwh();
        f = ddwhVar;
        dsqw.cc(ddwh.class, ddwhVar);
    }

    private ddwh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new ddwh();
            }
            if (i2 == 4) {
                return new ddwg();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddwh> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ddwh.class) {
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
