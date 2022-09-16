package defpackage;

import android.content.Context;
import android.webkit.WebView;
/* compiled from: PG */
/* renamed from: yfw  reason: default package */
/* loaded from: classes4.dex */
final class yfw extends WebView {
    public yfw(Context context) {
        super(context);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onCheckIsTextEditor() {
        return true;
    }
}
