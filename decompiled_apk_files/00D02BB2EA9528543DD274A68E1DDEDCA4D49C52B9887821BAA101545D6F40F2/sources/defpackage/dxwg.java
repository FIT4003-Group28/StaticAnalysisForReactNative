package defpackage;
/* compiled from: PG */
/* renamed from: dxwg  reason: default package */
/* loaded from: classes6.dex */
public final class dxwg extends dsqw<dxwg, dxwf> implements dssk {
    public static final dxwg c;
    private static volatile dssr<dxwg> d;
    public String a = "";
    public dxvs b;

    static {
        dxwg dxwgVar = new dxwg();
        c = dxwgVar;
        dsqw.cc(dxwg.class, dxwgVar);
    }

    private dxwg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dxwg();
            }
            if (i2 == 4) {
                return new dxwf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxwg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxwg.class) {
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
