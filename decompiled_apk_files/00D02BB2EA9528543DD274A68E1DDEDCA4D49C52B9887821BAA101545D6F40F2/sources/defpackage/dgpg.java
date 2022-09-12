package defpackage;
/* compiled from: PG */
/* renamed from: dgpg  reason: default package */
/* loaded from: classes6.dex */
public final class dgpg extends dsqw<dgpg, dgpf> implements dssk {
    public static final dgpg k;
    private static volatile dssr<dgpg> t;
    public int a;
    public int b;
    public ddyb c;
    public int d;
    public int e;
    public long g;
    public boolean h;
    public dgrh i;
    public dgrh j;
    private dgrh l;
    private dgrn m;
    private dgrn n;
    private dgrh o;
    private dgrh p;
    private dgrh q;
    private dgrh r;
    private byte s = 2;
    public dsrj<String> f = dssu.b;

    static {
        dgpg dgpgVar = new dgpg();
        k = dgpgVar;
        dsqw.cc(dgpg.class, dgpgVar);
    }

    private dgpg() {
        dspd dspdVar = dspd.b;
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(k, "\u0001\u0010\u0000\u0001\u0001!\u0010\u0000\u0001\n\u0001ᐉ\u0000\u0002ဌ\u0002\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\b\u0006ᐉ\t\u0007ᐉ\n\nᐉ\r\u000bစ\u000f\u0015ဇ\u0010\u0016ᐉ\u0017\u0017ᐉ\u0018\u001aᐉ\u0003\u001cင\u0006 ဌ\u0007!\u001a", new Object[]{"a", "l", "b", dgpc.c(), "n", "c", "o", "p", "q", "r", "g", "h", "i", "j", "m", "d", "e", dgoy.a, "f"});
            }
            if (i2 == 3) {
                return new dgpg();
            }
            if (i2 == 4) {
                return new dgpf();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.s = b;
                return null;
            }
            dssr<dgpg> dssrVar = t;
            if (dssrVar == null) {
                synchronized (dgpg.class) {
                    dssrVar = t;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        t = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.s);
    }
}
