package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: coir  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class coir implements coht {
    static final coht a = new coir();

    private coir() {
    }

    @Override // defpackage.coht
    public final IInterface a(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppTrainer");
        if (queryLocalInterface instanceof coif) {
            return (coif) queryLocalInterface;
        }
        return new coif(iBinder);
    }
}
