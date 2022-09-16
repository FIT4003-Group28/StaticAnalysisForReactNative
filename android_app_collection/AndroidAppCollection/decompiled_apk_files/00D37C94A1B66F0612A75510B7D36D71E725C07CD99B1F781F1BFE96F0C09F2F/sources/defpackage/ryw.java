package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: ryw  reason: default package */
/* loaded from: classes4.dex */
final class ryw implements ankb {
    final /* synthetic */ ryx a;

    public ryw(ryx ryxVar) {
        this.a = ryxVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        ((anav) ((anav) ((anav) ryx.e.g()).h(th)).i("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment$1", "onFailure", 232, "StreamlineFragment.java")).q("StreamlinedFragment: Failed to setup cookies.");
        this.a.ag.d(ryp.b(202));
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Set set = (Set) obj;
        ((anav) ryx.e.k().i("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment$1", "onSuccess", 226, "StreamlineFragment.java")).q("StreamlinedFragment: webView starts loading url");
        ryx ryxVar = this.a;
        ryxVar.ah.loadUrl(ryxVar.af);
    }
}
