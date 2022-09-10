package defpackage;
/* compiled from: PG */
/* renamed from: dgrf  reason: default package */
/* loaded from: classes6.dex */
public final class dgrf extends dsqw<dgrf, dgre> implements dssk {
    private static volatile dssr<dgrf> C;
    public static final dgrf a;
    private dgrh A;
    private byte B = 2;
    private int b;
    private int c;
    private dgrh d;
    private dgrt e;
    private dgrt f;
    private dgrr g;
    private dgrn h;
    private dgrh i;
    private dtro j;
    private dgrd k;
    private dgqp l;
    private dgrv m;
    private dgrj n;
    private dgqv o;
    private dgrp p;
    private dgqn q;
    private dgqt r;
    private dgqr s;
    private dgrb t;
    private dgqz u;
    private dgrl v;
    private dgql w;
    private dgqh x;
    private dgqd y;
    private dgrh z;

    static {
        dgrf dgrfVar = new dgrf();
        a = dgrfVar;
        dsqw.cc(dgrf.class, dgrfVar);
    }

    private dgrf() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0018\u0000\u0002\u0001Ĭ\u0018\u0000\u0000\u0018\u0001ᔉ\u0000\u0002ᐉ\u0001\nᐉ\u0006\u0013ᐉ\t\u0019ᐉ\r\u001fᐉ\u0016 ᐉ\u0017!ᐉ\u0019\"ᐉ\u001a+ᐉ\u001d,ᐉ\u001e3ᐉ#8ᐉ';ᐉ\u0002<ᐉ(Cᐉ\u0010Lᐉ\u0014Rᐉ.Sᐉ\u0005Wᐉ\u001c\\ᐉ1]ᐉ2^ᐉ3Ĭᐉ/", new Object[]{"b", "c", "d", "e", "h", "i", "j", "m", "n", "o", "p", "r", "s", "t", "u", "f", "v", "k", "l", "w", "g", "q", "y", "z", "A", "x"});
            }
            if (i2 == 3) {
                return new dgrf();
            }
            if (i2 == 4) {
                return new dgre();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.B = b;
                return null;
            }
            dssr<dgrf> dssrVar = C;
            if (dssrVar == null) {
                synchronized (dgrf.class) {
                    dssrVar = C;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        C = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.B);
    }
}
