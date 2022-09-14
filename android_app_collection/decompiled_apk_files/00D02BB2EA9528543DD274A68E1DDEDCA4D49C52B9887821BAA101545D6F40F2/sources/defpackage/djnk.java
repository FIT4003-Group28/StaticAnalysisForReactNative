package defpackage;
/* compiled from: PG */
/* renamed from: djnk  reason: default package */
/* loaded from: classes6.dex */
public final class djnk extends dsqw<djnk, djnj> implements dssk {
    public static final djnk f;
    private static volatile dssr<djnk> g;
    public int a;
    public dsrj<djkr> b = dssu.b;
    public dsrj<djni> c = dssu.b;
    public dsrj<djml> d = dssu.b;
    public dspd e = dspd.b;

    static {
        djnk djnkVar = new djnk();
        f = djnkVar;
        dsqw.cc(djnk.class, djnkVar);
    }

    private djnk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0003\u0000\u0003\u001b\u0004\u001b\u0005\u001b\u0006ည\u0000", new Object[]{"a", "b", djkr.class, "c", djni.class, "d", djml.class, "e"});
            }
            if (i2 == 3) {
                return new djnk();
            }
            if (i2 == 4) {
                return new djnj();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djnk> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djnk.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<djkr> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }

    public final void c() {
        dsrj<djni> dsrjVar = this.c;
        if (!dsrjVar.a()) {
            this.c = dsqw.cl(dsrjVar);
        }
    }

    public final void d() {
        dsrj<djml> dsrjVar = this.d;
        if (!dsrjVar.a()) {
            this.d = dsqw.cl(dsrjVar);
        }
    }
}
