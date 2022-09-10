package defpackage;
/* compiled from: PG */
/* renamed from: dkdg  reason: default package */
/* loaded from: classes6.dex */
public final class dkdg extends dsqw<dkdg, dkcz> implements dssk {
    public static final dkdg j;
    private static volatile dssr<dkdg> k;
    public int a;
    public duls b;
    public dulh c;
    public String d = "";
    public dkdf e;
    public dkdb f;
    public boolean g;
    public drcc h;
    public boolean i;

    static {
        dkdg dkdgVar = new dkdg();
        j = dkdgVar;
        dsqw.cc(dkdg.class, dkdgVar);
    }

    private dkdg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0006ဉ\u0004\u0007ဇ\u0006\bဉ\u0005\tဉ\u0007\nဇ\t", new Object[]{"a", "b", "c", "d", "e", "g", "f", "h", "i"});
            }
            if (i2 == 3) {
                return new dkdg();
            }
            if (i2 == 4) {
                return new dkcz();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkdg> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dkdg.class) {
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
