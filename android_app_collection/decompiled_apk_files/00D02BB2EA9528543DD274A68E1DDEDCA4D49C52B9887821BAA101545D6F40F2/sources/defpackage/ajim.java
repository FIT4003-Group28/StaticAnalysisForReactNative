package defpackage;
/* compiled from: PG */
/* renamed from: ajim  reason: default package */
/* loaded from: classes2.dex */
public final class ajim extends dsqw<ajim, ajil> implements dssk {
    public static final ajim b;
    private static volatile dssr<ajim> c;
    public dsrj<ajiq> a = dssu.b;

    static {
        ajim ajimVar = new ajim();
        b = ajimVar;
        dsqw.cc(ajim.class, ajimVar);
    }

    private ajim() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"a", ajiq.class});
            }
            if (i2 == 3) {
                return new ajim();
            }
            if (i2 == 4) {
                return new ajil();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ajim> dssrVar = c;
            if (dssrVar == null) {
                synchronized (ajim.class) {
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
