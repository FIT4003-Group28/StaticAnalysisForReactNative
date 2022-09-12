package defpackage;
/* compiled from: PG */
/* renamed from: dwmp  reason: default package */
/* loaded from: classes6.dex */
public final class dwmp extends dsqw<dwmp, dwml> implements dssk {
    public static final dwmp q;
    private static volatile dssr<dwmp> r;
    public int a;
    public int b;
    public dqdg c;
    public dnwb e;
    public dwsb f;
    public dwmo g;
    public dqjy h;
    public dwnb i;
    public int j;
    public dwkq l;
    public dusd m;
    public dpst n;
    public int p;
    public String d = "";
    public dsrj<dpsz> k = dssu.b;
    public int o = 2;

    static {
        dwmp dwmpVar = new dwmp();
        q = dwmpVar;
        dsqw.cc(dwmp.class, dwmpVar);
    }

    private dwmp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(q, "\u0001\u000f\u0000\u0001\u0001\u0016\u000f\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0003\u0003ဉ\u0004\u0004ဉ\u0005\u0006ဉ\u0007\u0007ဉ\t\u000bင\u000b\fဉ\b\r\u001b\u0010ဉ\u000e\u0011ဉ\u0001\u0013ဉ\u000f\u0014ဉ\u0010\u0015ဌ\u0011\u0016ဌ\u0012", new Object[]{"a", "b", "d", "e", "f", "g", "i", "j", "h", "k", dpsz.class, "l", "c", "m", "n", "o", dowa.c(), "p", drrx.c()});
            }
            if (i2 == 3) {
                return new dwmp();
            }
            if (i2 == 4) {
                return new dwml();
            }
            if (i2 == 5) {
                return q;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwmp> dssrVar = r;
            if (dssrVar == null) {
                synchronized (dwmp.class) {
                    dssrVar = r;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(q);
                        r = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
