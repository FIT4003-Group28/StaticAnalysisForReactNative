package defpackage;
/* compiled from: PG */
/* renamed from: dqtf  reason: default package */
/* loaded from: classes6.dex */
public final class dqtf extends dsqw<dqtf, dqtc> implements dssk {
    public static final dqtf d;
    private static volatile dssr<dqtf> f;
    public String a = "";
    public dsrj<dqte> b = dssu.b;
    public dqso c;
    private int e;

    static {
        dqtf dqtfVar = new dqtf();
        d = dqtfVar;
        dsqw.cc(dqtf.class, dqtfVar);
    }

    private dqtf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"e", "a", "b", dqte.class, "c"});
            }
            if (i2 == 3) {
                return new dqtf();
            }
            if (i2 == 4) {
                return new dqtc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqtf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqtf.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
