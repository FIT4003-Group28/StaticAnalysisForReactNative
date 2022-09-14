package defpackage;
/* compiled from: PG */
/* renamed from: djsl  reason: default package */
/* loaded from: classes6.dex */
public final class djsl extends dsqw<djsl, djsk> implements dssk {
    public static final djsl b;
    private static volatile dssr<djsl> c;
    public dsrj<dgly> a;

    static {
        djsl djslVar = new djsl();
        b = djslVar;
        dsqw.cc(djsl.class, djslVar);
    }

    private djsl() {
        dssu<Object> dssuVar = dssu.b;
        this.a = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", dgly.class});
            }
            if (i2 == 3) {
                return new djsl();
            }
            if (i2 == 4) {
                return new djsk();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djsl> dssrVar = c;
            if (dssrVar == null) {
                synchronized (djsl.class) {
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
