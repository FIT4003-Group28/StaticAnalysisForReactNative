package defpackage;
/* compiled from: PG */
/* renamed from: dtor  reason: default package */
/* loaded from: classes6.dex */
public final class dtor extends dsqw<dtor, dtoq> implements dssk {
    public static final dtor a;
    private static volatile dssr<dtor> b;

    static {
        dtor dtorVar = new dtor();
        a = dtorVar;
        dsqw.cc(dtor.class, dtorVar);
    }

    private dtor() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dtor();
            }
            if (i2 == 4) {
                return new dtoq();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtor> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtor.class) {
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
