package defpackage;
/* compiled from: PG */
/* renamed from: dizh  reason: default package */
/* loaded from: classes.dex */
public final class dizh extends dsqw<dizh, dizg> implements dssk {
    public static final dizh j;
    private static volatile dssr<dizh> k;
    public int a;
    public dggg b;
    public dghk c;
    public dlwk d;
    public diyt e;
    public dsrj<dlwo> f = dssu.b;
    public diis g;
    public dizp h;
    public dizl i;

    static {
        dizh dizhVar = new dizh();
        j = dizhVar;
        dsqw.cc(dizh.class, dizhVar);
    }

    private dizh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0002\u000e\b\u0000\u0001\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006\u001b\u0007ဉ\u0004\tဉ\u0005\u000eဉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", dlwo.class, "g", "h", "i"});
            }
            if (i2 == 3) {
                return new dizh();
            }
            if (i2 == 4) {
                return new dizg();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dizh> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dizh.class) {
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
