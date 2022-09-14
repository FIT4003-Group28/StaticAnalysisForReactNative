package defpackage;
/* compiled from: PG */
/* renamed from: dfhx  reason: default package */
/* loaded from: classes6.dex */
public final class dfhx extends dsqw<dfhx, dfhq> implements dssk {
    public static final dfhx b;
    private static volatile dssr<dfhx> d;
    private byte c = 2;
    public dsrj<dfhs> a = dssu.b;

    static {
        dfhx dfhxVar = new dfhx();
        b = dfhxVar;
        dsqw.cc(dfhx.class, dfhxVar);
    }

    private dfhx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dfhs.class});
            }
            if (i2 == 3) {
                return new dfhx();
            }
            if (i2 == 4) {
                return new dfhq();
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
            dssr<dfhx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfhx.class) {
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
