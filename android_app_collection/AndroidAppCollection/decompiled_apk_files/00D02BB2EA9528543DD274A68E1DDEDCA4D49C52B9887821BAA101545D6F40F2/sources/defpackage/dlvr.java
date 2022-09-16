package defpackage;
/* compiled from: PG */
/* renamed from: dlvr  reason: default package */
/* loaded from: classes6.dex */
public final class dlvr extends dsqw<dlvr, dlvm> implements dssk {
    public static final dlvr c;
    private static volatile dssr<dlvr> d;
    public dsrj<dlvo> a = dssu.b;
    public dsrj<dlvq> b = dssu.b;

    static {
        dlvr dlvrVar = new dlvr();
        c = dlvrVar;
        dsqw.cc(dlvr.class, dlvrVar);
    }

    private dlvr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", dlvo.class, "b", dlvq.class});
            }
            if (i2 == 3) {
                return new dlvr();
            }
            if (i2 == 4) {
                return new dlvm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlvr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlvr.class) {
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
