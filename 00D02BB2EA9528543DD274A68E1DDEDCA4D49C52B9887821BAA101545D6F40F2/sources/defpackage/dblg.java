package defpackage;
/* compiled from: PG */
/* renamed from: dblg  reason: default package */
/* loaded from: classes5.dex */
public final class dblg extends dsqw<dblg, dblf> implements dssk {
    public static final dblg a;
    private static volatile dssr<dblg> b;

    static {
        dblg dblgVar = new dblg();
        a = dblgVar;
        dsqw.cc(dblg.class, dblgVar);
    }

    private dblg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dblg();
            }
            if (i2 == 4) {
                return new dblf();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dblg> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dblg.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
