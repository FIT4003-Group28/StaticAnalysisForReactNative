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
import java.lang.ref.WeakReference;
import java.util.List;
/* compiled from: PG */
/* renamed from: id  reason: default package */
/* loaded from: classes3.dex */
public class id extends Binder implements ie {
    private final WeakReference a;

    public id(ik ikVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(ikVar);
    }

    @Override // defpackage.ie
    public final void a(PlaybackStateCompat playbackStateCompat) {
        ik ikVar = (ik) this.a.get();
        if (ikVar != null) {
            ikVar.d(2, playbackStateCompat, null);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public void b(Bundle bundle) {
        ik ikVar = (ik) this.a.get();
        if (ikVar != null) {
            ikVar.d(7, bundle, null);
        }
    }

    public void c(MediaMetadataCompat mediaMetadataCompat) {
        ik ikVar = (ik) this.a.get();
        if (ikVar != null) {
            ikVar.d(3, mediaMetadataCompat, null);
        }
    }

    public void d(List list) {
        ik ikVar = (ik) this.a.get();
        if (ikVar != null) {
            ikVar.d(5, list, null);
        }
    }

    public void e(CharSequence charSequence) {
        ik ikVar = (ik) this.a.get();
        if (ikVar != null) {
            ikVar.d(6, charSequence, null);
        }
    }

    public void f() {
        ik ikVar = (ik) this.a.get();
        if (ikVar != null) {
            ikVar.d(8, null, null);
        }
    }

    public void g(ParcelableVolumeInfo parcelableVolumeInfo) {
        ik ikVar = (ik) this.a.get();
        if (ikVar != null) {
            ikVar.d(4, parcelableVolumeInfo != null ? new hx(parcelableVolumeInfo.b) : null, null);
        }
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
                ik ikVar = (ik) this.a.get();
                if (ikVar != null) {
                    ikVar.d(1, readString, bundle);
                }
                return true;
            case 2:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                f();
                return true;
            case 3:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                    playbackStateCompat = (PlaybackStateCompat) PlaybackStateCompat.CREATOR.createFromParcel(parcel);
                }
                a(playbackStateCompat);
                return true;
            case 4:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                    mediaMetadataCompat = (MediaMetadataCompat) MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                }
                c(mediaMetadataCompat);
                return true;
            case 5:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                d(parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR));
                return true;
            case 6:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                    charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                }
                e(charSequence);
                return true;
            case 7:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                    bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                b(bundle2);
                return true;
            case 8:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                    parcelableVolumeInfo = (ParcelableVolumeInfo) ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                }
                g(parcelableVolumeInfo);
                return true;
            case 9:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                int readInt = parcel.readInt();
                ik ikVar2 = (ik) this.a.get();
                if (ikVar2 != null) {
                    ikVar2.d(9, Integer.valueOf(readInt), null);
                }
                return true;
            case 10:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readInt();
                return true;
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                boolean z = parcel.readInt() != 0;
                ik ikVar3 = (ik) this.a.get();
                if (ikVar3 != null) {
                    ikVar3.d(11, Boolean.valueOf(z), null);
                }
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                int readInt2 = parcel.readInt();
                ik ikVar4 = (ik) this.a.get();
                if (ikVar4 != null) {
                    ikVar4.d(12, Integer.valueOf(readInt2), null);
                }
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                ik ikVar5 = (ik) this.a.get();
                if (ikVar5 != null) {
                    ikVar5.d(13, null, null);
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
