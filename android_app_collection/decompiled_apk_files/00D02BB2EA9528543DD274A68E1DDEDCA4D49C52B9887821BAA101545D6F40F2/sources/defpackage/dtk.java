package defpackage;
/* compiled from: PG */
/* renamed from: dtk  reason: default package */
/* loaded from: classes6.dex */
public final class dtk extends dsqw<dtk, dtf> implements dssk {
    public static final dtk f;
    private static volatile dssr<dtk> g;
    public int a;
    public boolean b;
    public int c = -1;
    public dsrj<dtj> d = dssu.b;
    public dth e;

    static {
        dtk dtkVar = new dtk();
        f = dtkVar;
        dsqw.cc(dtk.class, dtkVar);
    }

    private dtk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဇ\u0000\u0002င\u0001\u0003\u001b\u0004ဉ\u0002", new Object[]{"a", "b", "c", "d", dtj.class, "e"});
            }
            if (i2 == 3) {
                return new dtk();
            }
            if (i2 == 4) {
                return new dtf();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtk> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dtk.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
