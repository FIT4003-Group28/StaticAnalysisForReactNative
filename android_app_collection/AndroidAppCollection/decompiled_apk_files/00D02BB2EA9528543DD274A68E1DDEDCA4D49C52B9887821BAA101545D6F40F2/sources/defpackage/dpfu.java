package defpackage;
/* compiled from: PG */
/* renamed from: dpfu  reason: default package */
/* loaded from: classes6.dex */
public final class dpfu extends dsqw<dpfu, dpfr> implements dssk {
    public static final dpfu e;
    private static volatile dssr<dpfu> g;
    public int b;
    public int c;
    private int f;
    public String a = "";
    public String d = "";

    static {
        dpfu dpfuVar = new dpfu();
        e = dpfuVar;
        dsqw.cc(dpfu.class, dpfuVar);
    }

    private dpfu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0002\u0003ဈ\u0003\u0004င\u0001", new Object[]{"f", "a", "c", dpft.c(), "d", "b"});
            }
            if (i2 == 3) {
                return new dpfu();
            }
            if (i2 == 4) {
                return new dpfr();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpfu> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dpfu.class) {
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
