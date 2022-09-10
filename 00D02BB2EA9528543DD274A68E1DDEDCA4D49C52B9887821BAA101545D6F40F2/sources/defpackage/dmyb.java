package defpackage;
/* compiled from: PG */
/* renamed from: dmyb  reason: default package */
/* loaded from: classes6.dex */
public final class dmyb extends dsqw<dmyb, dmya> implements dssk {
    public static final dmyb a;
    private static volatile dssr<dmyb> f;
    private int b;
    private int c;
    private int d;
    private byte e = 2;

    static {
        dmyb dmybVar = new dmyb();
        a = dmybVar;
        dsqw.cc(dmyb.class, dmybVar);
    }

    private dmyb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔋ\u0000\u0002ᔋ\u0001", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new dmyb();
            }
            if (i2 == 4) {
                return new dmya();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dmyb> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmyb.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
