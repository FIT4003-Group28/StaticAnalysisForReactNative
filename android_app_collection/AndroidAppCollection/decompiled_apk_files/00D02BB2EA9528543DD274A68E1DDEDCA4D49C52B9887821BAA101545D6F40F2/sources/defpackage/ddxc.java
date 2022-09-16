package defpackage;
/* compiled from: PG */
/* renamed from: ddxc  reason: default package */
/* loaded from: classes6.dex */
public final class ddxc extends dsqw<ddxc, ddwz> implements dssk {
    public static final ddxc h;
    private static volatile dssr<ddxc> i;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        ddxc ddxcVar = new ddxc();
        h = ddxcVar;
        dsqw.cc(ddxc.class, ddxcVar);
    }

    private ddxc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004ဆ\u0003\u0005င\u0004\u0006ဆ\u0005", new Object[]{"a", "b", ddxa.a, "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new ddxc();
            }
            if (i3 == 4) {
                return new ddwz();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<ddxc> dssrVar = i;
            if (dssrVar == null) {
                synchronized (ddxc.class) {
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
