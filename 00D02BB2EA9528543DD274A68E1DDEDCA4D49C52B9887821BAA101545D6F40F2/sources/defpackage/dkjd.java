package defpackage;
/* compiled from: PG */
/* renamed from: dkjd  reason: default package */
/* loaded from: classes.dex */
public final class dkjd extends dsqw<dkjd, dkjc> implements dssk {
    public static final dkjd c;
    private static volatile dssr<dkjd> d;
    public dssd<Integer, dklb> b = dssd.b;
    public dsrj<dkgt> a = dssu.b;

    static {
        dkjd dkjdVar = new dkjd();
        c = dkjdVar;
        dsqw.cc(dkjd.class, dkjdVar);
    }

    private dkjd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0001\u0001\u0000\u0001\u001b\u00032", new Object[]{"a", dkgt.class, "b", dkjb.a});
            }
            if (i2 == 3) {
                return new dkjd();
            }
            if (i2 == 4) {
                return new dkjc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkjd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkjd.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
