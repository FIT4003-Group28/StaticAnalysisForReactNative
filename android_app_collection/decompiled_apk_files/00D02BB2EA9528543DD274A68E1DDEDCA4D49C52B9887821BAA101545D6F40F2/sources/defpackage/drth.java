package defpackage;
/* compiled from: PG */
/* renamed from: drth  reason: default package */
/* loaded from: classes6.dex */
public final class drth extends dsqs<drth, drtf> implements dsqt {
    public static final drth a;
    private static volatile dssr<drth> f;
    private int b;
    private dtro c;
    private dssd<String, drtj> d = dssd.b;
    private byte e = 2;

    static {
        drth drthVar = new drth();
        a = drthVar;
        dsqw.cc(drth.class, drthVar);
    }

    private drth() {
        dssu<Object> dssuVar = dssu.b;
        dspd dspdVar = dspd.b;
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u000e#\u0002\u0001\u0000\u0002\u000eᐉ\u0010#в", new Object[]{"b", "c", "d", drtg.a});
            }
            if (i2 == 3) {
                return new drth();
            }
            if (i2 == 4) {
                return new drtf();
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
            dssr<drth> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drth.class) {
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
