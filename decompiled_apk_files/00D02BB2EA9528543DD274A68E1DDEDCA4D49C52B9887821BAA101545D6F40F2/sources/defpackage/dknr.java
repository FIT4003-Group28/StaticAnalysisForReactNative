package defpackage;
/* compiled from: PG */
/* renamed from: dknr  reason: default package */
/* loaded from: classes.dex */
public final class dknr extends dsqw<dknr, dkna> implements dssk {
    public static final dknr l;
    private static volatile dssr<dknr> n;
    public String a = "";
    public dkmz b;
    public dknq c;
    public dknm d;
    public boolean e;
    public boolean f;
    public boolean g;
    public dknk h;
    public dkng i;
    public dkni j;
    public boolean k;
    private int m;

    static {
        dknr dknrVar = new dknr();
        l = dknrVar;
        dsqw.cc(dknr.class, dknrVar);
    }

    private dknr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(l, "\u0001\u000b\u0000\u0001\u0004\u001e\u000b\u0000\u0000\u0000\u0004ဈ\u0003\u0005ဉ\u0004\nဉ\u0006\rဉ\b\u000fဇ\t\u0010ဇ\n\u0015ဇ\r\u0017ဉ\u000f\u001cဉ\u0014\u001dဉ\u0015\u001eဇ\u0016", new Object[]{"m", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            }
            if (i2 == 3) {
                return new dknr();
            }
            if (i2 == 4) {
                return new dkna();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dknr> dssrVar = n;
            if (dssrVar == null) {
                synchronized (dknr.class) {
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
