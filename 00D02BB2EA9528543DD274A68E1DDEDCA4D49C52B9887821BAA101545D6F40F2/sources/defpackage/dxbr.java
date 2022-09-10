package defpackage;
/* compiled from: PG */
/* renamed from: dxbr  reason: default package */
/* loaded from: classes6.dex */
public final class dxbr extends dsqw<dxbr, dxbq> implements dssk {
    public static final dxbr h;
    private static volatile dssr<dxbr> j;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public dwzj g;
    private byte i = 2;

    static {
        dxbr dxbrVar = new dxbr();
        h = dxbrVar;
        dsqw.cc(dxbr.class, dxbrVar);
    }

    private dxbr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᔄ\u0001\u0006ဇ\u0007\bᐉ\t\tင\u0005\nင\u0006", new Object[]{"a", "b", "c", "f", "g", "d", "e"});
            }
            if (i2 == 3) {
                return new dxbr();
            }
            if (i2 == 4) {
                return new dxbq();
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
            dssr<dxbr> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dxbr.class) {
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
