package defpackage;
/* compiled from: PG */
/* renamed from: dzyy  reason: default package */
/* loaded from: classes6.dex */
public final class dzyy extends dsqw<dzyy, dzyx> implements dssk {
    public static final dzyy e;
    private static volatile dssr<dzyy> f;
    public int a;
    public dzza b;
    public dzza c;
    public float d;

    static {
        dzyy dzyyVar = new dzyy();
        e = dzyyVar;
        dsqw.cc(dzyy.class, dzyyVar);
    }

    private dzyy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ခ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dzyy();
            }
            if (i2 == 4) {
                return new dzyx();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dzyy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dzyy.class) {
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
