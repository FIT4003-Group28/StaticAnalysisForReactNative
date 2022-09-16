package defpackage;

import android.view.View;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajoe  reason: default package */
/* loaded from: classes2.dex */
public final class ajoe implements btzi<disj, disp> {
    final /* synthetic */ btlu a;
    final /* synthetic */ PersonId b;
    final /* synthetic */ deig c;
    final /* synthetic */ ajof d;

    public ajoe(ajof ajofVar, btlu btluVar, PersonId personId, deig deigVar) {
        this.d = ajofVar;
        this.a = btluVar;
        this.b = personId;
        this.c = deigVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<disj> btzrVar, btzy btzyVar) {
        this.d.c(this.a, this.b, false, false);
        ajof ajofVar = this.d;
        ajofVar.g.a(aigu.f(this.b, ajofVar.f.b()), dbsg.i(this.a));
        bttq bttqVar = btzyVar.p;
        this.c.j(false);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<disj> btzrVar, disp dispVar) {
        int a;
        aigt f;
        String string;
        boolean z;
        disp dispVar2 = dispVar;
        boolean z2 = false;
        if (dispVar2.a.size() != 1) {
            a = 3;
        } else {
            a = disn.a(dispVar2.a.get(0).a);
            if (a == 0) {
                a = 1;
            }
        }
        if (a != 2) {
            ajof ajofVar = this.d;
            final btlu btluVar = this.a;
            final PersonId personId = this.b;
            View.OnClickListener onClickListener = new View.OnClickListener(this, btluVar, personId) { // from class: ajod
                private final ajoe a;
                private final btlu b;
                private final PersonId c;

                {
                    this.a = this;
                    this.b = btluVar;
                    this.c = personId;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ajoe ajoeVar = this.a;
                    bvqd.a(ajoeVar.d.a(this.b, this.c), ajoeVar.d.c);
                }
            };
            int i = a - 1;
            if (i != 1) {
                if (i != 3) {
                    string = ajofVar.b.getString(R.string.REQUEST_LOCATION_GENERIC_ERROR);
                    z = true;
                } else {
                    string = ajofVar.b.getString(R.string.REQUEST_LOCATION_EXCEEDED_QUOTA_ERROR);
                    z = false;
                }
                cztq a2 = cztt.a(ajofVar.a);
                a2.c = string;
                if (z) {
                    a2.a(R.string.LOCATION_SHARING_OFFLINE_RETRY, onClickListener);
                }
                a2.c();
            }
        }
        ajof ajofVar2 = this.d;
        btlu btluVar2 = this.a;
        PersonId personId2 = this.b;
        if (a == 2) {
            z2 = true;
        }
        ajofVar2.c(btluVar2, personId2, false, z2);
        ajof ajofVar3 = this.d;
        aihe<ailn, aigt> aiheVar = ajofVar3.g;
        if (a == 2) {
            f = new aigt(ailp.RPC_SUCCEEDED, new eapd(ajofVar3.f.b()), this.b);
        } else {
            f = aigu.f(this.b, ajofVar3.f.b());
        }
        aiheVar.a(f, dbsg.i(this.a));
        this.c.j(Boolean.valueOf(z2));
    }
}
