package defpackage;
/* compiled from: PG */
/* renamed from: djth  reason: default package */
/* loaded from: classes6.dex */
public final class djth extends dsqw<djth, djtg> implements dssk {
    public static final djth b;
    private static volatile dssr<djth> c;
    public dsrj<djtf> a = dssu.b;

    static {
        djth djthVar = new djth();
        b = djthVar;
        dsqw.cc(djth.class, djthVar);
    }

    private djth() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", djtf.class});
            }
            if (i2 == 3) {
                return new djth();
            }
            if (i2 == 4) {
                return new djtg();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djth> dssrVar = c;
            if (dssrVar == null) {
                synchronized (djth.class) {
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
