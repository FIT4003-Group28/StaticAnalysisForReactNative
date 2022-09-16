package defpackage;
/* compiled from: PG */
/* renamed from: chvy  reason: default package */
/* loaded from: classes4.dex */
public final class chvy extends dsqw<chvy, chvx> implements dssk {
    public static final chvy b;
    private static volatile dssr<chvy> c;
    public dsrj<djao> a = dssu.b;

    static {
        chvy chvyVar = new chvy();
        b = chvyVar;
        dsqw.cc(chvy.class, chvyVar);
    }

    private chvy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", djao.class});
            }
            if (i2 == 3) {
                return new chvy();
            }
            if (i2 == 4) {
                return new chvx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chvy> dssrVar = c;
            if (dssrVar == null) {
                synchronized (chvy.class) {
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
