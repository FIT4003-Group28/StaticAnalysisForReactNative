package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: cogd  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cogd implements coht {
    static final coht a = new cogd();

    private cogd() {
    }

    @Override // defpackage.coht
    public final IInterface a(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.IInAppExampleStoreProxy");
        if (queryLocalInterface instanceof cohp) {
            return (cohp) queryLocalInterface;
        }
        return new cohp(iBinder);
    }
}
