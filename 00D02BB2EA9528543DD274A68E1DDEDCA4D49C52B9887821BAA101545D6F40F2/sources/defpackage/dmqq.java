package defpackage;
/* compiled from: PG */
/* renamed from: dmqq  reason: default package */
/* loaded from: classes.dex */
public final class dmqq extends dsqw<dmqq, dmql> implements dssk {
    public static final dmqq d;
    private static volatile dssr<dmqq> e;
    public int a;
    public dmqn b;
    public int c = 2;

    static {
        dmqq dmqqVar = new dmqq();
        d = dmqqVar;
        dsqw.cc(dmqq.class, dmqqVar);
    }

    private dmqq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဌ\u0001", new Object[]{"a", "b", "c", dmqo.a});
            }
            if (i2 == 3) {
                return new dmqq();
            }
            if (i2 == 4) {
                return new dmql();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmqq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmqq.class) {
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
