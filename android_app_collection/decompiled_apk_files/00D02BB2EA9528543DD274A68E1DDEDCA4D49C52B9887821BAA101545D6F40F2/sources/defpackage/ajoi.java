package defpackage;

import android.app.AlertDialog;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajoi  reason: default package */
/* loaded from: classes2.dex */
public class ajoi implements ajpb {
    final /* synthetic */ ajos a;
    final /* synthetic */ AlertDialog b;
    final /* synthetic */ btlu c;
    final /* synthetic */ Profile d;
    final /* synthetic */ deig e;
    final /* synthetic */ ajoj f;

    public ajoi(ajoj ajojVar, ajos ajosVar, AlertDialog alertDialog, btlu btluVar, Profile profile, deig deigVar) {
        this.f = ajojVar;
        this.a = ajosVar;
        this.b = alertDialog;
        this.c = btluVar;
        this.d = profile;
        this.e = deigVar;
    }

    @Override // defpackage.ajpb
    public ajop a() {
        return this.a;
    }

    @Override // defpackage.ajpb
    public CharSequence b() {
        return this.f.a.getText(R.string.BLOCK_PERSON_ACTION);
    }

    @Override // defpackage.ajpb
    public cqkl c() {
        this.b.dismiss();
        final dehn<bvns> a = this.f.b.a(this.c, this.d);
        final deig deigVar = this.e;
        final btlu btluVar = this.c;
        final Profile profile = this.d;
        a.Pk(new Runnable(this, a, deigVar, btluVar, profile) { // from class: ajoh
            private final ajoi a;
            private final dehn b;
            private final deig c;
            private final btlu d;
            private final Profile e;

            {
                this.a = this;
                this.b = a;
                this.c = deigVar;
                this.d = btluVar;
                this.e = profile;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ajoi ajoiVar = this.a;
                dehn dehnVar = this.b;
                deig deigVar2 = this.c;
                btlu btluVar2 = this.d;
                Profile profile2 = this.e;
                bvns bvnsVar = bvns.BLOCK_ACTION_SUCCESS;
                int ordinal = ((bvns) deha.s(dehnVar)).ordinal();
                if (ordinal == 0) {
                    deigVar2.j(false);
                } else if (ordinal != 1 && ordinal != 2) {
                } else {
                    deigVar2.p(ajoiVar.f.a(btluVar2, profile2));
                }
            }
        }, this.f.d);
        return cqkl.a;
    }

    @Override // defpackage.ajpb
    public CharSequence d() {
        return this.f.a.getText(R.string.NO_BUTTON);
    }

    @Override // defpackage.ajpb
    public cqkl e() {
        this.b.dismiss();
        this.e.j(false);
        return cqkl.a;
    }

    @Override // defpackage.ajpb
    public CharSequence f() {
        return this.a.f();
    }

    @Override // defpackage.ajpb
    public cqkl g() {
        this.b.dismiss();
        this.e.j(true);
        return cqkl.a;
    }
}
