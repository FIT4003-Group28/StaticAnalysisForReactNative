package defpackage;
/* compiled from: PG */
/* renamed from: cjpm  reason: default package */
/* loaded from: classes4.dex */
public final class cjpm extends dsqw<cjpm, cjpl> implements dssk {
    public static final cjpm f;
    private static volatile dssr<cjpm> h;
    public int a;
    public agyj b;
    public agyp c;
    public long d;
    public boolean e;
    private byte g = 2;

    static {
        cjpm cjpmVar = new cjpm();
        f = cjpmVar;
        dsqw.cc(cjpm.class, cjpmVar);
    }

    private cjpm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဂ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new cjpm();
            }
            if (i2 == 4) {
                return new cjpl();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<cjpm> dssrVar = h;
            if (dssrVar == null) {
                synchronized (cjpm.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
