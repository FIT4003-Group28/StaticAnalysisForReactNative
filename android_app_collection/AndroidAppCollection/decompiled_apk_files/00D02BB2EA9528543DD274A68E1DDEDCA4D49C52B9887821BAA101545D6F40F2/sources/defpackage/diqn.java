package defpackage;
/* compiled from: PG */
/* renamed from: diqn  reason: default package */
/* loaded from: classes6.dex */
public final class diqn extends dsqw<diqn, diqm> implements dssk {
    public static final diqn a;
    private static volatile dssr<diqn> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        diqn diqnVar = new diqn();
        a = diqnVar;
        dsqw.cc(diqn.class, diqnVar);
    }

    private diqn() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new diqn();
            }
            if (i2 == 4) {
                return new diqm();
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
            dssr<diqn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (diqn.class) {
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
