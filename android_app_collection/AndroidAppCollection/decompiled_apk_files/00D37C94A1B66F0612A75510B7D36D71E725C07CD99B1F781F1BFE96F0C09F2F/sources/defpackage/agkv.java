package defpackage;

import android.database.Cursor;
/* compiled from: PG */
/* renamed from: agkv  reason: default package */
/* loaded from: classes.dex */
public final class agkv {
    public final int a;
    public final agqe b;

    public agkv(int i, agqe agqeVar) {
        this.a = i;
        this.b = agqeVar;
    }

    public static agkv a(String str, Cursor cursor) {
        if (cursor.isAfterLast()) {
            return null;
        }
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(ymr.e(str, "ad_video_id"));
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow(ymr.e(str, "playback_count"));
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow(ymr.e(str, "status"));
        if (cursor.isNull(columnIndexOrThrow)) {
            return null;
        }
        cursor.getString(columnIndexOrThrow);
        return new agkv(cursor.getInt(columnIndexOrThrow2), agqe.a(cursor.getInt(columnIndexOrThrow3)));
    }
}
