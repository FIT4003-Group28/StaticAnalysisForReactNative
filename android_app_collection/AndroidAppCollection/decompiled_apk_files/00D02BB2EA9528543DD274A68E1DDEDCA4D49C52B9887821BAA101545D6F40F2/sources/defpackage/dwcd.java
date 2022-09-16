package defpackage;
/* compiled from: PG */
/* renamed from: dwcd  reason: default package */
/* loaded from: classes6.dex */
public final class dwcd extends dsqw<dwcd, dwcc> implements dssk {
    public static final dwcd a;
    private static volatile dssr<dwcd> b;

    static {
        dwcd dwcdVar = new dwcd();
        a = dwcdVar;
        dsqw.cc(dwcd.class, dwcdVar);
    }

    private dwcd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dwcd();
            }
            if (i2 == 4) {
                return new dwcc();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwcd> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dwcd.class) {
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
