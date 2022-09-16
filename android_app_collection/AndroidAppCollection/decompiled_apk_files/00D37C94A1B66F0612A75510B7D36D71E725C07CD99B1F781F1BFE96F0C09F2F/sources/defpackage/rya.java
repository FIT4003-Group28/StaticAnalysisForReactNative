package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.libraries.accountlinking.activity.AccountLinkingActivity;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: rya  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class rya implements u {
    public final /* synthetic */ AccountLinkingActivity a;
    private final /* synthetic */ int b;

    public /* synthetic */ rya(AccountLinkingActivity accountLinkingActivity) {
        this.a = accountLinkingActivity;
    }

    public /* synthetic */ rya(AccountLinkingActivity accountLinkingActivity, int i) {
        this.b = i;
        this.a = accountLinkingActivity;
    }

    @Override // defpackage.u
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            AccountLinkingActivity accountLinkingActivity = this.a;
            if (((Boolean) obj).booleanValue()) {
                CircularProgressIndicator circularProgressIndicator = accountLinkingActivity.c;
                if (circularProgressIndicator.c > 0) {
                    circularProgressIndicator.removeCallbacks(circularProgressIndicator.h);
                    circularProgressIndicator.postDelayed(circularProgressIndicator.h, circularProgressIndicator.c);
                    return;
                }
                circularProgressIndicator.h.run();
                return;
            }
            CircularProgressIndicator circularProgressIndicator2 = accountLinkingActivity.c;
            if (circularProgressIndicator2.getVisibility() != 0) {
                circularProgressIndicator2.removeCallbacks(circularProgressIndicator2.h);
                return;
            }
            circularProgressIndicator2.removeCallbacks(circularProgressIndicator2.i);
            long uptimeMillis = SystemClock.uptimeMillis() - circularProgressIndicator2.e;
            long j = circularProgressIndicator2.d;
            if (uptimeMillis < j) {
                circularProgressIndicator2.postDelayed(circularProgressIndicator2.i, j - uptimeMillis);
            } else {
                circularProgressIndicator2.i.run();
            }
        } else if (i == 1) {
            AccountLinkingActivity accountLinkingActivity2 = this.a;
            ryi ryiVar = (ryi) obj;
            ((anav) AccountLinkingActivity.a.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "lambda$onCreate$2", 138, "AccountLinkingActivity.java")).q("Setting activity result and finishing AccountLinkingActivity");
            accountLinkingActivity2.setResult(ryiVar.a, ryiVar.b);
            accountLinkingActivity2.b();
        } else {
            AccountLinkingActivity accountLinkingActivity3 = this.a;
            List list = (List) obj;
            ryl rylVar = accountLinkingActivity3.b;
            ArrayList arrayList = new ArrayList();
            aofl aoflVar = rylVar.k.g;
            if (aoflVar == null) {
                aoflVar = aofl.a;
            }
            aopu aopuVar = aoflVar.b;
            if (list.contains(rxw.LINKING_INFO)) {
                arrayList.add((String) amtf.d(aopuVar).c(mem.o).f(meo.t).a().c());
            }
            if (list.contains(rxw.CAPABILITY_CONSENT)) {
                arrayList.add((String) amtf.d(aopuVar).c(mem.p).f(meo.t).a().c());
            }
            ((anav) AccountLinkingActivity.a.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "createDataUsageNoticeFragment", 236, "AccountLinkingActivity.java")).s("urls passed to dataUsageNotice %s ", arrayList);
            Account account = rylVar.c;
            ryu ryuVar = new ryu();
            Bundle bundle = new Bundle();
            bundle.putParcelable("account", account);
            bundle.putStringArray("data_usage_notice_urls", (String[]) arrayList.toArray(new String[0]));
            ryuVar.ae(bundle);
            accountLinkingActivity3.a(ryuVar, true);
            ((anav) AccountLinkingActivity.a.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "lambda$onCreate$1", 131, "AccountLinkingActivity.java")).s("Starting data usage notice fragment \"%s\"", list);
        }
    }
}
