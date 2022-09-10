package defpackage;
/* compiled from: PG */
/* renamed from: cyle  reason: default package */
/* loaded from: classes5.dex */
public final class cyle extends dsqw<cyle, cyld> implements dssk {
    public static final cyle e;
    private static volatile dssr<cyle> f;
    public cyjt b;
    public String a = "";
    public String c = "";
    public String d = "";

    static {
        cyle cyleVar = new cyle();
        e = cyleVar;
        dsqw.cc(cyle.class, cyleVar);
    }

    private cyle() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new cyle();
            }
            if (i2 == 4) {
                return new cyld();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cyle> dssrVar = f;
            if (dssrVar == null) {
                synchronized (cyle.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
