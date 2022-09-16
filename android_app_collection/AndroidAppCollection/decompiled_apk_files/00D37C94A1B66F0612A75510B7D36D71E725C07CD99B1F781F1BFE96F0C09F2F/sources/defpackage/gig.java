package defpackage;

import android.net.Uri;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.webkit.WebView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gig  reason: default package */
/* loaded from: classes3.dex */
public final class gig implements xi {
    public final View a;
    public String b;
    public WebView c;
    final zhd d = zhd.a(fxm.h);
    xj e;
    private final TextView f;
    private final TextView g;
    private final View h;
    private final View i;
    private final acti j;

    public gig(ViewStub viewStub, final gfu gfuVar, final acti actiVar) {
        this.j = actiVar;
        viewStub.setLayoutResource(R.layout.web_view_bottom_sheet_header);
        View inflate = viewStub.inflate();
        this.a = inflate;
        inflate.findViewById(R.id.close_button).setOnClickListener(new View.OnClickListener() { // from class: gid
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gig.this.d.b(view);
            }
        });
        inflate.findViewById(R.id.open_in_browser_button).setOnClickListener(new View.OnClickListener() { // from class: gif
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gig gigVar = gig.this;
                actiVar.H(3, new acte(actj.SEARCH_BOTTOM_SHEET_WEB_VIEW_OPEN_IN_EXTERNAL_BROWSER_BUTTON), null);
                gigVar.d.b(view);
                eog.g(gigVar.a.getContext(), Uri.parse(gigVar.b));
            }
        });
        inflate.findViewById(R.id.overflow_menu).setOnClickListener(new View.OnClickListener() { // from class: gie
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gig gigVar = gig.this;
                gigVar.e = new xj(new ack(gigVar.a.getContext(), gfuVar.a() == gfs.LIGHT ? 2132083268 : 2132083267), view);
                xj xjVar = gigVar.e;
                new rl(xjVar.a).inflate(R.menu.web_view_title_overflow_menu, xjVar.b);
                gigVar.e.d = gigVar;
                if (!gigVar.c.canGoBack()) {
                    gigVar.b(gigVar.e.b.findItem(R.id.back_button));
                }
                if (!gigVar.c.canGoForward()) {
                    gigVar.b(gigVar.e.b.findItem(R.id.forward_button));
                }
                gigVar.e.a();
            }
        });
        this.f = (TextView) inflate.findViewById(R.id.webview_title);
        TextView textView = (TextView) inflate.findViewById(R.id.webview_url);
        this.g = textView;
        textView.setTextColor(zhn.d(textView.getContext(), R.attr.ytTextSecondary));
        this.i = inflate.findViewById(R.id.not_secured_icon);
        this.h = inflate.findViewById(R.id.secured_icon);
        actiVar.n(new acte(actj.SEARCH_BOTTOM_SHEET_WEB_VIEW_BACK_BUTTON));
        actiVar.n(new acte(actj.SEARCH_BOTTOM_SHEET_WEB_VIEW_FORWARD_BUTTON));
        actiVar.n(new acte(actj.SEARCH_BOTTOM_SHEET_WEB_VIEW_REFRESH_BUTTON));
        actiVar.n(new acte(actj.SEARCH_BOTTOM_SHEET_WEB_VIEW_OPEN_IN_EXTERNAL_BROWSER_BUTTON));
    }

    @Override // defpackage.xi
    public final boolean a(MenuItem menuItem) {
        int i = ((si) menuItem).a;
        if (i == R.id.back_button) {
            this.j.H(3, new acte(actj.SEARCH_BOTTOM_SHEET_WEB_VIEW_BACK_BUTTON), null);
            this.c.goBack();
            return true;
        } else if (i == R.id.forward_button) {
            this.j.H(3, new acte(actj.SEARCH_BOTTOM_SHEET_WEB_VIEW_FORWARD_BUTTON), null);
            this.c.goForward();
            return true;
        } else if (i != R.id.refresh_button) {
            return false;
        } else {
            this.j.H(3, new acte(actj.SEARCH_BOTTOM_SHEET_WEB_VIEW_REFRESH_BUTTON), null);
            this.c.reload();
            return true;
        }
    }

    public final void b(MenuItem menuItem) {
        menuItem.setEnabled(false);
        SpannableString spannableString = new SpannableString(menuItem.getTitle());
        spannableString.setSpan(new ForegroundColorSpan(zhn.d(this.a.getContext(), R.attr.ytIconDisabled)), 0, spannableString.length(), 0);
        menuItem.setTitle(spannableString);
    }

    public final void c(WebView webView, String str) {
        this.b = str;
        this.c = webView;
        this.f.setText(webView.getTitle());
        this.g.setText(str);
        boolean contains = str.contains("https://");
        zag.o(this.h, contains);
        zag.o(this.i, !contains);
        this.a.requestLayout();
    }
}
