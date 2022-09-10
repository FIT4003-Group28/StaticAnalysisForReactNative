package defpackage;
/* compiled from: PG */
/* renamed from: drmr  reason: default package */
/* loaded from: classes6.dex */
public final class drmr extends dsqw<drmr, drmm> implements dssk {
    public static final drmr h;
    private static volatile dssr<drmr> i;
    public int a;
    public int d;
    public drnn e;
    public int f;
    public String b = "";
    public String c = "";
    public String g = "";

    static {
        drmr drmrVar = new drmr();
        h = drmrVar;
        dsqw.cc(drmr.class, drmrVar);
    }

    private drmr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0003\u0004ဌ\u0004\u0005ဈ\u0005\u0006ဌ\u0002", new Object[]{"a", "b", "c", "e", "f", drmq.c(), "g", "d", drmn.a});
            }
            if (i3 == 3) {
                return new drmr();
            }
            if (i3 == 4) {
                return new drmm();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<drmr> dssrVar = i;
            if (dssrVar == null) {
                synchronized (drmr.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
