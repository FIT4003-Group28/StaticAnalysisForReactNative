package defpackage;
/* compiled from: PG */
/* renamed from: dinq  reason: default package */
/* loaded from: classes6.dex */
public final class dinq extends dsqw<dinq, dimz> implements dssk {
    public static final dinq g;
    private static volatile dssr<dinq> i;
    public int a;
    public dinm b;
    public dino c;
    public int d;
    public dmbi e;
    public dnqh f;
    private byte h = 2;

    static {
        dinq dinqVar = new dinq();
        g = dinqVar;
        dsqw.cc(dinq.class, dinqVar);
    }

    private dinq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0005ᐉ\u0005\bဉ\u0003", new Object[]{"a", "b", "c", "d", dinp.a, "f", "e"});
            }
            if (i3 == 3) {
                return new dinq();
            }
            if (i3 == 4) {
                return new dimz();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dinq> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dinq.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
