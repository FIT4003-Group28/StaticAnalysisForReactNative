package defpackage;

import android.location.Location;
/* compiled from: PG */
/* renamed from: avpb  reason: default package */
/* loaded from: classes3.dex */
final class avpb implements degu<dlqi> {
    final /* synthetic */ Location a;
    final /* synthetic */ dehn b;
    final /* synthetic */ akqq c;
    final /* synthetic */ avpc d;

    public avpb(avpc avpcVar, Location location, dehn dehnVar, akqq akqqVar) {
        this.d = avpcVar;
        this.a = location;
        this.b = dehnVar;
        this.c = akqqVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dlqi dlqiVar) {
        dlqi dlqiVar2 = dlqiVar;
        boolean z = dlqiVar2.b;
        final avoq avoqVar = new avoq(this.a, (dlsw) deha.s(this.b), dlqiVar2);
        synchronized (this.d.a) {
            avpe avpeVar = this.d.a;
            avpeVar.h = avoqVar;
            avpeVar.i = avpeVar.a.b();
            this.d.a.g.d(new dbsz(avoqVar) { // from class: avpa
                private final avpd a;

                {
                    this.a = avoqVar;
                }

                @Override // defpackage.dbsz
                public final void NU(Object obj) {
                    ((avoy) obj).a(this.a);
                }
            });
            avki avkiVar = this.d.a.e;
            dcdc f = dcdc.f(this.c);
            dloy bZ = dlpa.c.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dlpa dlpaVar = (dlpa) bZ.b;
            dlpaVar.b = 1;
            dlpaVar.a = 1 | dlpaVar.a;
            avkiVar.u(f, bZ.bK());
        }
    }
}
