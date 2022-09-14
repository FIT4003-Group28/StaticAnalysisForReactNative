package defpackage;
/* compiled from: PG */
/* renamed from: dtmz  reason: default package */
/* loaded from: classes6.dex */
public final class dtmz extends dsqs<dtmz, dtmy> implements dsqt {
    public static final dtmz a;
    private static volatile dssr<dtmz> h;
    private int b;
    private dtmj c;
    private dtqk d;
    private dtot e;
    private dtop f;
    private byte g = 2;

    static {
        dtmz dtmzVar = new dtmz();
        a = dtmzVar;
        dsqw.cc(dtmz.class, dtmzVar);
    }

    private dtmz() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0004\u0000\u0001\u0012ϫ\u0004\u0000\u0000\u0004\u0012ᐉ\u0000\u001bᐉ\u00076ᐉ\u000eϫᐉ\u000f", new Object[]{"b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dtmz();
            }
            if (i2 == 4) {
                return new dtmy();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dtmz> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dtmz.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
