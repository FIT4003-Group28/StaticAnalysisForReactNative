package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aolk  reason: default package */
/* loaded from: classes2.dex */
public final class aolk implements View.OnAttachStateChangeListener {
    final /* synthetic */ aoll a;

    public aolk(aoll aollVar) {
        this.a = aollVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        aoll aollVar = this.a;
        aollVar.a.b(R.id.receipt_web_content_webview_container);
        cqkx.p(aollVar);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        aoll aollVar = this.a;
        cqkx.p(aollVar);
        aollVar.a.c();
    }
}
