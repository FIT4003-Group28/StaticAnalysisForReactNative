package defpackage;
/* compiled from: PG */
/* renamed from: dtbk  reason: default package */
/* loaded from: classes.dex */
public final class dtbk extends dsqw<dtbk, dtbj> implements dssk {
    public static final dtbk d;
    private static volatile dssr<dtbk> f;
    public int a;
    public long b;
    public long c;
    private byte e = 2;

    static {
        dtbk dtbkVar = new dtbk();
        d = dtbkVar;
        dsqw.cc(dtbk.class, dtbkVar);
    }

    private dtbk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔅ\u0000\u0002ᔅ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dtbk();
            }
            if (i2 == 4) {
                return new dtbj();
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
            dssr<dtbk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtbk.class) {
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
