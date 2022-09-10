package defpackage;

import android.app.Application;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: ckth  reason: default package */
/* loaded from: classes4.dex */
public final class ckth {
    @dzsi
    public final GoogleApiClient a;
    private final GoogleApiClient.OnConnectionFailedListener b;

    public ckth(Application application) {
        cktg cktgVar = new cktg();
        this.b = cktgVar;
        btsm b = btsm.b(application);
        if (b == null) {
            this.a = null;
            return;
        }
        b.g(cool.c);
        b.h(new cktf());
        b.i(cktgVar);
        GoogleApiClient e = b.e();
        this.a = e;
        e.connect();
    }
}
