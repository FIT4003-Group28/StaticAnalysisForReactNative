package defpackage;
/* compiled from: PG */
/* renamed from: dior  reason: default package */
/* loaded from: classes6.dex */
public final class dior extends dsqw<dior, diok> implements dssk {
    public static final dior g;
    private static volatile dssr<dior> i;
    public int a;
    public int b;
    public int c;
    public diom f;
    private byte h = 2;
    public String d = "";
    public String e = "";

    static {
        dior diorVar = new dior();
        g = diorVar;
        dsqw.cc(dior.class, diorVar);
    }

    private dior() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဈ\u0003\u0003ဈ\u0002\u0004ဌ\u0001\u0005ᐉ\u0004", new Object[]{"a", "b", dioq.c(), "e", "d", "c", dioo.c(), "f"});
            }
            if (i3 == 3) {
                return new dior();
            }
            if (i3 == 4) {
                return new diok();
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
            dssr<dior> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dior.class) {
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
