package defpackage;
/* compiled from: PG */
/* renamed from: dibm  reason: default package */
/* loaded from: classes6.dex */
public final class dibm extends dsqw<dibm, dibl> implements dssk {
    public static final dibm c;
    private static volatile dssr<dibm> e;
    public dsrj<dpqu> a = dssu.b;
    public dpql b;
    private int d;

    static {
        dibm dibmVar = new dibm();
        c = dibmVar;
        dsqw.cc(dibm.class, dibmVar);
    }

    private dibm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"d", "a", dpqu.class, "b"});
            }
            if (i2 == 3) {
                return new dibm();
            }
            if (i2 == 4) {
                return new dibl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dibm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dibm.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
