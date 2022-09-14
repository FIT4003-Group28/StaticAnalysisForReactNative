package defpackage;
/* compiled from: PG */
/* renamed from: auni  reason: default package */
/* loaded from: classes2.dex */
public final class auni extends dsqw<auni, aunh> implements dssk {
    public static final auni e;
    private static volatile dssr<auni> f;
    public int a;
    public int b;
    public String c = "";
    public long d;

    static {
        auni auniVar = new auni();
        e = auniVar;
        dsqw.cc(auni.class, auniVar);
    }

    private auni() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new auni();
            }
            if (i2 == 4) {
                return new aunh();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<auni> dssrVar = f;
            if (dssrVar == null) {
                synchronized (auni.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
