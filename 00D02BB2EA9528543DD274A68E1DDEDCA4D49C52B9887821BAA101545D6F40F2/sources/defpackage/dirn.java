package defpackage;
/* compiled from: PG */
/* renamed from: dirn  reason: default package */
/* loaded from: classes6.dex */
public final class dirn extends dsqw<dirn, dirm> implements dssk {
    public static final dirn a;
    private static volatile dssr<dirn> b;

    static {
        dirn dirnVar = new dirn();
        a = dirnVar;
        dsqw.cc(dirn.class, dirnVar);
    }

    private dirn() {
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
                return new dirn();
            }
            if (i2 == 4) {
                return new dirm();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dirn> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dirn.class) {
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
