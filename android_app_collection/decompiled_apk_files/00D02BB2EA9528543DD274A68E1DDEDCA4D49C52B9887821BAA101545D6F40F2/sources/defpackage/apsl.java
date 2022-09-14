package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: apsl  reason: default package */
/* loaded from: classes.dex */
public final class apsl extends afhx {
    public static final dbsl<afga> l = apsj.a;
    public final dxio<begg> a;
    public final gga b;
    public final bvjj c;
    public final bvrb d;
    public final auhi e;
    public final cjqq i;
    public final bhhf j;
    public final dxio<apus> k;
    @dzsi
    private bwrs<ilo> m;
    private final dxio<apsa> n;

    public apsl(Intent intent, @dzsi String str, dxio<begg> dxioVar, gga ggaVar, cjqq cjqqVar, bvjj bvjjVar, bvrb bvrbVar, auhi auhiVar, bhhf bhhfVar, dxio<apsa> dxioVar2, dxio<apus> dxioVar3) {
        super(intent, str, afid.BUSINESS_INSIGHTS);
        this.a = dxioVar;
        this.b = ggaVar;
        this.i = cjqqVar;
        this.c = bvjjVar;
        this.d = bvrbVar;
        this.e = auhiVar;
        this.j = bhhfVar;
        this.n = dxioVar2;
        this.k = dxioVar3;
    }

    @Override // defpackage.afhx
    public final void a() {
        boolean parseBoolean = Boolean.parseBoolean(this.f.getStringExtra("has_multiple_listings"));
        dbsg j = dbsg.j(dbsj.f(this.f.getStringExtra("feature_id")));
        if (parseBoolean) {
            if (j.a()) {
                return;
            }
            this.n.a().f();
            this.i.g().d(cjtd.a(dtxv.di));
        } else if (!j.a()) {
        } else {
            ily ilyVar = new ily();
            ilyVar.k((String) j.b());
            ilo d = ilyVar.d();
            this.m = bwrs.a(d);
            bwrs<ilo> bwrsVar = this.m;
            dbsk.s(bwrsVar);
            this.a.a().q(bwrsVar, true);
            this.a.a().p(d, null, new apsk(this));
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    @dzsi
    public final durz c() {
        return durz.EIT_BUSINESS_INSIGHTS_NOTIFICATION;
    }
}
