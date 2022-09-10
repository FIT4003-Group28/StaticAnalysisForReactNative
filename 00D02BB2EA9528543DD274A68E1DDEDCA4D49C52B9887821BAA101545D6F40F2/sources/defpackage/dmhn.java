package defpackage;
/* compiled from: PG */
/* renamed from: dmhn  reason: default package */
/* loaded from: classes6.dex */
public final class dmhn extends dsqw<dmhn, dmhm> implements dssk {
    public static final dmhn b;
    private static volatile dssr<dmhn> c;
    public dsrj<String> a = dssu.b;

    static {
        dmhn dmhnVar = new dmhn();
        b = dmhnVar;
        dsqw.cc(dmhn.class, dmhnVar);
    }

    private dmhn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dmhn();
            }
            if (i2 == 4) {
                return new dmhm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmhn> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmhn.class) {
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
