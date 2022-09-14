package defpackage;
/* compiled from: PG */
/* renamed from: dsob  reason: default package */
/* loaded from: classes6.dex */
public final class dsob extends dsqw<dsob, dsnx> implements dssk {
    public static final dsob g;
    private static volatile dssr<dsob> h;
    public int a;
    public dsoa c;
    public int d;
    public dsnw f;
    public String b = "";
    public String e = "";

    static {
        dsob dsobVar = new dsob();
        g = dsobVar;
        dsqw.cc(dsob.class, dsobVar);
    }

    private dsob() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဈ\u0003\u0007ဉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dsob();
            }
            if (i2 == 4) {
                return new dsnx();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsob> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dsob.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
