package defpackage;
/* compiled from: PG */
/* renamed from: dnop  reason: default package */
/* loaded from: classes6.dex */
public final class dnop extends dsqw<dnop, dnom> implements dssk {
    public static final dnop j;
    private static volatile dssr<dnop> k;
    public int a;
    public int c;
    public int d;
    public int e;
    public int g;
    public int h;
    public int i;
    public String b = "";
    public dsrj<dnoo> f = dssu.b;

    static {
        dnop dnopVar = new dnop();
        j = dnopVar;
        dsqw.cc(dnop.class, dnopVar);
    }

    private dnop() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဌ\u0001\u0002င\u0002\u0003င\u0003\u0004\u001b\u0005ဌ\u0004\u0006င\u0005\u0007င\u0006\bဈ\u0000", new Object[]{"a", "c", dnor.a, "d", "e", "f", dnoo.class, "g", dnoq.a, "h", "i", "b"});
            }
            if (i2 == 3) {
                return new dnop();
            }
            if (i2 == 4) {
                return new dnom();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnop> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dnop.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
