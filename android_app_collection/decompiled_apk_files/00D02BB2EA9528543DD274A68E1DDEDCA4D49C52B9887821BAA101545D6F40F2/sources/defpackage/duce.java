package defpackage;
/* compiled from: PG */
/* renamed from: duce  reason: default package */
/* loaded from: classes6.dex */
public final class duce extends dsqw<duce, dubv> implements dssk {
    public static final duce b;
    private static volatile dssr<duce> c;
    public ducd a;

    static {
        duce duceVar = new duce();
        b = duceVar;
        dsqw.cc(duce.class, duceVar);
    }

    private duce() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new duce();
            }
            if (i2 == 4) {
                return new dubv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duce> dssrVar = c;
            if (dssrVar == null) {
                synchronized (duce.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
