package defpackage;
/* compiled from: PG */
/* renamed from: duwx  reason: default package */
/* loaded from: classes.dex */
public final class duwx extends dsqw<duwx, duww> implements dssk {
    public static final duwx i;
    private static volatile dssr<duwx> k;
    public boolean a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean h;
    private int j;
    public float b = 25.0f;
    public int g = 75;

    static {
        duwx duwxVar = new duwx();
        i = duwxVar;
        dsqw.cc(duwx.class, duwxVar);
    }

    private duwx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ခ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007င\u0006\bဇ\u0007", new Object[]{"j", "a", "b", "c", "d", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new duwx();
            }
            if (i3 == 4) {
                return new duww();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<duwx> dssrVar = k;
            if (dssrVar == null) {
                synchronized (duwx.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
