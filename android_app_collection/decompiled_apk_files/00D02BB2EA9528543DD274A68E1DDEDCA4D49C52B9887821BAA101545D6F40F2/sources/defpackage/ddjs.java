package defpackage;
/* compiled from: PG */
/* renamed from: ddjs  reason: default package */
/* loaded from: classes.dex */
public final class ddjs extends dsqw<ddjs, ddjp> implements dssk {
    public static final ddjs h;
    private static volatile dssr<ddjs> i;
    public int a;
    public String b = "";
    public String c = "";
    public int d;
    public int e;
    public boolean f;
    public boolean g;

    static {
        ddjs ddjsVar = new ddjs();
        h = ddjsVar;
        dsqw.cc(ddjs.class, ddjsVar);
    }

    private ddjs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0003\u0004ဇ\u0004\u0005ဇ\u0005\u0007ဌ\u0002", new Object[]{"a", "b", "c", "e", durz.c(), "f", "g", "d", ddjr.c()});
            }
            if (i3 == 3) {
                return new ddjs();
            }
            if (i3 == 4) {
                return new ddjp();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<ddjs> dssrVar = i;
            if (dssrVar == null) {
                synchronized (ddjs.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
