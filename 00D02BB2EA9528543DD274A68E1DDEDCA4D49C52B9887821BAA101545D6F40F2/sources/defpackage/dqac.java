package defpackage;
/* compiled from: PG */
/* renamed from: dqac  reason: default package */
/* loaded from: classes6.dex */
public final class dqac extends dsqw<dqac, dqab> implements dssk {
    public static final dqac d;
    private static volatile dssr<dqac> e;
    public int a;
    public dsrj<dqau> b = dssu.b;
    public dqas c;

    static {
        dqac dqacVar = new dqac();
        d = dqacVar;
        dsqw.cc(dqac.class, dqacVar);
    }

    private dqac() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", dqau.class, "c"});
            }
            if (i2 == 3) {
                return new dqac();
            }
            if (i2 == 4) {
                return new dqab();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqac> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqac.class) {
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
