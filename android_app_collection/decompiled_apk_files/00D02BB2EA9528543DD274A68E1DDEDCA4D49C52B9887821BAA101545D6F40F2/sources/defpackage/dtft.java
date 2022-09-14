package defpackage;
/* compiled from: PG */
/* renamed from: dtft  reason: default package */
/* loaded from: classes6.dex */
public final class dtft extends dsqw<dtft, dtfs> implements dssk {
    public static final dtft a;
    private static volatile dssr<dtft> b;

    static {
        dtft dtftVar = new dtft();
        a = dtftVar;
        dsqw.cc(dtft.class, dtftVar);
    }

    private dtft() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dtft();
            }
            if (i2 == 4) {
                return new dtfs();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtft> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtft.class) {
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
