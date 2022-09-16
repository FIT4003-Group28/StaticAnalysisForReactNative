package defpackage;
/* compiled from: PG */
/* renamed from: dwkj  reason: default package */
/* loaded from: classes.dex */
public final class dwkj extends dsqw<dwkj, dwke> implements dssk {
    public static final dwkj o;
    private static volatile dssr<dwkj> p;
    public int a;
    public int c;
    public int d;
    public int j;
    public int k;
    public boolean l;
    public boolean n;
    public boolean b = true;
    public int e = 30;
    public String f = "";
    public dsrj<dwkd> g = dssu.b;
    public dsrj<dwki> h = dssu.b;
    public String i = "";
    public String m = "";

    static {
        dwkj dwkjVar = new dwkj();
        o = dwkjVar;
        dsqw.cc(dwkj.class, dwkjVar);
    }

    private dwkj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0002\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005ဈ\u0004\u0006\u001b\u0007\u001b\bဈ\u0005\tင\u0006\nင\u0007\u000bဇ\b\fဈ\t\rဇ\n", new Object[]{"a", "b", "c", dwkf.a, "d", "e", "f", "g", dwkd.class, "h", dwki.class, "i", "j", "k", "l", "m", "n"});
            }
            if (i2 == 3) {
                return new dwkj();
            }
            if (i2 == 4) {
                return new dwke();
            }
            if (i2 == 5) {
                return o;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwkj> dssrVar = p;
            if (dssrVar == null) {
                synchronized (dwkj.class) {
                    dssrVar = p;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(o);
                        p = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
