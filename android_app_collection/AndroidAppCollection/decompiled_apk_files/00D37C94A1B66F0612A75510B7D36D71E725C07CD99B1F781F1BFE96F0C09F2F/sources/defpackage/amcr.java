package defpackage;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.AccountActionResult;
import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: amcr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class amcr implements ampg {
    public final /* synthetic */ AccountId a;
    private final /* synthetic */ int b;

    public /* synthetic */ amcr(AccountId accountId) {
        this.a = accountId;
    }

    public /* synthetic */ amcr(AccountId accountId, int i) {
        this.b = i;
        this.a = accountId;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        int i = this.b;
        if (i == 0) {
            return amct.a(amct.b((amdp) obj, this.a));
        }
        boolean z = true;
        if (i == 1) {
            return new AccountActionResult(this.a, ambp.a, null, null);
        }
        if (i == 2) {
            int k = answ.k(amct.b((amdp) obj, this.a).e);
            if (k == 0 || k != 2) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        AccountId accountId = this.a;
        aopa mo52toBuilder = ((amdp) obj).mo52toBuilder();
        int a = accountId.a();
        Map unmodifiableMap = Collections.unmodifiableMap(((amdp) mo52toBuilder.instance).d);
        Integer valueOf = Integer.valueOf(a);
        if (unmodifiableMap.containsKey(valueOf)) {
            aopa mo52toBuilder2 = ((amds) unmodifiableMap.get(valueOf)).mo52toBuilder();
            mo52toBuilder2.copyOnWrite();
            amds amdsVar = (amds) mo52toBuilder2.instance;
            amdsVar.e = 1;
            amdsVar.b |= 4;
            mo52toBuilder.H(accountId.a(), (amds) mo52toBuilder2.mo39build());
            return (amdp) mo52toBuilder.mo39build();
        }
        throw new IllegalArgumentException();
    }
}
