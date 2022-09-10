package defpackage;
/* compiled from: PG */
/* renamed from: cut  reason: default package */
/* loaded from: classes5.dex */
public final class cut extends dsqw<cut, cus> implements dssk {
    public static final cut e;
    private static volatile dssr<cut> f;
    public int a;
    public djie b;
    public String c = "";
    public boolean d;

    static {
        cut cutVar = new cut();
        e = cutVar;
        dsqw.cc(cut.class, cutVar);
    }

    private cut() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new cut();
            }
            if (i2 == 4) {
                return new cus();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cut> dssrVar = f;
            if (dssrVar == null) {
                synchronized (cut.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
