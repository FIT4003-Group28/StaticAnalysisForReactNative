package defpackage;
/* compiled from: PG */
/* renamed from: dium  reason: default package */
/* loaded from: classes6.dex */
public final class dium extends dsqw<dium, diul> implements dssk {
    public static final dium d;
    private static volatile dssr<dium> f;
    public String a = "";
    public dsrj<divi> b = dssu.b;
    public dsrj<divs> c = dssu.b;
    private int e;

    static {
        dium diumVar = new dium();
        d = diumVar;
        dsqw.cc(dium.class, diumVar);
    }

    private dium() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b", new Object[]{"e", "a", "b", divi.class, "c", divs.class});
            }
            if (i2 == 3) {
                return new dium();
            }
            if (i2 == 4) {
                return new diul();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dium> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dium.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
