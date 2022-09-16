package defpackage;
/* compiled from: PG */
/* renamed from: dwhf  reason: default package */
/* loaded from: classes6.dex */
public final class dwhf extends dsqw<dwhf, dwhe> implements dssk {
    public static final dwhf i;
    private static volatile dssr<dwhf> k;
    public int a;
    public dhjz b;
    public dhjx c;
    public dnzj d;
    public int e;
    public boolean f;
    public boolean g;
    public dnqh h;
    private byte j = 2;

    static {
        dwhf dwhfVar = new dwhf();
        i = dwhfVar;
        dsqw.cc(dwhf.class, dwhfVar);
    }

    private dwhf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0002\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဌ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\tᐉ\u0006", new Object[]{"a", "b", "c", "d", "e", doca.a, "f", "g", "h"});
            }
            if (i3 == 3) {
                return new dwhf();
            }
            if (i3 == 4) {
                return new dwhe();
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
            dssr<dwhf> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dwhf.class) {
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
