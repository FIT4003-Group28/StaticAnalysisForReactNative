package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
/* compiled from: PG */
/* renamed from: afkd  reason: default package */
/* loaded from: classes.dex */
public final class afkd {
    public volatile String a;

    public final void a(VideoStreamingData videoStreamingData) {
        FormatStreamModel formatStreamModel = (FormatStreamModel) arey.r(videoStreamingData.n, null);
        if (formatStreamModel == null) {
            return;
        }
        String host = formatStreamModel.d.getHost();
        if (TextUtils.isEmpty(host) || !host.endsWith("googlevideo.com")) {
            return;
        }
        this.a = host;
    }
}
