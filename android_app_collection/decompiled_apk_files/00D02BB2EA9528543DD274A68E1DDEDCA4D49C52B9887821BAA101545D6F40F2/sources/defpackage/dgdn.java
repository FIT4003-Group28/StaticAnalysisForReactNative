package defpackage;
/* compiled from: PG */
/* renamed from: dgdn  reason: default package */
/* loaded from: classes6.dex */
public final class dgdn extends dsqw<dgdn, dgdm> implements dssk {
    public static final dgdn d;
    private static volatile dssr<dgdn> e;
    public int a;
    public dgdy b;
    public dgea c;

    static {
        dgdn dgdnVar = new dgdn();
        d = dgdnVar;
        dsqw.cc(dgdn.class, dgdnVar);
    }

    private dgdn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dgdn();
            }
            if (i2 == 4) {
                return new dgdm();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgdn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgdn.class) {
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
