package defpackage;
/* compiled from: PG */
/* renamed from: dhgz  reason: default package */
/* loaded from: classes6.dex */
public final class dhgz extends dsqw<dhgz, dhgy> implements dssk {
    public static final dhgz a;
    private static volatile dssr<dhgz> b;

    static {
        dhgz dhgzVar = new dhgz();
        a = dhgzVar;
        dsqw.cc(dhgz.class, dhgzVar);
    }

    private dhgz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhgz();
            }
            if (i2 == 4) {
                return new dhgy();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhgz> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhgz.class) {
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
