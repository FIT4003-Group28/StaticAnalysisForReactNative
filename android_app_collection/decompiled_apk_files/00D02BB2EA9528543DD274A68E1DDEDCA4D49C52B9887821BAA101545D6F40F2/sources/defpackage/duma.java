package defpackage;
/* compiled from: PG */
/* renamed from: duma  reason: default package */
/* loaded from: classes6.dex */
public final class duma extends dsqw<duma, dulz> implements dssk {
    public static final duma a;
    private static volatile dssr<duma> e;
    private int b;
    private dgrh c;
    private byte d = 2;

    static {
        duma dumaVar = new duma();
        a = dumaVar;
        dsqw.cc(duma.class, dumaVar);
    }

    private duma() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new duma();
            }
            if (i2 == 4) {
                return new dulz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<duma> dssrVar = e;
            if (dssrVar == null) {
                synchronized (duma.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
