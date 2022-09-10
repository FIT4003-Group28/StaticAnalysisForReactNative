package defpackage;
/* compiled from: PG */
/* renamed from: dgow  reason: default package */
/* loaded from: classes6.dex */
public final class dgow extends dsqw<dgow, dgov> implements dssk {
    public static final dgow a;
    private static volatile dssr<dgow> b;

    static {
        dgow dgowVar = new dgow();
        a = dgowVar;
        dsqw.cc(dgow.class, dgowVar);
    }

    private dgow() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dgow();
            }
            if (i2 == 4) {
                return new dgov();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgow> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dgow.class) {
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
