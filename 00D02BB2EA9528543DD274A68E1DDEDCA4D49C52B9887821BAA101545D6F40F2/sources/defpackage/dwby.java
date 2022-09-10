package defpackage;
/* compiled from: PG */
/* renamed from: dwby  reason: default package */
/* loaded from: classes6.dex */
public final class dwby extends dsqw<dwby, dwbx> implements dssk {
    public static final dwby c;
    private static volatile dssr<dwby> d;
    public int a;
    public dpum b;

    static {
        dwby dwbyVar = new dwby();
        c = dwbyVar;
        dsqw.cc(dwby.class, dwbyVar);
    }

    private dwby() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dwby();
            }
            if (i2 == 4) {
                return new dwbx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwby> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwby.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
