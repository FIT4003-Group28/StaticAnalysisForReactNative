package defpackage;
/* compiled from: PG */
/* renamed from: dted  reason: default package */
/* loaded from: classes6.dex */
public final class dted extends dsqw<dted, dtec> implements dssk {
    public static final dted a;
    private static volatile dssr<dted> e;
    private int b;
    private dtfn c;
    private byte d = 2;

    static {
        dted dtedVar = new dted();
        a = dtedVar;
        dsqw.cc(dted.class, dtedVar);
    }

    private dted() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\t\t\u0001\u0000\u0000\u0001\tᐉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dted();
            }
            if (i2 == 4) {
                return new dtec();
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
            dssr<dted> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dted.class) {
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
