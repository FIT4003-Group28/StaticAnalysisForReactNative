package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
/* compiled from: PG */
/* renamed from: njk  reason: default package */
/* loaded from: classes3.dex */
public final class njk extends njf {
    private final VideoQuality a;

    public njk(Context context, VideoQuality videoQuality) {
        super(context, videoQuality.b);
        this.a = videoQuality;
    }

    public final int c() {
        return this.a.a;
    }

    public final String d() {
        return this.a.b;
    }
}
