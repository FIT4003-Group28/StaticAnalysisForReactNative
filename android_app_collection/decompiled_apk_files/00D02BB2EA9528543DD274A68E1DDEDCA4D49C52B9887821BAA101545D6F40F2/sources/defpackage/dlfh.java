package defpackage;
/* compiled from: PG */
/* renamed from: dlfh  reason: default package */
/* loaded from: classes6.dex */
public final class dlfh extends dsqw<dlfh, dlfe> implements dssk {
    public static final dlfh q;
    private static volatile dssr<dlfh> s;
    public String a = "";
    public String b = "";
    public String c = "";
    public long d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public int o;
    public int p;
    private int r;

    static {
        dlfh dlfhVar = new dlfh();
        q = dlfhVar;
        dsqw.cc(dlfh.class, dlfhVar);
    }

    private dlfh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(q, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007\tဌ\b\nဌ\t\u000bဌ\n\fဌ\u000b\rဌ\f\u000eဇ\r\u000fဌ\u000e\u0010ဌ\u000f", new Object[]{"r", "a", "b", "c", "d", "e", dlfc.a, "f", dlfc.a, "g", dlfc.a, "h", dlfc.a, "i", dlfc.a, "j", dlfc.a, "k", dlfc.a, "l", dlfc.a, "m", dlfc.a, "n", "o", dlff.a, "p", dlfc.a});
            }
            if (i2 == 3) {
                return new dlfh();
            }
            if (i2 == 4) {
                return new dlfe();
            }
            if (i2 == 5) {
                return q;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlfh> dssrVar = s;
            if (dssrVar == null) {
                synchronized (dlfh.class) {
                    dssrVar = s;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(q);
                        s = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
