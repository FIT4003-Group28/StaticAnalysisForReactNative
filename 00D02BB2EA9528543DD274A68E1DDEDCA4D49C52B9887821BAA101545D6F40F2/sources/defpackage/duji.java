package defpackage;
/* compiled from: PG */
/* renamed from: duji  reason: default package */
/* loaded from: classes.dex */
public final class duji extends dsqs<duji, dujh> implements dsqt {
    public static final duji m;
    private static volatile dssr<duji> o;
    public int a;
    public long b;
    public long c;
    public int e;
    public long g;
    public dspd h;
    public long i;
    public dspd j;
    public boolean k;
    public String l;
    private byte n = 2;
    public String d = "";
    public String f = "";

    static {
        duji dujiVar = new duji();
        m = dujiVar;
        dsqw.cc(duji.class, dujiVar);
    }

    private duji() {
        dssu<Object> dssuVar = dssu.b;
        dspd dspdVar = dspd.b;
        this.h = dspd.b;
        this.i = 180000L;
        this.j = dspd.b;
        dsqz dsqzVar = dsqz.b;
        this.l = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(m, "\u0001\u000b\u0000\u0001\u0001\u001c\u000b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0003\u0006ည\n\u000bင\u0004\fဂ\u0006\u000fတ\u0010\u0011ဂ\u0001\u0012ည\u0012\u0019ဇ\u0017\u001aဈ\u0005\u001cဈ\u0018", new Object[]{"a", "b", "d", "h", "e", "g", "i", "c", "j", "k", "f", "l"});
            }
            if (i2 == 3) {
                return new duji();
            }
            if (i2 == 4) {
                return new dujh();
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
            dssr<duji> dssrVar = o;
            if (dssrVar == null) {
                synchronized (duji.class) {
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
