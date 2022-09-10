package defpackage;
/* compiled from: PG */
/* renamed from: dtkx  reason: default package */
/* loaded from: classes6.dex */
public final class dtkx extends dsqs<dtkx, dtkw> implements dsqt {
    public static final dtkx e;
    private static volatile dssr<dtkx> i;
    public int a;
    public dtku b;
    public boolean d;
    private dthb f;
    private dthb g;
    private byte h = 2;
    public dsrj<dtlf> c = dssu.b;

    static {
        dtkx dtkxVar = new dtkx();
        e = dtkxVar;
        dsqw.cc(dtkx.class, dtkxVar);
    }

    private dtkx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(e, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0003\u0001ᐉ\u0000\u0002\u001b\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဇ\u0001", new Object[]{"a", "b", "c", dtlf.class, "f", "g", "d"});
            }
            if (i3 == 3) {
                return new dtkx();
            }
            if (i3 == 4) {
                return new dtkw();
            }
            if (i3 == 5) {
                return e;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dtkx> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dtkx.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }

    public final void c() {
        dsrj<dtlf> dsrjVar = this.c;
        if (!dsrjVar.a()) {
            this.c = dsqw.cl(dsrjVar);
        }
    }
}
