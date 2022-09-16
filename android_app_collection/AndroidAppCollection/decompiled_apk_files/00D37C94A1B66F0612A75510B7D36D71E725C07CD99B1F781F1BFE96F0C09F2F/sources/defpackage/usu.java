package defpackage;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import com.google.android.libraries.parenttools.youtube.ParentToolsResult;
import com.google.android.youtube.R;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: usu  reason: default package */
/* loaded from: classes4.dex */
public final class usu extends dp {
    public String a;
    public View ae;
    private String af;
    private String ag;
    private String ah;
    private String ai;
    private String aj;
    private boolean ak;
    private ExecutorService al;
    private Future am;
    public String b;
    public WebView c;
    public View d;
    public View e;

    public final void a() {
        d("");
    }

    public final void d(String str) {
        this.d.setVisibility(0);
        this.e.setVisibility(8);
        this.ae.setVisibility(0);
        this.c.setVisibility(8);
        usq usqVar = (usq) mJ();
        if (usqVar == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            usqVar.d(4, str);
        } else {
            usqVar.d(5, "");
        }
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        Bundle bundle2 = this.m;
        if (!(mJ() instanceof usq)) {
            Log.wtf("ParentToolsFragment", "host activity must implement ParentToolsFragmentListener");
        } else if (bundle2 == null) {
            Log.e("ParentToolsFragment", "getArguments() returned null! Arguments are required.");
            ((usq) mJ()).d(1, "");
            p();
        } else {
            this.al = Executors.newSingleThreadExecutor();
            this.af = bundle2.getString("parent_tools_url", "https://families.youtube.com");
            this.a = bundle2.getString("parent_account_name", "");
            this.ag = bundle2.getString("client_name", "");
            this.ah = bundle2.getString("client_version", "");
            this.ai = bundle2.getString("child_obfuscated_gaia_id", "");
            this.b = bundle2.getString("end_url", "https://www.youtube.com/closeParentTools");
            this.aj = bundle2.getString("tool_bar_title", "");
            this.ak = bundle2.getBoolean("should_block_system_back_button", false);
            if (TextUtils.isEmpty(this.ag) || TextUtils.isEmpty(this.ah)) {
                Log.e("ParentToolsFragment", "Close parent tools because either client name or client version is not set");
                ((usq) mJ()).d(1, "");
                p();
            }
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    @Override // defpackage.dp
    public final void mR() {
        super.mR();
        Future future = this.am;
        if (future != null) {
            future.cancel(true);
            this.am = null;
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.parent_tools_fragment, viewGroup, false);
        this.d = inflate.findViewById(R.id.control_container);
        this.e = inflate.findViewById(R.id.loading_spinner_container);
        this.ae = inflate.findViewById(R.id.error_page_container);
        WebView webView = (WebView) inflate.findViewById(R.id.web_view);
        this.c = webView;
        webView.setWebViewClient(new ust(this));
        this.c.setWebChromeClient(new uss(this));
        WebSettings settings = this.c.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(true);
        final ImageView imageView = (ImageView) inflate.findViewById(R.id.loading_spinner_lottie_holder);
        bxe.j(rb().getResources().openRawResource(R.raw.loading_spinner_grey), "2131951680").e(new bxp() { // from class: usm
            @Override // defpackage.bxp
            public final void a(Object obj) {
                ImageView imageView2 = imageView;
                bxn bxnVar = new bxn();
                bxnVar.setCallback(imageView2);
                bxnVar.r((bwx) obj);
                bxnVar.p(-1);
                imageView2.setImageDrawable(null);
                imageView2.setImageDrawable(bxnVar);
                bxnVar.start();
            }
        });
        inflate.findViewById(R.id.error_button).setOnClickListener(new usl(this, 1));
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        toolbar.requestFocus();
        if (TextUtils.isEmpty(this.aj)) {
            toolbar.setVisibility(8);
        } else {
            toolbar.w(this.aj);
            toolbar.setContentDescription(this.aj);
            if (!this.ak) {
                toolbar.q(po.b(toolbar.getContext(), 2131232313));
                toolbar.p(N(R.string.accessibility_parent_tools_toolbar_back));
                toolbar.r(new usl(this));
            } else {
                toolbar.q(null);
            }
        }
        n();
        return inflate;
    }

    public final void n() {
        Uri parse = Uri.parse(this.af);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Uri.Builder buildUpon = parse.buildUpon();
        if (!queryParameterNames.contains("host_name")) {
            buildUpon.appendQueryParameter("host_name", this.ag);
        }
        if (!queryParameterNames.contains("host_version")) {
            buildUpon.appendQueryParameter("host_version", this.ah);
        }
        if (!queryParameterNames.contains("profile_id") && !TextUtils.isEmpty(this.ai)) {
            buildUpon.appendQueryParameter("profile_id", this.ai);
        }
        if (!queryParameterNames.contains("feature")) {
            buildUpon.appendQueryParameter("feature", "parent_tools");
        }
        buildUpon.appendQueryParameter("return_url", this.b);
        buildUpon.appendQueryParameter("hl", Locale.getDefault().toLanguageTag());
        buildUpon.appendQueryParameter("override_hl", "");
        final String uri = buildUpon.build().toString();
        this.am = this.al.submit(new Runnable() { // from class: usp
            @Override // java.lang.Runnable
            public final void run() {
                Account account;
                Account[] l;
                usu usuVar = usu.this;
                String str = uri;
                try {
                    for (Account account2 : qhz.l(usuVar.rb())) {
                        if (TextUtils.equals(account2.name, usuVar.a)) {
                            account = account2;
                            break;
                        }
                    }
                } catch (RemoteException | qsc | qsd e) {
                    Log.e("ParentToolsFragment", "An exception occurred while retrieving the user account", e);
                }
                account = null;
                if (account != null) {
                    new usf(usuVar.mJ(), account, str, new usn(usuVar), new uso(usuVar)).run();
                    return;
                }
                dt mJ = usuVar.mJ();
                if (mJ == null) {
                    return;
                }
                ((usq) mJ).d(2, "");
                mJ.runOnUiThread(new uso(usuVar, 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(ParentToolsResult parentToolsResult, int i) {
        usq usqVar = (usq) mJ();
        if (usqVar != null) {
            usqVar.c(parentToolsResult, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p() {
        usv c = ParentToolsResult.c();
        c.b(2);
        o(c.a(), 3);
    }
}
