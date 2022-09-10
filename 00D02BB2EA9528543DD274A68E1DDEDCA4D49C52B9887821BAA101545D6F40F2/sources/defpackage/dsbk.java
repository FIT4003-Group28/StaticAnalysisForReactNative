package defpackage;
/* compiled from: PG */
/* renamed from: dsbk  reason: default package */
/* loaded from: classes6.dex */
public final class dsbk extends dsqw<dsbk, dsbj> implements dssk {
    public static final dsbk e;
    private static volatile dssr<dsbk> f;
    public int a;
    public float c;
    public String b = "";
    public int d = -1;

    static {
        dsbk dsbkVar = new dsbk();
        e = dsbkVar;
        dsqw.cc(dsbk.class, dsbkVar);
    }

    private dsbk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dsbk();
            }
            if (i2 == 4) {
                return new dsbj();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsbk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dsbk.class) {
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
