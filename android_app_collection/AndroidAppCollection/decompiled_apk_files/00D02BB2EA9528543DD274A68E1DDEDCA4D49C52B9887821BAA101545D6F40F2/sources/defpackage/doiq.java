package defpackage;
/* compiled from: PG */
/* renamed from: doiq  reason: default package */
/* loaded from: classes6.dex */
public final class doiq extends dsqw<doiq, doil> implements dssk {
    public static final doiq b;
    private static volatile dssr<doiq> c;
    public dsrj<doip> a = dssu.b;

    static {
        doiq doiqVar = new doiq();
        b = doiqVar;
        dsqw.cc(doiq.class, doiqVar);
    }

    private doiq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", doip.class});
            }
            if (i2 == 3) {
                return new doiq();
            }
            if (i2 == 4) {
                return new doil();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doiq> dssrVar = c;
            if (dssrVar == null) {
                synchronized (doiq.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
