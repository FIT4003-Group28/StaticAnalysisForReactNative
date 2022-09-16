package defpackage;

import android.app.Activity;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bbcs  reason: default package */
/* loaded from: classes3.dex */
final class bbcs implements degu<bbmn> {
    final /* synthetic */ bbct a;

    public bbcs(bbct bbctVar) {
        this.a = bbctVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        gn gnVar = this.a.A;
        if (gnVar != null) {
            gnVar.e();
        }
        Activity activity = this.a.f;
        Toast.makeText(activity, activity.getString(R.string.PERSONALIZATION_LIST_PAGE_LOAD_ERROR_TOAST), 1).show();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(bbmn bbmnVar) {
        this.a.ad.c(bbmnVar);
    }
}
