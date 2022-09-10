package defpackage;
/* compiled from: PG */
/* renamed from: dozs  reason: default package */
/* loaded from: classes6.dex */
public final class dozs extends dsqw<dozs, dozj> implements dssk {
    public static final dozs q;
    private static volatile dssr<dozs> r;
    public int a;
    public dgas d;
    public boolean e;
    public dowb f;
    public dgas g;
    public float h;
    public dgas i;
    public dozl j;
    public dozr l;
    public dozn m;
    public dotj n;
    public int o;
    public String b = "";
    public String c = "";
    public dsrj<String> k = dssu.b;
    public dsrj<dqts> p = dssu.b;

    static {
        dozs dozsVar = new dozs();
        q = dozsVar;
        dsqw.cc(dozs.class, dozsVar);
    }

    private dozs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(q, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0002\u0000\u0001ဉ\u0002\u0002ဉ\u0004\u0003ဉ\b\u0004\u001a\u0005ဇ\u0003\u0006ဉ\t\u0007ဈ\u0000\bဈ\u0001\tဉ\u0005\nခ\u0006\u000bဉ\u0007\fဉ\n\rဉ\u000b\u000eဌ\f\u000f\u001b", new Object[]{"a", "d", "f", "j", "k", "e", "l", "b", "c", "g", "h", "i", "m", "n", "o", dozh.a, "p", dqts.class});
            }
            if (i2 == 3) {
                return new dozs();
            }
            if (i2 == 4) {
                return new dozj();
            }
            if (i2 == 5) {
                return q;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dozs> dssrVar = r;
            if (dssrVar == null) {
                synchronized (dozs.class) {
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
