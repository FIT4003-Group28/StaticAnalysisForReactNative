package defpackage;
/* compiled from: PG */
/* renamed from: dnub  reason: default package */
/* loaded from: classes.dex */
public final class dnub extends dsqw<dnub, dnua> implements dssk {
    public static final dnub d;
    private static volatile dssr<dnub> e;
    public int a;
    public dpjx b;
    public dsrj<drbv> c = dssu.b;

    static {
        dnub dnubVar = new dnub();
        d = dnubVar;
        dsqw.cc(dnub.class, dnubVar);
    }

    private dnub() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", drbv.class});
            }
            if (i2 == 3) {
                return new dnub();
            }
            if (i2 == 4) {
                return new dnua();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnub> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnub.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
