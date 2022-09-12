package defpackage;
/* compiled from: PG */
/* renamed from: ckxy  reason: default package */
/* loaded from: classes5.dex */
public final class ckxy extends dsqw<ckxy, ckxx> implements dssk {
    public static final ckxy c;
    private static volatile dssr<ckxy> d;
    public int a;
    public ckwb b;

    static {
        ckxy ckxyVar = new ckxy();
        c = ckxyVar;
        dsqw.cc(ckxy.class, ckxyVar);
    }

    private ckxy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ckxy();
            }
            if (i2 == 4) {
                return new ckxx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckxy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ckxy.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
