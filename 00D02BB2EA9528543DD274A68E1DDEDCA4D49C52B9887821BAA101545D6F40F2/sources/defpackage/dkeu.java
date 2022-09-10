package defpackage;
/* compiled from: PG */
/* renamed from: dkeu  reason: default package */
/* loaded from: classes6.dex */
public final class dkeu extends dsqw<dkeu, dket> implements dssk {
    public static final dkeu a;
    private static volatile dssr<dkeu> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        dkeu dkeuVar = new dkeu();
        a = dkeuVar;
        dsqw.cc(dkeu.class, dkeuVar);
    }

    private dkeu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dkeu();
            }
            if (i2 == 4) {
                return new dket();
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
            dssr<dkeu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkeu.class) {
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
