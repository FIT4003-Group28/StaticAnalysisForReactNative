package defpackage;
/* compiled from: PG */
/* renamed from: dihj  reason: default package */
/* loaded from: classes6.dex */
public final class dihj extends dsqw<dihj, dihi> implements dssk {
    public static final dihj c;
    private static volatile dssr<dihj> e;
    public int a;
    public dnqh b;
    private byte d = 2;

    static {
        dihj dihjVar = new dihj();
        c = dihjVar;
        dsqw.cc(dihj.class, dihjVar);
    }

    private dihj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0003", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dihj();
            }
            if (i2 == 4) {
                return new dihi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dihj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dihj.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
