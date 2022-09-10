package defpackage;
/* compiled from: PG */
/* renamed from: dwoj  reason: default package */
/* loaded from: classes.dex */
public final class dwoj extends dsqw<dwoj, dwoi> implements dssk {
    public static final dwoj k;
    private static volatile dssr<dwoj> m;
    public boolean b;
    public boolean e;
    public boolean f;
    public boolean g;
    private int l;
    public int a = 1;
    public String c = "hmm;";
    public String d = "Hmm";
    public long h = 2592000000L;
    public long i = 86400000;
    public float j = 8.0f;

    static {
        dwoj dwojVar = new dwoj();
        k = dwojVar;
        dsqw.cc(dwoj.class, dwojVar);
    }

    private dwoj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0000\u0000\u0001ဌ\u0000\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\bဇ\u0007\tဇ\b\fဇ\u000b\rဂ\f\u000eဂ\r\u000fခ\u000e", new Object[]{"l", "a", dwog.a, "b", "c", "d", "e", "f", "g", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new dwoj();
            }
            if (i2 == 4) {
                return new dwoi();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwoj> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dwoj.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
