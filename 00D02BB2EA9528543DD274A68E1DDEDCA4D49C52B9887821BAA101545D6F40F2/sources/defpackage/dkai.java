package defpackage;
/* compiled from: PG */
/* renamed from: dkai  reason: default package */
/* loaded from: classes6.dex */
public final class dkai extends dsqw<dkai, dkah> implements dssk {
    public static final dkai a;
    private static volatile dssr<dkai> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        dkai dkaiVar = new dkai();
        a = dkaiVar;
        dsqw.cc(dkai.class, dkaiVar);
    }

    private dkai() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0001", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dkai();
            }
            if (i2 == 4) {
                return new dkah();
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
            dssr<dkai> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkai.class) {
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
