package defpackage;
/* compiled from: PG */
/* renamed from: ddkr  reason: default package */
/* loaded from: classes.dex */
public final class ddkr extends dsqw<ddkr, ddjm> implements dssk {
    public static final ddkr i;
    private static volatile dssr<ddkr> j;
    public int a;
    public int b;
    public ddjs c;
    public ddju d;
    public ddkk e;
    public ddkq f;
    public ddou g;
    public ddjo h;

    static {
        ddkr ddkrVar = new ddkr();
        i = ddkrVar;
        dsqw.cc(ddkr.class, ddkrVar);
    }

    private ddkr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0006ဉ\u0006\u0007ဉ\u0007\nဉ\u0004", new Object[]{"a", "b", dukj.c(), "c", "d", "e", "g", "h", "f"});
            }
            if (i3 == 3) {
                return new ddkr();
            }
            if (i3 == 4) {
                return new ddjm();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<ddkr> dssrVar = j;
            if (dssrVar == null) {
                synchronized (ddkr.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
