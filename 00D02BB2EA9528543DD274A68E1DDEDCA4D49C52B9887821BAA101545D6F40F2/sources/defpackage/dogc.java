package defpackage;
/* compiled from: PG */
/* renamed from: dogc  reason: default package */
/* loaded from: classes6.dex */
public final class dogc extends dsqw<dogc, dogb> implements dssk {
    public static final dogc e;
    private static volatile dssr<dogc> f;
    public int a;
    public dolk b;
    public dojz c;
    public dnkc d;

    static {
        dogc dogcVar = new dogc();
        e = dogcVar;
        dsqw.cc(dogc.class, dogcVar);
    }

    private dogc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0002\u0004ဉ\u0001", new Object[]{"a", "b", "d", "c"});
            }
            if (i2 == 3) {
                return new dogc();
            }
            if (i2 == 4) {
                return new dogb();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dogc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dogc.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
