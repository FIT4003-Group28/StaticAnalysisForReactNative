package defpackage;
/* compiled from: PG */
/* renamed from: eavx  reason: default package */
/* loaded from: classes6.dex */
public final class eavx extends dsqw<eavx, eavw> implements dssk {
    public static final eavx b;
    private static volatile dssr<eavx> c;
    public dsre a = dsqk.b;

    static {
        eavx eavxVar = new eavx();
        b = eavxVar;
        dsqw.cc(eavx.class, eavxVar);
    }

    private eavx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new eavx();
            }
            if (i2 == 4) {
                return new eavw();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eavx> dssrVar = c;
            if (dssrVar == null) {
                synchronized (eavx.class) {
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
