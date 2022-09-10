package defpackage;
/* compiled from: PG */
/* renamed from: bzhe  reason: default package */
/* loaded from: classes4.dex */
public final class bzhe extends dsqw<bzhe, bzhd> implements dssk {
    public static final bzhe d;
    private static volatile dssr<bzhe> e;
    public int a;
    public String b = "";
    public dsrj<bzhb> c = dssu.b;

    static {
        bzhe bzheVar = new bzhe();
        d = bzheVar;
        dsqw.cc(bzhe.class, bzheVar);
    }

    private bzhe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", "c", bzhb.class});
            }
            if (i2 == 3) {
                return new bzhe();
            }
            if (i2 == 4) {
                return new bzhd();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bzhe> dssrVar = e;
            if (dssrVar == null) {
                synchronized (bzhe.class) {
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
