package defpackage;
/* compiled from: PG */
/* renamed from: akul  reason: default package */
/* loaded from: classes2.dex */
public final class akul extends dsqw<akul, akuk> implements dssk {
    public static final akul d;
    private static volatile dssr<akul> e;
    public int a;
    public int b;
    public int c;

    static {
        akul akulVar = new akul();
        d = akulVar;
        dsqw.cc(akul.class, akulVar);
    }

    private akul() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new akul();
            }
            if (i2 == 4) {
                return new akuk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<akul> dssrVar = e;
            if (dssrVar == null) {
                synchronized (akul.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
