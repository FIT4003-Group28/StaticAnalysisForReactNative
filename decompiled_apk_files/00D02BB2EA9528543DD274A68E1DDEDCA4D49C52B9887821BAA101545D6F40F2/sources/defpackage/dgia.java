package defpackage;
/* compiled from: PG */
/* renamed from: dgia  reason: default package */
/* loaded from: classes6.dex */
public final class dgia extends dsqw<dgia, dghz> implements dssk {
    public static final dgia i;
    private static volatile dssr<dgia> j;
    public int a;
    public dgly c;
    public dgbo e;
    public String b = "";
    public dsrj<dgly> d = dssu.b;
    public String f = "";
    public String g = "";
    public String h = "";

    static {
        dgia dgiaVar = new dgia();
        i = dgiaVar;
        dsqw.cc(dgia.class, dgiaVar);
    }

    private dgia() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0003\u0003ဉ\u0004\u0004ဈ\u0005\u0005ဈ\u0006\u0006ဈ\u0007\u000b\u001b", new Object[]{"a", "b", "c", "e", "f", "g", "h", "d", dgly.class});
            }
            if (i3 == 3) {
                return new dgia();
            }
            if (i3 == 4) {
                return new dghz();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dgia> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dgia.class) {
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
