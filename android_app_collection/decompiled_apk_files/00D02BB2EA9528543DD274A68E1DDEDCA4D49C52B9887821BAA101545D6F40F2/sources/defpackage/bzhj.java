package defpackage;
/* compiled from: PG */
/* renamed from: bzhj  reason: default package */
/* loaded from: classes4.dex */
public final class bzhj extends dsqw<bzhj, bzhg> implements dssk {
    public static final bzhj h;
    private static volatile dssr<bzhj> j;
    public int a;
    public bzjj b;
    public bzhn c;
    public dlkv d;
    public int g;
    private byte i = 2;
    public String e = "";
    public dsri f = dsrx.b;

    static {
        bzhj bzhjVar = new bzhj();
        h = bzhjVar;
        dsqw.cc(bzhj.class, bzhjVar);
    }

    private bzhj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0002\u0010\u0006\u0000\u0001\u0001\u0002ᐉ\u0000\u0004ဉ\u0001\nဉ\u0002\r\u0017\u000eဈ\u0003\u0010ဌ\u0004", new Object[]{"a", "b", "c", "d", "f", "e", "g", bzhh.a});
            }
            if (i2 == 3) {
                return new bzhj();
            }
            if (i2 == 4) {
                return new bzhg();
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
            dssr<bzhj> dssrVar = j;
            if (dssrVar == null) {
                synchronized (bzhj.class) {
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
