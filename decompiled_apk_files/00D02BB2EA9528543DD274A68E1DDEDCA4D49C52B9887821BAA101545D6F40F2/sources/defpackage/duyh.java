package defpackage;
/* compiled from: PG */
/* renamed from: duyh  reason: default package */
/* loaded from: classes.dex */
public final class duyh extends dsqw<duyh, duyg> implements dssk {
    public static final duyh f;
    private static volatile dssr<duyh> h;
    public String a = "";
    public String b = "";
    public drcy c;
    public int d;
    public int e;
    private int g;

    static {
        duyh duyhVar = new duyh();
        f = duyhVar;
        dsqw.cc(duyh.class, duyhVar);
    }

    private duyh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"g", "a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new duyh();
            }
            if (i2 == 4) {
                return new duyg();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duyh> dssrVar = h;
            if (dssrVar == null) {
                synchronized (duyh.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
