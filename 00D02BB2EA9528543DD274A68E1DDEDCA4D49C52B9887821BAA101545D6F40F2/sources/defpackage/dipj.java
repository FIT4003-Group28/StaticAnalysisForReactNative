package defpackage;
/* compiled from: PG */
/* renamed from: dipj  reason: default package */
/* loaded from: classes6.dex */
public final class dipj extends dsqw<dipj, dipi> implements dssk {
    public static final dipj c;
    private static volatile dssr<dipj> e;
    public long a;
    public diox b;
    private int d;

    static {
        dipj dipjVar = new dipj();
        c = dipjVar;
        dsqw.cc(dipj.class, dipjVar);
    }

    private dipj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dipj();
            }
            if (i2 == 4) {
                return new dipi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dipj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dipj.class) {
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
