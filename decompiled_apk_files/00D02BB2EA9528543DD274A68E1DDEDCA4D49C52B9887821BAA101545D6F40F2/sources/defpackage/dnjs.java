package defpackage;
/* compiled from: PG */
/* renamed from: dnjs  reason: default package */
/* loaded from: classes6.dex */
public final class dnjs extends dsqw<dnjs, dnjr> implements dssk {
    public static final dnjs a;
    private static volatile dssr<dnjs> b;

    static {
        dnjs dnjsVar = new dnjs();
        a = dnjsVar;
        dsqw.cc(dnjs.class, dnjsVar);
    }

    private dnjs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dnjs();
            }
            if (i2 == 4) {
                return new dnjr();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnjs> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dnjs.class) {
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
