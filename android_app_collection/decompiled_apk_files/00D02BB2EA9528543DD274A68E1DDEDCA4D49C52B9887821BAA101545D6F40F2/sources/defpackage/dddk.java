package defpackage;
/* compiled from: PG */
/* renamed from: dddk  reason: default package */
/* loaded from: classes5.dex */
public final class dddk extends dsqw<dddk, dddj> implements dssk {
    public static final dddk h;
    private static volatile dssr<dddk> i;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        dddk dddkVar = new dddk();
        h = dddkVar;
        dsqw.cc(dddk.class, dddkVar);
    }

    private dddk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဌ\u0005", new Object[]{"a", "b", dgfb.c(), "c", dgfc.a, "d", "e", "f", "g", dgfd.a});
            }
            if (i3 == 3) {
                return new dddk();
            }
            if (i3 == 4) {
                return new dddj();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dddk> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dddk.class) {
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
