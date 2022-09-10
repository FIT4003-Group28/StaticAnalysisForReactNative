package defpackage;
/* compiled from: PG */
/* renamed from: duef  reason: default package */
/* loaded from: classes6.dex */
public final class duef extends dsqw<duef, duee> implements dssk {
    public static final duef e;
    private static volatile dssr<duef> g;
    public int a;
    public double b;
    public String c = "";
    public duds d;
    private int f;

    static {
        duef duefVar = new duef();
        e = duefVar;
        dsqw.cc(duef.class, duefVar);
    }

    private duef() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002က\u0001\u0003ဈ\u0002\u0007ဉ\u0005", new Object[]{"f", "a", dued.c(), "b", "c", "d"});
            }
            if (i2 == 3) {
                return new duef();
            }
            if (i2 == 4) {
                return new duee();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duef> dssrVar = g;
            if (dssrVar == null) {
                synchronized (duef.class) {
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
