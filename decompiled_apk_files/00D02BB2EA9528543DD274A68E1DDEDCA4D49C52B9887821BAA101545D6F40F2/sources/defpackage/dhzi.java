package defpackage;
/* compiled from: PG */
/* renamed from: dhzi  reason: default package */
/* loaded from: classes6.dex */
public final class dhzi extends dsqw<dhzi, dhzh> implements dssk {
    public static final dhzi a;
    private static volatile dssr<dhzi> c;
    private byte b = 2;

    static {
        dhzi dhziVar = new dhzi();
        a = dhziVar;
        dsqw.cc(dhzi.class, dhziVar);
    }

    private dhzi() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhzi();
            }
            if (i2 == 4) {
                return new dhzh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dhzi> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dhzi.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.b);
    }
}
