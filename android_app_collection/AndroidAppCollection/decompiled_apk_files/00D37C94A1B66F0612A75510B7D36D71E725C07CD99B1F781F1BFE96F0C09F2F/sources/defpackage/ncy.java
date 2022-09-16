package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.ads.ui.webview.AdsInlineWebsite;
import com.google.android.youtube.R;
import java.net.MalformedURLException;
import java.net.URL;
/* compiled from: PG */
/* renamed from: ncy  reason: default package */
/* loaded from: classes3.dex */
public final class ncy implements ajru, xjr {
    public final Context a;
    public final aafo b;
    public final View c;
    public final AdsInlineWebsite d;
    public ajrs e;
    public apdr f;
    public acte g;
    public acte h;
    public acte i;
    public acte j;

    public ncy(Context context, aafo aafoVar, ViewGroup viewGroup) {
        this.a = context;
        this.b = aafoVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.ads_inline_website_view, viewGroup, false);
        this.c = inflate;
        AdsInlineWebsite adsInlineWebsite = (AdsInlineWebsite) inflate.findViewById(R.id.webview);
        this.d = adsInlineWebsite;
        adsInlineWebsite.a = this;
        inflate.findViewById(R.id.back).setOnClickListener(new ncx(this, 1));
        inflate.findViewById(R.id.open_in_new).setOnClickListener(new ncx(this, 2));
        inflate.findViewById(R.id.close).setOnClickListener(new ncx(this));
    }

    public static String d(String str) {
        try {
            URL url = new URL(str);
            String valueOf = String.valueOf(url.getHost());
            String valueOf2 = String.valueOf(url.getFile());
            str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        } catch (MalformedURLException unused) {
        }
        return str;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        apdr apdrVar = (apdr) obj;
        this.f = apdrVar;
        this.e = ajrsVar;
        this.d.loadUrl(apdrVar.d);
        ((TextView) this.c.findViewById(R.id.headline)).setText(this.f.e);
        this.g = new acte(this.f.c);
        this.h = new acte(actj.ADS_INLINE_WEBSITE_OPEN_IN_NEW_BUTTON);
        this.i = new acte(actj.ADS_INLINE_WEBSITE_BACK_BUTTON);
        this.j = new acte(actj.ADS_INLINE_WEBSITE_CLOSE_BUTTON);
        this.e.a.D(this.h);
        this.e.a.D(this.i);
        this.e.a.D(this.j);
        this.e.a.u(this.g, null);
        this.e.a.u(this.h, null);
        this.e.a.u(this.i, null);
        this.e.a.u(this.j, null);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.d.loadUrl("about:blank");
        this.d.clearHistory();
        this.e.a.q(this.g, null);
        this.e.a.q(this.i, null);
        this.e.a.q(this.h, null);
        this.e.a.q(this.j, null);
    }
}
