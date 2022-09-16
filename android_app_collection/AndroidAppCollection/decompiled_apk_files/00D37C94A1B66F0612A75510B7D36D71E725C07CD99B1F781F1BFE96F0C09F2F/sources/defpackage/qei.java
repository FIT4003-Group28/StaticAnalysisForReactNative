package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: PG */
/* renamed from: qei  reason: default package */
/* loaded from: classes4.dex */
public final class qei extends raf {
    public qei() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // defpackage.raf
    protected final /* bridge */ /* synthetic */ Object c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        if (queryLocalInterface instanceof qdq) {
            return (qdq) queryLocalInterface;
        }
        return new qdq(iBinder);
    }
}
