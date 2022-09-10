package defpackage;
/* compiled from: PG */
/* renamed from: dqst  reason: default package */
/* loaded from: classes6.dex */
public final class dqst extends dsqw<dqst, dqss> implements dssk {
    public static final dqst c;
    private static volatile dssr<dqst> e;
    public String a = "";
    public dsrj<dqsz> b = dssu.b;
    private int d;

    static {
        dqst dqstVar = new dqst();
        c = dqstVar;
        dsqw.cc(dqst.class, dqstVar);
    }

    private dqst() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", dqsz.class});
            }
            if (i2 == 3) {
                return new dqst();
            }
            if (i2 == 4) {
                return new dqss();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqst> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqst.class) {
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
