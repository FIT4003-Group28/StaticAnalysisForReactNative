package defpackage;
/* compiled from: PG */
/* renamed from: dlvo  reason: default package */
/* loaded from: classes6.dex */
public final class dlvo extends dsqw<dlvo, dlvn> implements dssk {
    public static final dlvo e;
    private static volatile dssr<dlvo> f;
    public int a;
    public float b;
    public float c;
    public float d;

    static {
        dlvo dlvoVar = new dlvo();
        e = dlvoVar;
        dsqw.cc(dlvo.class, dlvoVar);
    }

    private dlvo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dlvo();
            }
            if (i2 == 4) {
                return new dlvn();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlvo> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dlvo.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
