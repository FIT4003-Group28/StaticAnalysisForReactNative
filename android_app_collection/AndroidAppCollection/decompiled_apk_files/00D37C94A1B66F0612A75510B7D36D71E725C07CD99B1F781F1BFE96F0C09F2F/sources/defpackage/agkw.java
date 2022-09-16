package defpackage;

import android.database.Cursor;
/* compiled from: PG */
/* renamed from: agkw  reason: default package */
/* loaded from: classes.dex */
public final class agkw {
    public static final String[] a = {"ad_video_id", "playback_count", "status"};
    public final agli b;

    public agkw(agli agliVar) {
        agliVar.getClass();
        this.b = agliVar;
    }

    public final agkv a(String str) {
        Cursor query = this.b.a().query("ad_videos", a, "ad_video_id=?", new String[]{str}, null, null, null, null);
        try {
            if (!query.moveToNext()) {
                return null;
            }
            return agkv.a(null, query);
        } finally {
            query.close();
        }
    }

    public final boolean b(String str) {
        boolean z = true;
        Cursor rawQuery = this.b.a().rawQuery("SELECT COUNT(*) FROM ad_videos WHERE ad_video_id=?", new String[]{str});
        try {
            if (!rawQuery.moveToNext()) {
                return false;
            }
            if (rawQuery.getInt(0) <= 0) {
                z = false;
            }
            return z;
        } finally {
            rawQuery.close();
        }
    }
}
