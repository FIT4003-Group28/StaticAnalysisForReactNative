package defpackage;
/* compiled from: PG */
/* renamed from: dzyo  reason: default package */
/* loaded from: classes6.dex */
public final class dzyo extends dsqw<dzyo, dzyn> implements dssk {
    public static final dzyo i;
    private static volatile dssr<dzyo> j;
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public dzyi h;

    static {
        dzyo dzyoVar = new dzyo();
        i = dzyoVar;
        dsqw.cc(dzyo.class, dzyoVar);
    }

    private dzyo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new dzyo();
            }
            if (i3 == 4) {
                return new dzyn();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dzyo> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dzyo.class) {
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
