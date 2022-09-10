package defpackage;
/* compiled from: PG */
/* renamed from: dokf  reason: default package */
/* loaded from: classes6.dex */
public final class dokf extends dsqw<dokf, dokc> implements dssk {
    public static final dokf d;
    private static volatile dssr<dokf> e;
    public int a;
    public int b;
    public dokb c;

    static {
        dokf dokfVar = new dokf();
        d = dokfVar;
        dsqw.cc(dokf.class, dokfVar);
    }

    private dokf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", dokd.a, "c"});
            }
            if (i2 == 3) {
                return new dokf();
            }
            if (i2 == 4) {
                return new dokc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dokf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dokf.class) {
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
