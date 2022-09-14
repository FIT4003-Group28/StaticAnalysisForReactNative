package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: crns  reason: default package */
/* loaded from: classes5.dex */
final class crns {
    GoogleApiClient.Builder a;
    final /* synthetic */ Context b;

    public crns(Context context) {
        this.b = context;
        this.a = new GoogleApiClient.Builder(context);
    }

    public final void a(Api<? extends cnnw> api) {
        GoogleApiClient.Builder builder = this.a;
        builder.addApi(api);
        this.a = builder;
    }
}
