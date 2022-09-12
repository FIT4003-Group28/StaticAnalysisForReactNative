package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: codb  reason: default package */
/* loaded from: classes5.dex */
public final class codb extends cnuw<codc> {
    public final Context a;

    public codb(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, cnum cnumVar) {
        super(context, looper, 29, cnumVar, connectionCallbacks, onConnectionFailedListener);
        this.a = context;
        cpkh.b(context);
    }

    @Override // defpackage.cnui
    public final Feature[] Sm() {
        return coco.b;
    }

    @Override // defpackage.cnui
    protected final String a() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final String b() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final int c() {
        return 11925000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final /* bridge */ /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
        return queryLocalInterface instanceof codc ? (codc) queryLocalInterface : new codc(iBinder);
    }
}
