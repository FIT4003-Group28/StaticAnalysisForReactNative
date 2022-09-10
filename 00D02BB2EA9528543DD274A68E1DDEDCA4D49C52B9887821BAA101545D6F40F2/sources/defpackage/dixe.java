package defpackage;
/* compiled from: PG */
/* renamed from: dixe  reason: default package */
/* loaded from: classes.dex */
public final class dixe extends dsqw<dixe, dixd> implements dssk {
    public static final dixe b;
    private static volatile dssr<dixe> c;
    public dsrj<dweu> a = dssu.b;

    static {
        dixe dixeVar = new dixe();
        b = dixeVar;
        dsqw.cc(dixe.class, dixeVar);
    }

    private dixe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dweu.class});
            }
            if (i2 == 3) {
                return new dixe();
            }
            if (i2 == 4) {
                return new dixd();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dixe> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dixe.class) {
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
