package defpackage;
/* compiled from: PG */
/* renamed from: dsfk  reason: default package */
/* loaded from: classes6.dex */
public final class dsfk extends dsqw<dsfk, dsfh> implements dssk {
    public static final dsfk c;
    private static volatile dssr<dsfk> e;
    public float a;
    public dsrj<dsfj> b = dssu.b;
    private int d;

    static {
        dsfk dsfkVar = new dsfk();
        c = dsfkVar;
        dsqw.cc(dsfk.class, dsfkVar);
    }

    private dsfk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ခ\u0000\u0002\u001b", new Object[]{"d", "a", "b", dsfj.class});
            }
            if (i2 == 3) {
                return new dsfk();
            }
            if (i2 == 4) {
                return new dsfh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsfk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsfk.class) {
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
