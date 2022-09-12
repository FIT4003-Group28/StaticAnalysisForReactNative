package defpackage;
/* compiled from: PG */
/* renamed from: crfw  reason: default package */
/* loaded from: classes5.dex */
final class crfw implements Runnable {
    final /* synthetic */ crfy a;

    public crfw(crfy crfyVar) {
        this.a = crfyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            crfy crfyVar = this.a;
            if (crfyVar.k) {
                vvy vvyVar = crfyVar.j;
                if (vvyVar != null) {
                    crfyVar.j = vze.g(vvyVar, crfyVar.f.b(), null, 0, this.a.l);
                    crfy crfyVar2 = this.a;
                    if (crfyVar2.j == null) {
                        bvoo.h("currentDirections is null in periodicTimestampUpdate", new Object[0]);
                    } else {
                        crfyVar2.i.b(vzd.NAVIGATION_RESTORE, this.a.j);
                    }
                }
                this.a.g.a(this, crfy.b, crfy.d);
            }
        }
    }
}
