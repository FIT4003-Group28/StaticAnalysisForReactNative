package defpackage;
/* compiled from: PG */
/* renamed from: duzo  reason: default package */
/* loaded from: classes6.dex */
public final class duzo extends dsqw<duzo, duzl> implements dssk {
    public static final duzo b;
    private static volatile dssr<duzo> c;
    public dsrj<duzn> a = dssu.b;

    static {
        duzo duzoVar = new duzo();
        b = duzoVar;
        dsqw.cc(duzo.class, duzoVar);
    }

    private duzo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", duzn.class});
            }
            if (i2 == 3) {
                return new duzo();
            }
            if (i2 == 4) {
                return new duzl();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duzo> dssrVar = c;
            if (dssrVar == null) {
                synchronized (duzo.class) {
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
