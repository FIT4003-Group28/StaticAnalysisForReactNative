package defpackage;
/* compiled from: PG */
/* renamed from: djqg  reason: default package */
/* loaded from: classes.dex */
public final class djqg extends dsqw<djqg, djqf> implements dssk {
    public static final djqg b;
    private static volatile dssr<djqg> c;
    public dsrj<djqa> a = dssu.b;

    static {
        djqg djqgVar = new djqg();
        b = djqgVar;
        dsqw.cc(djqg.class, djqgVar);
    }

    private djqg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", djqa.class});
            }
            if (i2 == 3) {
                return new djqg();
            }
            if (i2 == 4) {
                return new djqf();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djqg> dssrVar = c;
            if (dssrVar == null) {
                synchronized (djqg.class) {
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
