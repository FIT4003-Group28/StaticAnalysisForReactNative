package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnyi  reason: default package */
/* loaded from: classes5.dex */
public final class cnyi extends cnyw {
    final /* synthetic */ cnyf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnyi(GoogleApiClient googleApiClient, cnyf cnyfVar) {
        super(googleApiClient);
        this.a = cnyfVar;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(cnyz cnyzVar) {
        cnyt cnytVar;
        cnyz cnyzVar2 = cnyzVar;
        cnyf cnyfVar = this.a;
        cnwc.b(true ^ (cnyfVar == null));
        cnyzVar2.K();
        if (cnyfVar != null) {
            cnytVar = cnyzVar2.Q().b.remove(cnyfVar);
            if (cnytVar == null) {
                c(new Status(0));
                return;
            }
        } else {
            cnytVar = null;
        }
        cnyt cnytVar2 = cnytVar;
        cnzd d = cnzd.d(this, new cnyy(cnytVar2));
        ContextManagerClientInfo contextManagerClientInfo = cnyzVar2.t;
        ((cnzi) cnyzVar2.L()).h(d, contextManagerClientInfo.b, contextManagerClientInfo.a, contextManagerClientInfo.d, cnytVar2);
    }
}
