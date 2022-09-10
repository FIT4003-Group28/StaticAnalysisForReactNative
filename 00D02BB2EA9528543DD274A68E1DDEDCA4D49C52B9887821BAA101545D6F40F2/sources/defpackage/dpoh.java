package defpackage;
/* compiled from: PG */
/* renamed from: dpoh  reason: default package */
/* loaded from: classes6.dex */
public final class dpoh extends dsqw<dpoh, dpog> implements dssk {
    public static final dpoh c;
    private static volatile dssr<dpoh> d;
    public int a;
    public dptk b;

    static {
        dpoh dpohVar = new dpoh();
        c = dpohVar;
        dsqw.cc(dpoh.class, dpohVar);
    }

    private dpoh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dpoh();
            }
            if (i2 == 4) {
                return new dpog();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpoh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpoh.class) {
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
