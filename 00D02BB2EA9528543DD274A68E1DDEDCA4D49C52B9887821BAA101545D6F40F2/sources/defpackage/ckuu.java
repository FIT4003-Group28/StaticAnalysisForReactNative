package defpackage;

import android.app.Application;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: ckuu  reason: default package */
/* loaded from: classes4.dex */
public final class ckuu {
    @dzsi
    public final GoogleApiClient a;
    private final GoogleApiClient.ConnectionCallbacks b;
    private final GoogleApiClient.OnConnectionFailedListener c;

    public ckuu(Application application) {
        ckus ckusVar = new ckus();
        this.b = ckusVar;
        ckut ckutVar = new ckut();
        this.c = ckutVar;
        dbsk.s(application);
        btsm b = btsm.b(application);
        if (b == null) {
            this.a = null;
            return;
        }
        b.g(cpgr.a);
        b.h(ckusVar);
        b.i(ckutVar);
        GoogleApiClient e = b.e();
        this.a = e;
        e.connect();
    }
}
