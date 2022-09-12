package defpackage;
/* compiled from: PG */
/* renamed from: didi  reason: default package */
/* loaded from: classes6.dex */
public final class didi extends dsqw<didi, didh> implements dssk {
    public static final didi b;
    private static volatile dssr<didi> c;
    public dsrj<djbh> a = dssu.b;

    static {
        didi didiVar = new didi();
        b = didiVar;
        dsqw.cc(didi.class, didiVar);
    }

    private didi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", djbh.class});
            }
            if (i2 == 3) {
                return new didi();
            }
            if (i2 == 4) {
                return new didh();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<didi> dssrVar = c;
            if (dssrVar == null) {
                synchronized (didi.class) {
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
