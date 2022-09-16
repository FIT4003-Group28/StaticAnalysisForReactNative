package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
/* compiled from: PG */
/* renamed from: cjc  reason: default package */
/* loaded from: classes2.dex */
public final class cjc implements cjf {
    private static final String[] a = {"_data"};
    private final ContentResolver b;

    public cjc(ContentResolver contentResolver) {
        this.b = contentResolver;
    }

    @Override // defpackage.cjf
    public final Cursor a(Uri uri) {
        return this.b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, a, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
    }
}
