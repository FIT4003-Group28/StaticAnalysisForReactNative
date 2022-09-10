package defpackage;
/* compiled from: PG */
/* renamed from: bmvx  reason: default package */
/* loaded from: classes3.dex */
final class bmvx implements ango {
    public final dbsg<String> a;
    public final String b;
    final /* synthetic */ bmvy c;

    public bmvx(bmvy bmvyVar, dbsg<String> dbsgVar, String str) {
        this.c = bmvyVar;
        this.a = dbsgVar;
        this.b = str;
    }

    @Override // defpackage.ango
    public final void c(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void d(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void e(duyc duycVar, duye duyeVar) {
        this.c.a.g.b(new Runnable(this) { // from class: bmvv
            private final bmvx a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bmvx bmvxVar = this.a;
                ckos.a(bmvxVar.c.a.f.findViewById(16908290), (CharSequence) ((dbsu) bmvxVar.a).a, -1).c();
                bmvxVar.c.a.h = dbpy.a;
                bmvi W = bmvxVar.c.a.W();
                ily g = bmvxVar.c.a.W().c().g();
                ilw ilwVar = g.b;
                if (ilwVar.x == null) {
                    ilwVar.x = new ilc(1, null, null);
                }
                W.b(g.d());
                bmvxVar.c.a.X();
            }
        }, bvrj.UI_THREAD);
    }

    @Override // defpackage.ango
    public final void f(duyc duycVar) {
        this.c.a.g.b(new Runnable(this) { // from class: bmvw
            private final bmvx a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bmvx bmvxVar = this.a;
                ckos.a(bmvxVar.c.a.f.findViewById(16908290), bmvxVar.b, -1).c();
                bmvxVar.c.a.h = dbpy.a;
                bmvxVar.c.a.X();
            }
        }, bvrj.UI_THREAD);
    }
}
