package defpackage;
/* compiled from: PG */
/* renamed from: dqau  reason: default package */
/* loaded from: classes6.dex */
public final class dqau extends dsqw<dqau, dqat> implements dssk {
    public static final dqau e;
    private static volatile dssr<dqau> f;
    public int a;
    public dqkn b;
    public dqaw c;
    public String d = "";

    static {
        dqau dqauVar = new dqau();
        e = dqauVar;
        dsqw.cc(dqau.class, dqauVar);
    }

    private dqau() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dqau();
            }
            if (i2 == 4) {
                return new dqat();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqau> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqau.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
