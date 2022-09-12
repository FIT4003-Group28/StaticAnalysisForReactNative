package defpackage;
/* compiled from: PG */
/* renamed from: dopf  reason: default package */
/* loaded from: classes6.dex */
public final class dopf extends dsqw<dopf, dopc> implements dssk {
    public static final dopf h;
    private static volatile dssr<dopf> j;
    public int a;
    public int b;
    public dnoh d;
    private byte i = 2;
    public String c = "";
    public String e = "";
    public dsrj<douj> f = dssu.b;
    public dsrf g = dsqz.b;

    static {
        dopf dopfVar = new dopf();
        h = dopfVar;
        dsqw.cc(dopf.class, dopfVar);
    }

    private dopf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0001\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005Л\u0007\u0016", new Object[]{"a", "b", dopd.a, "c", "d", "e", "f", douj.class, "g"});
            }
            if (i2 == 3) {
                return new dopf();
            }
            if (i2 == 4) {
                return new dopc();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<dopf> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dopf.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
