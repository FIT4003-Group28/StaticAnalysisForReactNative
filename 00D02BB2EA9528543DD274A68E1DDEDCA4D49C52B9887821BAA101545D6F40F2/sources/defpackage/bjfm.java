package defpackage;
/* compiled from: PG */
/* renamed from: bjfm  reason: default package */
/* loaded from: classes3.dex */
public final class bjfm extends dsqw<bjfm, bjfl> implements dssk {
    public static final bjfm c;
    private static volatile dssr<bjfm> d;
    public int a;
    public String b = "";

    static {
        bjfm bjfmVar = new bjfm();
        c = bjfmVar;
        dsqw.cc(bjfm.class, bjfmVar);
    }

    private bjfm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new bjfm();
            }
            if (i2 == 4) {
                return new bjfl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bjfm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (bjfm.class) {
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
