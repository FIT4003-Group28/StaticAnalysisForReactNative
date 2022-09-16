package defpackage;
/* compiled from: PG */
/* renamed from: aaak  reason: default package */
/* loaded from: classes.dex */
public final class aaak {
    final /* synthetic */ aaal a;

    public aaak(aaal aaalVar) {
        this.a = aaalVar;
    }

    public final void a() {
        aaal aaalVar = this.a;
        if (aaalVar.h) {
            aaar aaarVar = aaalVar.c;
            zza a = aaarVar.a();
            if (a == null) {
                aaarVar.g();
                return;
            } else if (!aaarVar.p(a)) {
                zep.l("Teaser clicked for a card that is not in the current InfoCardCollection.");
                return;
            } else {
                arji e = a.e();
                aaarVar.d.a(e.e);
                aaarVar.c(e.h.I());
                if ((e.b & 64) == 0) {
                    aaarVar.m(aaarVar.g.b().indexOf(a), true);
                    return;
                }
                aafo aafoVar = aaarVar.z;
                apzg apzgVar = e.i;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.c(apzgVar, null);
                return;
            }
        }
        aaalVar.c.g();
    }

    public final void b() {
        aaar aaarVar = this.a.c;
        zza a = aaarVar.a();
        if (a == null || !aaarVar.p(a)) {
            return;
        }
        aaarVar.d.a(a.e().g);
    }

    public final void c() {
        aaal aaalVar = this.a;
        aaalVar.h = false;
        aaalVar.h();
    }
}
