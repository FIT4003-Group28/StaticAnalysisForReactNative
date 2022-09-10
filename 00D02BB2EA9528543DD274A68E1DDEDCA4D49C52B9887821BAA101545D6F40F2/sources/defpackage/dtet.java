package defpackage;
/* compiled from: PG */
/* renamed from: dtet  reason: default package */
/* loaded from: classes6.dex */
public final class dtet extends dsqw<dtet, dtes> implements dssk {
    public static final dtet a;
    private static volatile dssr<dtet> e;
    private int b;
    private dtdh c;
    private byte d = 2;

    static {
        dtet dtetVar = new dtet();
        a = dtetVar;
        dsqw.cc(dtet.class, dtetVar);
    }

    private dtet() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dtet();
            }
            if (i2 == 4) {
                return new dtes();
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
            dssr<dtet> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtet.class) {
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
