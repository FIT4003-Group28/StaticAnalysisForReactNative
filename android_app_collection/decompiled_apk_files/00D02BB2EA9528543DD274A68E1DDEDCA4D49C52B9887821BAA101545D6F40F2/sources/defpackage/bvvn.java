package defpackage;

import android.os.Parcelable;
import com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks;
/* compiled from: PG */
/* renamed from: bvvn  reason: default package */
/* loaded from: classes4.dex */
public final class bvvn extends bvvr {
    public Class<? extends cqiw<bvxg>> a;
    public WebViewCallbacks b;
    public dbsg<Parcelable> c = dbpy.a;
    private bvxu d;

    @Override // defpackage.bvvr
    public final void b(bvxu bvxuVar) {
        if (bvxuVar != null) {
            this.d = bvxuVar;
            return;
        }
        throw new NullPointerException("Null webViewProperties");
    }

    @Override // defpackage.bvvr
    public final bvvs a() {
        String str = this.d == null ? " webViewProperties" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new bvvo(this.d, this.a, this.b, this.c);
    }
}
