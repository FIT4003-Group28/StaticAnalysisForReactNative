package defpackage;
/* compiled from: PG */
/* renamed from: dhez  reason: default package */
/* loaded from: classes6.dex */
public final class dhez extends dsqw<dhez, dhey> implements dssk {
    public static final dhez c;
    private static volatile dssr<dhez> d;
    public boolean a;
    public boolean b;

    static {
        dhez dhezVar = new dhez();
        c = dhezVar;
        dsqw.cc(dhez.class, dhezVar);
    }

    private dhez() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dhez();
            }
            if (i2 == 4) {
                return new dhey();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhez> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhez.class) {
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