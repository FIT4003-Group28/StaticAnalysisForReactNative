package defpackage;
/* compiled from: PG */
/* renamed from: cdpd  reason: default package */
/* loaded from: classes4.dex */
public final class cdpd extends dsqw<cdpd, cdpc> implements dssk {
    public static final cdpd l;
    private static volatile dssr<cdpd> n;
    public int a;
    public int b;
    public boolean c;
    public int d;
    public dlif e;
    public int i;
    public cdph j;
    public int k;
    private byte m = 2;
    public String f = "";
    public String g = "";
    public dsrj<dwfl> h = dssu.b;

    static {
        cdpd cdpdVar = new cdpd();
        l = cdpdVar;
        dsqw.cc(cdpd.class, cdpdVar);
    }

    private cdpd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0001\u0001င\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ᐉ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007\u001b\bဌ\u0006\tဉ\u0007\nဌ\b", new Object[]{"a", "b", "c", "d", cdpb.c(), "e", "f", "g", "h", dwfl.class, "i", dhpj.c(), "j", "k", ddhv.c()});
            }
            if (i2 == 3) {
                return new cdpd();
            }
            if (i2 == 4) {
                return new cdpc();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            }
            dssr<cdpd> dssrVar = n;
            if (dssrVar == null) {
                synchronized (cdpd.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.m);
    }
}
