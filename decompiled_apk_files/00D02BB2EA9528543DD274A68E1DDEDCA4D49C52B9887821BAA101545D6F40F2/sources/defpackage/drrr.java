package defpackage;
/* compiled from: PG */
/* renamed from: drrr  reason: default package */
/* loaded from: classes6.dex */
public final class drrr extends dsqw<drrr, drrq> implements dssk {
    public static final drrr j;
    private static volatile dssr<drrr> k;
    public int a;
    public drrr b;
    public droz c;
    public drox d;
    public drot e;
    public drri f;
    public drpc g;
    public drsh h;
    public drry i;

    static {
        drrr drrrVar = new drrr();
        j = drrrVar;
        dsqw.cc(drrr.class, drrrVar);
    }

    private drrr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\u0013\b\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0004ဉ\u0003\bဉ\u0007\u000bဉ\n\u000fဉ\u000e\u0010ဉ\u000f\u0013ဉ\u0012", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new drrr();
            }
            if (i2 == 4) {
                return new drrq();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drrr> dssrVar = k;
            if (dssrVar == null) {
                synchronized (drrr.class) {
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
