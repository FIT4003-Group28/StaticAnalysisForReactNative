package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
/* compiled from: PG */
/* renamed from: bve  reason: default package */
/* loaded from: classes4.dex */
public final class bve implements bvg {
    private static final String[] b = {"_data"};
    private final ContentResolver a;

    public bve(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    @Override // defpackage.bvg
    public final Cursor a(Uri uri) {
        return this.a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
    }
}
