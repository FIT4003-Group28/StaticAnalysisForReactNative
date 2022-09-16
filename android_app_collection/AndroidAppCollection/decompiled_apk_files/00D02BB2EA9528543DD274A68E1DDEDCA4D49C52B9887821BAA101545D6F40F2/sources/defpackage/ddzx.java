package defpackage;
/* compiled from: PG */
/* renamed from: ddzx  reason: default package */
/* loaded from: classes.dex */
public final class ddzx extends dsqw<ddzx, ddzv> implements dssk {
    public static final ddzx i;
    private static volatile dssr<ddzx> j;
    public int a;
    public float b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public String h = "";

    static {
        ddzx ddzxVar = new ddzx();
        i = ddzxVar;
        dsqw.cc(ddzx.class, ddzxVar);
    }

    private ddzx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0003\u0011\u0007\u0000\u0000\u0000\u0003ခ\u0002\u0007င\u0006\bဌ\u0007\tင\b\nဇ\t\u000bဇ\n\u0011ဈ\u0010", new Object[]{"a", "b", "c", "d", ddzw.a, "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new ddzx();
            }
            if (i3 == 4) {
                return new ddzv();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<ddzx> dssrVar = j;
            if (dssrVar == null) {
                synchronized (ddzx.class) {
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
