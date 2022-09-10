package defpackage;
/* compiled from: PG */
/* renamed from: dino  reason: default package */
/* loaded from: classes6.dex */
public final class dino extends dsqw<dino, dinn> implements dssk {
    public static final dino d;
    private static volatile dssr<dino> e;
    public int a;
    public int b;
    public String c = "";

    static {
        dino dinoVar = new dino();
        d = dinoVar;
        dsqw.cc(dino.class, dinoVar);
    }

    private dino() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dino();
            }
            if (i2 == 4) {
                return new dinn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dino> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dino.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
