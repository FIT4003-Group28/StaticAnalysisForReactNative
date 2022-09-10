package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vzt  reason: default package */
/* loaded from: classes7.dex */
public final class vzt implements Runnable {
    final /* synthetic */ vzu a;

    public vzt(vzu vzuVar) {
        this.a = vzuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.j) {
            vzu vzuVar = this.a;
            area areaVar = vzuVar.f;
            if (areaVar != null) {
                areaVar.a = vzuVar.c.X(vzuVar.i);
            }
            vzu vzuVar2 = this.a;
            arce arceVar = vzuVar2.h;
            if (arceVar != null) {
                area areaVar2 = vzuVar2.i > 0 ? vzuVar2.f : null;
                akzh a = vzuVar2.b.a();
                if (areaVar2 == null) {
                    arceVar.a(false);
                } else {
                    arceVar.a(true);
                    alad p = a.p();
                    areaVar2.q = ardi.b(p.k, p.l);
                    arceVar.a.e(areaVar2.a, Float.valueOf(arceVar.c * ardi.a(arceVar.a.c(), areaVar2.q)), Float.valueOf(-a.p().m), null);
                }
            }
        }
    }
}
