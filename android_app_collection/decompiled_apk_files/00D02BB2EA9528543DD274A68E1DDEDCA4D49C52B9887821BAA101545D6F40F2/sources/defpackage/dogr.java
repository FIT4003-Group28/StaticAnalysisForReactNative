package defpackage;
/* compiled from: PG */
/* renamed from: dogr  reason: default package */
/* loaded from: classes6.dex */
public final class dogr extends dsqw<dogr, dogm> implements dssk {
    public static final dogr b;
    private static volatile dssr<dogr> c;
    public dsrj<dogq> a = dssu.b;

    static {
        dogr dogrVar = new dogr();
        b = dogrVar;
        dsqw.cc(dogr.class, dogrVar);
    }

    private dogr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", dogq.class});
            }
            if (i2 == 3) {
                return new dogr();
            }
            if (i2 == 4) {
                return new dogm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dogr> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dogr.class) {
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
