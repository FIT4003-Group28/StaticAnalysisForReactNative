package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: PG */
/* renamed from: qfo  reason: default package */
/* loaded from: classes4.dex */
public final class qfo extends raf {
    public qfo() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // defpackage.raf
    protected final /* bridge */ /* synthetic */ Object c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof qfp) {
            return (qfp) queryLocalInterface;
        }
        return new qfp(iBinder);
    }
}
