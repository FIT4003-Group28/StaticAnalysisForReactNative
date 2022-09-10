package defpackage;

import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: byck  reason: default package */
/* loaded from: classes4.dex */
public final class byck extends ges {
    public efg a;
    public dxio<afha> b;
    @dzsi
    private String c;

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        gga ggaVar = this.aE;
        if (ggaVar != null) {
            ggaVar.finish();
            return false;
        }
        return false;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.c = this.o.getString("killSwitchContentUrl");
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        efg efgVar = this.a;
        egj egjVar = new egj(this);
        gga ggaVar = this.aE;
        dbsk.s(ggaVar);
        String str = this.c;
        dxio<afha> dxioVar = this.b;
        WebView webView = (WebView) ggaVar.getLayoutInflater().inflate(R.layout.terms_killswitch_page, (ViewGroup) null).findViewById(R.id.terms_killswitch_page);
        webView.setWebViewClient(new bvol(ggaVar, dxioVar));
        if (!dbsj.d(str)) {
            webView.loadUrl(str);
        }
        egjVar.w(webView);
        egjVar.ag(null);
        efgVar.a(egjVar.a());
    }
}
