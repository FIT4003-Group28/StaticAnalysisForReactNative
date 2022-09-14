package defpackage;
/* compiled from: PG */
/* renamed from: diwv  reason: default package */
/* loaded from: classes6.dex */
public final class diwv extends dsqw<diwv, diwu> implements dssk {
    public static final diwv a;
    private static volatile dssr<diwv> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        diwv diwvVar = new diwv();
        a = diwvVar;
        dsqw.cc(diwv.class, diwvVar);
    }

    private diwv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new diwv();
            }
            if (i2 == 4) {
                return new diwu();
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
            dssr<diwv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (diwv.class) {
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
