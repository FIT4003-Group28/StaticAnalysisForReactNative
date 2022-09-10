package defpackage;
/* compiled from: PG */
/* renamed from: diqf  reason: default package */
/* loaded from: classes6.dex */
public final class diqf extends dsqw<diqf, diqe> implements dssk {
    public static final diqf a;
    private static volatile dssr<diqf> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        diqf diqfVar = new diqf();
        a = diqfVar;
        dsqw.cc(diqf.class, diqfVar);
    }

    private diqf() {
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
                return new diqf();
            }
            if (i2 == 4) {
                return new diqe();
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
            dssr<diqf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (diqf.class) {
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
