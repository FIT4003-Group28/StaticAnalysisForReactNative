package defpackage;
/* compiled from: PG */
/* renamed from: dsxt  reason: default package */
/* loaded from: classes6.dex */
public final class dsxt extends dsqw<dsxt, dsxs> implements dssk {
    public static final dsxt a;
    private static volatile dssr<dsxt> f;
    private int b;
    private dsxn c;
    private dsxn d;
    private byte e = 2;

    static {
        dsxt dsxtVar = new dsxt();
        a = dsxtVar;
        dsqw.cc(dsxt.class, dsxtVar);
    }

    private dsxt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0002\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new dsxt();
            }
            if (i2 == 4) {
                return new dsxs();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dsxt> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dsxt.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
