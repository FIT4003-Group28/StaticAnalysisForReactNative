package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: cmtv  reason: default package */
/* loaded from: classes5.dex */
public final class cmtv {
    public static final /* synthetic */ int a = 0;

    static {
        new cnxf("GoogleSignInCommon", new String[0]);
    }

    public static void a(Context context) {
        cmtx.a(context).b();
        for (GoogleApiClient googleApiClient : GoogleApiClient.getAllClients()) {
            googleApiClient.maybeSignOut();
        }
        synchronized (cnrn.e) {
            if (cnrn.f != null) {
                cnrn cnrnVar = cnrn.f;
                cnrnVar.j.incrementAndGet();
                Handler handler = cnrnVar.n;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }
}
