package defpackage;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
/* compiled from: PG */
/* renamed from: cnyj  reason: default package */
/* loaded from: classes5.dex */
public final class cnyj {
    public static final Api<cmuz> a;

    static {
        cnoa<cnyz> cnoaVar = cmuy.a;
        a = cmuy.b;
    }

    @Deprecated
    public static cnoh<Status> a(GoogleApiClient googleApiClient, cnyf cnyfVar) {
        cnwc.a(cnyfVar);
        cnyi cnyiVar = new cnyi(googleApiClient, cnyfVar);
        googleApiClient.enqueue(cnyiVar);
        return cnyiVar;
    }

    @Deprecated
    public static WriteBatchImpl b() {
        return new WriteBatchImpl();
    }

    @Deprecated
    public static cnoh<cnyk> c(GoogleApiClient googleApiClient, ContextDataFilterImpl contextDataFilterImpl) {
        cnyg cnygVar = new cnyg(googleApiClient, contextDataFilterImpl);
        googleApiClient.enqueue(cnygVar);
        return cnygVar;
    }

    @Deprecated
    public static cnoh<Status> d(GoogleApiClient googleApiClient, ContextDataFilterImpl contextDataFilterImpl, cnyf cnyfVar) {
        cnwc.a(cnyfVar);
        cnyh cnyhVar = new cnyh(googleApiClient, contextDataFilterImpl, cnyfVar);
        googleApiClient.enqueue(cnyhVar);
        return cnyhVar;
    }
}
