package defpackage;
/* compiled from: PG */
/* renamed from: bxmh  reason: default package */
/* loaded from: classes4.dex */
public final class bxmh extends dsqw<bxmh, bxme> implements dssk {
    public static final bxmh f;
    private static volatile dssr<bxmh> h;
    public int a;
    public dwjj b;
    public drgr d;
    public int e;
    private byte g = 2;
    public String c = "";

    static {
        bxmh bxmhVar = new bxmh();
        f = bxmhVar;
        dsqw.cc(bxmh.class, bxmhVar);
    }

    private bxmh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0006ဉ\u0004\u0007ဌ\u0005", new Object[]{"a", "b", "c", "d", "e", bxmg.c()});
            }
            if (i2 == 3) {
                return new bxmh();
            }
            if (i2 == 4) {
                return new bxme();
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
            dssr<bxmh> dssrVar = h;
            if (dssrVar == null) {
                synchronized (bxmh.class) {
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
