package defpackage;
/* compiled from: PG */
/* renamed from: dlql  reason: default package */
/* loaded from: classes6.dex */
public final class dlql extends dsqw<dlql, dlqk> implements dssk {
    public static final dlql d;
    private static volatile dssr<dlql> g;
    public dlsw a;
    public dlug b;
    public dlug c;
    private int e;
    private byte f = 2;

    static {
        dlql dlqlVar = new dlql();
        d = dlqlVar;
        dsqw.cc(dlql.class, dlqlVar);
    }

    private dlql() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dlql();
            }
            if (i2 == 4) {
                return new dlqk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dlql> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlql.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
