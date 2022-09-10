package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cdzg  reason: default package */
/* loaded from: classes4.dex */
final class cdzg<T> implements aa<ceap> {
    final /* synthetic */ ceae a;
    final /* synthetic */ Context b;

    public cdzg(ceae ceaeVar, Context context) {
        this.a = ceaeVar;
        this.b = context;
    }

    @Override // defpackage.aa
    public final /* bridge */ /* synthetic */ void m(ceap ceapVar) {
        ceap ceapVar2 = ceapVar;
        if (ceapVar2 != null) {
            cdvi cdviVar = cdvi.MEDIA_CAPTURE;
            int ordinal = ceapVar2.ordinal();
            if (ordinal == 0) {
                ceae.aS(this.a).hide();
                return;
            } else if (ordinal == 1) {
                ceae.aS(this.a).show();
                return;
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    return;
                }
                ceae ceaeVar = this.a;
                Activity activity = (Activity) this.b;
                Dialog dialog = ceaeVar.af;
                if (dialog == null) {
                    dzvx.a("publishingDialog");
                }
                dialog.dismiss();
                dafk b = ckos.b((CoordinatorLayout) activity.findViewById(R.id.editorOuterLayout), R.string.photo_posts_publication_failed_message, -2);
                b.t(R.string.photo_posts_publication_failed_retry_action, cdzf.a);
                b.c();
                return;
            } else if (!ceae.aS(this.a).isShowing()) {
                return;
            } else {
                ceae ceaeVar2 = this.a;
                Dialog dialog2 = ceaeVar2.af;
                if (dialog2 == null) {
                    dzvx.a("publishingDialog");
                }
                dialog2.hide();
                ceaeVar2.aJ();
                ceaw ceawVar = ceaeVar2.ag;
                if (ceawVar == null) {
                    dzvx.a("photoPostSubmitter");
                }
                if (ceawVar.f == null) {
                    return;
                }
                chhr chhrVar = ceaeVar2.g;
                if (chhrVar == null) {
                    dzvx.a("thanksPageDisplayer");
                }
                ceaw ceawVar2 = ceaeVar2.ag;
                if (ceawVar2 == null) {
                    dzvx.a("photoPostSubmitter");
                }
                djgl djglVar = ceawVar2.f;
                chir chirVar = chir.c;
                cdzd cdzdVar = ceaeVar2.ae;
                if (cdzdVar == null) {
                    dzvx.a("options");
                }
                ilo d = cdzdVar.d();
                if (!chhrVar.c(d)) {
                    return;
                }
                chix chixVar = chhrVar.c;
                dbsg<chit> b2 = chix.b(djglVar);
                if (!b2.a()) {
                    return;
                }
                chit b3 = b2.b();
                dsqp dsqpVar = (dsqp) b3.cu(5);
                dsqpVar.bC(b3);
                chis chisVar = (chis) dsqpVar;
                if (chisVar.c) {
                    chisVar.bF();
                    chisVar.c = false;
                }
                chit chitVar = (chit) chisVar.b;
                chit chitVar2 = chit.i;
                chirVar.getClass();
                chitVar.f = chirVar;
                chitVar.a |= 8;
                chhrVar.a.D(chbx.g(chisVar.bK(), chhrVar.b, bwrs.a(d)));
                return;
            }
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
