package defpackage;
/* compiled from: PG */
/* renamed from: dlwg  reason: default package */
/* loaded from: classes.dex */
public final class dlwg extends dsqw<dlwg, dlwf> implements dssk {
    public static final dlwg e;
    private static volatile dssr<dlwg> g;
    public long a;
    public float b;
    public String c = "";
    public String d = "";
    private int f;

    static {
        dlwg dlwgVar = new dlwg();
        e = dlwgVar;
        dsqw.cc(dlwg.class, dlwgVar);
    }

    private dlwg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဃ\u0000\u0002ခ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dlwg();
            }
            if (i2 == 4) {
                return new dlwf();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlwg> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlwg.class) {
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
