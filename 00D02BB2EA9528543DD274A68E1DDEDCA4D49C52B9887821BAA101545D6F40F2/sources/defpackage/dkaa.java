package defpackage;
/* compiled from: PG */
/* renamed from: dkaa  reason: default package */
/* loaded from: classes6.dex */
public final class dkaa extends dsqw<dkaa, djzz> implements dssk {
    public static final dkaa a;
    private static volatile dssr<dkaa> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        dkaa dkaaVar = new dkaa();
        a = dkaaVar;
        dsqw.cc(dkaa.class, dkaaVar);
    }

    private dkaa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0001", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dkaa();
            }
            if (i2 == 4) {
                return new djzz();
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
            dssr<dkaa> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkaa.class) {
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
