package defpackage;
/* compiled from: PG */
/* renamed from: eawf  reason: default package */
/* loaded from: classes6.dex */
public final class eawf extends dsqw<eawf, eawe> implements dssk {
    public static final eawf l;
    private static volatile dssr<eawf> m;
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public eawt j;
    public int k;

    static {
        eawf eawfVar = new eawf();
        l = eawfVar;
        dsqw.cc(eawf.class, eawfVar);
    }

    private eawf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bင\u0007\tဉ\t\rင\f", new Object[]{"a", "b", eawz.a, "c", eaxa.a, "d", "e", "f", eaxb.a, "g", eaxb.a, "h", eaxe.a, "i", "j", "k"});
            }
            if (i2 == 3) {
                return new eawf();
            }
            if (i2 == 4) {
                return new eawe();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eawf> dssrVar = m;
            if (dssrVar == null) {
                synchronized (eawf.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
