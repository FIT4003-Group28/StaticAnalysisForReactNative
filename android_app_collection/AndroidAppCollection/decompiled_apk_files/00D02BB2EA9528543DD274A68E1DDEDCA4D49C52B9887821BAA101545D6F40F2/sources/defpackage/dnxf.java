package defpackage;
/* compiled from: PG */
/* renamed from: dnxf  reason: default package */
/* loaded from: classes6.dex */
public final class dnxf extends dsqw<dnxf, dnxe> implements dssk {
    public static final dnxf k;
    private static volatile dssr<dnxf> m;
    public int a;
    public boolean b;
    public dqdk g;
    public dnxd i;
    private byte l = 2;
    public boolean c = true;
    public String d = "";
    public String e = "";
    public String f = "";
    public String h = "";
    public String j = "";

    static {
        dnxf dnxfVar = new dnxf();
        k = dnxfVar;
        dsqw.cc(dnxf.class, dnxfVar);
    }

    private dnxf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\u0011\t\u0000\u0000\u0000\u0001ဈ\u0003\u0002ဉ\u0006\bဈ\u0005\nဈ\u000b\u000bဈ\u0004\fဉ\f\rဇ\u0001\u0010ဇ\u0002\u0011ဈ\u000f", new Object[]{"a", "d", "g", "f", "h", "e", "i", "b", "c", "j"});
            }
            if (i2 == 3) {
                return new dnxf();
            }
            if (i2 == 4) {
                return new dnxe();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            }
            dssr<dnxf> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dnxf.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.l);
    }
}
