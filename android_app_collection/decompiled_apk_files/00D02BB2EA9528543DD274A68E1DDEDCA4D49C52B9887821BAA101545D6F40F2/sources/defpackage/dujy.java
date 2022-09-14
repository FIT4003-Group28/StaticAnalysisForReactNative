package defpackage;
/* compiled from: PG */
/* renamed from: dujy  reason: default package */
/* loaded from: classes6.dex */
public final class dujy extends dsqw<dujy, dujx> implements dssk {
    public static final dujy g;
    private static volatile dssr<dujy> i;
    public long c;
    public long d;
    private int h;
    public String a = "";
    public String b = "";
    public String e = "";
    public int f = 2000;

    static {
        dujy dujyVar = new dujy();
        g = dujyVar;
        dsqw.cc(dujy.class, dujyVar);
    }

    private dujy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဂ\u0004\u0004ဂ\u0005\u0005ဈ\u0006\bင\u0007", new Object[]{"h", "a", "b", "c", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dujy();
            }
            if (i3 == 4) {
                return new dujx();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dujy> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dujy.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
