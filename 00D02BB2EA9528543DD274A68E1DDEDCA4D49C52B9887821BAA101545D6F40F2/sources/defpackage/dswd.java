package defpackage;
/* compiled from: PG */
/* renamed from: dswd  reason: default package */
/* loaded from: classes6.dex */
public final class dswd extends dsqw<dswd, dswc> implements dssk {
    public static final dswd b;
    private static volatile dssr<dswd> d;
    private byte c = 2;
    public dsrj<dsyn> a = dssu.b;

    static {
        dswd dswdVar = new dswd();
        b = dswdVar;
        dsqw.cc(dswd.class, dswdVar);
    }

    private dswd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dsyn.class});
            }
            if (i2 == 3) {
                return new dswd();
            }
            if (i2 == 4) {
                return new dswc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.c = b2;
                return null;
            }
            dssr<dswd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dswd.class) {
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
