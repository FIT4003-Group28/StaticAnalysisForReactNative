package defpackage;
/* compiled from: PG */
/* renamed from: dups  reason: default package */
/* loaded from: classes.dex */
public final class dups extends dsqw<dups, dupp> implements dupt {
    public static final dups l;
    private static volatile dssr<dups> n;
    public boolean a;
    public int b;
    public int c;
    public int d;
    public dsrj<dupr> e = dssu.b;
    public dsrj<dupr> f = dssu.b;
    public dsrj<dupr> g = dssu.b;
    public dsrj<dupr> h = dssu.b;
    public int i;
    public boolean j;
    public boolean k;
    private int m;

    static {
        dups dupsVar = new dups();
        l = dupsVar;
        dsqw.cc(dups.class, dupsVar);
    }

    private dups() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(l, "\u0001\u000b\u0000\u0001\u0002\u0010\u000b\u0000\u0004\u0000\u0002င\u0002\u0003င\u0003\u0004င\u0004\u0006\u001b\u0007င\u0006\bဇ\u0000\nဇ\u0007\f\u001b\r\u001b\u000e\u001b\u0010ဇ\t", new Object[]{"m", "b", "c", "d", "e", dupr.class, "i", "a", "j", "f", dupr.class, "g", dupr.class, "h", dupr.class, "k"});
            }
            if (i2 == 3) {
                return new dups();
            }
            if (i2 == 4) {
                return new dupp();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dups> dssrVar = n;
            if (dssrVar == null) {
                synchronized (dups.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
