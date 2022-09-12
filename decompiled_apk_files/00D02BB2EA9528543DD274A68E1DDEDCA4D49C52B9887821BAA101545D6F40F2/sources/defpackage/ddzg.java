package defpackage;
/* compiled from: PG */
/* renamed from: ddzg  reason: default package */
/* loaded from: classes.dex */
public final class ddzg extends dsqw<ddzg, ddzf> implements dssk {
    public static final ddzg t;
    public static final dsqv<ddhk, ddzg> u;
    private static volatile dssr<ddzg> z;
    public int a;
    public int b;
    public deat c;
    public dsrj<dear> d;
    public ddzx e;
    public ddil f;
    public ddep g;
    public ddzp h;
    public ddyd i;
    public ddzu j;
    public ddyu k;
    public ddfb l;
    public ddip m;
    public ddxv n;
    public ddcj o;
    public ddij p;
    public ddys q;
    public dsrj<ddij> r;
    public ddir s;
    private ddze v;
    private dder w;
    private ddbu x;
    private byte y = 2;

    static {
        ddzg ddzgVar = new ddzg();
        t = ddzgVar;
        dsqw.cc(ddzg.class, ddzgVar);
        u = dsqw.newSingularGeneratedExtension(ddhk.k, ddzgVar, ddzgVar, null, 67, dsur.MESSAGE, ddzg.class);
    }

    private ddzg() {
        dspd dspdVar = dspd.b;
        this.d = dssu.b;
        this.r = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(t, "\u0001\u0014\u0000\u0002\u0001F\u0014\u0000\u0002\u0006\u0001ᐉ\u0000\u0005ဉ\u0004\u0014\u001b\u001aဉ\u0017\u001cဉ\u0018\u001eᐉ\u001a\u001fဉ\u001c ဉ\u001d!ဉ\u001e#ဉ $ဉ!'ဉ$,ဉ*2ဉ/9ᐉ\u001b<ᐉ9>ᐉ;?ဉ<EЛFဉ?", new Object[]{"a", "b", "v", "c", "d", dear.class, "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "w", "x", "p", "q", "r", ddij.class, "s"});
            }
            if (i2 == 3) {
                return new ddzg();
            }
            if (i2 == 4) {
                return new ddzf();
            }
            if (i2 == 5) {
                return t;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.y = b;
                return null;
            }
            dssr<ddzg> dssrVar = z;
            if (dssrVar == null) {
                synchronized (ddzg.class) {
                    dssrVar = z;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(t);
                        z = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.y);
    }

    public final void b() {
        dsrj<ddij> dsrjVar = this.r;
        if (!dsrjVar.a()) {
            this.r = dsqw.cl(dsrjVar);
        }
    }
}
