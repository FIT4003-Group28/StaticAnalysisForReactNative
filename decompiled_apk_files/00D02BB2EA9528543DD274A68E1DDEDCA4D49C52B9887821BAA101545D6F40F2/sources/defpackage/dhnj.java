package defpackage;
/* compiled from: PG */
/* renamed from: dhnj  reason: default package */
/* loaded from: classes6.dex */
public final class dhnj extends dsqw<dhnj, dhni> implements dssk {
    public static final dhnj b;
    private static volatile dssr<dhnj> d;
    public String a = "";
    private int c;

    static {
        dhnj dhnjVar = new dhnj();
        b = dhnjVar;
        dsqw.cc(dhnj.class, dhnjVar);
    }

    private dhnj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dhnj();
            }
            if (i2 == 4) {
                return new dhni();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhnj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhnj.class) {
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