package defpackage;
/* compiled from: PG */
/* renamed from: cbts  reason: default package */
/* loaded from: classes4.dex */
public final class cbts extends dsqw<cbts, cbtr> implements dssk {
    public static final cbts e;
    private static volatile dssr<cbts> g;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    private int f;

    static {
        cbts cbtsVar = new cbts();
        e = cbtsVar;
        dsqw.cc(cbts.class, cbtsVar);
    }

    private cbts() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new cbts();
            }
            if (i2 == 4) {
                return new cbtr();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cbts> dssrVar = g;
            if (dssrVar == null) {
                synchronized (cbts.class) {
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
