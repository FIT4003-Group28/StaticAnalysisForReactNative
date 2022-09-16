package defpackage;

import android.animation.TimeInterpolator;
/* compiled from: PG */
/* renamed from: alqb  reason: default package */
/* loaded from: classes.dex */
final class alqb implements akyb {
    final /* synthetic */ bnss a;
    final /* synthetic */ ammx b;
    final /* synthetic */ alqj c;

    public alqb(alqj alqjVar, bnss bnssVar, ammx ammxVar) {
        this.c = alqjVar;
        this.a = bnssVar;
        this.b = ammxVar;
    }

    @Override // defpackage.akyb
    public final int a() {
        return this.a.a().getWidth();
    }

    @Override // defpackage.akyb
    public final int b() {
        return this.a.a().getHeight();
    }

    @Override // defpackage.akyb
    public final akzh c() {
        return this.c.b.b();
    }

    @Override // defpackage.akyb
    public final void d(alad aladVar, int i, @dzsi TimeInterpolator timeInterpolator) {
        akzh akzhVar = this.c.b;
        akzhVar.i = false;
        akzhVar.o(aladVar);
        alqj alqjVar = this.c;
        alqjVar.b.i = true;
        alqjVar.ai(true);
        ammx ammxVar = this.b;
        if (ammxVar.e) {
            ammxVar.l(ammxVar.c.a());
        }
        this.c.d.b(aladVar, 0, null);
    }
}
