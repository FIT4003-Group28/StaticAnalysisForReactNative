package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.youtube.R;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: ryo  reason: default package */
/* loaded from: classes4.dex */
public class ryo extends dp {
    public WebView d;
    private static final anay e = sbs.e();
    public static final amvn a = amvn.t("https://myaccount.google.com/embedded/accountlinking/info", "https://myaccount.google.com/embedded/accountlinking/usagenotice", "https://myaccount.google.com/embedded/accountlinking/create");
    public static final amvn b = amvn.w("https://myaccount.google.com/", "https://play.google.com/", "https://www.gstatic.com/", "https://fonts.gstatic.com/", "https://lh3.googleusercontent.com/", "https://lh4.googleusercontent.com/", "https://lh5.googleusercontent.com/", "https://lh6.googleusercontent.com/");
    public static final Pattern c = Pattern.compile("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|ico))$)", 2);

    @Override // defpackage.dp
    public final void U() {
        ((anav) e.k().i("com/google/android/libraries/accountlinking/flows/BaseFragmentFullScreen", "onDestroy", 77, "BaseFragmentFullScreen.java")).q("BaseFragmentFullScreen: onDestroy()");
        super.U();
        WebView webView = this.d;
        if (webView != null) {
            webView.stopLoading();
            this.d.destroy();
        }
    }

    public void a() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(String str) {
    }

    @Override // defpackage.dp
    public void mQ(Bundle bundle) {
        ((anav) e.k().i("com/google/android/libraries/accountlinking/flows/BaseFragmentFullScreen", "onCreate", 60, "BaseFragmentFullScreen.java")).q("BaseFragmentFullScreen: onCreate()");
        super.mQ(bundle);
        aC();
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((anav) e.k().i("com/google/android/libraries/accountlinking/flows/BaseFragmentFullScreen", "onCreateView", 68, "BaseFragmentFullScreen.java")).q("BaseFragmentFullScreen: onCreateView()");
        View inflate = layoutInflater.inflate(R.layout.base_fragment_full_screen, viewGroup, false);
        WebView webView = (WebView) inflate.findViewById(R.id.webView);
        this.d = webView;
        webView.setFocusable(true);
        this.d.setFocusableInTouchMode(true);
        this.d.setMapTrackballToArrowKeys(false);
        WebSettings settings = this.d.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(false);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setAllowFileAccess(false);
        settings.setDatabaseEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setNeedInitialFocus(false);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(false);
        if (Build.VERSION.SDK_INT >= 24) {
            settings.setDisabledActionModeMenuItems(7);
        }
        this.d.setWebViewClient(new ryn(this));
        this.d.setOnKeyListener(new View.OnKeyListener() { // from class: rym
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                ryo ryoVar = ryo.this;
                if (keyEvent.getAction() != 0) {
                    return true;
                }
                if (i != 4) {
                    return false;
                }
                if (ryoVar.d.canGoBack()) {
                    ryoVar.d.goBack();
                    return true;
                }
                ryoVar.a();
                return true;
            }
        });
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void n(String str) {
    }
}
