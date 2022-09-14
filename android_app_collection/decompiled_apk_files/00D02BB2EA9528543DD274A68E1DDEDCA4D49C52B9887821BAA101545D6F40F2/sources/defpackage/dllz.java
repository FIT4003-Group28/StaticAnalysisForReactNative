package defpackage;
/* compiled from: PG */
/* renamed from: dllz  reason: default package */
/* loaded from: classes6.dex */
public final class dllz extends dsqw<dllz, dlly> implements dssk {
    public static final dllz a;
    private static volatile dssr<dllz> b;

    static {
        dllz dllzVar = new dllz();
        a = dllzVar;
        dsqw.cc(dllz.class, dllzVar);
    }

    private dllz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dllz();
            }
            if (i2 == 4) {
                return new dlly();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dllz> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dllz.class) {
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
