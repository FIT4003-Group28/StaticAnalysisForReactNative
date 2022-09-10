package defpackage;
/* compiled from: PG */
/* renamed from: dusk  reason: default package */
/* loaded from: classes6.dex */
public final class dusk extends dsqw<dusk, dusj> implements dssk {
    public static final dusk c;
    private static volatile dssr<dusk> f;
    public int a;
    public duld b;
    private dulu d;
    private byte e = 2;

    static {
        dusk duskVar = new dusk();
        c = duskVar;
        dsqw.cc(dusk.class, duskVar);
    }

    private dusk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0002\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", "d"});
            }
            if (i2 == 3) {
                return new dusk();
            }
            if (i2 == 4) {
                return new dusj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dusk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dusk.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
