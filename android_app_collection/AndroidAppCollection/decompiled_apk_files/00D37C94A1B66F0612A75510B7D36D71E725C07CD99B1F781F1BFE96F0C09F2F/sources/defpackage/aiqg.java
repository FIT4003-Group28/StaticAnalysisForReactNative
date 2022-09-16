package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
import com.google.android.libraries.youtube.player.sequencer.navigation.AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState;
import com.google.android.libraries.youtube.player.sequencer.navigation.VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState;
import com.google.android.libraries.youtube.player.sequencer.state.OmegaSequencerState;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
import com.google.android.libraries.youtube.player.stats.HeartbeatClient$HeartbeatClientState;
import com.google.android.libraries.youtube.player.stats.PlaybackClientManager$State;
import com.google.android.libraries.youtube.player.stats.PlaybackTrackingUrlPingClient$PlaybackTrackingUrlPingClientState;
import com.google.android.libraries.youtube.player.stats.VideoStats2Client$VideoStats2ClientState;
import com.google.android.libraries.youtube.player.stats.VideoStats3Client$VideoStats3ClientState;
import com.google.android.libraries.youtube.player.stats.attestation.AttestationClient$AttestationClientState;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSnapshot;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import com.google.android.libraries.youtube.player.video.state.DirectorSavedState;
import com.google.android.libraries.youtube.player.video.state.PlaybackListenerStateRestorerState;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.libraries.youtube.upload.util.UploadThumbnailHelper$ThumbnailFileInfo;
import com.google.android.play.core.review.ReviewInfo;
/* compiled from: PG */
/* renamed from: aiqg  reason: default package */
/* loaded from: classes.dex */
public final class aiqg implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public aiqg() {
    }

    public aiqg(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState[i];
            case 1:
                return new WatchDescriptor[i];
            case 2:
                return new VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState[i];
            case 3:
                return new OmegaSequencerState[i];
            case 4:
                return new PlaybackServiceState[i];
            case 5:
                return new HeartbeatClient$HeartbeatClientState[i];
            case 6:
                return new PlaybackClientManager$State[i];
            case 7:
                return new PlaybackTrackingUrlPingClient$PlaybackTrackingUrlPingClientState[i];
            case 8:
                return new VideoStats2Client$VideoStats2ClientState[i];
            case 9:
                return new VideoStats3Client$VideoStats3ClientState[i];
            case 10:
                return new AttestationClient$AttestationClientState[i];
            case 11:
                return new SubtitleTrack[i];
            case 12:
                return new SubtitleWindowSettings[i];
            case 13:
                return new SubtitleWindowSnapshot[i];
            case 14:
                return new SubtitlesStyle[i];
            case 15:
                return new DirectorSavedState[i];
            case 16:
                return new PlaybackListenerStateRestorerState[i];
            case 17:
                return new ParcelableMessageLite[i];
            case 18:
                return new PermissionDescriptor[i];
            case 19:
                return new UploadThumbnailHelper$ThumbnailFileInfo[0];
            default:
                return new ReviewInfo[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState(parcel);
            case 1:
                byte[] createByteArray = parcel.createByteArray();
                if (createByteArray == null) {
                    return new WatchDescriptor(osb.a.createBuilder());
                }
                try {
                    return new WatchDescriptor(((osb) aopi.parseFrom(osb.a, createByteArray, aoos.b())).mo52toBuilder());
                } catch (aopx unused) {
                    return new WatchDescriptor(osb.a.createBuilder());
                }
            case 2:
                return new VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState(parcel);
            case 3:
                return new OmegaSequencerState(parcel);
            case 4:
                return new PlaybackServiceState(parcel);
            case 5:
                return new HeartbeatClient$HeartbeatClientState(parcel);
            case 6:
                return new PlaybackClientManager$State(parcel);
            case 7:
                return new PlaybackTrackingUrlPingClient$PlaybackTrackingUrlPingClientState(parcel);
            case 8:
                return new VideoStats2Client$VideoStats2ClientState(parcel);
            case 9:
                return new VideoStats3Client$VideoStats3ClientState(parcel);
            case 10:
                return new AttestationClient$AttestationClientState(parcel);
            case 11:
                aiyg m = SubtitleTrack.m();
                String readString = parcel.readString();
                if (readString != null) {
                    m.e(readString);
                }
                String readString2 = parcel.readString();
                if (readString2 != null) {
                    m.f(readString2);
                }
                String readString3 = parcel.readString();
                if (readString3 != null) {
                    m.h(readString3);
                }
                String readString4 = parcel.readString();
                if (readString4 != null) {
                    m.j(readString4);
                }
                m.b(parcel.readInt());
                String readString5 = parcel.readString();
                if (readString5 != null) {
                    m.g(readString5);
                }
                String readString6 = parcel.readString();
                if (readString6 != null) {
                    m.a = readString6;
                }
                String readString7 = parcel.readString();
                if (readString7 != null) {
                    m.k(readString7);
                }
                String readString8 = parcel.readString();
                if (readString8 != null) {
                    m.i(readString8);
                }
                String readString9 = parcel.readString();
                if (readString9 != null) {
                    m.b = readString9;
                }
                return m.a();
            case 12:
                return new SubtitleWindowSettings(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 1, parcel.readInt() == 1);
            case 13:
                return new SubtitleWindowSnapshot(parcel.readInt(), parcel.readLong(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), (SubtitleWindowSettings) parcel.readParcelable(SubtitleWindowSettings.class.getClassLoader()));
            case 14:
                return new SubtitlesStyle(parcel);
            case 15:
                return new DirectorSavedState(parcel);
            case 16:
                return new PlaybackListenerStateRestorerState(parcel);
            case 17:
                return new ParcelableMessageLite(parcel);
            case 18:
                return new PermissionDescriptor(parcel);
            case 19:
                return new UploadThumbnailHelper$ThumbnailFileInfo(parcel);
            default:
                return ReviewInfo.b((PendingIntent) parcel.readParcelable(ReviewInfo.class.getClassLoader()));
        }
    }
}
