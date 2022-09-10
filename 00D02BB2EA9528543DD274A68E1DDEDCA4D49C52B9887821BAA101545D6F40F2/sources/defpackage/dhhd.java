package defpackage;
/* compiled from: PG */
/* renamed from: dhhd  reason: default package */
/* loaded from: classes6.dex */
public final class dhhd extends dsqw<dhhd, dhhc> implements dssk {
    public static final dhhd a;
    private static volatile dssr<dhhd> e;
    private int b;
    private dtro c;
    private byte d = 2;

    static {
        dhhd dhhdVar = new dhhd();
        a = dhhdVar;
        dsqw.cc(dhhd.class, dhhdVar);
    }

    private dhhd() {
        dssu<Object> dssuVar = dssu.b;
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\n\n\u0001\u0000\u0000\u0001\nᐉ\u0006", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dhhd();
            }
            if (i2 == 4) {
                return new dhhc();
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
            dssr<dhhd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhhd.class) {
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
