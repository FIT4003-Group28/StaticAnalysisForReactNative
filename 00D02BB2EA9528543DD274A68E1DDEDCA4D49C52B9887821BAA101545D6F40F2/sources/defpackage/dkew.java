package defpackage;
/* compiled from: PG */
/* renamed from: dkew  reason: default package */
/* loaded from: classes6.dex */
public final class dkew extends dsqw<dkew, dkev> implements dssk {
    public static final dkew a;
    private static volatile dssr<dkew> b;

    static {
        dkew dkewVar = new dkew();
        a = dkewVar;
        dsqw.cc(dkew.class, dkewVar);
    }

    private dkew() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dkew();
            }
            if (i2 == 4) {
                return new dkev();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkew> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dkew.class) {
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
