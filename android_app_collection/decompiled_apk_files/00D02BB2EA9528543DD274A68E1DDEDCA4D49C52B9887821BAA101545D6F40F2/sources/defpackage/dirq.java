package defpackage;
/* compiled from: PG */
/* renamed from: dirq  reason: default package */
/* loaded from: classes6.dex */
public final class dirq extends dsqw<dirq, dirp> implements dssk {
    public static final dirq a;
    private static volatile dssr<dirq> b;

    static {
        dirq dirqVar = new dirq();
        a = dirqVar;
        dsqw.cc(dirq.class, dirqVar);
    }

    private dirq() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dirq();
            }
            if (i2 == 4) {
                return new dirp();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dirq> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dirq.class) {
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
