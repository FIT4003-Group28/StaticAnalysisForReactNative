package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnyg  reason: default package */
/* loaded from: classes5.dex */
public final class cnyg extends cnyv {
    final /* synthetic */ ContextDataFilterImpl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnyg(GoogleApiClient googleApiClient, ContextDataFilterImpl contextDataFilterImpl) {
        super(googleApiClient);
        this.a = contextDataFilterImpl;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(cnyz cnyzVar) {
        cnyz cnyzVar2 = cnyzVar;
        ContextDataFilterImpl contextDataFilterImpl = this.a;
        cnyzVar2.K();
        cnzd cnzdVar = new cnzd(null, this, null, null);
        ContextManagerClientInfo contextManagerClientInfo = cnyzVar2.t;
        ((cnzi) cnyzVar2.L()).f(cnzdVar, contextManagerClientInfo.b, contextManagerClientInfo.a, contextManagerClientInfo.d, contextDataFilterImpl);
    }
}
