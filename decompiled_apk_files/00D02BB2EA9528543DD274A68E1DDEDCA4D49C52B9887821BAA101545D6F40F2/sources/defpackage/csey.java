package defpackage;
/* compiled from: PG */
/* renamed from: csey  reason: default package */
/* loaded from: classes5.dex */
public final class csey extends dsqw<csey, csex> implements dssk {
    public static final csey a;
    private static volatile dssr<csey> b;

    static {
        csey cseyVar = new csey();
        a = cseyVar;
        dsqw.cc(csey.class, cseyVar);
    }

    private csey() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new csey();
            }
            if (i2 == 4) {
                return new csex();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<csey> dssrVar = b;
            if (dssrVar == null) {
                synchronized (csey.class) {
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
