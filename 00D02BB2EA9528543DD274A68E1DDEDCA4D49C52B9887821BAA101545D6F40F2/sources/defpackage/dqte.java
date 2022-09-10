package defpackage;
/* compiled from: PG */
/* renamed from: dqte  reason: default package */
/* loaded from: classes6.dex */
public final class dqte extends dsqw<dqte, dqtd> implements dssk {
    public static final dqte c;
    private static volatile dssr<dqte> e;
    public String a = "";
    public dsrj<dqsx> b = dssu.b;
    private int d;

    static {
        dqte dqteVar = new dqte();
        c = dqteVar;
        dsqw.cc(dqte.class, dqteVar);
    }

    private dqte() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", dqsx.class});
            }
            if (i2 == 3) {
                return new dqte();
            }
            if (i2 == 4) {
                return new dqtd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqte> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqte.class) {
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
