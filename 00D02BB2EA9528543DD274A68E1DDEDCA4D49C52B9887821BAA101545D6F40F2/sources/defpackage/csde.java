package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: csde  reason: default package */
/* loaded from: classes5.dex */
public final class csde extends ex {
    public WebView ad;
    public Runnable ae;
    private ViewGroup af;

    public final void aJ() {
        WebView webView = this.ad;
        if (webView == null || this.af == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) webView.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.ad);
        }
        this.af.addView(this.ad, 0, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i(true);
        View inflate = layoutInflater.inflate(R.layout.survey_dialog, viewGroup, false);
        this.af = (ViewGroup) inflate.findViewById(R.id.survey_container);
        aJ();
        return inflate;
    }

    @Override // defpackage.ex, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Runnable runnable = this.ae;
        if (runnable != null) {
            runnable.run();
        }
    }
}
