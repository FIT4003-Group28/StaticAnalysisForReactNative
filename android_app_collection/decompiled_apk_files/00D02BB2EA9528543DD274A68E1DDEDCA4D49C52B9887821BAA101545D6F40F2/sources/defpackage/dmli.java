package defpackage;
/* compiled from: PG */
/* renamed from: dmli  reason: default package */
/* loaded from: classes6.dex */
public final class dmli extends dsqw<dmli, dmlg> implements dssk {
    public static final dmli e;
    private static volatile dssr<dmli> f;
    public String a = "";
    public String b;
    public String c;
    public int d;

    static {
        dmli dmliVar = new dmli();
        e = dmliVar;
        dsqw.cc(dmli.class, dmliVar);
    }

    private dmli() {
        dssu<Object> dssuVar = dssu.b;
        this.b = "";
        this.c = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\t\u0004\u0000\u0000\u0000\u0001Ȉ\u0006Ȉ\u0007Ȉ\t\f", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dmli();
            }
            if (i2 == 4) {
                return new dmlg();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmli> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmli.class) {
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
