package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: coij  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class coij implements coht {
    public static final coht a = new coij();

    private coij() {
    }

    @Override // defpackage.coht
    public final IInterface a(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppJobService");
        if (queryLocalInterface instanceof coie) {
            return (coie) queryLocalInterface;
        }
        return new coid(iBinder);
    }
}
