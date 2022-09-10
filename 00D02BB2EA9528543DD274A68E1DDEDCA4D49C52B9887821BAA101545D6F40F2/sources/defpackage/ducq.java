package defpackage;
/* compiled from: PG */
/* renamed from: ducq  reason: default package */
/* loaded from: classes6.dex */
public final class ducq extends dsqw<ducq, ducp> implements dssk {
    public static final ducq d;
    private static volatile dssr<ducq> e;
    public String a = "";
    public dsrj<String> b = dssu.b;
    public boolean c;

    static {
        ducq ducqVar = new ducq();
        d = ducqVar;
        dsqw.cc(ducq.class, ducqVar);
    }

    private ducq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003\u0007", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ducq();
            }
            if (i2 == 4) {
                return new ducp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ducq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ducq.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
