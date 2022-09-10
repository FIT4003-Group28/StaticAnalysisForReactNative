package defpackage;
/* compiled from: PG */
/* renamed from: dsat  reason: default package */
/* loaded from: classes6.dex */
public final class dsat extends dsqw<dsat, dsal> implements dssk {
    public static final dsat r;
    private static volatile dssr<dsat> s;
    public int a;
    public float b;
    public int c;
    public int i;
    public int n;
    public dsdd p;
    public dsdp q;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String j = "";
    public String k = "";
    public dsrj<dsao> l = dssu.b;
    public dsrj<dsar> m = dssu.b;
    public String o = "";

    static {
        dsat dsatVar = new dsat();
        r = dsatVar;
        dsqw.cc(dsat.class, dsatVar);
    }

    private dsat() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(r, "\u0001\u0010\u0000\u0001\u0002\u0011\u0010\u0000\u0002\u0000\u0002ခ\u0000\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဈ\u0006\u0007င\u0007\bဈ\b\tဌ\u0001\nဈ\u0002\u000bဈ\t\f\u001b\r\u001b\u000eဌ\n\u000fဈ\u000b\u0010ဉ\f\u0011ဉ\r", new Object[]{"a", "b", "e", "f", "g", "h", "i", "j", "c", dsas.a, "d", "k", "l", dsao.class, "m", dsar.class, "n", dsak.a, "o", "p", "q"});
            }
            if (i2 == 3) {
                return new dsat();
            }
            if (i2 == 4) {
                return new dsal();
            }
            if (i2 == 5) {
                return r;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsat> dssrVar = s;
            if (dssrVar == null) {
                synchronized (dsat.class) {
                    dssrVar = s;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(r);
                        s = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
