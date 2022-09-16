package defpackage;
/* compiled from: PG */
/* renamed from: dqjw  reason: default package */
/* loaded from: classes6.dex */
public final class dqjw extends dsqw<dqjw, dqju> implements dssk {
    public static final dqjw i;
    private static volatile dssr<dqjw> j;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public dsrj<String> e = dssu.b;
    public String f = "";
    public String g = "";
    public String h = "";

    static {
        dqjw dqjwVar = new dqjw();
        i = dqjwVar;
        dsqw.cc(dqjw.class, dqjwVar);
    }

    private dqjw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001a\u0003ဈ\u0003\u0004ဈ\u0005\u0005ဈ\u0001\u0006ဈ\u0002\u0007ဈ\u0004", new Object[]{"a", "b", dqjv.a, "e", "f", "h", "c", "d", "g"});
            }
            if (i3 == 3) {
                return new dqjw();
            }
            if (i3 == 4) {
                return new dqju();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dqjw> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dqjw.class) {
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
