package defpackage;
/* compiled from: PG */
/* renamed from: dsfm  reason: default package */
/* loaded from: classes6.dex */
public final class dsfm extends dsqw<dsfm, dsfl> implements dssk {
    public static final dsfm c;
    private static volatile dssr<dsfm> e;
    public float a;
    public dsfa b;
    private int d;

    static {
        dsfm dsfmVar = new dsfm();
        c = dsfmVar;
        dsqw.cc(dsfm.class, dsfmVar);
    }

    private dsfm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0003ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dsfm();
            }
            if (i2 == 4) {
                return new dsfl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsfm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsfm.class) {
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
