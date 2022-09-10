package defpackage;
/* compiled from: PG */
/* renamed from: dmwr  reason: default package */
/* loaded from: classes6.dex */
public final class dmwr extends dsqw<dmwr, dmwq> implements dssk {
    public static final dmwr b;
    private static volatile dssr<dmwr> c;
    public dsrj<String> a = dssu.b;

    static {
        dmwr dmwrVar = new dmwr();
        b = dmwrVar;
        dsqw.cc(dmwr.class, dmwrVar);
    }

    private dmwr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dmwr();
            }
            if (i2 == 4) {
                return new dmwq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmwr> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmwr.class) {
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
