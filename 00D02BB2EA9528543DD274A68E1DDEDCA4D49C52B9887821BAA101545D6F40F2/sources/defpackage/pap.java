package defpackage;
/* compiled from: PG */
/* renamed from: pap  reason: default package */
/* loaded from: classes7.dex */
public final class pap extends dsqw<pap, pao> implements dssk {
    public static final pap d;
    private static volatile dssr<pap> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        pap papVar = new pap();
        d = papVar;
        dsqw.cc(pap.class, papVar);
    }

    private pap() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new pap();
            }
            if (i2 == 4) {
                return new pao();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<pap> dssrVar = e;
            if (dssrVar == null) {
                synchronized (pap.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
