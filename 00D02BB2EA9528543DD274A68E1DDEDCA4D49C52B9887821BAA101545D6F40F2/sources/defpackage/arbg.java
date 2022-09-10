package defpackage;
/* compiled from: PG */
/* renamed from: arbg  reason: default package */
/* loaded from: classes.dex */
public final class arbg implements Runnable {
    final /* synthetic */ arbi a;

    public arbg(arbi arbiVar) {
        this.a = arbiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        area areaVar;
        akox akoxVar = this.a.h;
        boolean z = false;
        if (akoxVar == null) {
            bvoo.h("mapContainer is null in MyLocationCameraUpdatedRunnable.", new Object[0]);
            return;
        }
        akzh k = akoxVar.k();
        this.a.p.c(k);
        synchronized (this.a.o) {
            arbi arbiVar = this.a;
            arbiVar.p.a(arbiVar.o);
            area areaVar2 = this.a.o;
            if (areaVar2.e() && this.a.o.f(k.r())) {
                z = true;
            }
            areaVar2.t = z;
            areaVar = new area(this.a.o);
        }
        synchronized (this.a) {
            arci arciVar = this.a.l;
            if (arciVar != null) {
                arciVar.a(areaVar, k);
            }
        }
        this.a.h.j.b(this);
    }
}
