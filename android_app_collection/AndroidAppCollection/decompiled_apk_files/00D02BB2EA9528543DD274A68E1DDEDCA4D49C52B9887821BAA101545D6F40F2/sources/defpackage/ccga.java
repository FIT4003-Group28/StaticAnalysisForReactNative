package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gmm.ugc.interstitial.UgcInterstitialWebViewCallbacks;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: ccga  reason: default package */
/* loaded from: classes.dex */
public final class ccga extends afhx {
    public static final dbsl<afga> a = ccfz.a;
    private final bvvw b;
    private final btvo c;
    private final ccgo d;
    private final ccgp e;
    private final cfrt i;
    private final chnm j;
    private final auhi k;

    public ccga(Intent intent, @dzsi String str, bvvw bvvwVar, btvo btvoVar, ccgo ccgoVar, ccgp ccgpVar, cfrt cfrtVar, chnm chnmVar, auhi auhiVar) {
        super(intent, str, afid.UGC_INTERSTITIAL_WEB_VIEW);
        this.b = bvvwVar;
        this.c = btvoVar;
        this.d = ccgoVar;
        this.e = ccgpVar;
        this.i = cfrtVar;
        this.j = chnmVar;
        this.k = auhiVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        String path;
        ccgq e;
        Uri data = this.f.getData();
        if (data == null || (path = data.getPath()) == null) {
            return;
        }
        ccgo ccgoVar = this.d;
        ((ckhe) ccgoVar.e.a(ckko.a)).a();
        cjrc r = ccgoVar.d.r(ccgoVar.a);
        String lowerCase = path.toLowerCase(Locale.ROOT);
        String valueOf = String.valueOf(ccgoVar.b.getUgcParameters().aF());
        if (lowerCase.equals(valueOf.length() != 0 ? "/local/ugc/interstitial".concat(valueOf) : new String("/local/ugc/interstitial"))) {
            e = ccgq.e(dtxy.ck, dtxy.cm, dtxy.cn, dtxy.cl);
        } else {
            String valueOf2 = String.valueOf(ccgoVar.b.getUgcParameters().aG());
            if (lowerCase.equals(valueOf2.length() != 0 ? "/local/ugc/interstitial".concat(valueOf2) : new String("/local/ugc/interstitial"))) {
                e = ccgq.e(dtya.dD, dtya.dF, dtya.dG, dtya.dE);
            } else {
                String valueOf3 = String.valueOf(ccgoVar.b.getUgcParameters().aH());
                if (lowerCase.equals(valueOf3.length() != 0 ? "/local/ugc/interstitial".concat(valueOf3) : new String("/local/ugc/interstitial"))) {
                    e = ccgq.e(dtxs.c, dtxs.e, dtxs.f, dtxs.d);
                } else {
                    String valueOf4 = String.valueOf(ccgoVar.b.getUgcParameters().aI());
                    e = lowerCase.equals(valueOf4.length() != 0 ? "/local/ugc/interstitial".concat(valueOf4) : new String("/local/ugc/interstitial")) ? ccgq.e(dtyd.n, dtyd.p, dtyd.q, dtyd.o) : null;
                }
            }
        }
        ccgoVar.g = e;
        if (ccgoVar.g != null) {
            ccgoVar.f = ccgoVar.c.e(r, ccgoVar.a);
        }
        if (this.j.s()) {
            if (this.i.b()) {
                this.i.a();
            }
            Integer l = this.k.l(this.f);
            this.j.j(null, null, l == null ? null : dpyv.b(l.intValue()), null);
        }
        ccgp ccgpVar = this.e;
        ccgo ccgoVar2 = this.d;
        Intent intent = this.f;
        ccgp.a(ccgoVar2, 1);
        ccgp.a(intent, 2);
        gga a2 = ccgpVar.a.a();
        ccgp.a(a2, 3);
        ccgn a3 = ccgpVar.b.a();
        ccgp.a(a3, 4);
        UgcInterstitialWebViewCallbacks ugcInterstitialWebViewCallbacks = new UgcInterstitialWebViewCallbacks(ccgoVar2, intent, a2, a3);
        bvvw bvvwVar = this.b;
        String uri = data.toString();
        bvxn bZ = bvxu.A.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar = (bvxu) bZ.b;
        uri.getClass();
        int i = bvxuVar.a | 1;
        bvxuVar.a = i;
        bvxuVar.b = uri;
        int i2 = i | 4;
        bvxuVar.a = i2;
        bvxuVar.d = true;
        bvxuVar.a = i2 | 32;
        bvxuVar.g = true;
        bvxu.b(bvxuVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar2 = (bvxu) bZ.b;
        int i3 = bvxuVar2.a | 64;
        bvxuVar2.a = i3;
        bvxuVar2.h = "aGMM.UgcInterstitial";
        bvxuVar2.a = i3 | 8;
        bvxuVar2.e = true;
        dkyx dkyxVar = this.c.getEnableFeatureParameters().at;
        if (dkyxVar == null) {
            dkyxVar = dkyx.f;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar3 = (bvxu) bZ.b;
        dkyxVar.getClass();
        bvxuVar3.j = dkyxVar;
        bvxuVar3.a |= 256;
        bvvwVar.j(bZ.bK(), ugcInterstitialWebViewCallbacks, dtyd.v);
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    @dzsi
    public final durz c() {
        return null;
    }
}
