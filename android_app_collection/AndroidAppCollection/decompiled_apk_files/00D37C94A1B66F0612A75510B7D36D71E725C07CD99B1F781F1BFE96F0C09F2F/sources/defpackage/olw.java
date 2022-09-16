package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.webviewfallback.WebViewFallbackActivity;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: olw  reason: default package */
/* loaded from: classes3.dex */
public final class olw implements abv {
    final /* synthetic */ olx a;

    public olw(olx olxVar) {
        this.a = olxVar;
    }

    @Override // defpackage.abv
    public final void a(Context context) {
        olx olxVar = this.a;
        if (!olxVar.a) {
            olxVar.a = true;
            Object lI = olxVar.lI();
            WebViewFallbackActivity webViewFallbackActivity = (WebViewFallbackActivity) olxVar;
            dwq dwqVar = (dwq) lI;
            webViewFallbackActivity.c = dwqVar.o();
            webViewFallbackActivity.d = (olz) dwqVar.kD.get();
            webViewFallbackActivity.e = (omh) dwqVar.kE.get();
            webViewFallbackActivity.f = (omn) dwqVar.kK.get();
            webViewFallbackActivity.g = (omq) dwqVar.kI.get();
            webViewFallbackActivity.n = (vzc) dwqVar.a.hY.get();
            webViewFallbackActivity.h = (afvn) dwqVar.a.au.get();
            webViewFallbackActivity.i = (onb) dwqVar.kL.get();
            webViewFallbackActivity.j = (ScheduledExecutorService) dwqVar.a.h.get();
            webViewFallbackActivity.k = gad.q();
            webViewFallbackActivity.l = dwqVar.kM;
            webViewFallbackActivity.m = (Executor) dwqVar.a.x.get();
        }
    }
}
