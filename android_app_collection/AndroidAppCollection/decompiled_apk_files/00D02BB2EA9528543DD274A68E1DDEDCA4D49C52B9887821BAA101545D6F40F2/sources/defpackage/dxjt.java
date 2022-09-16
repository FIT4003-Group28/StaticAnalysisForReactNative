package defpackage;
/* compiled from: PG */
/* renamed from: dxjt  reason: default package */
/* loaded from: classes6.dex */
public final class dxjt extends dsqw<dxjt, dxjs> implements dssk {
    public static final dxjt d;
    private static volatile dssr<dxjt> e;
    public dxwi a;
    public int b;
    public String c = "";

    static {
        dxjt dxjtVar = new dxjt();
        d = dxjtVar;
        dsqw.cc(dxjt.class, dxjtVar);
    }

    private dxjt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\t\u0003\u0004\u0004Ȉ", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dxjt();
            }
            if (i2 == 4) {
                return new dxjs();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxjt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxjt.class) {
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
