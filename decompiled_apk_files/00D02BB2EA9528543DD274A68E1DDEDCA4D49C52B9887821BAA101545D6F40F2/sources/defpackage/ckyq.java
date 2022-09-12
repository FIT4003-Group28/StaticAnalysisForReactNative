package defpackage;
/* compiled from: PG */
/* renamed from: ckyq  reason: default package */
/* loaded from: classes5.dex */
public final class ckyq extends dsqs<ckyq, ckyp> implements dsqt {
    public static final ckyq c;
    private static volatile dssr<ckyq> e;
    public int a;
    public int b;
    private byte d = 2;

    static {
        ckyq ckyqVar = new ckyq();
        c = ckyqVar;
        dsqw.cc(ckyq.class, ckyqVar);
    }

    private ckyq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", ckyn.a});
            }
            if (i2 == 3) {
                return new ckyq();
            }
            if (i2 == 4) {
                return new ckyp();
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
            dssr<ckyq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ckyq.class) {
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
