package defpackage;

import android.os.Parcel;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.media.ImageHints;
/* compiled from: PG */
/* renamed from: qmx  reason: default package */
/* loaded from: classes4.dex */
public final class qmx extends dvd implements qmy {
    public qmx() {
        super("com.google.android.gms.cast.framework.media.IImagePicker");
    }

    @Override // defpackage.qmy
    public final rad a() {
        throw null;
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            MediaMetadata mediaMetadata = (MediaMetadata) dve.a(parcel, MediaMetadata.CREATOR);
            parcel.readInt();
            throw null;
        } else if (i == 2) {
            throw null;
        } else {
            if (i == 3) {
                parcel2.writeNoException();
                parcel2.writeInt(213380000);
                return true;
            } else if (i != 4) {
                return false;
            } else {
                MediaMetadata mediaMetadata2 = (MediaMetadata) dve.a(parcel, MediaMetadata.CREATOR);
                ImageHints imageHints = (ImageHints) dve.a(parcel, ImageHints.CREATOR);
                throw null;
            }
        }
    }
}
