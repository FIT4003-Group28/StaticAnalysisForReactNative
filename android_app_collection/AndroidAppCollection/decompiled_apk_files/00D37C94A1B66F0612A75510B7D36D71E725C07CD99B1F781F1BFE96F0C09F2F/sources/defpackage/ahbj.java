package defpackage;
/* compiled from: PG */
/* renamed from: ahbj  reason: default package */
/* loaded from: classes.dex */
final class ahbj implements afwa {
    final /* synthetic */ String a;
    final /* synthetic */ attp b;
    final /* synthetic */ ahcx c;
    final /* synthetic */ acti d;
    final /* synthetic */ atpy e;
    final /* synthetic */ int f;
    final /* synthetic */ ahbm h;

    public ahbj(ahbm ahbmVar, String str, attp attpVar, ahcx ahcxVar, acti actiVar, atpy atpyVar, int i) {
        this.h = ahbmVar;
        this.a = str;
        this.b = attpVar;
        this.c = ahcxVar;
        this.d = actiVar;
        this.e = atpyVar;
        this.f = i;
    }

    @Override // defpackage.afwa
    public final void a() {
        ahcx ahcxVar = this.c;
        if (ahcxVar != null) {
            ahcxVar.a(this.a, 2);
        }
        this.h.x(2);
    }

    @Override // defpackage.afwa
    public final void b() {
        this.h.c(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.afwa
    public final void c(Exception exc) {
        this.h.c.e(exc);
    }
}
