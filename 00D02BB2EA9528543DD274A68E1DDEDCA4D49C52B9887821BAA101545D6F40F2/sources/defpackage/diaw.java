package defpackage;
/* compiled from: PG */
/* renamed from: diaw  reason: default package */
/* loaded from: classes6.dex */
public final class diaw extends dsqw<diaw, diar> implements dssk {
    public static final diaw g;
    private static volatile dssr<diaw> i;
    public int a;
    public dpov b;
    public diav d;
    public diat e;
    public dnqh f;
    private byte h = 2;
    public dsrj<diaq> c = dssu.b;

    static {
        diaw diawVar = new diaw();
        g = diawVar;
        dsqw.cc(diaw.class, diawVar);
    }

    private diaw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0002\u0001ဉ\u0000\u0003ဉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0007\u001b", new Object[]{"a", "b", "d", "e", "f", "c", diaq.class});
            }
            if (i3 == 3) {
                return new diaw();
            }
            if (i3 == 4) {
                return new diar();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<diaw> dssrVar = i;
            if (dssrVar == null) {
                synchronized (diaw.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
