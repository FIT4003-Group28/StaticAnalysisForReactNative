package defpackage;
/* compiled from: PG */
/* renamed from: duvh  reason: default package */
/* loaded from: classes6.dex */
public final class duvh extends dsqw<duvh, duvg> implements dssk {
    public static final duvh a;
    private static volatile dssr<duvh> f;
    private int b;
    private dico c;
    private dgrh d;
    private byte e = 2;

    static {
        duvh duvhVar = new duvh();
        a = duvhVar;
        dsqw.cc(duvh.class, duvhVar);
    }

    private duvh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new duvh();
            }
            if (i2 == 4) {
                return new duvg();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<duvh> dssrVar = f;
            if (dssrVar == null) {
                synchronized (duvh.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
