package defpackage;
/* compiled from: PG */
/* renamed from: dkez  reason: default package */
/* loaded from: classes6.dex */
public final class dkez extends dsqw<dkez, dkex> implements dssk {
    public static final dkez f;
    private static volatile dssr<dkez> h;
    public int a;
    public Object c;
    public int d;
    public dnqh e;
    public int b = 0;
    private byte g = 2;

    static {
        dkez dkezVar = new dkez();
        f = dkezVar;
        dsqw.cc(dkez.class, dkezVar);
    }

    private dkez() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0001\u0001\u0001\t\u0004\u0000\u0000\u0001\u0001ဌ\u0000\u0002ျ\u0000\u0003ျ\u0000\tᐉ\b", new Object[]{"c", "b", "a", "d", dkey.a, "e"});
            }
            if (i2 == 3) {
                return new dkez();
            }
            if (i2 == 4) {
                return new dkex();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dkez> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dkez.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
