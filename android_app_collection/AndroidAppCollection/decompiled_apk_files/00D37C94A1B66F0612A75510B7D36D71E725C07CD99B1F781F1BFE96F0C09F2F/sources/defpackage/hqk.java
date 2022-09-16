package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.OperationCanceledException;
import android.util.Size;
/* compiled from: PG */
/* renamed from: hqk  reason: default package */
/* loaded from: classes3.dex */
public final class hqk {
    private static final Point c = new Point(512, 384);
    public final Context a;
    public final MediaMetadataRetriever b = new MediaMetadataRetriever();

    public hqk(Context context) {
        this.a = context;
    }

    public final ampq a(Uri uri) {
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                Point point = c;
                int max = Math.max(point.x, point.y);
                return ampq.j(this.a.getContentResolver().loadThumbnail(uri, new Size(max, max), null));
            } catch (Exception e) {
                if (!(e instanceof OperationCanceledException)) {
                    afus.c(1, 24, "Failed loading thumbnail", e);
                }
            }
        }
        return amon.a;
    }
}
