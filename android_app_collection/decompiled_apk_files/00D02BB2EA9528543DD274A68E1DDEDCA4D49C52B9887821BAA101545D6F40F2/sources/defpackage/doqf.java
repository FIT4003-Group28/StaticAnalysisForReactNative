package defpackage;
/* compiled from: PG */
/* renamed from: doqf  reason: default package */
/* loaded from: classes6.dex */
public final class doqf extends dsqw<doqf, doqe> implements dssk {
    public static final doqf b;
    private static volatile dssr<doqf> e;
    public dphe a;
    private int c;
    private byte d = 2;

    static {
        doqf doqfVar = new doqf();
        b = doqfVar;
        dsqw.cc(doqf.class, doqfVar);
    }

    private doqf() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new doqf();
            }
            if (i2 == 4) {
                return new doqe();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.d = b2;
                return null;
            }
            dssr<doqf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (doqf.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
