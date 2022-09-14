package defpackage;
/* compiled from: PG */
/* renamed from: dmxh  reason: default package */
/* loaded from: classes.dex */
public final class dmxh extends dsqs<dmxh, dmxg> implements dsqt {
    public static final dmxh j;
    private static volatile dssr<dmxh> l;
    public int a;
    public dmxn d;
    public dmwh e;
    public dmyw f;
    public dmyj g;
    public dsrf h;
    public dmlk i;
    private byte k = 2;
    public dsrj<dmyd> b = dssu.b;
    public dsrj<dmwx> c = dssu.b;

    static {
        dmxh dmxhVar = new dmxh();
        j = dmxhVar;
        dsqw.cc(dmxh.class, dmxhVar);
    }

    private dmxh() {
        dspd dspdVar = dspd.b;
        this.h = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\u001b\b\u0000\u0003\u0004\u0001Л\u0002Л\u0003ᐉ\u0001\u0006ဉ\u0006\u0014ဉ\u0003\u0016ဉ\f\u0017'\u001bᐉ\u0015", new Object[]{"a", "b", dmyd.class, "c", dmwx.class, "d", "f", "e", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new dmxh();
            }
            if (i2 == 4) {
                return new dmxg();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            }
            dssr<dmxh> dssrVar = l;
            if (dssrVar == null) {
                synchronized (dmxh.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.k);
    }

    public final void b() {
        dsrj<dmyd> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }

    public final void c() {
        dsrj<dmwx> dsrjVar = this.c;
        if (!dsrjVar.a()) {
            this.c = dsqw.cl(dsrjVar);
        }
    }
}
