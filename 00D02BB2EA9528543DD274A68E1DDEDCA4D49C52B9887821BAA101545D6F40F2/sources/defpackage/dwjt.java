package defpackage;
/* compiled from: PG */
/* renamed from: dwjt  reason: default package */
/* loaded from: classes.dex */
public final class dwjt extends dsqw<dwjt, dwjs> implements dssk {
    public static final dwjt b;
    private static volatile dssr<dwjt> c;
    public dsrj<dosd> a = dssu.b;

    static {
        dwjt dwjtVar = new dwjt();
        b = dwjtVar;
        dsqw.cc(dwjt.class, dwjtVar);
    }

    private dwjt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dosd.class});
            }
            if (i2 == 3) {
                return new dwjt();
            }
            if (i2 == 4) {
                return new dwjs();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwjt> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dwjt.class) {
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
