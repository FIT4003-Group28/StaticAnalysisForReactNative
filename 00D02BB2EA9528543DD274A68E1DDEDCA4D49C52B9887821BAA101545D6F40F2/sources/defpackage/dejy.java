package defpackage;
/* compiled from: PG */
/* renamed from: dejy  reason: default package */
/* loaded from: classes6.dex */
public final class dejy extends dsqw<dejy, dejx> implements dssk {
    public static final dejy e;
    private static volatile dssr<dejy> f;
    public int a;
    public String b = "";
    public float c;
    public float d;

    static {
        dejy dejyVar = new dejy();
        e = dejyVar;
        dsqw.cc(dejy.class, dejyVar);
    }

    private dejy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dejy();
            }
            if (i2 == 4) {
                return new dejx();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dejy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dejy.class) {
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
