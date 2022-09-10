package defpackage;
/* compiled from: PG */
/* renamed from: dddo  reason: default package */
/* loaded from: classes5.dex */
public final class dddo extends dsqw<dddo, dddl> implements dssk {
    public static final dddo i;
    private static volatile dssr<dddo> j;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public String h;

    static {
        dddo dddoVar = new dddo();
        i = dddoVar;
        dsqw.cc(dddo.class, dddoVar);
    }

    private dddo() {
        dssu<Object> dssuVar = dssu.b;
        this.h = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0003\n\u0007\u0000\u0000\u0000\u0003ဌ\u0004\u0004ဌ\u0005\u0005ဇ\u0006\u0006ဈ\u0002\u0007ဌ\u0003\bဇ\u0007\nဈ\b", new Object[]{"a", "d", dwyd.c(), "e", dddn.c(), "f", "b", "c", cruf.c(), "g", "h"});
            }
            if (i3 == 3) {
                return new dddo();
            }
            if (i3 == 4) {
                return new dddl();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dddo> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dddo.class) {
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
