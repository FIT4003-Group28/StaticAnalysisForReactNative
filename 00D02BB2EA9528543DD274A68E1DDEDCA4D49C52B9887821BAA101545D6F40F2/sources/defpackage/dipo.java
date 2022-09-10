package defpackage;
/* compiled from: PG */
/* renamed from: dipo  reason: default package */
/* loaded from: classes.dex */
public final class dipo extends dsqw<dipo, dipl> implements dssk {
    public static final dipo e;
    private static volatile dssr<dipo> g;
    public int a;
    public dipn b;
    public int d;
    private byte f = 2;
    public dsrj<dipk> c = dssu.b;

    static {
        dipo dipoVar = new dipo();
        e = dipoVar;
        dsqw.cc(dipo.class, dipoVar);
    }

    private dipo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ဌ\u0001", new Object[]{"a", "b", "c", dipk.class, "d", dgcf.a});
            }
            if (i2 == 3) {
                return new dipo();
            }
            if (i2 == 4) {
                return new dipl();
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
            dssr<dipo> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dipo.class) {
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
