package defpackage;
/* compiled from: PG */
/* renamed from: dxde  reason: default package */
/* loaded from: classes6.dex */
public final class dxde extends dsqw<dxde, dxdb> implements dssk {
    public static final dxde a;
    private static volatile dssr<dxde> i;
    private int b;
    private int c;
    private int d;
    private int e;
    private dnbi f;
    private int g;
    private byte h = 2;

    static {
        dxde dxdeVar = new dxde();
        a = dxdeVar;
        dsqw.cc(dxde.class, dxdeVar);
    }

    private dxde() {
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(a, "\u0001\u0005\u0000\u0001\u0001\u001b\u0005\u0000\u0000\u0005\u0001ᔌ\u0016\u0002ᔄ\u0000\u0003ᔄ\u0001\u0004ᔄ\u0002\u001bᐉ\u000f", new Object[]{"b", "g", dxdd.c(), "c", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dxde();
            }
            if (i3 == 4) {
                return new dxdb();
            }
            if (i3 == 5) {
                return a;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dxde> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dxde.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
