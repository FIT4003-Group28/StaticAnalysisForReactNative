package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
/* compiled from: PG */
/* renamed from: aanw  reason: default package */
/* loaded from: classes.dex */
final class aanw extends zer {
    public aanw() {
        super("VideoStreamingDataFactory.Lazy<VideoStreamingData>.create()");
    }

    @Override // defpackage.zer
    /* renamed from: c */
    public final synchronized VideoStreamingData a() {
        return aanz.a.e(aanz.d(), "zzzzzzzzzzz", 60000L);
    }
}
