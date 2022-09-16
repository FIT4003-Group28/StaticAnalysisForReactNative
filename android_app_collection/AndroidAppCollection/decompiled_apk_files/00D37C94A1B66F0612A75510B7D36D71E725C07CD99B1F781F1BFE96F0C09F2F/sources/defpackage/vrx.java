package defpackage;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import java.util.Map;
/* compiled from: PG */
/* renamed from: vrx  reason: default package */
/* loaded from: classes4.dex */
public final class vrx {
    public final MediaExtractor a;

    public vrx(MediaExtractor mediaExtractor) {
        viu.d(true);
        this.a = mediaExtractor;
    }

    public final int a() {
        return this.a.getTrackCount();
    }

    public final MediaFormat b(int i) {
        return this.a.getTrackFormat(i);
    }

    public final void c() {
        this.a.release();
    }

    public final void d(int i) {
        this.a.selectTrack(i);
    }

    public final void e(long j) {
        this.a.seekTo(j, 2);
    }

    public final void f(Context context, Uri uri) {
        this.a.setDataSource(context, uri, (Map<String, String>) null);
    }
}
