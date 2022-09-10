package defpackage;
/* compiled from: PG */
/* renamed from: dkrj  reason: default package */
/* loaded from: classes.dex */
public final class dkrj extends dsqw<dkrj, dkri> implements dssk {
    public static final dkrj j;
    private static volatile dssr<dkrj> k;
    public int a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean i;
    public String b = "";
    public boolean h = true;

    static {
        dkrj dkrjVar = new dkrj();
        j = dkrjVar;
        dsqw.cc(dkrj.class, dkrjVar);
    }

    private dkrj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0003\u000b\b\u0000\u0000\u0000\u0003ဇ\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဈ\u0000\u0007ဇ\u0004\tဇ\u0005\nဇ\u0006\u000bဇ\u0007", new Object[]{"a", "c", "d", "e", "b", "f", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new dkrj();
            }
            if (i2 == 4) {
                return new dkri();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkrj> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dkrj.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
