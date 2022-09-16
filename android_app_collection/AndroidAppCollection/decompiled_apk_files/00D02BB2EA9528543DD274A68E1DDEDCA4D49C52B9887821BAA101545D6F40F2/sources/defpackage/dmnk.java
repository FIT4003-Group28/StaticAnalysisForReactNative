package defpackage;
/* compiled from: PG */
/* renamed from: dmnk  reason: default package */
/* loaded from: classes.dex */
public final class dmnk extends dsqs<dmnk, dmnj> implements dsqt {
    public static final dmnk o;
    private static volatile dssr<dmnk> r;
    public int a;
    public dmsw b;
    public int d;
    public dmqi e;
    public dmmw f;
    public dmte g;
    public dmpp h;
    public dmrp i;
    public dmrx j;
    public dmrl k;
    public int l;
    public dsrj<dmpx> m;
    public dsrj<dmnr> n;
    private drsu p;
    private byte q = 2;
    public dsrj<dmqx> c = dssu.b;

    static {
        dmnk dmnkVar = new dmnk();
        o = dmnkVar;
        dsqw.cc(dmnk.class, dmnkVar);
    }

    private dmnk() {
        dspd dspdVar = dspd.b;
        this.m = dssu.b;
        this.n = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(o, "\u0001\u000e\u0000\u0001\u0001\u0013\u000e\u0000\u0003\b\u0001ᐉ\u0000\u0002ဉ\u0001\u0003Л\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\n\rဉ\r\u000eင\u000e\u000f\u001b\u0010ဋ\u0002\u0011ᐉ\f\u0013\u001b", new Object[]{"a", "p", "b", "c", dmqx.class, "e", "f", "g", "h", "i", "k", "l", "m", dmpx.class, "d", "j", "n", dmnr.class});
            }
            if (i2 == 3) {
                return new dmnk();
            }
            if (i2 == 4) {
                return new dmnj();
            }
            if (i2 == 5) {
                return o;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.q = b;
                return null;
            }
            dssr<dmnk> dssrVar = r;
            if (dssrVar == null) {
                synchronized (dmnk.class) {
                    dssrVar = r;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(o);
                        r = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.q);
    }
}
