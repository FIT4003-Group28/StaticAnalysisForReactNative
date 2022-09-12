package defpackage;
/* compiled from: PG */
/* renamed from: dige  reason: default package */
/* loaded from: classes6.dex */
public final class dige extends dsqw<dige, digd> implements dssk {
    public static final dige c;
    private static volatile dssr<dige> f;
    public int a;
    public dpsn b;
    private dnqh d;
    private byte e = 2;

    static {
        dige digeVar = new dige();
        c = digeVar;
        dsqw.cc(dige.class, digeVar);
    }

    private dige() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဉ\u0002", new Object[]{"a", "d", "b"});
            }
            if (i2 == 3) {
                return new dige();
            }
            if (i2 == 4) {
                return new digd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dige> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dige.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
