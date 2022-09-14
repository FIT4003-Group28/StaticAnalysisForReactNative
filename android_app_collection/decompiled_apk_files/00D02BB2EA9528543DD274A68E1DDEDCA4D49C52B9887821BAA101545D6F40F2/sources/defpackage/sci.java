package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: sci  reason: default package */
/* loaded from: classes7.dex */
final class sci implements cqkn<sae> {
    final /* synthetic */ sco a;

    public sci(sco scoVar) {
        this.a = scoVar;
    }

    @Override // defpackage.cqkn
    public final /* bridge */ /* synthetic */ void a(sae saeVar, View view) {
        sae saeVar2 = saeVar;
        boolean z = !saeVar2.o().booleanValue();
        saeVar2.p(z);
        bvqd.a(this.a.g.g(z ? domw.COMBINE_FREQUENT_TRIPS_WITH_LOCATION_HISTORY : domw.USE_ONLY_FREQUENT_TRIPS), this.a.i);
        if (z) {
            this.a.j.e();
        }
    }
}
