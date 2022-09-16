package defpackage;

import android.webkit.JavascriptInterface;
/* compiled from: PG */
/* renamed from: aduu  reason: default package */
/* loaded from: classes.dex */
final class aduu {
    final /* synthetic */ aduv a;

    public aduu(aduv aduvVar) {
        this.a = aduvVar;
    }

    @JavascriptInterface
    public void consentFlowCompleted(boolean z) {
        acup b;
        if (z) {
            b = acuo.b(36385);
        } else {
            b = acuo.b(36386);
        }
        this.a.e.H(3, new acte(b), null);
        String str = true != z ? "denied" : "completed";
        aduv aduvVar = this.a;
        aduvVar.d.a(aduvVar.h, str);
        this.a.c(!z ? 1 : 0, null);
    }
}
