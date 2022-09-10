package defpackage;
/* compiled from: PG */
/* renamed from: dpxb  reason: default package */
/* loaded from: classes6.dex */
public final class dpxb extends dsqw<dpxb, dpxa> implements dssk {
    public static final dpxb c;
    private static volatile dssr<dpxb> e;
    public int a;
    public dmni b;
    private byte d = 2;

    static {
        dpxb dpxbVar = new dpxb();
        c = dpxbVar;
        dsqw.cc(dpxb.class, dpxbVar);
    }

    private dpxb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dpxb();
            }
            if (i2 == 4) {
                return new dpxa();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dpxb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpxb.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
