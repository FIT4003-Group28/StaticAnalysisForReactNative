package defpackage;
/* compiled from: PG */
/* renamed from: dgrb  reason: default package */
/* loaded from: classes6.dex */
public final class dgrb extends dsqw<dgrb, dgra> implements dssk {
    public static final dgrb a;
    private static volatile dssr<dgrb> e;
    private int b;
    private dgqj c;
    private byte d = 2;

    static {
        dgrb dgrbVar = new dgrb();
        a = dgrbVar;
        dsqw.cc(dgrb.class, dgrbVar);
    }

    private dgrb() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\r\r\u0001\u0000\u0000\u0001\rᐉ\u0002", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dgrb();
            }
            if (i2 == 4) {
                return new dgra();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dgrb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgrb.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
