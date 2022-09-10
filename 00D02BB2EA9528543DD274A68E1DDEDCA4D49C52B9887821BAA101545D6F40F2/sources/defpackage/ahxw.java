package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.apps.gmm.locationsharing.interprocess.api.ReportingState;
import com.google.android.apps.gmm.locationsharing.interprocess.api.ShareCreationPrerequisitesState;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ahxw  reason: default package */
/* loaded from: classes2.dex */
class ahxw implements jad {
    final /* synthetic */ ahxx a;

    public ahxw(ahxx ahxxVar) {
        this.a = ahxxVar;
    }

    @Override // defpackage.jad
    public Boolean a() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        ReportingState shareCreationPrerequisitesState;
        String str;
        Intent intent = new Intent();
        ahxx ahxxVar = this.a;
        if (ahxxVar.o) {
            ahzd ahzdVar = ahxxVar.i;
            String str2 = ahxxVar.n;
            dbsg<btlu> h = ahzdVar.b.h(str2);
            if (h.a()) {
                ajsj ajsjVar = ahzdVar.b;
                if (ajsj.k(h.b()) && ahzdVar.b.i()) {
                    shareCreationPrerequisitesState = ahzdVar.a(h.b());
                    str = "com.google.android.apps.gmm.locationsharing.interprocess.reportingStateExtraKey";
                }
            }
            shareCreationPrerequisitesState = new ReportingState(str2, 3, dcdc.f(1));
            str = "com.google.android.apps.gmm.locationsharing.interprocess.reportingStateExtraKey";
        } else {
            ahzh ahzhVar = ahxxVar.j;
            String str3 = ahxxVar.n;
            dbsg<btlu> h2 = ahzhVar.b.h(str3);
            if (h2.a()) {
                ajsj ajsjVar2 = ahzhVar.b;
                if (ajsj.k(h2.b()) && ahzhVar.b.i()) {
                    shareCreationPrerequisitesState = ahzhVar.a(h2.b());
                    str = "com.google.android.apps.gmm.locationsharing.interprocess.shareCreationPrerequisitesStateExtraKey";
                }
            }
            shareCreationPrerequisitesState = new ShareCreationPrerequisitesState(str3, 3, dcdc.f(1));
            str = "com.google.android.apps.gmm.locationsharing.interprocess.shareCreationPrerequisitesStateExtraKey";
        }
        intent.putExtra(str, shareCreationPrerequisitesState);
        try {
            ahxx ahxxVar2 = this.a;
            ahxxVar2.p.send(ahxxVar2.b.a(), 0, intent);
            this.a.g.execute(new Runnable(this) { // from class: ahxv
                private final ahxw a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.k.run();
                }
            });
        } catch (PendingIntent.CanceledException unused) {
            bvoo.h("Location sharing IPC return intent canceled.", new Object[0]);
        }
        ckgz ckgzVar = this.a.o ? ckgd.A : ckgd.E;
        ahxx ahxxVar3 = this.a;
        ahxxVar3.m.b(ahxxVar3.n, ckgzVar);
    }

    @Override // defpackage.jad
    public cqkl c() {
        this.a.f.execute(new Runnable(this) { // from class: ahxu
            private final ahxw a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b();
            }
        });
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        return cjtd.a(dtxu.dM);
    }

    @Override // defpackage.jad
    public CharSequence e() {
        return this.a.b.a().getString(R.string.PERSONAL_SAFETY_FIXES_COMPLETE_BUTTON_TEXT);
    }

    @Override // defpackage.jad
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jad
    public cqkl g(cjqm cjqmVar) {
        return jac.b(this);
    }

    @Override // defpackage.jad
    public Boolean h() {
        return jac.a();
    }

    @Override // defpackage.jad
    public cqtd i() {
        return null;
    }
}
