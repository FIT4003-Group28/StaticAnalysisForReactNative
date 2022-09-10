package defpackage;
/* compiled from: PG */
/* renamed from: dwyl  reason: default package */
/* loaded from: classes6.dex */
public final class dwyl extends dsqw<dwyl, dwyk> implements dssk {
    public static final dwyl a;
    private static volatile dssr<dwyl> b;

    static {
        dwyl dwylVar = new dwyl();
        a = dwylVar;
        dsqw.cc(dwyl.class, dwylVar);
    }

    private dwyl() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dwyl();
            }
            if (i2 == 4) {
                return new dwyk();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwyl> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dwyl.class) {
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
