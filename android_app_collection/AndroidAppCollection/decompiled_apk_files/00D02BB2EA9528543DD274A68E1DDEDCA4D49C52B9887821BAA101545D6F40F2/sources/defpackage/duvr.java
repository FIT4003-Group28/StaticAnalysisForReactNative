package defpackage;
/* compiled from: PG */
/* renamed from: duvr  reason: default package */
/* loaded from: classes6.dex */
public final class duvr extends dsqw<duvr, duvq> implements dssk {
    public static final duvr b;
    private static volatile dssr<duvr> d;
    public dwvz a;
    private int c;

    static {
        duvr duvrVar = new duvr();
        b = duvrVar;
        dsqw.cc(duvr.class, duvrVar);
    }

    private duvr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new duvr();
            }
            if (i2 == 4) {
                return new duvq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duvr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (duvr.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
