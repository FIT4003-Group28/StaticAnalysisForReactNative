package defpackage;
/* compiled from: PG */
/* renamed from: drum  reason: default package */
/* loaded from: classes6.dex */
public final class drum extends dsqw<drum, drul> implements dssk {
    public static final drum c;
    private static volatile dssr<drum> d;
    public int a;
    public drus b;

    static {
        drum drumVar = new drum();
        c = drumVar;
        dsqw.cc(drum.class, drumVar);
    }

    private drum() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new drum();
            }
            if (i2 == 4) {
                return new drul();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drum> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drum.class) {
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
