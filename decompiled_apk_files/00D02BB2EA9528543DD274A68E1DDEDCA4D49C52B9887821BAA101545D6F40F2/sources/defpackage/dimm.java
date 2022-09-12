package defpackage;
/* compiled from: PG */
/* renamed from: dimm  reason: default package */
/* loaded from: classes6.dex */
public final class dimm extends dsqs<dimm, dimj> implements dsqt {
    public static final dimm h;
    private static volatile dssr<dimm> m;
    public int a;
    public diml c;
    public diml d;
    public boolean e;
    public diml f;
    public dnwb g;
    private dnqh i;
    private boolean j;
    private boolean k;
    private byte l = 2;
    public String b = "";

    static {
        dimm dimmVar = new dimm();
        h = dimmVar;
        dsqw.cc(dimm.class, dimmVar);
    }

    private dimm() {
    }

    public static /* synthetic */ void b(dimm dimmVar) {
        dimmVar.a |= 8;
        dimmVar.j = true;
    }

    public static /* synthetic */ void c(dimm dimmVar) {
        dimmVar.a |= 32;
        dimmVar.k = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007ဉ\u0006\bဇ\u0007\tဉ\b\nဉ\t", new Object[]{"a", "i", "b", "j", "c", "k", "d", "e", "f", "g"});
            }
            if (i2 == 3) {
                return new dimm();
            }
            if (i2 == 4) {
                return new dimj();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            }
            dssr<dimm> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dimm.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.l);
    }
}
