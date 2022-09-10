package defpackage;
/* compiled from: PG */
/* renamed from: dtrg  reason: default package */
/* loaded from: classes6.dex */
public final class dtrg extends dsqw<dtrg, dtrf> implements dssk {
    public static final dtrg a;
    private static volatile dssr<dtrg> b;

    static {
        dtrg dtrgVar = new dtrg();
        a = dtrgVar;
        dsqw.cc(dtrg.class, dtrgVar);
    }

    private dtrg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dtrg();
            }
            if (i2 == 4) {
                return new dtrf();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtrg> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtrg.class) {
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
