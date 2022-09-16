package defpackage;
/* compiled from: PG */
/* renamed from: dkcw  reason: default package */
/* loaded from: classes6.dex */
public final class dkcw extends dsqw<dkcw, dkcv> implements dssk {
    public static final dkcw i;
    private static volatile dssr<dkcw> k;
    public int a;
    public dnqh b;
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;
    public dqlc h;
    private byte j = 2;

    static {
        dkcw dkcwVar = new dkcw();
        i = dkcwVar;
        dsqw.cc(dkcw.class, dkcwVar);
    }

    private dkcw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004စ\u0004\u0006စ\u0005\u0007ဌ\u0003\bဉ\u0006", new Object[]{"a", "b", "c", dqkp.a, "d", dqko.a, "f", "g", "e", dqkr.c(), "h"});
            }
            if (i3 == 3) {
                return new dkcw();
            }
            if (i3 == 4) {
                return new dkcv();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            dssr<dkcw> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dkcw.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.j);
    }
}
