package defpackage;
/* compiled from: PG */
/* renamed from: dkjf  reason: default package */
/* loaded from: classes.dex */
public final class dkjf extends dsqw<dkjf, dkje> implements dssk {
    public static final dkjf c;
    private static volatile dssr<dkjf> d;
    public dsrf a = dsqz.b;
    public dsrf b = dsqz.b;

    static {
        dkjf dkjfVar = new dkjf();
        c = dkjfVar;
        dsqw.cc(dkjf.class, dkjfVar);
    }

    private dkjf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001'\u0002'", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dkjf();
            }
            if (i2 == 4) {
                return new dkje();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkjf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkjf.class) {
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
