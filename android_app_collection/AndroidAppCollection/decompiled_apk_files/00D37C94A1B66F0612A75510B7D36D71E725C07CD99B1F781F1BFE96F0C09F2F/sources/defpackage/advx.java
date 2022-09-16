package defpackage;
/* compiled from: PG */
/* renamed from: advx  reason: default package */
/* loaded from: classes.dex */
public final class advx implements advt, ynl {
    public final yni a;
    private final afvn b;
    private final afvy c;
    private final boolean d;
    private final boolean e;
    private final long f;
    private final snc g;
    private long h;
    private boolean i;

    static {
        zep.a("MDX.user");
    }

    public advx(afvn afvnVar, afvy afvyVar, yni yniVar, snc sncVar, acwu acwuVar) {
        afvnVar.getClass();
        this.b = afvnVar;
        afvyVar.getClass();
        this.c = afvyVar;
        yniVar.getClass();
        this.a = yniVar;
        this.g = sncVar;
        long j = acwuVar.B;
        this.f = j;
        this.d = j != 0;
        this.h = 0L;
        this.i = false;
        this.e = acwuVar.C;
    }

    @Override // defpackage.advt
    public final String a() {
        if (!d()) {
            return null;
        }
        return this.b.c().e();
    }

    @Override // defpackage.advt
    public final String b() {
        if (d()) {
            afvm c = this.b.c();
            afvx a = this.c.a(c);
            long d = this.g.d();
            if ((this.e && this.i) || (this.d && d > this.h + this.f)) {
                a.b(c);
                this.h = d;
                this.i = false;
            } else if (this.h == 0) {
                this.h = d;
            }
            afvv a2 = a.a(c);
            if (a2.g()) {
                return a2.e();
            }
        }
        return null;
    }

    @Override // defpackage.advt
    public final void c() {
        this.i = true;
    }

    public final boolean d() {
        return this.b.t();
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                this.a.d(advs.a);
                return null;
            } else if (i == 1) {
                afwd afwdVar = (afwd) obj;
                this.a.d(advs.a);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{afwb.class, afwd.class};
    }
}
