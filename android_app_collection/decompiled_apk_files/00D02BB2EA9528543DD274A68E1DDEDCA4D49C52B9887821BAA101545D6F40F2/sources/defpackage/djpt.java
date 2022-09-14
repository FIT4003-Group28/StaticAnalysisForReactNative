package defpackage;
/* compiled from: PG */
/* renamed from: djpt  reason: default package */
/* loaded from: classes6.dex */
public final class djpt extends dsqw<djpt, djps> implements dssk {
    public static final djpt b;
    private static volatile dssr<djpt> c;
    public dsrj<drhn> a = dssu.b;

    static {
        djpt djptVar = new djpt();
        b = djptVar;
        dsqw.cc(djpt.class, djptVar);
    }

    private djpt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", drhn.class});
            }
            if (i2 == 3) {
                return new djpt();
            }
            if (i2 == 4) {
                return new djps();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djpt> dssrVar = c;
            if (dssrVar == null) {
                synchronized (djpt.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
