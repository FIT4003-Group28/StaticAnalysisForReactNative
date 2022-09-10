package defpackage;

import android.location.Location;
import com.google.android.gms.location.LocationResult;
/* compiled from: PG */
/* renamed from: ajkg  reason: default package */
/* loaded from: classes2.dex */
final class ajkg extends cola {
    public int a = 0;
    final /* synthetic */ ajkh b;
    private final dqza c;
    private final dbsz<Location> d;
    private final deig<dbsg<Location>> e;
    private final ckcw f;

    public ajkg(ajkh ajkhVar, dqza dqzaVar, dbsz<Location> dbszVar, deig<dbsg<Location>> deigVar, ckcw ckcwVar) {
        this.b = ajkhVar;
        this.c = dqzaVar;
        this.d = dbszVar;
        this.e = deigVar;
        this.f = ckcwVar;
    }

    @Override // defpackage.cola
    public final void a(LocationResult locationResult) {
        Location a = locationResult.a();
        if (a == null) {
            return;
        }
        this.a++;
        this.d.NU(a);
        eaow eaowVar = new eaow(new eapd(a.getTime()), new eapd(this.b.a.b()));
        boolean q = eaowVar.q(eaow.e(this.c.a));
        float accuracy = a.getAccuracy();
        float f = this.c.b;
        if (q && accuracy < f) {
            if (this.e.isDone()) {
                return;
            }
            this.b.b.l(this);
            this.e.j(dbsg.i(a));
            return;
        }
        if (!q) {
            ((ckcp) this.f.a(ckgd.N)).a(eaowVar.b);
        }
        if (accuracy < f) {
            return;
        }
        ((ckco) this.f.a(ckgd.O)).a((int) a.getAccuracy());
    }
}
