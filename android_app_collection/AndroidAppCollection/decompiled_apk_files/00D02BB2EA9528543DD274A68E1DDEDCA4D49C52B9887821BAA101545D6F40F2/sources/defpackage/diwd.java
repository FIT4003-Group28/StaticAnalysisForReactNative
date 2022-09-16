package defpackage;
/* compiled from: PG */
/* renamed from: diwd  reason: default package */
/* loaded from: classes6.dex */
public final class diwd extends dsqw<diwd, diwc> implements dssk {
    public static final diwd j;
    private static volatile dssr<diwd> l;
    public int a;
    public int b;
    public dhkd c;
    public dhkd d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    private boolean k;

    static {
        diwd diwdVar = new diwd();
        j = diwdVar;
        dsqw.cc(diwd.class, diwdVar);
    }

    private diwd() {
    }

    public static /* synthetic */ void b(diwd diwdVar) {
        diwdVar.a |= 32;
        diwdVar.k = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\t\u0000\u0001\u0002\u000e\t\u0000\u0000\u0000\u0002င\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဇ\u0005\u0007ဇ\u0006\tဇ\b\u000bဇ\u0004\fဇ\n\u000eဇ\f", new Object[]{"a", "b", "c", "d", "k", "f", "g", "e", "h", "i"});
            }
            if (i2 == 3) {
                return new diwd();
            }
            if (i2 == 4) {
                return new diwc();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diwd> dssrVar = l;
            if (dssrVar == null) {
                synchronized (diwd.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
