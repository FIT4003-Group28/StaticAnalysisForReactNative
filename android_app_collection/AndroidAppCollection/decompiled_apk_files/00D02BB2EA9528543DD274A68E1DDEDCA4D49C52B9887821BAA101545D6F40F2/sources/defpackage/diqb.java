package defpackage;
/* compiled from: PG */
/* renamed from: diqb  reason: default package */
/* loaded from: classes6.dex */
public final class diqb extends dsqw<diqb, diqa> implements dssk {
    public static final diqb a;
    private static volatile dssr<diqb> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        diqb diqbVar = new diqb();
        a = diqbVar;
        dsqw.cc(diqb.class, diqbVar);
    }

    private diqb() {
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
                return new diqb();
            }
            if (i2 == 4) {
                return new diqa();
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
            dssr<diqb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (diqb.class) {
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
