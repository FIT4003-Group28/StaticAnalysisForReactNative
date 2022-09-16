package defpackage;
/* compiled from: PG */
/* renamed from: cerz  reason: default package */
/* loaded from: classes4.dex */
public final class cerz extends dsqw<cerz, cery> implements dssk {
    public static final cerz i;
    private static volatile dssr<cerz> j;
    public int a;
    public String b = "";
    public String c = "";
    public int d;
    public int e;
    public dhtc f;
    public drfs g;
    public boolean h;

    static {
        cerz cerzVar = new cerz();
        i = cerzVar;
        dsqw.cc(cerz.class, cerzVar);
    }

    private cerz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", "c", "d", dpyv.c(), "e", drds.c(), "f", "g", "h"});
            }
            if (i3 == 3) {
                return new cerz();
            }
            if (i3 == 4) {
                return new cery();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<cerz> dssrVar = j;
            if (dssrVar == null) {
                synchronized (cerz.class) {
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
