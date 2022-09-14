package defpackage;
/* compiled from: PG */
/* renamed from: doht  reason: default package */
/* loaded from: classes6.dex */
public final class doht extends dsqw<doht, doho> implements dssk {
    public static final doht b;
    private static volatile dssr<doht> c;
    public dsrj<dohs> a = dssu.b;

    static {
        doht dohtVar = new doht();
        b = dohtVar;
        dsqw.cc(doht.class, dohtVar);
    }

    private doht() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dohs.class});
            }
            if (i2 == 3) {
                return new doht();
            }
            if (i2 == 4) {
                return new doho();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doht> dssrVar = c;
            if (dssrVar == null) {
                synchronized (doht.class) {
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
