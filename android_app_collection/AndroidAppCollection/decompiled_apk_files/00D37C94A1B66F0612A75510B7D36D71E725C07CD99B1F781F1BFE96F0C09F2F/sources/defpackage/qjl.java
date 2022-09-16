package defpackage;

import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.cast.EqualizerBandSettings;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueContainerMetadata;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.SessionState;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.cast.VastAdsRequest;
import com.google.android.gms.cast.VideoInfo;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.cast.framework.media.NotificationAction;
/* compiled from: PG */
/* renamed from: qjl  reason: default package */
/* loaded from: classes4.dex */
public final class qjl implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public qjl() {
    }

    public qjl(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new CredentialsData[i];
            case 1:
                return new ApplicationMetadata[i];
            case 2:
                return new EqualizerBandSettings[i];
            case 3:
                return new EqualizerSettings[i];
            case 4:
                return new LaunchOptions[i];
            case 5:
                return new MediaError[i];
            case 6:
                return new MediaLiveSeekableRange[i];
            case 7:
                return new MediaLoadRequestData[i];
            case 8:
                return new MediaMetadata[i];
            case 9:
                return new MediaQueueContainerMetadata[i];
            case 10:
                return new MediaQueueData[i];
            case 11:
                return new MediaQueueItem[i];
            case 12:
                return new MediaTrack[i];
            case 13:
                return new SessionState[i];
            case 14:
                return new TextTrackStyle[i];
            case 15:
                return new VastAdsRequest[i];
            case 16:
                return new VideoInfo[i];
            case 17:
                return new CastOptions[i];
            case 18:
                return new CastMediaOptions[i];
            case 19:
                return new ImageHints[i];
            default:
                return new NotificationAction[i];
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 627
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:60)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r32) {
        /*
            Method dump skipped, instructions count: 2012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qjl.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
