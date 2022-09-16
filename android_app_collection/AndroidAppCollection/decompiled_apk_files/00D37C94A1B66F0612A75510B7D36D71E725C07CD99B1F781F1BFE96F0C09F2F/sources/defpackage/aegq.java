package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
/* compiled from: PG */
/* renamed from: aegq  reason: default package */
/* loaded from: classes.dex */
public abstract class aegq {
    public static final VideoQuality[] a = new VideoQuality[0];
    public static final aalv[] b = new aalv[0];

    public abstract aegu a(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, aegs aegsVar);

    public final aegu b(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z) {
        return c(videoStreamingData, playerConfigModel, z, null);
    }

    public final aegu c(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z, aegs aegsVar) {
        return d(videoStreamingData, playerConfigModel, z, aegsVar, Integer.MAX_VALUE);
    }

    public abstract aegu d(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z, aegs aegsVar, int i);
}
