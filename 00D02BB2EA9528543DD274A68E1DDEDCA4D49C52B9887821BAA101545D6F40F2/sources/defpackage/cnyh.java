package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnyh  reason: default package */
/* loaded from: classes5.dex */
public final class cnyh extends cnyw {
    final /* synthetic */ cnyf a;
    final /* synthetic */ ContextDataFilterImpl k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnyh(GoogleApiClient googleApiClient, ContextDataFilterImpl contextDataFilterImpl, cnyf cnyfVar) {
        super(googleApiClient);
        this.k = contextDataFilterImpl;
        this.a = cnyfVar;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(cnyz cnyzVar) {
        cnyz cnyzVar2 = cnyzVar;
        ContextDataFilterImpl contextDataFilterImpl = this.k;
        cnyf cnyfVar = this.a;
        cnwc.b(true ^ (cnyfVar == null));
        cnyzVar2.K();
        cnzi cnziVar = (cnzi) cnyzVar2.L();
        cnyt cnytVar = null;
        cnzd d = cnzd.d(this, null);
        ContextManagerClientInfo contextManagerClientInfo = cnyzVar2.t;
        String str = contextManagerClientInfo.b;
        String str2 = contextManagerClientInfo.a;
        String str3 = contextManagerClientInfo.d;
        if (cnyfVar != null) {
            clcr<cnyf, cnyt> Q = cnyzVar2.Q();
            cnyt cnytVar2 = Q.b.get(cnyfVar);
            if (cnytVar2 == null) {
                cnyr cnyrVar = Q.c;
                cnyt cnytVar3 = new cnyt(cnyfVar, Q.a);
                Q.b.put(cnyfVar, cnytVar3);
                cnytVar2 = cnytVar3;
            }
            cnytVar = cnytVar2;
        }
        cnziVar.g(d, str, str2, str3, contextDataFilterImpl, cnytVar);
    }
}
