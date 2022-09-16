package defpackage;

import android.content.Context;
import android.media.MediaActionSound;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: znf  reason: default package */
/* loaded from: classes4.dex */
public final class znf {
    public final axnm a;
    private final axnm b;
    private final Context c;
    private long d;

    public znf(axnm axnmVar, axnm axnmVar2, Context context) {
        this.a = axnmVar;
        this.b = axnmVar2;
        this.c = context;
    }

    public final long a() {
        ((MediaActionSound) this.a.get()).play(2);
        long j = this.d;
        if (j > 0) {
            return j;
        }
        this.d = 500L;
        try {
            Uri parse = Uri.parse("/system/media/audio/ui/VideoRecord.ogg");
            MediaMetadataRetriever mediaMetadataRetriever = (MediaMetadataRetriever) this.b.get();
            mediaMetadataRetriever.setDataSource(this.c, parse);
            this.d = Math.max(Long.parseLong(mediaMetadataRetriever.extractMetadata(9)) + 150, 500L);
        } catch (RuntimeException unused) {
        }
        return this.d;
    }
}
