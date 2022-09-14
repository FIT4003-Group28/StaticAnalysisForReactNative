package defpackage;
/* compiled from: PG */
/* renamed from: bzhx  reason: default package */
/* loaded from: classes4.dex */
public final class bzhx extends dsqw<bzhx, bzhw> implements dssk {
    public static final bzhx d;
    private static volatile dssr<bzhx> e;
    public int a;
    public long b;
    public String c = "";

    static {
        bzhx bzhxVar = new bzhx();
        d = bzhxVar;
        dsqw.cc(bzhx.class, bzhxVar);
    }

    private bzhx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new bzhx();
            }
            if (i2 == 4) {
                return new bzhw();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bzhx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (bzhx.class) {
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
