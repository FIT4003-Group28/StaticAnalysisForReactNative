package defpackage;
/* compiled from: PG */
/* renamed from: ddfz  reason: default package */
/* loaded from: classes5.dex */
public final class ddfz extends dsqw<ddfz, ddfy> implements dssk {
    public static final ddfz e;
    private static volatile dssr<ddfz> f;
    public int a;
    public String b = "";
    public boolean c;
    public int d;

    static {
        ddfz ddfzVar = new ddfz();
        e = ddfzVar;
        dsqw.cc(ddfz.class, ddfzVar);
    }

    private ddfz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ddfz();
            }
            if (i2 == 4) {
                return new ddfy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddfz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddfz.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
