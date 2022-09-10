package defpackage;
/* compiled from: PG */
/* renamed from: dmnp  reason: default package */
/* loaded from: classes.dex */
public final class dmnp extends dsqw<dmnp, dmno> implements dssk {
    public static final dmnp a;
    private static volatile dssr<dmnp> f;
    private int b;
    private float c;
    private float d;
    private byte e = 2;

    static {
        dmnp dmnpVar = new dmnp();
        a = dmnpVar;
        dsqw.cc(dmnp.class, dmnpVar);
    }

    private dmnp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔁ\u0000\u0002ᔁ\u0001", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new dmnp();
            }
            if (i2 == 4) {
                return new dmno();
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
            dssr<dmnp> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmnp.class) {
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
