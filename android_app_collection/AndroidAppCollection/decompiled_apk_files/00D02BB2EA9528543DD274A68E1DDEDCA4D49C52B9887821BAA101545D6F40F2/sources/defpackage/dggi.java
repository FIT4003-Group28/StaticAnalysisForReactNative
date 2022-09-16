package defpackage;
/* compiled from: PG */
/* renamed from: dggi  reason: default package */
/* loaded from: classes6.dex */
public final class dggi extends dsqw<dggi, dggh> implements dssk {
    public static final dggi d;
    private static volatile dssr<dggi> e;
    public int a;
    public int b;
    public int c;

    static {
        dggi dggiVar = new dggi();
        d = dggiVar;
        dsqw.cc(dggi.class, dggiVar);
    }

    private dggi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dggi();
            }
            if (i2 == 4) {
                return new dggh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dggi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dggi.class) {
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
