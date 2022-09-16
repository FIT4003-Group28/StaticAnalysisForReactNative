package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.player.Vss3ConfigModel;
import com.google.android.libraries.youtube.livechat.innertube.CreatorSupportPickerPanelWrapper;
import com.google.android.libraries.youtube.livechat.innertube.ProductPickerPanelWrapper;
import com.google.android.libraries.youtube.livecreation.controller.StreamConfig;
import com.google.android.libraries.youtube.livecreation.innertube.StreamMetadata;
import com.google.android.libraries.youtube.livecreation.ui.view.CameraStreamViewManager$CameraModelData;
import com.google.android.libraries.youtube.livecreation.ui.view.NetworkOperationView;
import com.google.android.libraries.youtube.logging.interaction.GelVisibilityUpdate;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.libraries.youtube.mdx.model.AppStatus;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import com.google.android.libraries.youtube.metadataeditor.geo.EditLocation;
import com.google.android.libraries.youtube.metadataeditor.geo.Place;
import com.google.android.libraries.youtube.offline.player.OfflinePlaybackTrackingPlaybackListener$State;
import com.google.android.libraries.youtube.player.audiofocus.PlaybackAudioManager$RestorableState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import com.google.android.libraries.youtube.player.modality.PlaybackModalityState;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: abjw  reason: default package */
/* loaded from: classes.dex */
public final class abjw implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public abjw() {
    }

    public abjw(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new CreatorSupportPickerPanelWrapper[i];
            case 1:
                return new Vss3ConfigModel[i];
            case 2:
                return new ProductPickerPanelWrapper[i];
            case 3:
                return new StreamConfig[i];
            case 4:
                return new StreamMetadata[i];
            case 5:
                return new CameraStreamViewManager$CameraModelData[i];
            case 6:
                return new NetworkOperationView.SavedState[i];
            case 7:
                return new GelVisibilityUpdate.HiddenVisibilityUpdate[i];
            case 8:
                return new GelVisibilityUpdate.ShownVisibilityUpdate[i];
            case 9:
                return new InteractionLoggingScreen[i];
            case 10:
                return new AppStatus[i];
            case 11:
                return new ScreenId[i];
            case 12:
                return new EditLocation.SavedState[i];
            case 13:
                return new Place[i];
            case 14:
                return new OfflinePlaybackTrackingPlaybackListener$State[i];
            case 15:
                return new PlaybackAudioManager$RestorableState[i];
            case 16:
                return new ControlsOverlayStyle[i];
            case 17:
                return new ControlsState[i];
            case 18:
                return new TimelineMarker[i];
            case 19:
                return new PlaybackModalityState[i];
            default:
                return new PlaybackStartDescriptor[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                return new CreatorSupportPickerPanelWrapper(parcel);
            case 1:
                return new Vss3ConfigModel((awcg) zgd.J(parcel, awcg.a));
            case 2:
                return new ProductPickerPanelWrapper(parcel);
            case 3:
                return new StreamConfig(parcel);
            case 4:
                return new StreamMetadata(parcel);
            case 5:
                return new CameraStreamViewManager$CameraModelData(parcel);
            case 6:
                return new NetworkOperationView.SavedState(parcel);
            case 7:
                return new GelVisibilityUpdate.HiddenVisibilityUpdate(parcel);
            case 8:
                return new GelVisibilityUpdate.ShownVisibilityUpdate(parcel);
            case 9:
                return new InteractionLoggingScreen(parcel);
            case 10:
                adhw c = AppStatus.c();
                c.e(parcel.readInt());
                c.a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
                c.c = parcel.readString();
                c.b = (ScreenId) parcel.readSerializable();
                c.f(parcel.readByte() == 1);
                c.d(parcel.readByte() == 1);
                if (parcel.readByte() != 1) {
                    z2 = false;
                }
                c.c(z2);
                int readInt = parcel.readInt();
                HashMap hashMap = new HashMap(readInt);
                for (int i = 0; i < readInt; i++) {
                    hashMap.put(parcel.readString(), parcel.readString());
                }
                c.b(hashMap);
                return c.a();
            case 11:
                return new ScreenId(parcel.readString());
            case 12:
                return new EditLocation.SavedState(parcel);
            case 13:
                return new Place(parcel);
            case 14:
                return new OfflinePlaybackTrackingPlaybackListener$State(parcel);
            case 15:
                return new PlaybackAudioManager$RestorableState(parcel);
            case 16:
                return new ControlsOverlayStyle(parcel);
            case 17:
                ahzb ahzbVar = ahzb.values()[parcel.readInt()];
                if (parcel.readByte() == 1) {
                    z = true;
                }
                return new ControlsState(ahzbVar, z);
            case 18:
                return new TimelineMarker(parcel.readLong(), parcel.readLong());
            case 19:
                return new PlaybackModalityState(parcel);
            default:
                byte[] createByteArray = parcel.createByteArray();
                String readString = parcel.readString();
                if (createByteArray == null) {
                    PlaybackStartDescriptor a = PlaybackStartDescriptor.d().a();
                    a.c = readString;
                    return a;
                }
                try {
                    aoos b = aoos.b();
                    aijl d = PlaybackStartDescriptor.d();
                    d.m = (ory) aopi.parseFrom(ory.a, createByteArray, b);
                    PlaybackStartDescriptor a2 = d.a();
                    a2.c = readString;
                    return a2;
                } catch (aopx unused) {
                    return PlaybackStartDescriptor.d().a();
                }
        }
    }
}
