package defpackage;
/* compiled from: PG */
/* renamed from: dkvy  reason: default package */
/* loaded from: classes6.dex */
public final class dkvy extends dsqw<dkvy, dkvx> implements dssk {
    public static final dkvy c;
    private static volatile dssr<dkvy> e;
    public boolean a;
    public float b = 22.0f;
    private int d;

    static {
        dkvy dkvyVar = new dkvy();
        c = dkvyVar;
        dsqw.cc(dkvy.class, dkvyVar);
    }

    private dkvy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ခ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dkvy();
            }
            if (i2 == 4) {
                return new dkvx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkvy> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkvy.class) {
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
