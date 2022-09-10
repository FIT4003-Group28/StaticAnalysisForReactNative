package defpackage;
/* compiled from: PG */
/* renamed from: ckzf  reason: default package */
/* loaded from: classes5.dex */
public final class ckzf extends dsqw<ckzf, ckze> implements dssk {
    public static final ckzf c;
    private static volatile dssr<ckzf> d;
    public int a;
    public int b;

    static {
        ckzf ckzfVar = new ckzf();
        c = ckzfVar;
        dsqw.cc(ckzf.class, ckzfVar);
    }

    private ckzf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ckzf();
            }
            if (i2 == 4) {
                return new ckze();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckzf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ckzf.class) {
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
