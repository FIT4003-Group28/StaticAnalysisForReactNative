package defpackage;
/* compiled from: PG */
/* renamed from: duas  reason: default package */
/* loaded from: classes6.dex */
public final class duas extends dsqw<duas, duar> implements dssk {
    public static final duas c;
    private static volatile dssr<duas> d;
    public dubn a;
    public ducf b;

    static {
        duas duasVar = new duas();
        c = duasVar;
        dsqw.cc(duas.class, duasVar);
    }

    private duas() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\t\u0003\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new duas();
            }
            if (i2 == 4) {
                return new duar();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duas> dssrVar = d;
            if (dssrVar == null) {
                synchronized (duas.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
