package defpackage;
/* compiled from: PG */
/* renamed from: dslg  reason: default package */
/* loaded from: classes6.dex */
public final class dslg extends dsqw<dslg, dslf> implements dssk {
    public static final dslg a;
    private static volatile dssr<dslg> b;

    static {
        dslg dslgVar = new dslg();
        a = dslgVar;
        dsqw.cc(dslg.class, dslgVar);
    }

    private dslg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dslg();
            }
            if (i2 == 4) {
                return new dslf();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dslg> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dslg.class) {
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
