package defpackage;
/* compiled from: PG */
/* renamed from: dgio  reason: default package */
/* loaded from: classes6.dex */
public final class dgio extends dsqw<dgio, dgin> implements dssk {
    public static final dgio b;
    private static volatile dssr<dgio> c;
    public dsrj<dgim> a = dssu.b;

    static {
        dgio dgioVar = new dgio();
        b = dgioVar;
        dsqw.cc(dgio.class, dgioVar);
    }

    private dgio() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dgim.class});
            }
            if (i2 == 3) {
                return new dgio();
            }
            if (i2 == 4) {
                return new dgin();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgio> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dgio.class) {
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
