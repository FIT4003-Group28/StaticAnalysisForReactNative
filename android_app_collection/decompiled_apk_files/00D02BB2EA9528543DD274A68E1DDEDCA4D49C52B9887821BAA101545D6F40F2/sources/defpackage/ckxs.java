package defpackage;
/* compiled from: PG */
/* renamed from: ckxs  reason: default package */
/* loaded from: classes5.dex */
public final class ckxs extends dsqw<ckxs, ckxq> implements dssk {
    public static final ckxs c;
    private static volatile dssr<ckxs> d;
    public int a;
    public int b;

    static {
        ckxs ckxsVar = new ckxs();
        c = ckxsVar;
        dsqw.cc(ckxs.class, ckxsVar);
    }

    private ckxs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", ckxr.a});
            }
            if (i2 == 3) {
                return new ckxs();
            }
            if (i2 == 4) {
                return new ckxq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckxs> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ckxs.class) {
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
