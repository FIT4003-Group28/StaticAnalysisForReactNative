package defpackage;
/* compiled from: PG */
/* renamed from: dgql  reason: default package */
/* loaded from: classes6.dex */
public final class dgql extends dsqw<dgql, dgqk> implements dssk {
    public static final dgql a;
    private static volatile dssr<dgql> e;
    private int b;
    private dgqj c;
    private byte d = 2;

    static {
        dgql dgqlVar = new dgql();
        a = dgqlVar;
        dsqw.cc(dgql.class, dgqlVar);
    }

    private dgql() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dgql();
            }
            if (i2 == 4) {
                return new dgqk();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dgql> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgql.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
