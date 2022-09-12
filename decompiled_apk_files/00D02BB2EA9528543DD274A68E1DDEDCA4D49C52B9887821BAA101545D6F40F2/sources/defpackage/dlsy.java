package defpackage;
/* compiled from: PG */
/* renamed from: dlsy  reason: default package */
/* loaded from: classes6.dex */
public final class dlsy extends dsqw<dlsy, dlsx> implements dssk {
    public static final dlsy m;
    private static volatile dssr<dlsy> o;
    public int a;
    public boolean b;
    public boolean c;
    public dvfc d;
    public int e;
    public int f;
    public boolean g;
    public boolean i;
    public dlsw j;
    public boolean k;
    public boolean l;
    private byte n = 2;
    public String h = "";

    static {
        dlsy dlsyVar = new dlsy();
        m = dlsyVar;
        dsqw.cc(dlsy.class, dlsyVar);
    }

    private dlsy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(m, "\u0001\u000b\u0000\u0001\u0001\u0011\u000b\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဇ\u0001\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဇ\u0005\tဈ\u0006\nဇ\u0007\u000bᐉ\u0002\rဉ\t\u000fဇ\u000b\u0011ဇ\f", new Object[]{"a", "b", "c", "e", dlpu.a, "f", dlpu.a, "g", "h", "i", "d", "j", "k", "l"});
            }
            if (i2 == 3) {
                return new dlsy();
            }
            if (i2 == 4) {
                return new dlsx();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            }
            dssr<dlsy> dssrVar = o;
            if (dssrVar == null) {
                synchronized (dlsy.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(m);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.n);
    }
}
