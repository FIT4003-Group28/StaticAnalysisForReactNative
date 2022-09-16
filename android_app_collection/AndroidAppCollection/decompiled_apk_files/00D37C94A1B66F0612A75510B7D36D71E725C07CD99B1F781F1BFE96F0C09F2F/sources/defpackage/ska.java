package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
/* compiled from: PG */
/* renamed from: ska  reason: default package */
/* loaded from: classes4.dex */
final class ska extends WebView {
    public ska(Context context) {
        super(context);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }
}
