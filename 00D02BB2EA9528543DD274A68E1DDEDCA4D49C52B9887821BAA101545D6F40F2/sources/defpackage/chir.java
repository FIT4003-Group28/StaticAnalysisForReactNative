package defpackage;
/* compiled from: PG */
/* renamed from: chir  reason: default package */
/* loaded from: classes4.dex */
public final class chir extends dsqw<chir, chin> implements dssk {
    public static final chir c;
    private static volatile dssr<chir> e;
    public int a;
    private dssd<String, String> d = dssd.b;
    public int b = 1;

    static {
        chir chirVar = new chir();
        c = chirVar;
        dsqw.cc(chir.class, chirVar);
    }

    private chir() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0001\u0000\u0000\u0002ဌ\u0000\u00032", new Object[]{"a", "b", chio.a, "d", chiq.a});
            }
            if (i2 == 3) {
                return new chir();
            }
            if (i2 == 4) {
                return new chin();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chir> dssrVar = e;
            if (dssrVar == null) {
                synchronized (chir.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
