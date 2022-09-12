package defpackage;
/* compiled from: PG */
/* renamed from: dkeq  reason: default package */
/* loaded from: classes6.dex */
public final class dkeq extends dsqw<dkeq, dkep> implements dssk {
    public static final dkeq e;
    private static volatile dssr<dkeq> g;
    public int a;
    public int c;
    public dnqh d;
    private byte f = 2;
    public String b = "";

    static {
        dkeq dkeqVar = new dkeq();
        e = dkeqVar;
        dsqw.cc(dkeq.class, dkeqVar);
    }

    private dkeq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဌ\u0001\u0004ᐉ\u0003", new Object[]{"a", "b", "c", dqjh.c(), "d"});
            }
            if (i2 == 3) {
                return new dkeq();
            }
            if (i2 == 4) {
                return new dkep();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dkeq> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dkeq.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
