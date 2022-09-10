package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
/* compiled from: PG */
/* renamed from: cnzp  reason: default package */
/* loaded from: classes5.dex */
public final class cnzp extends cnyw {
    final /* synthetic */ WriteBatchImpl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnzp(WriteBatchImpl writeBatchImpl, GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.a = writeBatchImpl;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(cnyz cnyzVar) {
        cnyz cnyzVar2 = cnyzVar;
        WriteBatchImpl writeBatchImpl = this.a;
        cnyzVar2.K();
        cnzd cnzdVar = new cnzd(null, null, new cnyx(writeBatchImpl, this), null);
        ContextManagerClientInfo contextManagerClientInfo = cnyzVar2.t;
        ((cnzi) cnyzVar2.L()).e(cnzdVar, contextManagerClientInfo.b, contextManagerClientInfo.a, contextManagerClientInfo.d, writeBatchImpl);
    }
}
