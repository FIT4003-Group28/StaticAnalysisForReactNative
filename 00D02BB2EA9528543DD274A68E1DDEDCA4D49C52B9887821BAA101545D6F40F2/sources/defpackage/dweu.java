package defpackage;
/* compiled from: PG */
/* renamed from: dweu  reason: default package */
/* loaded from: classes6.dex */
public final class dweu extends dsqw<dweu, dwek> implements dssk {
    public static final dweu m;
    private static volatile dssr<dweu> o;
    public int a;
    public Object c;
    public int e;
    public boolean j;
    public int k;
    public int l;
    private dwer n;
    public int b = 0;
    public dspd d = dspd.b;
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";

    static {
        dweu dweuVar = new dweu();
        m = dweuVar;
        dsqw.cc(dweu.class, dweuVar);
    }

    private dweu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(m, "\u0001\f\u0001\u0001\u0001\r\f\u0000\u0000\u0000\u0001ည\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ြ\u0000\u0006ြ\u0000\u0007ဈ\u0005\bဈ\u0004\tဌ\u0001\nဉ\b\u000bဇ\t\fင\n\rဌ\u000b", new Object[]{"c", "b", "a", "d", "f", "g", dweo.class, dwet.class, "i", "h", "e", dweb.c(), "n", "j", "k", "l", dpod.a});
            }
            if (i2 == 3) {
                return new dweu();
            }
            if (i2 == 4) {
                return new dwek();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dweu> dssrVar = o;
            if (dssrVar == null) {
                synchronized (dweu.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(m);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
