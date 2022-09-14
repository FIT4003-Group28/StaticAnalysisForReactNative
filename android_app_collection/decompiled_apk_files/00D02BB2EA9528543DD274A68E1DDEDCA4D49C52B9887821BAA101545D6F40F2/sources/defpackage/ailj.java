package defpackage;
/* compiled from: PG */
/* renamed from: ailj  reason: default package */
/* loaded from: classes2.dex */
public final class ailj extends dsqw<ailj, aili> implements dssk {
    public static final ailj c;
    private static volatile dssr<ailj> d;
    public int a;
    public doep b;

    static {
        ailj ailjVar = new ailj();
        c = ailjVar;
        dsqw.cc(ailj.class, ailjVar);
    }

    private ailj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ailj();
            }
            if (i2 == 4) {
                return new aili();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ailj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ailj.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
