package defpackage;
/* compiled from: PG */
/* renamed from: ckn  reason: default package */
/* loaded from: classes4.dex */
public final class ckn extends dsqw<ckn, ckm> implements dssk {
    public static final ckn j;
    private static volatile dssr<ckn> k;
    public int a;
    public ckb b;
    public boolean e;
    public String c = "";
    public dsrj<String> d = dssu.b;
    public dsrj<ckn> f = dssu.b;
    public String g = "";
    public String h = "";
    public String i = "";

    static {
        ckn cknVar = new ckn();
        j = cknVar;
        dsqw.cc(ckn.class, cknVar);
    }

    private ckn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဇ\u0002\u0007\u001b\bဈ\u0003\tဈ\u0004\nဈ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", ckn.class, "g", "h", "i"});
            }
            if (i2 == 3) {
                return new ckn();
            }
            if (i2 == 4) {
                return new ckm();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckn> dssrVar = k;
            if (dssrVar == null) {
                synchronized (ckn.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
