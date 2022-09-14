package defpackage;
/* compiled from: PG */
/* renamed from: dlpk  reason: default package */
/* loaded from: classes6.dex */
public final class dlpk extends dsqw<dlpk, dlpi> implements dssk {
    public static final dlpk l;
    private static volatile dssr<dlpk> m;
    public int a;
    public int c;
    public long g;
    public long h;
    public int k;
    public dspd b = dspd.b;
    public String d = "";
    public String e = "";
    public String f = "";
    public dspd i = dspd.b;
    public String j = "";

    static {
        dlpk dlpkVar = new dlpk();
        l = dlpkVar;
        dsqw.cc(dlpk.class, dlpkVar);
    }

    private dlpk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0000\u0001ည\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bည\u0007\nဈ\b\fဌ\t", new Object[]{"a", "b", "c", dluy.c(), "d", "e", "f", "g", "h", "i", "j", "k", dlpj.a});
            }
            if (i2 == 3) {
                return new dlpk();
            }
            if (i2 == 4) {
                return new dlpi();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlpk> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dlpk.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
