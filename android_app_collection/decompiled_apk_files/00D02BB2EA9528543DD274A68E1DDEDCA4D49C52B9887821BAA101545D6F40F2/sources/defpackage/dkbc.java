package defpackage;
/* compiled from: PG */
/* renamed from: dkbc  reason: default package */
/* loaded from: classes6.dex */
public final class dkbc extends dsqw<dkbc, dkbb> implements dssk {
    public static final dkbc a;
    private static volatile dssr<dkbc> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        dkbc dkbcVar = new dkbc();
        a = dkbcVar;
        dsqw.cc(dkbc.class, dkbcVar);
    }

    private dkbc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0004", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dkbc();
            }
            if (i2 == 4) {
                return new dkbb();
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
            dssr<dkbc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkbc.class) {
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
