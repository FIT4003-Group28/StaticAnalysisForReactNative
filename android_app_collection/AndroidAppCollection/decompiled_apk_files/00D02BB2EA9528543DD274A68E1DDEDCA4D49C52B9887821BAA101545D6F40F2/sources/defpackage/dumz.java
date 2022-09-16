package defpackage;
/* compiled from: PG */
/* renamed from: dumz  reason: default package */
/* loaded from: classes6.dex */
public final class dumz extends dsqw<dumz, dumy> implements dssk {
    public static final dumz i;
    private static volatile dssr<dumz> j;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public dmxb f;
    public String g = "";
    public boolean h;

    static {
        dumz dumzVar = new dumz();
        i = dumzVar;
        dsqw.cc(dumz.class, dumzVar);
    }

    private dumz() {
    }

    public static /* synthetic */ void c(dumz dumzVar) {
        dumzVar.a |= 1;
        dumzVar.b = true;
    }

    public static /* synthetic */ void e(dumz dumzVar) {
        dumzVar.a |= 4;
        dumzVar.d = true;
    }

    public static /* synthetic */ void f(dumz dumzVar) {
        dumzVar.a |= 8;
        dumzVar.e = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဉ\u0004\u0005ဈ\u0005\u0006ဇ\u0003\u0007ဇ\u0006", new Object[]{"a", "b", "c", "d", "f", "g", "e", "h"});
            }
            if (i3 == 3) {
                return new dumz();
            }
            if (i3 == 4) {
                return new dumy();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dumz> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dumz.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
