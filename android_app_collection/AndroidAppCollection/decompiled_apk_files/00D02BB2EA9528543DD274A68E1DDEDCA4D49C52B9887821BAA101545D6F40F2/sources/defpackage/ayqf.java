package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ayqf  reason: default package */
/* loaded from: classes3.dex */
final class ayqf implements View.OnAttachStateChangeListener {
    final /* synthetic */ ayqg a;

    public ayqf(ayqg ayqgVar) {
        this.a = ayqgVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ges gesVar;
        ayqg ayqgVar = this.a;
        gn g = ayqgVar.b.g();
        if (g == null || (gesVar = ayqgVar.a) == null) {
            return;
        }
        if (gesVar.I) {
            gz b = g.b();
            b.A(gesVar);
            b.h();
        } else if (gesVar.aD) {
        } else {
            gz b2 = g.b();
            b2.C(R.id.place_list_details_related_lists_carousel, gesVar, "PLACE_LIST_DETAILS_RELATED_LISTS_WEB_VIEW_FRAGMENT_TAG");
            b2.h();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ges gesVar;
        ayqg ayqgVar = this.a;
        gn g = ayqgVar.b.g();
        if (g == null || (gesVar = ayqgVar.a) == null || gesVar.I) {
            return;
        }
        gz b = g.b();
        b.t(gesVar);
        b.h();
    }
}
