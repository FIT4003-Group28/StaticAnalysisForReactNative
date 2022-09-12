package defpackage;
/* compiled from: PG */
/* renamed from: dfip  reason: default package */
/* loaded from: classes6.dex */
public final class dfip extends dsqw<dfip, dfio> implements dssk {
    public static final dfip i;
    private static volatile dssr<dfip> j;
    public int a;
    public boolean f;
    public float b = 42.0f;
    public float c = 42.0f;
    public float d = 14.0f;
    public float e = 3.0f;
    public float g = 89.0f;
    public float h = 89.0f;

    static {
        dfip dfipVar = new dfip();
        i = dfipVar;
        dsqw.cc(dfip.class, dfipVar);
    }

    private dfip() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ဇ\u0004\u0006ခ\u0005\u0007ခ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new dfip();
            }
            if (i3 == 4) {
                return new dfio();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dfip> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dfip.class) {
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
