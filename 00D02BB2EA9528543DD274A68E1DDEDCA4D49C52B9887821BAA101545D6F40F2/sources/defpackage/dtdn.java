package defpackage;
/* compiled from: PG */
/* renamed from: dtdn  reason: default package */
/* loaded from: classes6.dex */
public final class dtdn extends dsqw<dtdn, dtdm> implements dssk {
    public static final dtdn a;
    private static volatile dssr<dtdn> b;

    static {
        dtdn dtdnVar = new dtdn();
        a = dtdnVar;
        dsqw.cc(dtdn.class, dtdnVar);
    }

    private dtdn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dtdn();
            }
            if (i2 == 4) {
                return new dtdm();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtdn> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtdn.class) {
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
