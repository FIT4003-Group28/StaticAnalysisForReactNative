package com.google.android.apps.youtube.embeddedplayer.service.innertube.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import com.google.android.apps.youtube.embeddedplayer.service.model.AdEventData;
import com.google.android.apps.youtube.embeddedplayer.service.model.BitmapKey;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupportedDataWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.model.ErrorData;
import com.google.android.apps.youtube.embeddedplayer.service.model.FragmentKeyData;
import com.google.android.apps.youtube.embeddedplayer.service.model.HotConfigData;
import com.google.android.apps.youtube.embeddedplayer.service.model.IpcCompatiblePlaybackState;
import com.google.android.apps.youtube.embeddedplayer.service.model.MutedAutoplayState;
import com.google.android.apps.youtube.embeddedplayer.service.model.PlaybackEventData;
import com.google.android.apps.youtube.embeddedplayer.service.model.PlayerViewModeData;
import com.google.android.apps.youtube.embeddedplayer.service.model.RelatedVideoItem;
import com.google.android.apps.youtube.embeddedplayer.service.model.RelatedVideosScreen;
import com.google.android.apps.youtube.embeddedplayer.service.model.RemoteEmbedExceptionData;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import com.google.android.apps.youtube.embeddedplayer.service.model.b;
import com.google.android.apps.youtube.embeddedplayer.service.model.e;
import com.google.android.apps.youtube.embeddedplayer.service.model.h;
import com.google.android.apps.youtube.embeddedplayer.service.model.i;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.ArrayList;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public a() {
    }

    public a(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new CommandWrapper[i];
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                return new FancyDismissibleDialogRendererWrapper[i];
            case 3:
                return new PermissionsWrapper[i];
            case 4:
                return new PlayabilityStatusWrapper[i];
            case 5:
                return new PlayerErrorMessageRendererWrapper[i];
            case 6:
                return new AdEventData[i];
            case 7:
                return new BitmapKey[i];
            case 8:
                return new BusSupportedDataWrapper[i];
            case 9:
                return new ErrorData[i];
            case 10:
                return new FragmentKeyData[i];
            case 11:
                return new HotConfigData[i];
            case 12:
                return new IpcCompatiblePlaybackState[i];
            case 13:
                return new MutedAutoplayState[i];
            case 14:
                return new PlaybackEventData[i];
            case 15:
                return new PlayerViewModeData[i];
            case 16:
                return new RelatedVideoItem[i];
            case 17:
                return new RelatedVideosScreen[i];
            case 18:
                return new RemoteEmbedExceptionData[i];
            case 19:
                return new SelectableItemKey[i];
            default:
                return new SimplePlaybackDescriptor[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        amuk p;
        switch (this.a) {
            case 0:
                return new CommandWrapper(parcel);
            case 1:
                switch (parcel.readInt()) {
                    case 0:
                        return Tick.REMOTE_EMBED_COORDINATOR_INIT_START;
                    case 1:
                        return Tick.REMOTE_EMBED_COORDINATOR_INIT_END;
                    case 2:
                        return Tick.REMOTE_EMBEDDED_PLAYER_V2_SERVICE_INIT_START;
                    case 3:
                        return Tick.REMOTE_EMBEDDED_PLAYER_V2_SERVICE_INIT_END;
                    case 4:
                        return Tick.REMOTE_RECEIVES_REQUEST;
                    case 5:
                        return Tick.REMOTE_SENDS_MAIN_APP_REQUEST;
                    case 6:
                        return Tick.MAIN_APP_RECEIVES_REQUEST;
                    case 7:
                        return Tick.MAIN_APP_SENDS_PLAYER_REQUEST;
                    case 8:
                        return Tick.REMOTE_RECEIVES_PREVIEW_REQUEST;
                    case 9:
                        return Tick.MAIN_APP_SENDS_EMBEDDED_PLAYER_REQUEST;
                    case 10:
                        return Tick.MAIN_APP_RECEIVES_EMBEDDED_PLAYER_REQUEST;
                    default:
                        throw new IllegalArgumentException("Invalid id argument");
                }
            case 2:
                return new FancyDismissibleDialogRendererWrapper(parcel);
            case 3:
                return new PermissionsWrapper(parcel);
            case 4:
                return new PlayabilityStatusWrapper(parcel);
            case 5:
                return new PlayerErrorMessageRendererWrapper(parcel);
            case 6:
                com.google.android.apps.youtube.embeddedplayer.service.model.a c = AdEventData.c();
                c.c(parcel.readInt());
                c.b(parcel.readInt());
                c.a = parcel.readString();
                return c.a();
            case 7:
                return new BitmapKey(parcel.readInt(), parcel.readInt());
            case 8:
                String readString = parcel.readString();
                if (readString == null) {
                    throw new IllegalStateException("BusSupportedData type cannot be null");
                }
                return new BusSupportedDataWrapper((BusSupported$Data) b.a(readString).j.createFromParcel(parcel));
            case 9:
                return new ErrorData(parcel.readInt());
            case 10:
                e b = FragmentKeyData.b();
                String readString2 = parcel.readString();
                readString2.getClass();
                b.b(readString2);
                return b.a();
            case 11:
                return new HotConfigData((aqtp) zgd.J(parcel, aqtp.a));
            case 12:
                int readInt = parcel.readInt();
                boolean z = true;
                PlaybackStartDescriptor playbackStartDescriptor = parcel.readInt() == 1 ? (PlaybackStartDescriptor) parcel.readParcelable(PlaybackStartDescriptor.class.getClassLoader()) : null;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                return new IpcCompatiblePlaybackState(readInt, playbackStartDescriptor, z);
            case 13:
                return new MutedAutoplayState((SelectableItemKey) parcel.readParcelable(SelectableItemKey.class.getClassLoader()), (SelectableItemKey) parcel.readParcelable(SelectableItemKey.class.getClassLoader()), (SelectableItemKey) parcel.readParcelable(SelectableItemKey.class.getClassLoader()), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readInt());
            case 14:
                h g = PlaybackEventData.g();
                g.d(parcel.readInt());
                g.a = parcel.readString();
                g.e(parcel.readLong());
                g.c(parcel.readLong());
                g.b(parcel.readFloat());
                return g.a();
            case 15:
                return new PlayerViewModeData(parcel.readInt());
            case 16:
                i i = RelatedVideoItem.i();
                i.a = parcel.readString();
                i.b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                i.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                i.d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                i.e = (BitmapKey) parcel.readParcelable(BitmapKey.class.getClassLoader());
                i.f = (SelectableItemKey) parcel.readParcelable(SelectableItemKey.class.getClassLoader());
                i.g = (aoob) parcel.readSerializable();
                return i.a();
            case 17:
                CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                RelatedVideoItem[] relatedVideoItemArr = (RelatedVideoItem[]) parcel.createTypedArray(RelatedVideoItem.CREATOR);
                if (relatedVideoItemArr == null) {
                    p = amuk.o(new ArrayList());
                } else {
                    p = amuk.p(relatedVideoItemArr);
                }
                return new RelatedVideosScreen(charSequence, p);
            case 18:
                return new RemoteEmbedExceptionData(parcel);
            case 19:
                return new SelectableItemKey(parcel.readInt(), parcel.readInt());
            default:
                return new SimplePlaybackDescriptor(parcel);
        }
    }
}
