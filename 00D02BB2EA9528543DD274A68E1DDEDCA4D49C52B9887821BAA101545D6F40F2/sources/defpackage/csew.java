package defpackage;
/* compiled from: PG */
/* renamed from: csew  reason: default package */
/* loaded from: classes5.dex */
public final class csew extends dsqw<csew, csev> implements dssk {
    public static final csew a;
    private static volatile dssr<csew> b;

    static {
        csew csewVar = new csew();
        a = csewVar;
        dsqw.cc(csew.class, csewVar);
    }

    private csew() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new csew();
            }
            if (i2 == 4) {
                return new csev();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<csew> dssrVar = b;
            if (dssrVar == null) {
                synchronized (csew.class) {
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
