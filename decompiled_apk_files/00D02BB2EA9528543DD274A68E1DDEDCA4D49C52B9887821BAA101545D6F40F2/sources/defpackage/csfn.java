package defpackage;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: csfn  reason: default package */
/* loaded from: classes5.dex */
public final class csfn extends Binder {
    private final Bundle a;

    public csfn(@dzsi Bitmap bitmap) {
        Bundle bundle = new Bundle();
        this.a = bundle;
        if (bitmap != null) {
            bundle.putParcelable("bitmap", bitmap);
        }
    }

    @Override // android.os.Binder
    protected final boolean onTransact(int i, Parcel parcel, @dzsi Parcel parcel2, int i2) {
        if (i == 1) {
            if (parcel2 != null) {
                parcel2.writeNoException();
                parcel2.writeBundle(this.a);
                return true;
            }
            i = 1;
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }
}
