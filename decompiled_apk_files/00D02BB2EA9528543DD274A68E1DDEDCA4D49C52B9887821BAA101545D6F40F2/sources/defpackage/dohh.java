package defpackage;
/* compiled from: PG */
/* renamed from: dohh  reason: default package */
/* loaded from: classes6.dex */
public final class dohh extends dsqw<dohh, dohg> implements dssk {
    public static final dohh c;
    private static volatile dssr<dohh> d;
    public int a;
    public int b;

    static {
        dohh dohhVar = new dohh();
        c = dohhVar;
        dsqw.cc(dohh.class, dohhVar);
    }

    private dohh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dpqj.c()});
            }
            if (i2 == 3) {
                return new dohh();
            }
            if (i2 == 4) {
                return new dohg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dohh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dohh.class) {
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
