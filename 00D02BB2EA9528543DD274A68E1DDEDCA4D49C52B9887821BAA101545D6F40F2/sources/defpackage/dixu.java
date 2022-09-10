package defpackage;
/* compiled from: PG */
/* renamed from: dixu  reason: default package */
/* loaded from: classes6.dex */
public final class dixu extends dsqw<dixu, dixn> implements dssk {
    public static final dixu d;
    private static volatile dssr<dixu> e;
    public int a;
    public dixt b;
    public dixr c;

    static {
        dixu dixuVar = new dixu();
        d = dixuVar;
        dsqw.cc(dixu.class, dixuVar);
    }

    private dixu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dixu();
            }
            if (i2 == 4) {
                return new dixn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dixu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dixu.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
