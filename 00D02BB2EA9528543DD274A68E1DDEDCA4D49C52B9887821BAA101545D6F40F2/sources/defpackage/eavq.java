package defpackage;
/* compiled from: PG */
/* renamed from: eavq  reason: default package */
/* loaded from: classes6.dex */
public final class eavq extends dsqw<eavq, eavp> implements dssk {
    public static final eavq b;
    private static volatile dssr<eavq> c;
    public eavv a;

    static {
        eavq eavqVar = new eavq();
        b = eavqVar;
        dsqw.cc(eavq.class, eavqVar);
    }

    private eavq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new eavq();
            }
            if (i2 == 4) {
                return new eavp();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eavq> dssrVar = c;
            if (dssrVar == null) {
                synchronized (eavq.class) {
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
