package defpackage;
/* compiled from: PG */
/* renamed from: dndn  reason: default package */
/* loaded from: classes.dex */
public final class dndn extends dsqw<dndn, dndm> implements dssk {
    public static final dndn c;
    private static volatile dssr<dndn> d;
    public int a;
    public dndj b;

    static {
        dndn dndnVar = new dndn();
        c = dndnVar;
        dsqw.cc(dndn.class, dndnVar);
    }

    private dndn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dndn();
            }
            if (i2 == 4) {
                return new dndm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dndn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dndn.class) {
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
