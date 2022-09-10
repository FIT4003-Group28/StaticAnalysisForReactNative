package defpackage;
/* compiled from: PG */
/* renamed from: dwaw  reason: default package */
/* loaded from: classes.dex */
public final class dwaw extends dsqs<dwaw, dwat> implements dsqt {
    public static final dwaw j;
    private static volatile dssr<dwaw> m;
    public int a;
    public dvzy b;
    public dtaq e;
    public boolean f;
    public djpw g;
    public dwaq h;
    public boolean i;
    private boolean k;
    private byte l = 2;
    public dsrf c = dsqz.b;
    public dsrf d = dsqz.b;

    static {
        dwaw dwawVar = new dwaw();
        j = dwawVar;
        dsqw.cc(dwaw.class, dwawVar);
    }

    private dwaw() {
    }

    public static /* synthetic */ void c(dwaw dwawVar) {
        dwawVar.a |= 16;
        dwawVar.k = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(j, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0002\u0001\u0001ᐉ\u0000\u0002\u001e\u0004\u001e\u0006ဉ\u0001\u0007ဇ\u0002\bဇ\u0004\nဉ\u0005\u000bဉ\u0006\fဇ\u0007", new Object[]{"a", "b", "c", dvxj.c(), "d", dwav.c(), "e", "f", "k", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new dwaw();
            }
            if (i2 == 4) {
                return new dwat();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            }
            dssr<dwaw> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dwaw.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.l);
    }
}
