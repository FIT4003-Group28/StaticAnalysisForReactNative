package defpackage;
/* compiled from: PG */
/* renamed from: dilm  reason: default package */
/* loaded from: classes6.dex */
public final class dilm extends dsqw<dilm, dill> implements dssk {
    public static final dilm b;
    private static volatile dssr<dilm> c;
    public dsrj<dhwy> a = dssu.b;

    static {
        dilm dilmVar = new dilm();
        b = dilmVar;
        dsqw.cc(dilm.class, dilmVar);
    }

    private dilm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dhwy.class});
            }
            if (i2 == 3) {
                return new dilm();
            }
            if (i2 == 4) {
                return new dill();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dilm> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dilm.class) {
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
