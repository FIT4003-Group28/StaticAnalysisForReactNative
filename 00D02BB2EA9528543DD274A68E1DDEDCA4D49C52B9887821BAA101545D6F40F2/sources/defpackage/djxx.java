package defpackage;
/* compiled from: PG */
/* renamed from: djxx  reason: default package */
/* loaded from: classes6.dex */
public final class djxx extends dsqw<djxx, djxu> implements dssk {
    public static final djxx d;
    private static volatile dssr<djxx> f;
    public int a;
    public int b;
    public djxo c;
    private byte e = 2;

    static {
        djxx djxxVar = new djxx();
        d = djxxVar;
        dsqw.cc(djxx.class, djxxVar);
    }

    private djxx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", djxv.a, "c"});
            }
            if (i2 == 3) {
                return new djxx();
            }
            if (i2 == 4) {
                return new djxu();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<djxx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djxx.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
