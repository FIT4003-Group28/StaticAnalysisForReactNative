package defpackage;
/* compiled from: PG */
/* renamed from: diqx  reason: default package */
/* loaded from: classes6.dex */
public final class diqx extends dsqs<diqx, diqu> implements dsqt {
    public static final diqx g;
    private static volatile dssr<diqx> i;
    public int a;
    public diqw b;
    public boolean c;
    public boolean d;
    public boolean e;
    public dnqh f;
    private byte h = 2;

    static {
        diqx diqxVar = new diqx();
        g = diqxVar;
        dsqw.cc(diqx.class, diqxVar);
    }

    private diqx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0001\u0001ᐉ\u0006\u0004ဉ\u0001\u0006ဇ\u0003\u0007ဇ\u0004\bဇ\u0005", new Object[]{"a", "f", "b", "c", "d", "e"});
            }
            if (i3 == 3) {
                return new diqx();
            }
            if (i3 == 4) {
                return new diqu();
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
            dssr<diqx> dssrVar = i;
            if (dssrVar == null) {
                synchronized (diqx.class) {
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
