package defpackage;

import android.media.MediaMetadataRetriever;
import android.system.Os;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: gvj  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gvj implements Callable {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ gvj(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        if (i == 0) {
            String str = this.a;
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            return extractMetadata == null ? amon.a : ampq.i(mediaMetadataRetriever.getFrameAtTime(TimeUnit.MILLISECONDS.toMicros(Long.parseLong(extractMetadata)), 3));
        } else if (i == 1) {
            String str2 = this.a;
            MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
            mediaMetadataRetriever2.setDataSource(str2);
            String extractMetadata2 = mediaMetadataRetriever2.extractMetadata(32);
            return extractMetadata2 == null ? amon.a : ampq.i(mediaMetadataRetriever2.getFrameAtIndex(Integer.parseInt(extractMetadata2) - 1));
        } else {
            return Os.lstat(this.a);
        }
    }
}
