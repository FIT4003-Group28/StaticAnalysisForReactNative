package defpackage;
/* compiled from: PG */
/* renamed from: dlqm  reason: default package */
/* loaded from: classes6.dex */
public final class dlqm extends dsqw<dlqm, dlqj> implements dssk {
    public static final dlqm b;
    private static volatile dssr<dlqm> d;
    private byte c = 2;
    public dsrj<dlql> a = dssu.b;

    static {
        dlqm dlqmVar = new dlqm();
        b = dlqmVar;
        dsqw.cc(dlqm.class, dlqmVar);
    }

    private dlqm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0001\u0001\u0004Л", new Object[]{"a", dlql.class});
            }
            if (i2 == 3) {
                return new dlqm();
            }
            if (i2 == 4) {
                return new dlqj();
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
            dssr<dlqm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlqm.class) {
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
