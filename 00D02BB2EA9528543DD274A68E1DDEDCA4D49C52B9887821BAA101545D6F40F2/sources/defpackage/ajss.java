package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
/* compiled from: PG */
/* renamed from: ajss  reason: default package */
/* loaded from: classes2.dex */
public final class ajss implements btzi<dwdc, dwde> {
    final /* synthetic */ btlu a;
    final /* synthetic */ ahwl b;
    final /* synthetic */ dcdc c;
    final /* synthetic */ deig d;
    final /* synthetic */ ajsu e;

    public ajss(ajsu ajsuVar, btlu btluVar, ahwl ahwlVar, dcdc dcdcVar, deig deigVar) {
        this.e = ajsuVar;
        this.a = btluVar;
        this.b = ahwlVar;
        this.c = dcdcVar;
        this.d = deigVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwdc> btzrVar, btzy btzyVar) {
        bttq bttqVar = btzyVar.p;
        ahwl e = this.e.c.e(this.a, this.b.q());
        if (e == null || !e.i()) {
            this.e.c.u(this.a);
        } else {
            this.e.c.p(this.a, this.b.q());
        }
        dcdc dcdcVar = this.c;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            ajsu ajsuVar = this.e;
            ajsuVar.f.a(new aiht(new eapd(ajsuVar.e.b()), (dqzv) dcdcVar.get(i)), dbsg.i(this.a));
        }
        this.e.b.b(this.a);
        this.d.j(1);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwdc> btzrVar, dwde dwdeVar) {
        deig deigVar;
        int i;
        dwde dwdeVar2 = dwdeVar;
        ahwl e = this.e.c.e(this.a, this.b.q());
        if (e == null || !e.i()) {
            this.e.c.u(this.a);
        } else {
            this.e.c.p(this.a, this.b.q());
        }
        dcdc dcdcVar = this.c;
        int size = dcdcVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            dqzv dqzvVar = (dqzv) dcdcVar.get(i2);
            PersonId b = PersonId.b(dqzvVar);
            if (b != null) {
                aiki aikiVar = this.e.c;
                int a = dqzq.a(dqzvVar.d);
                if (a == 0) {
                    a = 1;
                }
                aikiVar.E(a, b, this.a);
                ajsu ajsuVar = this.e;
                ajsuVar.f.a(new aihp(new eapd(ajsuVar.e.b()), dqzvVar), dbsg.i(this.a));
            }
        }
        this.e.b.b(this.a);
        if (dwdeVar2.a.size() == 0) {
            deigVar = this.d;
            i = 0;
        } else {
            deigVar = this.d;
            i = 2;
        }
        deigVar.j(i);
    }
}
