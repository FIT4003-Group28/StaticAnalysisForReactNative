package defpackage;
/* compiled from: PG */
/* renamed from: dueh  reason: default package */
/* loaded from: classes6.dex */
public final class dueh extends dsqw<dueh, dueg> implements dssk {
    public static final dueh a;
    private static volatile dssr<dueh> b;

    static {
        dueh duehVar = new dueh();
        a = duehVar;
        dsqw.cc(dueh.class, duehVar);
    }

    private dueh() {
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
                return new dueh();
            }
            if (i2 == 4) {
                return new dueg();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dueh> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dueh.class) {
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
