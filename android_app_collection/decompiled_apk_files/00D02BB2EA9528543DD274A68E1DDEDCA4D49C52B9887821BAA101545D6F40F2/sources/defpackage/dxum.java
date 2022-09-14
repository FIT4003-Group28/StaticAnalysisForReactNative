package defpackage;
/* compiled from: PG */
/* renamed from: dxum  reason: default package */
/* loaded from: classes6.dex */
public final class dxum extends dsqw<dxum, dxul> implements dssk {
    public static final dxum a;
    private static volatile dssr<dxum> b;

    static {
        dxum dxumVar = new dxum();
        a = dxumVar;
        dsqw.cc(dxum.class, dxumVar);
    }

    private dxum() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dxum();
            }
            if (i2 == 4) {
                return new dxul();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxum> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dxum.class) {
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
