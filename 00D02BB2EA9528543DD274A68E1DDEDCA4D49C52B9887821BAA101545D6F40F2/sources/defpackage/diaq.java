package defpackage;
/* compiled from: PG */
/* renamed from: diaq  reason: default package */
/* loaded from: classes6.dex */
public final class diaq extends dsqw<diaq, diap> implements dssk {
    public static final diaq d;
    private static volatile dssr<diaq> e;
    public int a;
    public dppt b;
    public int c;

    static {
        diaq diaqVar = new diaq();
        d = diaqVar;
        dsqw.cc(diaq.class, diaqVar);
    }

    private diaq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", dpuk.c()});
            }
            if (i2 == 3) {
                return new diaq();
            }
            if (i2 == 4) {
                return new diap();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diaq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (diaq.class) {
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
