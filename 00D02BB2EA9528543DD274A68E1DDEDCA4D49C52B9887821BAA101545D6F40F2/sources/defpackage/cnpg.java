package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import defpackage.cnnq;
import defpackage.cnom;
/* compiled from: PG */
/* renamed from: cnpg  reason: default package */
/* loaded from: classes.dex */
public abstract class cnpg<R extends cnom, A extends cnnq> extends BasePendingResult<R> implements cnph<R> {
    public final cnnr<A> b;
    public final Api<?> c;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public cnpg(cnnr<A> cnnrVar, GoogleApiClient googleApiClient) {
        super(googleApiClient);
        cnwc.n(googleApiClient, "GoogleApiClient must not be null");
        cnwc.a(cnnrVar);
        this.b = cnnrVar;
        this.c = null;
    }

    private final void a(RemoteException remoteException) {
        m(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    protected abstract void b(A a);

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ void c(Object obj) {
        super.p((cnom) obj);
    }

    public final void l(A a) {
        try {
            b((cnpg<R, A>) a);
        } catch (DeadObjectException e) {
            a(e);
            throw e;
        } catch (RemoteException e2) {
            a(e2);
        }
    }

    public final void m(Status status) {
        cnwc.e(!status.d(), "Failed result must not be success");
        p(d(status));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnpg(Api<?> api, GoogleApiClient googleApiClient) {
        super(googleApiClient);
        cnwc.n(googleApiClient, "GoogleApiClient must not be null");
        cnwc.n(api, "Api must not be null");
        this.b = (cnnr<A>) api.getClientKey();
        this.c = api;
    }
}
