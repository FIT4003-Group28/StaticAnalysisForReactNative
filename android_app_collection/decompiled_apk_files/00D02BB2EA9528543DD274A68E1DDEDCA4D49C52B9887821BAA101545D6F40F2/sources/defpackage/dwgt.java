package defpackage;
/* compiled from: PG */
/* renamed from: dwgt  reason: default package */
/* loaded from: classes6.dex */
public final class dwgt extends dsqw<dwgt, dwgs> implements dssk {
    public static final dwgt a;
    private static volatile dssr<dwgt> b;

    static {
        dwgt dwgtVar = new dwgt();
        a = dwgtVar;
        dsqw.cc(dwgt.class, dwgtVar);
    }

    private dwgt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dwgt();
            }
            if (i2 == 4) {
                return new dwgs();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwgt> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dwgt.class) {
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
