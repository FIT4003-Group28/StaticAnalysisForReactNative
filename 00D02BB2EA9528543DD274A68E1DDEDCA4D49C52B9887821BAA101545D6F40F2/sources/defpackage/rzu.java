package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: rzu  reason: default package */
/* loaded from: classes7.dex */
public final class rzu implements degu<drih> {
    final /* synthetic */ deig a;

    public rzu(deig deigVar) {
        this.a = deigVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.k(th);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi drih drihVar) {
        rzk d;
        drih drihVar2 = drihVar;
        if (drihVar2 == null) {
            a(new NullPointerException());
            return;
        }
        ArrayList arrayList = new ArrayList(drihVar2.a.size());
        for (drig drigVar : drihVar2.a) {
            int i = drigVar.a;
            if (i == 2) {
                d = rzk.d();
            } else if (i == 3) {
                d = rzk.e();
            } else if (i == 1) {
                drid dridVar = (drid) drigVar.b;
                d = rzk.f(dridVar.d, rzv.a(dridVar.b), rzv.a((drigVar.a == 1 ? (drid) drigVar.b : drid.e).c));
            }
            arrayList.add(d);
        }
        this.a.j(arrayList);
    }
}
