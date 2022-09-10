package defpackage;
/* compiled from: PG */
/* renamed from: eawy  reason: default package */
/* loaded from: classes6.dex */
public final class eawy extends dsqw<eawy, eawh> implements dssk {
    public static final eawy n;
    private static volatile dssr<eawy> o;
    public int a;
    public eaxx b;
    public eaxr c;
    public int d;
    public eawj e;
    public eawl f;
    public eawp g;
    public eawn h;
    public eawv i;
    public eawx j;
    public eawd k;
    public eawf l;
    public eawr m;

    static {
        eawy eawyVar = new eawy();
        n = eawyVar;
        dsqw.cc(eawy.class, eawyVar);
    }

    private eawy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဉ\u0005\u0005ဉ\u0006\u0006ဉ\u0007\u0007ဉ\b\bဉ\t\tဉ\n\nဉ\u000b\u000bဉ\f\fဉ\u0003", new Object[]{"a", "b", "c", "d", eawg.a, "f", "g", "h", "i", "j", "k", "l", "m", "e"});
            }
            if (i2 == 3) {
                return new eawy();
            }
            if (i2 == 4) {
                return new eawh();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eawy> dssrVar = o;
            if (dssrVar == null) {
                synchronized (eawy.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(n);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
