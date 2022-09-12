package defpackage;
/* compiled from: PG */
/* renamed from: djxn  reason: default package */
/* loaded from: classes6.dex */
public final class djxn extends dsqw<djxn, djxm> implements dssk {
    public static final djxn g;
    private static volatile dssr<djxn> i;
    public int a;
    public dphe b;
    public dozz d;
    public int e;
    public int f;
    private byte h = 2;
    public dsrj<dozz> c = dssu.b;

    static {
        djxn djxnVar = new djxn();
        g = djxnVar;
        dsqw.cc(djxn.class, djxnVar);
    }

    private djxn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0003\u0001ᐉ\u0000\u0003Л\u0004ᐉ\u0001\u0005င\u0002\u0006င\u0003", new Object[]{"a", "b", "c", dozz.class, "d", "e", "f"});
            }
            if (i3 == 3) {
                return new djxn();
            }
            if (i3 == 4) {
                return new djxm();
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
            dssr<djxn> dssrVar = i;
            if (dssrVar == null) {
                synchronized (djxn.class) {
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
