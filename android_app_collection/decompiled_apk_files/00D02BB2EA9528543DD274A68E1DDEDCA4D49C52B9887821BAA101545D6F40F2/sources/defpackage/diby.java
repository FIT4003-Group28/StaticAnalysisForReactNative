package defpackage;
/* compiled from: PG */
/* renamed from: diby  reason: default package */
/* loaded from: classes6.dex */
public final class diby extends dsqw<diby, dibv> implements dssk {
    public static final diby f;
    private static volatile dssr<diby> i;
    public int a;
    public Object c;
    public long d;
    public diib e;
    private dnqh g;
    public int b = 0;
    private byte h = 2;

    static {
        diby dibyVar = new diby();
        f = dibyVar;
        dsqw.cc(diby.class, dibyVar);
    }

    private diby() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(f, "\u0001\u0005\u0001\u0001\u0002\u0006\u0005\u0000\u0000\u0001\u0002ဂ\u0002\u0003ျ\u0000\u0004ဉ\u0005\u0005ဿ\u0000\u0006ᐉ\u0001", new Object[]{"c", "b", "a", "d", "e", dibx.c(), "g"});
            }
            if (i3 == 3) {
                return new diby();
            }
            if (i3 == 4) {
                return new dibv();
            }
            if (i3 == 5) {
                return f;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<diby> dssrVar = i;
            if (dssrVar == null) {
                synchronized (diby.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
