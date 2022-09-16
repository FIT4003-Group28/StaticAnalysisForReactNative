package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: agmk  reason: default package */
/* loaded from: classes.dex */
public final class agmk {
    public final agli a;
    public final agmu b;
    public final snc c;
    public final List d = new ArrayList();
    private final azqb e;
    private final aglb f;

    public agmk(agli agliVar, azqb azqbVar, snc sncVar, aglb aglbVar, agmu agmuVar) {
        this.a = agliVar;
        this.e = azqbVar;
        this.c = sncVar;
        this.f = aglbVar;
        this.b = agmuVar;
    }

    public static ContentValues l(agqq agqqVar, snc sncVar, atsu atsuVar) {
        ContentValues contentValues = new ContentValues();
        long c = sncVar.c();
        contentValues.put("id", agqqVar.a);
        contentValues.put("type", Integer.valueOf(agqqVar.c));
        contentValues.put("size", Integer.valueOf(agqqVar.b));
        atsuVar.getClass();
        contentValues.put("selection_strategy", Integer.valueOf(atsuVar.e));
        contentValues.put("last_update_timestamp", Long.valueOf(c));
        return contentValues;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ContentValues s(agqf agqfVar, snc sncVar) {
        byte[] byteArray;
        ContentValues contentValues = new ContentValues();
        atrp atrpVar = agqfVar.l;
        agqa agqaVar = agqfVar.c;
        if (atrpVar != null) {
            byteArray = atrpVar.toByteArray();
        } else {
            byteArray = atrp.a.toByteArray();
        }
        contentValues.put("id", agqfVar.a);
        contentValues.put("offline_playlist_data_proto", byteArray);
        contentValues.put("size", Integer.valueOf(agqfVar.f));
        contentValues.put("saved_timestamp", Long.valueOf(sncVar.c()));
        contentValues.put("placeholder", Boolean.valueOf(agqfVar.h));
        if (agqaVar != null) {
            contentValues.put("channel_id", agqaVar.a);
        }
        return contentValues;
    }

    public final boolean A(String str) {
        return ymr.a(this.a.a(), "playlist_video", "playlist_id IS NULL AND video_id = ?", new String[]{str}) > 0;
    }

    public final boolean B(String str) {
        return ymr.a(this.a.a(), "playlist_video", "playlist_id IS NOT NULL AND video_id = ?", new String[]{str}) > 0;
    }

    public final int C(String str) {
        int i = 1;
        int i2 = 0;
        Cursor query = this.a.a().query("playlistsV13", new String[]{"playlist_offline_request_source"}, "id = ?", new String[]{str}, null, null, null);
        try {
            if (query.moveToNext()) {
                i2 = akel.am(query.getInt(0));
            }
            if (i2 != 0) {
                i = i2;
            }
            return i;
        } finally {
            query.close();
        }
    }

    public final int a(String str) {
        Cursor query = this.a.a().query("video_listsV13", new String[]{"source_ve_type"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                return query.getInt(0);
            }
            query.close();
            return -1;
        } finally {
            query.close();
        }
    }

    public final agqq b(String str) {
        Cursor query = this.a.a().query("video_listsV13", agmj.a, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                return agpr.f(query, query.getColumnIndexOrThrow("id"), query.getColumnIndexOrThrow("size"), query.getColumnIndexOrThrow("type"));
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    public final atsu c(String str) {
        Cursor query = this.a.a().query("video_listsV13", new String[]{"selection_strategy"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                atsu a = atsu.a(query.getInt(0));
                if (a == null) {
                    a = atsu.OFFLINE_VIDEO_SELECTION_STRATEGY_UNKNOWN;
                }
                return a;
            }
            return atsu.OFFLINE_VIDEO_SELECTION_STRATEGY_UNKNOWN;
        } finally {
            query.close();
        }
    }

    public final attl d(String str) {
        Cursor query = this.a.a().query("video_listsV13", new String[]{"format_type"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                return attl.b(query.getInt(0));
            }
            return attl.UNKNOWN_FORMAT_TYPE;
        } finally {
            query.close();
        }
    }

    public final List e() {
        Cursor query = this.a.a().query("video_listsV13", agmj.a, null, null, null, null, "saved_timestamp DESC", null);
        try {
            return agpr.g(query, query.getColumnIndexOrThrow("id"), query.getColumnIndexOrThrow("size"), query.getColumnIndexOrThrow("type"));
        } finally {
            query.close();
        }
    }

    public final List f(String str) {
        SQLiteDatabase a = this.a.a();
        String c = ymr.c("videosV2", agmt.a);
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 219);
        sb.append("SELECT video_list_videos.video_id,");
        sb.append(c);
        sb.append(" FROM video_list_videos LEFT OUTER JOIN videosV2 ON video_list_videos.video_id = videosV2.id WHERE video_list_videos.video_list_id = ? ORDER BY video_list_videos.index_in_video_list ASC");
        Cursor rawQuery = a.rawQuery(sb.toString(), new String[]{str});
        try {
            agpj agpjVar = (agpj) this.e.get();
            aglb aglbVar = this.f;
            rawQuery.getClass();
            agpjVar.getClass();
            return agks.c(rawQuery, agpjVar, aglbVar, rawQuery.getColumnIndexOrThrow("id"), rawQuery.getColumnIndexOrThrow("offline_video_data_proto"), rawQuery.getColumnIndexOrThrow("deleted"), rawQuery.getColumnIndexOrThrow("channel_id"), rawQuery.getColumnIndex("video_id"));
        } finally {
            rawQuery.close();
        }
    }

    public final void g(agmi agmiVar) {
        this.d.add(agmiVar);
    }

    public final void h(agqq agqqVar, List list) {
        String str = agqqVar.a;
        this.a.a().delete("final_video_list_video_ids", "video_list_id = ?", new String[]{str});
        for (int i = 0; i < list.size(); i++) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("video_list_id", str);
            contentValues.put("video_id", (String) list.get(i));
            contentValues.put("index_in_video_list", Integer.valueOf(i));
            contentValues.put("saved_timestamp", Long.valueOf(this.c.c()));
            this.a.a().insertOrThrow("final_video_list_video_ids", null, contentValues);
        }
        for (agmi agmiVar : this.d) {
            agmiVar.a(agqqVar, list);
        }
    }

    public final void i(agqq agqqVar) {
        long update = this.a.a().update("video_listsV13", l(agqqVar, this.c, c(agqqVar.a)), "id = ?", new String[]{agqqVar.a});
        if (update == 1) {
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Update video list affected ");
        sb.append(update);
        sb.append(" rows");
        throw new SQLException(sb.toString());
    }

    public final boolean j(String str) {
        Cursor query = this.a.a().query("video_list_videos", new String[]{"video_list_id"}, "video_id = ?", new String[]{str}, null, null, null);
        while (query.moveToNext()) {
            try {
                String string = query.getString(0);
                if (!TextUtils.isEmpty(string) && string.startsWith("offline_candidate_video_list_")) {
                    return true;
                }
            } finally {
                query.close();
            }
        }
        return false;
    }

    public final byte[] k(String str) {
        Cursor query = this.a.a().query("video_listsV13", new String[]{"tracking_params"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                return query.getBlob(0);
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    public final int m(String str) {
        int i = 1;
        int i2 = 0;
        Cursor query = this.a.a().query("video_listsV13", new String[]{"video_list_offline_request_source"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                i2 = akel.am(query.getInt(0));
            }
            if (i2 != 0) {
                i = i2;
            }
            return i;
        } finally {
            query.close();
        }
    }

    public final void n(agqq agqqVar, List list, agqe agqeVar, attl attlVar, int i, int i2, byte[] bArr) {
        String str = agqqVar.a;
        Collection e = agpr.e(f(str), list);
        this.a.a().delete("video_list_videos", "video_list_id = ?", new String[]{str});
        for (agmi agmiVar : this.d) {
            agmiVar.b(e);
        }
        HashSet hashSet = new HashSet();
        int a = ahdp.a(attlVar, 360);
        for (int i3 = 0; i3 < list.size(); i3++) {
            agqo agqoVar = (agqo) list.get(i3);
            String f = agqoVar.f();
            ContentValues contentValues = new ContentValues();
            contentValues.put("video_list_id", str);
            contentValues.put("video_id", f);
            contentValues.put("index_in_video_list", Integer.valueOf(i3));
            contentValues.put("saved_timestamp", Long.valueOf(this.c.c()));
            this.a.a().insertOrThrow("video_list_videos", null, contentValues);
            if (!this.b.l(f)) {
                this.b.n(agqoVar, agqeVar, agqn.OFFLINE_IMMEDIATELY, a, null, i, i2, this.c.c(), bArr);
                hashSet.add(f);
            }
        }
        for (agmi agmiVar2 : this.d) {
            agmiVar2.c(agqqVar, list, hashSet, attlVar, i2, bArr, agqeVar, agqn.OFFLINE_IMMEDIATELY);
        }
    }

    public final int o(String str) {
        Cursor query = this.a.a().query("playlistsV13", new String[]{"offline_source_ve_type"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                return query.getInt(0);
            }
            query.close();
            return -1;
        } finally {
            query.close();
        }
    }

    public final int p(String str) {
        Cursor query = this.a.a().query("playlistsV13", new String[]{"preferred_stream_quality"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                return query.getInt(0);
            }
            query.close();
            return -1;
        } finally {
            query.close();
        }
    }

    public final long q(String str) {
        Cursor query = this.a.a().query("playlistsV13", new String[]{"playlist_added_timestamp_millis"}, "id = ?", new String[]{str}, null, null, null);
        try {
            if (query.moveToNext()) {
                return query.getLong(0);
            }
            query.close();
            return 0L;
        } finally {
            query.close();
        }
    }

    public final long r(String str) {
        Cursor rawQuery = this.a.a().rawQuery("SELECT saved_timestamp FROM playlistsV13 WHERE id=?", new String[]{str});
        try {
            if (rawQuery.moveToNext()) {
                return rawQuery.getLong(0);
            }
            rawQuery.close();
            return 0L;
        } finally {
            rawQuery.close();
        }
    }

    public final agqf t(String str) {
        Cursor query = this.a.a().query("playlistsV13", aglt.a, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                return agks.d(query, (agpj) this.e.get(), this.f, query.getColumnIndexOrThrow("id"), query.getColumnIndexOrThrow("offline_playlist_data_proto"), query.getColumnIndexOrThrow("placeholder"), query.getColumnIndexOrThrow("size"), query.getColumnIndexOrThrow("channel_id"));
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    public final List u() {
        Cursor query = this.a.a().query("playlistsV13", aglt.a, null, null, null, null, "saved_timestamp DESC", null);
        try {
            try {
                return agks.e(query, (agpj) this.e.get(), this.f, query.getColumnIndexOrThrow("id"), query.getColumnIndexOrThrow("offline_playlist_data_proto"), query.getColumnIndexOrThrow("placeholder"), query.getColumnIndexOrThrow("size"), query.getColumnIndexOrThrow("channel_id"));
            } catch (SQLiteException e) {
                afus.c(2, 28, "Issue with playlists store", e);
                throw e;
            }
        } finally {
            query.close();
        }
    }

    public final List v() {
        SQLiteDatabase a = this.a.a();
        String c = ymr.c("videosV2", agmt.a);
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 174);
        sb.append("SELECT ");
        sb.append(c);
        sb.append(" FROM videosV2 INNER JOIN playlist_video ON videosV2.id = playlist_video.video_id WHERE playlist_video.playlist_id IS NULL ORDER BY playlist_video.saved_timestamp DESC");
        Cursor rawQuery = a.rawQuery(sb.toString(), null);
        try {
            agpj agpjVar = (agpj) this.e.get();
            aglb aglbVar = this.f;
            rawQuery.getClass();
            agpjVar.getClass();
            return agks.c(rawQuery, agpjVar, aglbVar, rawQuery.getColumnIndexOrThrow("id"), rawQuery.getColumnIndexOrThrow("offline_video_data_proto"), rawQuery.getColumnIndexOrThrow("deleted"), rawQuery.getColumnIndexOrThrow("channel_id"), rawQuery.getColumnIndex("video_id"));
        } finally {
            rawQuery.close();
        }
    }

    public final List w(String str) {
        SQLiteDatabase a = this.a.a();
        String c = ymr.c("videosV2", agmt.a);
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 200);
        sb.append("SELECT playlist_video.video_id,");
        sb.append(c);
        sb.append(" FROM playlist_video LEFT OUTER JOIN videosV2 ON playlist_video.video_id = videosV2.id WHERE playlist_video.playlist_id = ? ORDER BY playlist_video.index_in_playlist ASC");
        Cursor rawQuery = a.rawQuery(sb.toString(), new String[]{str});
        try {
            agpj agpjVar = (agpj) this.e.get();
            aglb aglbVar = this.f;
            rawQuery.getClass();
            agpjVar.getClass();
            return agks.c(rawQuery, agpjVar, aglbVar, rawQuery.getColumnIndexOrThrow("id"), rawQuery.getColumnIndexOrThrow("offline_video_data_proto"), rawQuery.getColumnIndexOrThrow("deleted"), rawQuery.getColumnIndexOrThrow("channel_id"), rawQuery.getColumnIndex("video_id"));
        } finally {
            rawQuery.close();
        }
    }

    public final void x(agls aglsVar) {
        this.d.add(aglsVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void y(String str) {
        this.a.a().delete("playlist_video", "playlist_id IS NULL AND video_id = ?", new String[]{str});
    }

    public final void z(String str) {
        Cursor rawQuery = this.a.a().rawQuery("SELECT video_id FROM playlist_video WHERE playlist_id IS NULL AND video_id =?", new String[]{str});
        try {
            if (rawQuery.getCount() > 0) {
                return;
            }
            rawQuery.close();
            ContentValues contentValues = new ContentValues();
            contentValues.putNull("playlist_id");
            contentValues.put("video_id", str);
            contentValues.put("saved_timestamp", Long.valueOf(this.c.c()));
            this.a.a().insertOrThrow("playlist_video", null, contentValues);
        } finally {
            rawQuery.close();
        }
    }

    public agmk(agli agliVar, azqb azqbVar, aglb aglbVar, agmu agmuVar, snc sncVar) {
        this.a = agliVar;
        this.e = azqbVar;
        this.f = aglbVar;
        this.b = agmuVar;
        this.c = sncVar;
    }
}
