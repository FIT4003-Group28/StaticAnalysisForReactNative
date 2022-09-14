package defpackage;
/* compiled from: PG */
/* renamed from: dixm  reason: default package */
/* loaded from: classes6.dex */
public final class dixm extends dsqw<dixm, dixl> implements dssk {
    public static final dixm b;
    private static volatile dssr<dixm> d;
    public dsrj<dwmk> a;
    private byte c = 2;

    static {
        dixm dixmVar = new dixm();
        b = dixmVar;
        dsqw.cc(dixm.class, dixmVar);
    }

    private dixm() {
        dssu<Object> dssuVar = dssu.b;
        this.a = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", dwmk.class});
            }
            if (i2 == 3) {
                return new dixm();
            }
            if (i2 == 4) {
                return new dixl();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.c = b2;
                return null;
            }
            dssr<dixm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dixm.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
