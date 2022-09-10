package defpackage;
/* compiled from: PG */
/* renamed from: dxxg  reason: default package */
/* loaded from: classes6.dex */
public final class dxxg extends dsqw<dxxg, dxxf> implements dssk {
    public static final dxxg b;
    private static volatile dssr<dxxg> c;
    public dxvy a;

    static {
        dxxg dxxgVar = new dxxg();
        b = dxxgVar;
        dsqw.cc(dxxg.class, dxxgVar);
    }

    private dxxg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxxg();
            }
            if (i2 == 4) {
                return new dxxf();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxxg> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxxg.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
