package defpackage;
/* compiled from: PG */
/* renamed from: eavz  reason: default package */
/* loaded from: classes6.dex */
public final class eavz extends dsqw<eavz, eavy> implements dssk {
    public static final eavz b;
    private static volatile dssr<eavz> c;
    public dsri a = dsrx.b;

    static {
        eavz eavzVar = new eavz();
        b = eavzVar;
        dsqw.cc(eavz.class, eavzVar);
    }

    private eavz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new eavz();
            }
            if (i2 == 4) {
                return new eavy();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eavz> dssrVar = c;
            if (dssrVar == null) {
                synchronized (eavz.class) {
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
