package defpackage;

import android.media.MediaExtractor;
import android.media.MediaFormat;
/* compiled from: PG */
/* renamed from: appy  reason: default package */
/* loaded from: classes2.dex */
public final class appy {
    public final MediaFormat a;
    public final int b;
    public int c;
    public final int d;

    public appy(int i, MediaExtractor mediaExtractor) {
        int i2;
        MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
        this.a = trackFormat;
        if (trackFormat.getString("mime").startsWith("video/")) {
            i2 = 2;
        } else {
            i2 = trackFormat.getString("mime").startsWith("audio/") ? 3 : 1;
        }
        this.d = i2;
        this.b = i;
        this.c = -1;
    }
}
