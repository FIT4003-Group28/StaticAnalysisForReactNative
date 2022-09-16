package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.apps.maps.R;
import com.spotify.sdk.android.authentication.AuthenticationRequest;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dxid  reason: default package */
/* loaded from: classes6.dex */
public final class dxid extends Dialog {
    public ProgressDialog a;
    public boolean b;
    public boolean c;
    public dxhs d;
    private final Uri e;

    public dxid(Activity activity, AuthenticationRequest authenticationRequest) {
        super(activity, 16973840);
        this.e = authenticationRequest.a();
    }

    public final void a() {
        if (this.b) {
            dismiss();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.b = true;
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = false;
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.a = progressDialog;
        progressDialog.setMessage(getContext().getString(R.string.com_spotify_sdk_login_progress));
        this.a.requestWindowFeature(1);
        this.a.setOnCancelListener(new dxib(this));
        requestWindowFeature(1);
        getWindow().setSoftInputMode(16);
        getWindow().setBackgroundDrawableResource(17301673);
        setContentView(R.layout.com_spotify_sdk_login_dialog);
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = -1;
        int i2 = ((float) displayMetrics.widthPixels) / displayMetrics.density > 400.0f ? (int) (displayMetrics.density * 400.0f) : -1;
        if (displayMetrics.heightPixels / displayMetrics.density > 640.0f) {
            i = (int) (displayMetrics.density * 640.0f);
        }
        ((LinearLayout) findViewById(R.id.com_spotify_sdk_login_webview_container)).setLayoutParams(new FrameLayout.LayoutParams(i2, i, 17));
        Uri uri = this.e;
        getContext().getPackageManager().checkPermission("android.permission.INTERNET", getContext().getPackageName());
        WebView webView = (WebView) findViewById(R.id.com_spotify_sdk_login_webview);
        String queryParameter = uri.getQueryParameter("redirect_uri");
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        webView.setWebViewClient(new dxic(this, webView, (LinearLayout) findViewById(R.id.com_spotify_sdk_login_webview_container), queryParameter));
        webView.loadUrl(uri.toString());
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.b = false;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog
    protected final void onStop() {
        dxhs dxhsVar;
        if (!this.c && (dxhsVar = this.d) != null) {
            dxhy dxhyVar = new dxhy();
            dxhyVar.a = dxhz.EMPTY;
            dxhsVar.b.b(dxhsVar.a, dxhyVar.a());
        }
        this.c = true;
        this.a.dismiss();
        super.onStop();
    }
}
