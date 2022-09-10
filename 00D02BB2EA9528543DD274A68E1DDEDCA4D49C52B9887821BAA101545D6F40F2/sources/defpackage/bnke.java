package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bnke  reason: default package */
/* loaded from: classes3.dex */
final class bnke implements View.OnAttachStateChangeListener {
    final /* synthetic */ bnkf a;

    public bnke(bnkf bnkfVar) {
        this.a = bnkfVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        bnkf bnkfVar = this.a;
        bnkfVar.a.b(R.id.place_web_content_webview_container);
        bnkfVar.b = dbpy.a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        bnkf bnkfVar = this.a;
        bnkfVar.b = dbsg.i(Integer.valueOf(view.findViewById(R.id.place_web_content_webview_container).getHeight()));
        cqkx.p(bnkfVar);
        bnkfVar.a.c();
    }
}
