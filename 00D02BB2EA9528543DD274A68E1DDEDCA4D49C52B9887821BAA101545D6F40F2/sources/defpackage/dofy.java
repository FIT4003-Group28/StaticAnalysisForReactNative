package defpackage;
/* compiled from: PG */
/* renamed from: dofy  reason: default package */
/* loaded from: classes6.dex */
public final class dofy extends dsqw<dofy, dofx> implements dssk {
    public static final dofy i;
    private static volatile dssr<dofy> j;
    public int a;
    public dndl b;
    public int c;
    public dolk e;
    public dojz f;
    public int h;
    public String d = "";
    public String g = "";

    static {
        dofy dofyVar = new dofy();
        i = dofyVar;
        dsqw.cc(dofy.class, dofyVar);
    }

    private dofy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဈ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဈ\u0005\bဌ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", dplo.a});
            }
            if (i3 == 3) {
                return new dofy();
            }
            if (i3 == 4) {
                return new dofx();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dofy> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dofy.class) {
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
