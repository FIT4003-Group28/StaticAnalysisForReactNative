package defpackage;
/* compiled from: PG */
/* renamed from: dilj  reason: default package */
/* loaded from: classes6.dex */
public final class dilj extends dsqw<dilj, dili> implements dssk {
    public static final dilj c;
    private static volatile dssr<dilj> d;
    public int a;
    public int b;

    static {
        dilj diljVar = new dilj();
        c = diljVar;
        dsqw.cc(dilj.class, diljVar);
    }

    private dilj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dilj();
            }
            if (i2 == 4) {
                return new dili();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dilj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dilj.class) {
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
