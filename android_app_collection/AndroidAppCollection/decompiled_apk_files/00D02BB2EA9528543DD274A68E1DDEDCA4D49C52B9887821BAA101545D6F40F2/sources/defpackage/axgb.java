package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axgb  reason: default package */
/* loaded from: classes3.dex */
public final class axgb implements dzab<dimq> {
    final /* synthetic */ axgi a;

    public axgb(axgi axgiVar) {
        this.a = axgiVar;
    }

    @Override // defpackage.dzab
    public final void a(dzak dzakVar) {
    }

    @Override // defpackage.dzab
    public final void b(Throwable th) {
        z<axgh> zVar = this.a.c;
        axgf e = zVar.h().e();
        e.e(axgg.INITIAL_LOAD_ERROR);
        e.f(th);
        zVar.f(e.g());
        z<axgh> zVar2 = this.a.d;
        axgf e2 = zVar2.h().e();
        e2.e(axgg.INITIAL_LOAD_ERROR);
        e2.f(th);
        zVar2.f(e2.g());
        z<axgh> zVar3 = this.a.e;
        axgf e3 = zVar3.h().e();
        e3.e(axgg.INITIAL_LOAD_ERROR);
        e3.f(th);
        zVar3.f(e3.g());
    }

    @Override // defpackage.dzab
    public final /* bridge */ /* synthetic */ void c(dimq dimqVar) {
        dimq dimqVar2 = dimqVar;
        z<axgh> zVar = this.a.c;
        axgf e = zVar.h().e();
        dimp dimpVar = dimqVar2.b;
        if (dimpVar == null) {
            dimpVar = dimp.e;
        }
        e.e((dimpVar.a & 1) != 0 ? axgg.PARTIALLY_LOADED : axgg.LOADED);
        dimp dimpVar2 = dimqVar2.b;
        if (dimpVar2 == null) {
            dimpVar2 = dimp.e;
        }
        e.d(dimpVar2);
        e.c(dimqVar2.c);
        zVar.f(e.g());
        z<axgh> zVar2 = this.a.d;
        axgf e2 = zVar2.h().e();
        dimp dimpVar3 = dimqVar2.d;
        if (dimpVar3 == null) {
            dimpVar3 = dimp.e;
        }
        e2.e((dimpVar3.a & 1) != 0 ? axgg.PARTIALLY_LOADED : axgg.LOADED);
        dimp dimpVar4 = dimqVar2.d;
        if (dimpVar4 == null) {
            dimpVar4 = dimp.e;
        }
        e2.d(dimpVar4);
        e2.c(dimqVar2.c);
        zVar2.f(e2.g());
        z<axgh> zVar3 = this.a.e;
        axgf e3 = zVar3.h().e();
        dimp dimpVar5 = dimqVar2.e;
        if (dimpVar5 == null) {
            dimpVar5 = dimp.e;
        }
        e3.e((dimpVar5.a & 1) != 0 ? axgg.PARTIALLY_LOADED : axgg.LOADED);
        dimp dimpVar6 = dimqVar2.e;
        if (dimpVar6 == null) {
            dimpVar6 = dimp.e;
        }
        e3.d(dimpVar6);
        e3.c(dimqVar2.c);
        zVar3.f(e3.g());
        z<dqas> zVar4 = this.a.f;
        dqas dqasVar = dimqVar2.g;
        if (dqasVar == null) {
            dqasVar = dqas.c;
        }
        zVar4.f(dqasVar);
    }
}
