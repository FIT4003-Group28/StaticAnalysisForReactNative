package defpackage;
/* compiled from: PG */
/* renamed from: dhdl  reason: default package */
/* loaded from: classes6.dex */
public final class dhdl extends dsqw<dhdl, dhdk> implements dssk {
    public static final dhdl b;
    private static volatile dssr<dhdl> d;
    public dayc a;
    private byte c = 2;

    static {
        dhdl dhdlVar = new dhdl();
        b = dhdlVar;
        dsqw.cc(dhdl.class, dhdlVar);
    }

    private dhdl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 0;
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0001\u0003Љ", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dhdl();
            }
            if (i2 == 4) {
                return new dhdk();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj != null) {
                    b2 = 1;
                }
                this.c = b2;
                return null;
            }
            dssr<dhdl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhdl.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
