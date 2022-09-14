package defpackage;
/* compiled from: PG */
/* renamed from: duaw  reason: default package */
/* loaded from: classes6.dex */
public final class duaw extends dsqw<duaw, duav> implements dssk {
    public static final duaw a;
    private static volatile dssr<duaw> b;

    static {
        duaw duawVar = new duaw();
        a = duawVar;
        dsqw.cc(duaw.class, duawVar);
    }

    private duaw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new duaw();
            }
            if (i2 == 4) {
                return new duav();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duaw> dssrVar = b;
            if (dssrVar == null) {
                synchronized (duaw.class) {
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
