package defpackage;
/* compiled from: PG */
/* renamed from: dble  reason: default package */
/* loaded from: classes5.dex */
public final class dble extends dsqw<dble, dbld> implements dssk {
    public static final dble b;
    private static volatile dssr<dble> d;
    public String a = "";
    private int c;

    static {
        dble dbleVar = new dble();
        b = dbleVar;
        dsqw.cc(dble.class, dbleVar);
    }

    private dble() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0000\bဈ\u0002", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dble();
            }
            if (i2 == 4) {
                return new dbld();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dble> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dble.class) {
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
