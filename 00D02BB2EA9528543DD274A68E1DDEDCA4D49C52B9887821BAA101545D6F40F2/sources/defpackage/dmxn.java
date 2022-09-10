package defpackage;
/* compiled from: PG */
/* renamed from: dmxn  reason: default package */
/* loaded from: classes.dex */
public final class dmxn extends dsqw<dmxn, dmxm> implements dssk {
    public static final dmxn e;
    private static volatile dssr<dmxn> g;
    public int a;
    private byte f = 2;
    public String b = "";
    public String c = "";
    public dsrj<dmyu> d = dssu.b;

    static {
        dmxn dmxnVar = new dmxn();
        e = dmxnVar;
        dsqw.cc(dmxn.class, dmxnVar);
    }

    private dmxn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\f\u0003\u0000\u0001\u0001\u0002ဈ\u0000\u0003ဈ\u0001\fЛ", new Object[]{"a", "b", "c", "d", dmyu.class});
            }
            if (i2 == 3) {
                return new dmxn();
            }
            if (i2 == 4) {
                return new dmxm();
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
            dssr<dmxn> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dmxn.class) {
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
