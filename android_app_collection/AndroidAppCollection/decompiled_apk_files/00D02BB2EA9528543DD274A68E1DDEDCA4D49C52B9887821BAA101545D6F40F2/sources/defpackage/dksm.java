package defpackage;
/* compiled from: PG */
/* renamed from: dksm  reason: default package */
/* loaded from: classes.dex */
public final class dksm extends dsqw<dksm, dksl> implements dssk {
    public static final dksm b;
    private static volatile dssr<dksm> c;
    public dsrj<String> a = dssu.b;

    static {
        dksm dksmVar = new dksm();
        b = dksmVar;
        dsqw.cc(dksm.class, dksmVar);
    }

    private dksm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001a", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dksm();
            }
            if (i2 == 4) {
                return new dksl();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dksm> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dksm.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
