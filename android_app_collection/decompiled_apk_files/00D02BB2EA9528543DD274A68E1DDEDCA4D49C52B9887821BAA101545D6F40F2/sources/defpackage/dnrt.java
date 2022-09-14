package defpackage;
/* compiled from: PG */
/* renamed from: dnrt  reason: default package */
/* loaded from: classes6.dex */
public final class dnrt extends dsqw<dnrt, dnrs> implements dssk {
    public static final dnrt c;
    private static volatile dssr<dnrt> d;
    public int a;
    public dniu b;

    static {
        dnrt dnrtVar = new dnrt();
        c = dnrtVar;
        dsqw.cc(dnrt.class, dnrtVar);
    }

    private dnrt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnrt();
            }
            if (i2 == 4) {
                return new dnrs();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnrt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnrt.class) {
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
