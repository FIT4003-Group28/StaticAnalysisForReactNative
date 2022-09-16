package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: lv  reason: default package */
/* loaded from: classes7.dex */
public abstract class lv extends Binder implements lw {
    public lv() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        Bundle bundle = null;
        ParcelableVolumeInfo parcelableVolumeInfo = null;
        Bundle bundle2 = null;
        CharSequence charSequence = null;
        MediaMetadataCompat mediaMetadataCompat = null;
        PlaybackStateCompat playbackStateCompat = null;
        switch (i) {
            case 1:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                a(readString, bundle);
                return true;
            case 2:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                b();
                return true;
            case 3:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                    playbackStateCompat = PlaybackStateCompat.CREATOR.createFromParcel(parcel);
                }
                c(playbackStateCompat);
                return true;
            case 4:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                    mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                }
                d(mediaMetadataCompat);
                return true;
            case 5:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                e(parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR));
                return true;
            case 6:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                    charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                }
                f(charSequence);
                return true;
            case 7:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                    bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                g(bundle2);
                return true;
            case 8:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                    parcelableVolumeInfo = ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                }
                h(parcelableVolumeInfo);
                return true;
            case 9:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                i(parcel.readInt());
                return true;
            case 10:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readInt();
                return true;
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                j(parcel.readInt() != 0);
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                k(parcel.readInt());
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                l();
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
