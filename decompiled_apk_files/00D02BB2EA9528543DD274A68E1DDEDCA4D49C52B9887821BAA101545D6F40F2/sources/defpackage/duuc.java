package defpackage;
/* compiled from: PG */
/* renamed from: duuc  reason: default package */
/* loaded from: classes.dex */
public final class duuc extends dsqw<duuc, duub> implements dssk {
    public static final duuc a;
    private static volatile dssr<duuc> b;

    static {
        duuc duucVar = new duuc();
        a = duucVar;
        dsqw.cc(duuc.class, duucVar);
    }

    private duuc() {
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
                return new duuc();
            }
            if (i2 == 4) {
                return new duub();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duuc> dssrVar = b;
            if (dssrVar == null) {
                synchronized (duuc.class) {
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
