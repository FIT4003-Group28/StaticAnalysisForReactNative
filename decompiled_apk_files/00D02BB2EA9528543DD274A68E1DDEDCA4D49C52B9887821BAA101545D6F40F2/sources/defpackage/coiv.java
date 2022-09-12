package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: coiv  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class coiv implements coht {
    public static final coht a = new coiv();

    private coiv() {
    }

    @Override // defpackage.coht
    public final IInterface a(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppTrainingService");
        if (queryLocalInterface instanceof coii) {
            return (coii) queryLocalInterface;
        }
        return new coih(iBinder);
    }
}
