package defpackage;

import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
/* compiled from: PG */
/* renamed from: aoln  reason: default package */
/* loaded from: classes2.dex */
public final class aoln extends ges {
    public cqkj a;
    public dzsj<efg> b;
    public bvvq c;
    public Application d;
    public aolm e;
    private aoll f;

    public static aoln g(String str) {
        aoln aolnVar = new aoln();
        Bundle bundle = new Bundle();
        bundle.putString("ReceiptsWebviewFragment.WebViewUrl", str);
        aolnVar.B(bundle);
        return aolnVar;
    }

    @Override // defpackage.ges
    protected final void Nv() {
        ((aolo) btsx.b(aolo.class, this)).ca(this);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((bvuh) this.c).b = R();
        cqkf c = this.a.c(new aolh(), null);
        String string = this.o.getString("ReceiptsWebviewFragment.WebViewUrl");
        dbsk.s(string);
        aolm aolmVar = this.e;
        Application application = this.d;
        dkyw bZ = dkyx.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkyx.b((dkyx) bZ.b);
        dkyx bK = bZ.bK();
        bvxn bZ2 = bvxu.A.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        bvxu bvxuVar = (bvxu) bZ2.b;
        bvxuVar.a |= 16;
        bvxuVar.f = 1;
        bvxp f = bvoa.f(ibm.b(), application);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        bvxu bvxuVar2 = (bvxu) bZ2.b;
        f.getClass();
        bvxuVar2.x = f;
        int i = bvxuVar2.a | 4194304;
        bvxuVar2.a = i;
        int i2 = i | 4;
        bvxuVar2.a = i2;
        bvxuVar2.d = true;
        bvxuVar2.a = i2 | 8;
        bvxuVar2.e = true;
        bvxu.b(bvxuVar2);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        bvxu bvxuVar3 = (bvxu) bZ2.b;
        bK.getClass();
        bvxuVar3.j = bK;
        bvxuVar3.a |= 256;
        bvxu.d(bvxuVar3);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        bvxu.c((bvxu) bZ2.b);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        bvxu bvxuVar4 = (bvxu) bZ2.b;
        string.getClass();
        int i3 = bvxuVar4.a | 1;
        bvxuVar4.a = i3;
        bvxuVar4.b = string;
        bvxuVar4.a = i3 | 64;
        bvxuVar4.h = "aGMM.Timeline.Receipts";
        bvvr e = bvvs.e();
        e.b(bZ2.bK());
        bvvs a = e.a();
        bvvq a2 = aolmVar.a.a();
        aolm.a(a2, 1);
        cqhn a3 = aolmVar.b.a();
        aolm.a(a3, 2);
        gga a4 = aolmVar.c.a();
        aolm.a(a4, 3);
        btvo a5 = aolmVar.d.a();
        aolm.a(a5, 4);
        afha a6 = aolmVar.e.a();
        aolm.a(a6, 5);
        anhg a7 = aolmVar.f.a();
        aolm.a(a7, 6);
        btrm a8 = aolmVar.g.a();
        aolm.a(a8, 7);
        aolm.a(a, 8);
        aoll aollVar = new aoll(a2, a3, a4, a5, a6, a7, a8, a);
        this.f = aollVar;
        c.e(aollVar);
        return c.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        super.am();
        ((bvuh) this.c).b = null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [bwce, bvxh] */
    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        ?? g;
        bvuh bvuhVar = (bvuh) this.c;
        WebView webView = null;
        if (bvuhVar.c.a() && !bvuhVar.c.b().c && (g = bvuhVar.c.b().g()) != 0) {
            webView = g.e();
        }
        if (webView == null || !webView.canGoBack()) {
            dbsk.s(this.f);
            this.f.c();
            return true;
        }
        webView.goBack();
        return true;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.w(this.P);
        egjVar.e(this);
        egjVar.F(null);
        egjVar.j(false);
        this.b.a().a(egjVar.a());
    }
}
