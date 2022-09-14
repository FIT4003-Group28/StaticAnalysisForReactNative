package defpackage;
/* compiled from: PG */
/* renamed from: chwt  reason: default package */
/* loaded from: classes4.dex */
public final class chwt extends dsqw<chwt, chws> implements dssk {
    public static final chwt c;
    private static volatile dssr<chwt> e;
    public int a;
    public dqgp b;
    private byte d = 2;

    static {
        chwt chwtVar = new chwt();
        c = chwtVar;
        dsqw.cc(chwt.class, chwtVar);
    }

    private chwt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new chwt();
            }
            if (i2 == 4) {
                return new chws();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<chwt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (chwt.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
