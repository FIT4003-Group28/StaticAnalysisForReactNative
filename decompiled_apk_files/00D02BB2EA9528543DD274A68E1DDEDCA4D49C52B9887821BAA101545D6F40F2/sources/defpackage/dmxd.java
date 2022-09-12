package defpackage;
/* compiled from: PG */
/* renamed from: dmxd  reason: default package */
/* loaded from: classes6.dex */
public final class dmxd extends dsqs<dmxd, dmxc> implements dsqt {
    public static final dmxd a;
    private static volatile dssr<dmxd> c;
    private byte b = 2;

    static {
        dmxd dmxdVar = new dmxd();
        a = dmxdVar;
        dsqw.cc(dmxd.class, dmxdVar);
    }

    private dmxd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dmxd();
            }
            if (i2 == 4) {
                return new dmxc();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dmxd> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmxd.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.b);
    }
}
