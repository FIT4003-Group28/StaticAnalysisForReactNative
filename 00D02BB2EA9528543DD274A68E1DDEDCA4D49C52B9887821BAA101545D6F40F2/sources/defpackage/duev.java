package defpackage;
/* compiled from: PG */
/* renamed from: duev  reason: default package */
/* loaded from: classes6.dex */
public final class duev extends dsqw<duev, dueu> implements dssk {
    public static final duev b;
    private static volatile dssr<duev> c;
    public dsrj<dugc> a;

    static {
        duev duevVar = new duev();
        b = duevVar;
        dsqw.cc(duev.class, duevVar);
    }

    private duev() {
        dssu<Object> dssuVar = dssu.b;
        this.a = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"a", dugc.class});
            }
            if (i2 == 3) {
                return new duev();
            }
            if (i2 == 4) {
                return new dueu();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duev> dssrVar = c;
            if (dssrVar == null) {
                synchronized (duev.class) {
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
