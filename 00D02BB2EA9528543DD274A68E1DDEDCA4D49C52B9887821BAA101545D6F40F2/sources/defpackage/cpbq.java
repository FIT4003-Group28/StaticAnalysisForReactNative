package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.internal.firstparty.GetActiveAccountRequest;
/* compiled from: PG */
/* renamed from: cpbq  reason: default package */
/* loaded from: classes5.dex */
public final class cpbq extends cnof<cnnw> {
    public cpbq(Context context) {
        super(context, (Api<cnnv>) cozu.b, cnnx.q, cnoe.a);
    }

    public final cnoh<cpbi> a() {
        GoogleApiClient googleApiClient = this.i;
        cpbh cpbhVar = new cpbh(googleApiClient);
        googleApiClient.enqueue(cpbhVar);
        return cpbhVar;
    }

    public final cpcq<AccountInfo> b() {
        cntc builder = cntd.builder();
        builder.a = new cnsr() { // from class: cpbn
            @Override // defpackage.cnsr
            public final void a(Object obj, Object obj2) {
                ((cpbb) ((cpbg) obj).L()).g(new GetActiveAccountRequest(), new cpbp((cpct) obj2));
            }
        };
        builder.c = 2117;
        return c(builder.a());
    }
}
