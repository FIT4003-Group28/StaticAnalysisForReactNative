package defpackage;
/* compiled from: PG */
/* renamed from: dneh  reason: default package */
/* loaded from: classes6.dex */
public final class dneh extends dsqw<dneh, dneg> implements dssk {
    public static final dneh c;
    private static volatile dssr<dneh> e;
    public boolean a;
    public boolean b;
    private int d;

    static {
        dneh dnehVar = new dneh();
        c = dnehVar;
        dsqw.cc(dneh.class, dnehVar);
    }

    private dneh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dneh();
            }
            if (i2 == 4) {
                return new dneg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dneh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dneh.class) {
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
