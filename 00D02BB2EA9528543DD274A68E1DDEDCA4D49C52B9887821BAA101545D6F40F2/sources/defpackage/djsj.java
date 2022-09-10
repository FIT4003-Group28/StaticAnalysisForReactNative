package defpackage;
/* compiled from: PG */
/* renamed from: djsj  reason: default package */
/* loaded from: classes6.dex */
public final class djsj extends dsqw<djsj, djsi> implements dssk {
    public static final djsj e;
    private static volatile dssr<djsj> g;
    public djag b;
    public djsl c;
    private int f;
    public String a = "";
    public String d = "";

    static {
        djsj djsjVar = new djsj();
        e = djsjVar;
        dsqw.cc(djsj.class, djsjVar);
    }

    private djsj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new djsj();
            }
            if (i2 == 4) {
                return new djsi();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djsj> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djsj.class) {
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
