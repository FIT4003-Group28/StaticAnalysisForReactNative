package defpackage;
/* compiled from: PG */
/* renamed from: drpg  reason: default package */
/* loaded from: classes6.dex */
public final class drpg extends dsqw<drpg, drpf> implements dssk {
    public static final drpg b;
    private static volatile dssr<drpg> d;
    public String a = "";
    private int c;

    static {
        drpg drpgVar = new drpg();
        b = drpgVar;
        dsqw.cc(drpg.class, drpgVar);
    }

    private drpg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new drpg();
            }
            if (i2 == 4) {
                return new drpf();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drpg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drpg.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
