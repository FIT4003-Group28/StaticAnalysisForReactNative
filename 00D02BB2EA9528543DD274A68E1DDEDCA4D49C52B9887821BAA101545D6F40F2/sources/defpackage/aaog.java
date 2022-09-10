package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aaog  reason: default package */
/* loaded from: classes2.dex */
final class aaog implements View.OnAttachStateChangeListener {
    final /* synthetic */ aaoh a;

    public aaog(aaoh aaohVar) {
        this.a = aaohVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        aaoh aaohVar = this.a;
        dbsg<gn> dbsgVar = aaohVar.a;
        dbsg<aazh> dbsgVar2 = aaohVar.b;
        if (!dbsgVar.a() || !dbsgVar2.a()) {
            return;
        }
        aazh b = dbsgVar2.b();
        if (!b.c) {
            gz b2 = dbsgVar.b().b();
            b2.C(R.id.experience_sheet_web_results_webview_container, b, "EVENT_WEB_RESULTS_WEB_VIEW_FRAGMENT_TAG");
            b2.h();
            return;
        }
        gz b3 = dbsgVar.b().b();
        b3.t(b);
        b3.A(b);
        b3.f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        aaoh aaohVar = this.a;
        dbsg<gn> dbsgVar = aaohVar.a;
        dbsg<aazh> dbsgVar2 = aaohVar.b;
        if (!dbsgVar.a() || !dbsgVar2.a()) {
            return;
        }
        aazh b = dbsgVar2.b();
        if (b.I) {
            return;
        }
        gz b2 = dbsgVar.b().b();
        b2.t(b);
        b2.h();
    }
}
