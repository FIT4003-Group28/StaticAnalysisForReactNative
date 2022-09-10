package defpackage;
/* compiled from: PG */
/* renamed from: ckwn  reason: default package */
/* loaded from: classes5.dex */
public final class ckwn extends dsqw<ckwn, ckwk> implements dssk {
    public static final ckwn c;
    private static volatile dssr<ckwn> d;
    public int a;
    public int b;

    static {
        ckwn ckwnVar = new ckwn();
        c = ckwnVar;
        dsqw.cc(ckwn.class, ckwnVar);
    }

    private ckwn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", ckwl.a});
            }
            if (i2 == 3) {
                return new ckwn();
            }
            if (i2 == 4) {
                return new ckwk();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckwn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ckwn.class) {
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
