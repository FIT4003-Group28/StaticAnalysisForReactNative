package defpackage;
/* compiled from: PG */
/* renamed from: dkbi  reason: default package */
/* loaded from: classes6.dex */
public final class dkbi extends dsqw<dkbi, dkbh> implements dssk {
    public static final dkbi a;
    private static volatile dssr<dkbi> b;

    static {
        dkbi dkbiVar = new dkbi();
        a = dkbiVar;
        dsqw.cc(dkbi.class, dkbiVar);
    }

    private dkbi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dkbi();
            }
            if (i2 == 4) {
                return new dkbh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkbi> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dkbi.class) {
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