package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: coim  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class coim implements coht {
    static final coht a = new coim();

    private coim() {
    }

    @Override // defpackage.coht
    public final IInterface a(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppTrainerCanceller");
        if (queryLocalInterface instanceof coig) {
            return (coig) queryLocalInterface;
        }
        return new coig(iBinder);
    }
}
