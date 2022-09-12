package defpackage;
/* compiled from: PG */
/* renamed from: dzyk  reason: default package */
/* loaded from: classes6.dex */
public final class dzyk extends dsqw<dzyk, dzyj> implements dssk {
    public static final dzyk e;
    private static volatile dssr<dzyk> f;
    public int a;
    public dsrj<dzyq> b = dssu.b;
    public dsrj<dzyg> c = dssu.b;
    public dzyi d;

    static {
        dzyk dzykVar = new dzyk();
        e = dzykVar;
        dsqw.cc(dzyk.class, dzykVar);
    }

    private dzyk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"a", "b", dzyq.class, "c", dzyg.class, "d"});
            }
            if (i2 == 3) {
                return new dzyk();
            }
            if (i2 == 4) {
                return new dzyj();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dzyk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dzyk.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
