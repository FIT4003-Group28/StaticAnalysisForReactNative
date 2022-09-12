package defpackage;
/* compiled from: PG */
/* renamed from: dqsz  reason: default package */
/* loaded from: classes6.dex */
public final class dqsz extends dsqw<dqsz, dqsy> implements dssk {
    public static final dqsz c;
    private static volatile dssr<dqsz> e;
    public dgly a;
    public dsrj<dqsv> b = dssu.b;
    private int d;

    static {
        dqsz dqszVar = new dqsz();
        c = dqszVar;
        dsqw.cc(dqsz.class, dqszVar);
    }

    private dqsz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", dqsv.class});
            }
            if (i2 == 3) {
                return new dqsz();
            }
            if (i2 == 4) {
                return new dqsy();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqsz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqsz.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
