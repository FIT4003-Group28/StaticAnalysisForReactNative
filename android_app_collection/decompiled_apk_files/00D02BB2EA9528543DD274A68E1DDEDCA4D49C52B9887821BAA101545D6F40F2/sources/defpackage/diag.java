package defpackage;
/* compiled from: PG */
/* renamed from: diag  reason: default package */
/* loaded from: classes6.dex */
public final class diag extends dsqw<diag, diaf> implements dssk {
    public static final diag b;
    private static volatile dssr<diag> c;
    public dsrj<dqqx> a = dssu.b;

    static {
        diag diagVar = new diag();
        b = diagVar;
        dsqw.cc(diag.class, diagVar);
    }

    private diag() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dqqx.class});
            }
            if (i2 == 3) {
                return new diag();
            }
            if (i2 == 4) {
                return new diaf();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diag> dssrVar = c;
            if (dssrVar == null) {
                synchronized (diag.class) {
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
