package defpackage;
/* compiled from: PG */
/* renamed from: dqhb  reason: default package */
/* loaded from: classes6.dex */
public final class dqhb extends dsqw<dqhb, dqha> implements dssk {
    public static final dqhb c;
    private static volatile dssr<dqhb> e;
    public String a = "";
    public dsrj<String> b = dssu.b;
    private int d;

    static {
        dqhb dqhbVar = new dqhb();
        c = dqhbVar;
        dsqw.cc(dqhb.class, dqhbVar);
    }

    private dqhb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dqhb();
            }
            if (i2 == 4) {
                return new dqha();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqhb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqhb.class) {
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
