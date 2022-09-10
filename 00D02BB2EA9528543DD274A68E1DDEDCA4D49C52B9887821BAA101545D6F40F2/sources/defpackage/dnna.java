package defpackage;
/* compiled from: PG */
/* renamed from: dnna  reason: default package */
/* loaded from: classes6.dex */
public final class dnna extends dsqw<dnna, dnmv> implements dssk {
    public static final dnna m;
    private static volatile dssr<dnna> n;
    public int a;
    public dreg d;
    public dnmx h;
    public int i;
    public int j;
    public dnmz k;
    public String b = "";
    public String c = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public dsrj<drek> l = dssu.b;

    static {
        dnna dnnaVar = new dnna();
        m = dnnaVar;
        dsqw.cc(dnna.class, dnnaVar);
    }

    private dnna() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0000\u0001ဉ\u0006\u0002င\u0007\u0003င\t\u0004ဈ\u0003\u0005ဈ\u0000\u0006ဈ\u0004\tဈ\u0005\nဉ\n\u000b\u001b\fဈ\u0001\rဉ\u0002", new Object[]{"a", "h", "i", "j", "e", "b", "f", "g", "k", "l", drek.class, "c", "d"});
            }
            if (i2 == 3) {
                return new dnna();
            }
            if (i2 == 4) {
                return new dnmv();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnna> dssrVar = n;
            if (dssrVar == null) {
                synchronized (dnna.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(m);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
