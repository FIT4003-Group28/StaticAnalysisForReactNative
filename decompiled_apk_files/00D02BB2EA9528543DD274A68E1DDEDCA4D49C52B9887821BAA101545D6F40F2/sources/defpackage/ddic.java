package defpackage;
/* compiled from: PG */
/* renamed from: ddic  reason: default package */
/* loaded from: classes5.dex */
public final class ddic extends dsqw<ddic, ddib> implements dssk {
    public static final ddic c;
    private static volatile dssr<ddic> f;
    public int a;
    public ddia b;
    private ddhy d;
    private byte e = 2;

    static {
        ddic ddicVar = new ddic();
        c = ddicVar;
        dsqw.cc(ddic.class, ddicVar);
    }

    private ddic() {
        dssu<Object> dssuVar = dssu.b;
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001DK\u0002\u0000\u0000\u0001Dဉ\u0015Kᐉ\u001c", new Object[]{"a", "b", "d"});
            }
            if (i2 == 3) {
                return new ddic();
            }
            if (i2 == 4) {
                return new ddib();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<ddic> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddic.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
