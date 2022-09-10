package defpackage;
/* compiled from: PG */
/* renamed from: dxrg  reason: default package */
/* loaded from: classes6.dex */
public final class dxrg extends dsqw<dxrg, dxrf> implements dssk {
    public static final dxrg a;
    private static volatile dssr<dxrg> b;

    static {
        dxrg dxrgVar = new dxrg();
        a = dxrgVar;
        dsqw.cc(dxrg.class, dxrgVar);
    }

    private dxrg() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dxrg();
            }
            if (i2 == 4) {
                return new dxrf();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxrg> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dxrg.class) {
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
