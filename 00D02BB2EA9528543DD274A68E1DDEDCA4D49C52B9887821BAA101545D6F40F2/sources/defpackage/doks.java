package defpackage;
/* compiled from: PG */
/* renamed from: doks  reason: default package */
/* loaded from: classes6.dex */
public final class doks extends dsqw<doks, dokr> implements dssk {
    public static final doks a;
    private static volatile dssr<doks> b;

    static {
        doks doksVar = new doks();
        a = doksVar;
        dsqw.cc(doks.class, doksVar);
    }

    private doks() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new doks();
            }
            if (i2 == 4) {
                return new dokr();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doks> dssrVar = b;
            if (dssrVar == null) {
                synchronized (doks.class) {
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
