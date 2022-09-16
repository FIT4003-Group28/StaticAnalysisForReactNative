package defpackage;
/* compiled from: PG */
/* renamed from: dgoo  reason: default package */
/* loaded from: classes6.dex */
public final class dgoo extends dsqw<dgoo, dgon> implements dssk {
    public static final dgoo a;
    private static volatile dssr<dgoo> b;

    static {
        dgoo dgooVar = new dgoo();
        a = dgooVar;
        dsqw.cc(dgoo.class, dgooVar);
    }

    private dgoo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dgoo();
            }
            if (i2 == 4) {
                return new dgon();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgoo> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dgoo.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
