package defpackage;
/* compiled from: PG */
/* renamed from: duzg  reason: default package */
/* loaded from: classes6.dex */
public final class duzg extends dsqw<duzg, duzf> implements dssk {
    public static final duzg b;
    private static volatile dssr<duzg> c;
    public dsrj<duze> a = dssu.b;

    static {
        duzg duzgVar = new duzg();
        b = duzgVar;
        dsqw.cc(duzg.class, duzgVar);
    }

    private duzg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", duze.class});
            }
            if (i2 == 3) {
                return new duzg();
            }
            if (i2 == 4) {
                return new duzf();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duzg> dssrVar = c;
            if (dssrVar == null) {
                synchronized (duzg.class) {
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
