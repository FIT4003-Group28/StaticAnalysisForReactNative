package defpackage;
/* compiled from: PG */
/* renamed from: djtd  reason: default package */
/* loaded from: classes6.dex */
public final class djtd extends dsqw<djtd, djtc> implements dssk {
    public static final djtd a;
    private static volatile dssr<djtd> b;

    static {
        djtd djtdVar = new djtd();
        a = djtdVar;
        dsqw.cc(djtd.class, djtdVar);
    }

    private djtd() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djtd();
            }
            if (i2 == 4) {
                return new djtc();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djtd> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djtd.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
