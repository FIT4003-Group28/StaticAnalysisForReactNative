package defpackage;
/* compiled from: PG */
/* renamed from: dtkj  reason: default package */
/* loaded from: classes6.dex */
public final class dtkj extends dsqw<dtkj, dtki> implements dssk {
    public static final dtkj d;
    private static volatile dssr<dtkj> i;
    public int a;
    public dtlv c;
    private dtlv e;
    private dtlv f;
    private dgrt g;
    private byte h = 2;
    public boolean b = true;

    static {
        dtkj dtkjVar = new dtkj();
        d = dtkjVar;
        dsqw.cc(dtkj.class, dtkjVar);
    }

    private dtkj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(d, "\u0001\u0005\u0000\u0001\u0001Ϫ\u0005\u0000\u0000\u0004\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ဇ\u0000\u0005ᐉ\u0003Ϫᐉ\u0010", new Object[]{"a", "c", "e", "b", "f", "g"});
            }
            if (i3 == 3) {
                return new dtkj();
            }
            if (i3 == 4) {
                return new dtki();
            }
            if (i3 == 5) {
                return d;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dtkj> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dtkj.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
