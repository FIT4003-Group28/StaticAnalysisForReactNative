package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: ccey  reason: default package */
/* loaded from: classes.dex */
public final class ccey extends afhx {
    public static final dcqe a = dcqe.c("ccey");
    public static final dbsl<afga> k = cceq.a;
    public final gga b;
    public final begg c;
    public final akfc d;
    public final bvrb e;
    public final bokp i;
    public final cqkj j;
    private final bvjj l;
    private final dxio<auhi> m;
    private final cafi n;
    private final bolb o;
    private final akfa p;

    public ccey(Intent intent, @dzsi String str, gga ggaVar, bvjj bvjjVar, dxio<auhi> dxioVar, begg beggVar, cafi cafiVar, akfa akfaVar, akfc akfcVar, bvrb bvrbVar, bolb bolbVar, bokp bokpVar, cqkj cqkjVar) {
        super(intent, str, afid.EDIT_PUBLISHED);
        this.b = ggaVar;
        this.l = bvjjVar;
        this.m = dxioVar;
        this.c = beggVar;
        this.n = cafiVar;
        this.d = akfcVar;
        this.o = bolbVar;
        this.p = akfaVar;
        this.e = bvrbVar;
        this.i = bokpVar;
        this.j = cqkjVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        String stringExtra = this.f.getStringExtra("gaia_id");
        if (stringExtra == null) {
            d(null);
            return;
        }
        btlu j = this.p.j();
        if (j == null || !j.d.equals(stringExtra)) {
            this.d.f(stringExtra, new ccer(this, stringExtra));
        } else {
            d(stringExtra);
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_EDIT_PUBLISHED;
    }

    public final void d(@dzsi String str) {
        String stringExtra = this.f.getStringExtra("feature_id");
        boolean booleanExtra = this.f.getBooleanExtra("is_place_removed", false);
        if (str == null) {
            if (dbsj.d(stringExtra)) {
                this.b.D(new bolc());
            } else if (!booleanExtra) {
                this.e.b(new ccew(this, stringExtra), bvrj.BACKGROUND_THREADPOOL);
            } else {
                this.e.b(new ccet(this, stringExtra), bvrj.BACKGROUND_THREADPOOL);
            }
            e();
            return;
        }
        this.n.k(str, dkcp.EDIT);
        bola a2 = this.o.a(str);
        a2.a(new cces(a2));
        e();
    }

    public final void e() {
        avac.bp(this.b, Integer.valueOf(dpyv.EDIT_PUBLISHED.dm), this.l, this.e, this.m.a());
    }
}
