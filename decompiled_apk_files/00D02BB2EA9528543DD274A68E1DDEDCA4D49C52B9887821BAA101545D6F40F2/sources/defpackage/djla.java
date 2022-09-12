package defpackage;
/* compiled from: PG */
/* renamed from: djla  reason: default package */
/* loaded from: classes6.dex */
public final class djla extends dsqw<djla, djkz> implements dssk {
    public static final djla d;
    private static volatile dssr<djla> e;
    public int a;
    public long b;
    public long c;

    static {
        djla djlaVar = new djla();
        d = djlaVar;
        dsqw.cc(djla.class, djlaVar);
    }

    private djla() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0004ဂ\u0003", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new djla();
            }
            if (i2 == 4) {
                return new djkz();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djla> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djla.class) {
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
