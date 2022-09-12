package defpackage;
/* compiled from: PG */
/* renamed from: drzu  reason: default package */
/* loaded from: classes6.dex */
public final class drzu extends dsqw<drzu, drzt> implements dssk {
    public static final drzu i;
    private static volatile dssr<drzu> j;
    public int a;
    public int b;
    public dsay d;
    public dsau f;
    public dsai g;
    public dryf h;
    public String c = "";
    public dsrj<String> e = dssu.b;

    static {
        drzu drzuVar = new drzu();
        i = drzuVar;
        dsqw.cc(drzu.class, drzuVar);
    }

    private drzu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0000\u0001ဈ\u0001\u0003\u001a\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\nဌ\u0000\u000bဉ\u0005", new Object[]{"a", "c", "e", "d", "f", "g", "b", dsdi.a, "h"});
            }
            if (i3 == 3) {
                return new drzu();
            }
            if (i3 == 4) {
                return new drzt();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<drzu> dssrVar = j;
            if (dssrVar == null) {
                synchronized (drzu.class) {
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
