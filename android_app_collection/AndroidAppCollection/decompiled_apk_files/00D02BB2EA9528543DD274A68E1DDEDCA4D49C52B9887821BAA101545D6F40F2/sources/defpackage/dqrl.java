package defpackage;
/* compiled from: PG */
/* renamed from: dqrl  reason: default package */
/* loaded from: classes6.dex */
public final class dqrl extends dsqw<dqrl, dqri> implements dssk {
    public static final dqrl d;
    private static volatile dssr<dqrl> f;
    public String a = "";
    public String b = "";
    public dsrj<dqrk> c = dssu.b;
    private int e;

    static {
        dqrl dqrlVar = new dqrl();
        d = dqrlVar;
        dsqw.cc(dqrl.class, dqrlVar);
    }

    private dqrl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"e", "c", dqrk.class, "a", "b"});
            }
            if (i2 == 3) {
                return new dqrl();
            }
            if (i2 == 4) {
                return new dqri();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqrl> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqrl.class) {
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
