package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: dwbk */
/* loaded from: classes.dex */
public final class dwbk extends dsqw<dwbk, dwbd> implements dssk {
    public static final dwbk s;
    private static volatile dssr<dwbk> v;
    public int a;
    public long d;
    public int e;
    public boolean f;
    public boolean g;
    public dwbj h;
    public dsrj<dpgs> j;
    public int k;
    public int l;
    public dsrj<dpgn> m;
    public boolean n;
    public dwbh o;
    public boolean p;
    public boolean q;
    public dpgq r;
    private boolean t;
    private int u;
    public int b = 1000;
    public int c = 1;
    public int i = 1;

    static {
        dwbk dwbkVar = new dwbk();
        s = dwbkVar;
        dsqw.cc(dwbk.class, dwbkVar);
    }

    private dwbk() {
        dsqz dsqzVar = dsqz.b;
        this.j = dssu.b;
        this.k = 1;
        this.m = dssu.b;
    }

    public static /* synthetic */ void f(dwbk dwbkVar) {
        dwbkVar.a |= 1024;
        dwbkVar.t = true;
    }

    public static /* synthetic */ void g(dwbk dwbkVar) {
        dwbkVar.a |= 8192;
        dwbkVar.u = 30000;
    }

    public static /* synthetic */ void h(dwbk dwbkVar) {
        dwbkVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        dwbkVar.p = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(s, "\u0001\u0013\u0000\u0001\u0001\u0016\u0013\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0005ဌ\b\bဌ\u000b\tဇ\n\n\u001b\u000bဌ\f\fင\u0003\rင\r\u000e\u001b\u000fဇ\u000e\u0010ဇ\u0004\u0011ဇ\u0010\u0012ဇ\u0005\u0013ဉ\u0006\u0014ဉ\u000f\u0015ဇ\u0011\u0016ဉ\u0012", new Object[]{"a", "b", dqvc.a, "c", dqup.a, "d", "i", dqvb.c(), "k", dqve.a, "t", "j", dpgs.class, "l", dquk.a, "e", "u", "m", dpgn.class, "n", "f", "p", "g", "h", "o", "q", "r"});
            }
            if (i2 == 3) {
                return new dwbk();
            }
            if (i2 == 4) {
                return new dwbd();
            }
            if (i2 == 5) {
                return s;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwbk> dssrVar = v;
            if (dssrVar == null) {
                synchronized (dwbk.class) {
                    dssrVar = v;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(s);
                        v = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void c() {
        dsrj<dpgs> dsrjVar = this.j;
        if (!dsrjVar.a()) {
            this.j = dsqw.cl(dsrjVar);
        }
    }

    public final void e() {
        dsrj<dpgn> dsrjVar = this.m;
        if (!dsrjVar.a()) {
            this.m = dsqw.cl(dsrjVar);
        }
    }
}
