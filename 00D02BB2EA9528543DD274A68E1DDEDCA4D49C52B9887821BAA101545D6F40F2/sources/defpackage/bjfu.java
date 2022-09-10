package defpackage;
/* compiled from: PG */
/* renamed from: bjfu  reason: default package */
/* loaded from: classes3.dex */
public final class bjfu extends dsqw<bjfu, bjft> implements dssk {
    public static final bjfu c;
    private static volatile dssr<bjfu> d;
    public int a;
    public String b = "";

    static {
        bjfu bjfuVar = new bjfu();
        c = bjfuVar;
        dsqw.cc(bjfu.class, bjfuVar);
    }

    private bjfu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new bjfu();
            }
            if (i2 == 4) {
                return new bjft();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bjfu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (bjfu.class) {
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
