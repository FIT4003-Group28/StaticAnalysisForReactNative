package defpackage;
/* compiled from: PG */
/* renamed from: drek  reason: default package */
/* loaded from: classes6.dex */
public final class drek extends dsqw<drek, drej> implements dssk {
    public static final drek a;
    private static volatile dssr<drek> b;

    static {
        drek drekVar = new drek();
        a = drekVar;
        dsqw.cc(drek.class, drekVar);
    }

    private drek() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new drek();
            }
            if (i2 == 4) {
                return new drej();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drek> dssrVar = b;
            if (dssrVar == null) {
                synchronized (drek.class) {
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
