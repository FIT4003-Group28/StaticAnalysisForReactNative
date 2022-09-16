package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: PG */
/* renamed from: qeh  reason: default package */
/* loaded from: classes4.dex */
public final class qeh extends raf {
    public qeh() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // defpackage.raf
    protected final /* bridge */ /* synthetic */ Object c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (queryLocalInterface instanceof qdp) {
            return (qdp) queryLocalInterface;
        }
        return new qdp(iBinder);
    }
}
