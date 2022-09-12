package defpackage;
/* compiled from: PG */
/* renamed from: dpbp  reason: default package */
/* loaded from: classes6.dex */
public final class dpbp extends dsqw<dpbp, dpbm> implements dssk {
    public static final dpbp i;
    private static volatile dssr<dpbp> k;
    public int a;
    public dpec b;
    public doup d;
    public dpcg e;
    public dsrj<dpbo> f;
    public doxl g;
    public dotf h;
    private byte j = 2;
    public dsrj<dpdy> c = dssu.b;

    static {
        dpbp dpbpVar = new dpbp();
        i = dpbpVar;
        dsqw.cc(dpbp.class, dpbpVar);
    }

    private dpbp() {
        dspd dspdVar = dspd.b;
        this.f = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0002\u0003\u0001ᐉ\u0000\u0002Л\u0005ᐉ\u0003\u0007ဉ\u0004\t\u001b\nဉ\u0005\u000bဉ\u0006", new Object[]{"a", "b", "c", dpdy.class, "d", "e", "f", dpbo.class, "g", "h"});
            }
            if (i3 == 3) {
                return new dpbp();
            }
            if (i3 == 4) {
                return new dpbm();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            dssr<dpbp> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dpbp.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.j);
    }

    public final void b() {
        dsrj<dpdy> dsrjVar = this.c;
        if (!dsrjVar.a()) {
            this.c = dsqw.cl(dsrjVar);
        }
    }
}
