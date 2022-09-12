package defpackage;
/* compiled from: PG */
/* renamed from: dkit  reason: default package */
/* loaded from: classes6.dex */
public final class dkit extends dsqw<dkit, dkis> implements dssk {
    public static final dkit b;
    private static volatile dssr<dkit> c;
    public dsrj<dkir> a = dssu.b;

    static {
        dkit dkitVar = new dkit();
        b = dkitVar;
        dsqw.cc(dkit.class, dkitVar);
    }

    private dkit() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dkir.class});
            }
            if (i2 == 3) {
                return new dkit();
            }
            if (i2 == 4) {
                return new dkis();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkit> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dkit.class) {
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
