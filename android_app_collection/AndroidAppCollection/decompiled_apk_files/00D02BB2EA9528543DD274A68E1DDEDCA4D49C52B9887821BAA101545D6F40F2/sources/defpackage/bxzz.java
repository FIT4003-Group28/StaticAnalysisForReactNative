package defpackage;
/* compiled from: PG */
/* renamed from: bxzz  reason: default package */
/* loaded from: classes4.dex */
public final class bxzz extends dsqw<bxzz, bxzy> implements dssk {
    public static final bxzz d;
    private static volatile dssr<bxzz> f;
    public int a;
    public dgrt b;
    public int c;
    private byte e = 2;

    static {
        bxzz bxzzVar = new bxzz();
        d = bxzzVar;
        dsqw.cc(bxzz.class, bxzzVar);
    }

    private bxzz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new bxzz();
            }
            if (i2 == 4) {
                return new bxzy();
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
            dssr<bxzz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (bxzz.class) {
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
