package defpackage;
/* compiled from: PG */
/* renamed from: dnsj  reason: default package */
/* loaded from: classes6.dex */
public final class dnsj extends dsqw<dnsj, dnsi> implements dssk {
    public static final dnsj e;
    private static volatile dssr<dnsj> l;
    public int a;
    public dnne c;
    public dnzp d;
    private int f;
    private dnqh g;
    private dnzr h;
    private docq i;
    private dobv j;
    private byte k = 2;
    public String b = "";

    static {
        dnsj dnsjVar = new dnsj();
        e = dnsjVar;
        dsqw.cc(dnsj.class, dnsjVar);
    }

    private dnsj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0007\u0000\u0002\u0001'\u0007\u0000\u0000\u0003\u0001ဈ\u0000\u0002ᐉ\u0001\u0007ဉ\u0005\u000eᐉ\u0006\u0010ᐉ\f\u001fဉ\u0016'ဉ!", new Object[]{"a", "f", "b", "g", "c", "h", "i", "d", "j"});
            }
            if (i2 == 3) {
                return new dnsj();
            }
            if (i2 == 4) {
                return new dnsi();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            }
            dssr<dnsj> dssrVar = l;
            if (dssrVar == null) {
                synchronized (dnsj.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.k);
    }
}
