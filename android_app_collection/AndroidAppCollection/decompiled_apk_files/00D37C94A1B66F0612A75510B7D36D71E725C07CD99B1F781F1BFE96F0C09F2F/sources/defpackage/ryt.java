package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: ryt  reason: default package */
/* loaded from: classes4.dex */
final class ryt implements ankb {
    final /* synthetic */ String a;
    final /* synthetic */ ryu b;

    public ryt(ryu ryuVar, String str) {
        this.b = ryuVar;
        this.a = str;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        ((anav) ((anav) ryu.e.k().h(th)).i("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment$1", "onFailure", 256, "DataUsageNoticeFragment.java")).q("DataUsageNoticeFragment: Failed to set up cookies.");
        this.b.ah.d(ryp.c(1, 402));
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Set set = (Set) obj;
        ((anav) ryu.e.k().i("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment$1", "onSuccess", 250, "DataUsageNoticeFragment.java")).q("DataUsageNoticeFragment: webview starts loading url.");
        this.b.ai.loadUrl(this.a);
    }
}
