package defpackage;
/* compiled from: PG */
/* renamed from: drgn  reason: default package */
/* loaded from: classes6.dex */
public final class drgn extends dsqw<drgn, drgk> implements dssk {
    public static final drgn b;
    private static volatile dssr<drgn> c;
    public dsrj<drgm> a = dssu.b;

    static {
        drgn drgnVar = new drgn();
        b = drgnVar;
        dsqw.cc(drgn.class, drgnVar);
    }

    private drgn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", drgm.class});
            }
            if (i2 == 3) {
                return new drgn();
            }
            if (i2 == 4) {
                return new drgk();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drgn> dssrVar = c;
            if (dssrVar == null) {
                synchronized (drgn.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
