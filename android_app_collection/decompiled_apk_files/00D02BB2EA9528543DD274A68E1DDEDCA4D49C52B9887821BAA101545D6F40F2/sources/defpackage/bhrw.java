package defpackage;
/* compiled from: PG */
/* renamed from: bhrw  reason: default package */
/* loaded from: classes3.dex */
public final class bhrw extends dsqw<bhrw, bhrv> implements dssk {
    public static final bhrw c;
    private static volatile dssr<bhrw> d;
    public int a;
    public ccln b;

    static {
        bhrw bhrwVar = new bhrw();
        c = bhrwVar;
        dsqw.cc(bhrw.class, bhrwVar);
    }

    private bhrw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new bhrw();
            }
            if (i2 == 4) {
                return new bhrv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bhrw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (bhrw.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
