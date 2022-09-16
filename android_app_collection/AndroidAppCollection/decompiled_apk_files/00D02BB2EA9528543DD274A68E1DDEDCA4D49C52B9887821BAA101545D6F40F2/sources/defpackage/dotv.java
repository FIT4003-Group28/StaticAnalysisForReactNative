package defpackage;
/* compiled from: PG */
/* renamed from: dotv  reason: default package */
/* loaded from: classes6.dex */
public final class dotv extends dsqw<dotv, dotu> implements dssk {
    public static final dotv f;
    private static volatile dssr<dotv> h;
    public int a;
    public dpgl b;
    public int c;
    public int d;
    public dgas e;
    private byte g = 2;

    static {
        dotv dotvVar = new dotv();
        f = dotvVar;
        dsqw.cc(dotv.class, dotvVar);
    }

    private dotv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0003င\u0001\u0004င\u0002\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dotv();
            }
            if (i2 == 4) {
                return new dotu();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dotv> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dotv.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
