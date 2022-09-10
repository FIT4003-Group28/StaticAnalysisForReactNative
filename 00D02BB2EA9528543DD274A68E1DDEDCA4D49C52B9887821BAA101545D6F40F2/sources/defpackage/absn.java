package defpackage;
/* compiled from: PG */
/* renamed from: absn  reason: default package */
/* loaded from: classes2.dex */
public final class absn extends dsqw<absn, absm> implements dssk {
    public static final dsrg<Integer, dpuz> f = new absl();
    public static final absn h;
    private static volatile dssr<absn> j;
    public int a;
    public int b;
    public dhjx c;
    public dhym d;
    public int g;
    private byte i = 2;
    public dsrf e = dsqz.b;

    static {
        absn absnVar = new absn();
        h = absnVar;
        dsqw.cc(absn.class, absnVar);
    }

    private absn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004\u001e\u0005ဌ\u0003", new Object[]{"a", "b", dpsv.c(), "c", "d", "e", dpuz.c(), "g", dpsw.a});
            }
            if (i2 == 3) {
                return new absn();
            }
            if (i2 == 4) {
                return new absm();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<absn> dssrVar = j;
            if (dssrVar == null) {
                synchronized (absn.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
