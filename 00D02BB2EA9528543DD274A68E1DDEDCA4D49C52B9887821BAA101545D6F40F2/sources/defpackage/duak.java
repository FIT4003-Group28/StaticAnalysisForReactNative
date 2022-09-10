package defpackage;
/* compiled from: PG */
/* renamed from: duak  reason: default package */
/* loaded from: classes.dex */
public final class duak extends dsqw<duak, duaj> implements dssk {
    public static final duak b;
    private static volatile dssr<duak> c;
    public duan a;

    static {
        duak duakVar = new duak();
        b = duakVar;
        dsqw.cc(duak.class, duakVar);
    }

    private duak() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new duak();
            }
            if (i2 == 4) {
                return new duaj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duak> dssrVar = c;
            if (dssrVar == null) {
                synchronized (duak.class) {
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
