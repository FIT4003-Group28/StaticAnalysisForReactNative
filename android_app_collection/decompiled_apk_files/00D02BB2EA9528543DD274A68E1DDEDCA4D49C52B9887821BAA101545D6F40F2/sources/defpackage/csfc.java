package defpackage;
/* compiled from: PG */
/* renamed from: csfc  reason: default package */
/* loaded from: classes5.dex */
public final class csfc extends dsqw<csfc, csfb> implements dssk {
    public static final csfc a;
    private static volatile dssr<csfc> b;

    static {
        csfc csfcVar = new csfc();
        a = csfcVar;
        dsqw.cc(csfc.class, csfcVar);
    }

    private csfc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new csfc();
            }
            if (i2 == 4) {
                return new csfb();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<csfc> dssrVar = b;
            if (dssrVar == null) {
                synchronized (csfc.class) {
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
