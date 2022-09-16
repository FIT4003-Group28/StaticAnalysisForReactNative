package defpackage;
/* compiled from: PG */
/* renamed from: djqe  reason: default package */
/* loaded from: classes6.dex */
public final class djqe extends dsqw<djqe, djqd> implements dssk {
    public static final djqe c;
    private static volatile dssr<djqe> e;
    public String a = "";
    public djqi b;
    private int d;

    static {
        djqe djqeVar = new djqe();
        c = djqeVar;
        dsqw.cc(djqe.class, djqeVar);
    }

    private djqe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new djqe();
            }
            if (i2 == 4) {
                return new djqd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djqe> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djqe.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
