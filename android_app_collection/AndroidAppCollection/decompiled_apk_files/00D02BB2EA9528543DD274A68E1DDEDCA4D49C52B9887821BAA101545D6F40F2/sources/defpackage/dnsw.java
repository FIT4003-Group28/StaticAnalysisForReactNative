package defpackage;
/* compiled from: PG */
/* renamed from: dnsw  reason: default package */
/* loaded from: classes6.dex */
public final class dnsw extends dsqw<dnsw, dnsv> implements dssk {
    public static final dnsw d;
    private static volatile dssr<dnsw> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dnsw dnswVar = new dnsw();
        d = dnswVar;
        dsqw.cc(dnsw.class, dnswVar);
    }

    private dnsw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dnsw();
            }
            if (i2 == 4) {
                return new dnsv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnsw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnsw.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
