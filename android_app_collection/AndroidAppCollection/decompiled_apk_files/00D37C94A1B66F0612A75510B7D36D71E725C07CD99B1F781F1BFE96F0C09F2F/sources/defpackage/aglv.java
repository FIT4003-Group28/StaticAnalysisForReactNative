package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: aglv  reason: default package */
/* loaded from: classes.dex */
final class aglv implements ymu {
    /* JADX WARN: Finally extract failed */
    @Override // defpackage.ymu
    public final void a(SQLiteDatabase sQLiteDatabase) {
        String str = "type";
        String str2 = "preferred_stream_quality";
        String str3 = "offline_channel_data_proto";
        String str4 = "last_update_timestamp";
        sQLiteDatabase.execSQL("CREATE TABLE playlistsV13 (id TEXT PRIMARY KEY,offline_playlist_data_proto BLOB,placeholder INTEGER,channel_id TEXT,size INTEGER,preferred_stream_quality INTEGER,saved_timestamp INTEGER,player_response_tracking_params BLOB DEFAULT NULL)");
        HashMap hashMap = new HashMap();
        String c = ymr.c("playlistsV2", aglm.b);
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 24);
        String str5 = "SELECT ";
        sb.append(str5);
        sb.append(c);
        sb.append(" FROM playlistsV2");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        while (rawQuery.moveToNext()) {
            try {
                int columnIndexOrThrow = rawQuery.getColumnIndexOrThrow("id");
                String str6 = str;
                int columnIndexOrThrow2 = rawQuery.getColumnIndexOrThrow("channel_id");
                String str7 = str4;
                int columnIndexOrThrow3 = rawQuery.getColumnIndexOrThrow("offline_playlist_data_proto");
                String str8 = str3;
                int columnIndexOrThrow4 = rawQuery.getColumnIndexOrThrow("placeholder");
                String str9 = str5;
                int columnIndexOrThrow5 = rawQuery.getColumnIndexOrThrow("player_response_tracking_params");
                int columnIndexOrThrow6 = rawQuery.getColumnIndexOrThrow("size");
                HashMap hashMap2 = hashMap;
                int columnIndexOrThrow7 = rawQuery.getColumnIndexOrThrow("saved_timestamp");
                int columnIndexOrThrow8 = rawQuery.getColumnIndexOrThrow(str2);
                String str10 = str2;
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", rawQuery.getString(columnIndexOrThrow));
                contentValues.put("channel_id", rawQuery.getString(columnIndexOrThrow2));
                contentValues.put("offline_playlist_data_proto", rawQuery.getBlob(columnIndexOrThrow3));
                contentValues.put("placeholder", Integer.valueOf(rawQuery.getInt(columnIndexOrThrow4)));
                contentValues.put("player_response_tracking_params", rawQuery.getBlob(columnIndexOrThrow5));
                contentValues.put("size", Integer.valueOf(rawQuery.getInt(columnIndexOrThrow6)));
                contentValues.put("saved_timestamp", Long.valueOf(rawQuery.getLong(columnIndexOrThrow7)));
                contentValues.put(str10, Integer.valueOf(rawQuery.getInt(columnIndexOrThrow8)));
                String asString = contentValues.getAsString("id");
                if (hashMap2.containsKey(asString)) {
                    try {
                        aopa mo52toBuilder = ((atrp) aopi.parseFrom(atrp.a, contentValues.getAsByteArray("offline_playlist_data_proto"), aoos.b())).mo52toBuilder();
                        mo52toBuilder.copyOnWrite();
                        atrp atrpVar = (atrp) mo52toBuilder.instance;
                        atrpVar.b |= 32;
                        atrpVar.i = 0L;
                        contentValues.put("offline_playlist_data_proto", ((atrp) mo52toBuilder.mo39build()).toByteArray());
                    } catch (aopx e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 64);
                        sb2.append("OfflineSchemaMigration13 duplicated playlist has invalid proto: ");
                        sb2.append(valueOf);
                        zep.b(sb2.toString());
                    }
                }
                agma.c(hashMap2, asString, contentValues);
                str2 = str10;
                hashMap = hashMap2;
                str = str6;
                str4 = str7;
                str3 = str8;
                str5 = str9;
            } catch (Throwable th) {
                throw th;
            }
        }
        String str11 = str;
        String str12 = str3;
        String str13 = str4;
        String str14 = str5;
        rawQuery.close();
        for (ContentValues contentValues2 : hashMap.values()) {
            sQLiteDatabase.insertOrThrow("playlistsV13", null, contentValues2);
        }
        sQLiteDatabase.execSQL("DROP TABLE playlistsV2");
        sQLiteDatabase.execSQL("CREATE TABLE channelsV13 (id TEXT PRIMARY KEY,offline_channel_data_proto BLOB)");
        HashMap hashMap3 = new HashMap();
        String c2 = ymr.c("channels", aglk.a);
        StringBuilder sb3 = new StringBuilder(String.valueOf(c2).length() + 21);
        sb3.append(str14);
        sb3.append(c2);
        sb3.append(" FROM channels");
        rawQuery = sQLiteDatabase.rawQuery(sb3.toString(), null);
        while (rawQuery.moveToNext()) {
            try {
                int columnIndexOrThrow9 = rawQuery.getColumnIndexOrThrow("id");
                String str15 = str12;
                int columnIndexOrThrow10 = rawQuery.getColumnIndexOrThrow(str15);
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("id", rawQuery.getString(columnIndexOrThrow9));
                contentValues3.put(str15, rawQuery.getBlob(columnIndexOrThrow10));
                String asString2 = contentValues3.getAsString("id");
                if (!hashMap3.containsKey(asString2)) {
                    agma.c(hashMap3, asString2, contentValues3);
                }
                str12 = str15;
            } finally {
            }
        }
        rawQuery.close();
        for (ContentValues contentValues4 : hashMap3.values()) {
            sQLiteDatabase.insertOrThrow("channelsV13", null, contentValues4);
        }
        sQLiteDatabase.execSQL("DROP TABLE channels");
        sQLiteDatabase.execSQL("CREATE TABLE video_listsV13 (id TEXT PRIMARY KEY,size INTEGER,type INTEGER,saved_timestamp INTEGER,last_update_timestamp INTEGER)");
        HashMap hashMap4 = new HashMap();
        String c3 = ymr.c("video_lists", agln.a);
        StringBuilder sb4 = new StringBuilder(String.valueOf(c3).length() + 24);
        sb4.append(str14);
        sb4.append(c3);
        sb4.append(" FROM video_lists");
        rawQuery = sQLiteDatabase.rawQuery(sb4.toString(), null);
        while (rawQuery.moveToNext()) {
            try {
                int columnIndexOrThrow11 = rawQuery.getColumnIndexOrThrow("id");
                String str16 = str13;
                int columnIndexOrThrow12 = rawQuery.getColumnIndexOrThrow(str16);
                int columnIndexOrThrow13 = rawQuery.getColumnIndexOrThrow("size");
                String str17 = str11;
                int columnIndexOrThrow14 = rawQuery.getColumnIndexOrThrow(str17);
                int columnIndexOrThrow15 = rawQuery.getColumnIndexOrThrow("saved_timestamp");
                ContentValues contentValues5 = new ContentValues();
                contentValues5.put("id", rawQuery.getString(columnIndexOrThrow11));
                contentValues5.put(str16, Long.valueOf(rawQuery.getLong(columnIndexOrThrow12)));
                contentValues5.put("size", Integer.valueOf(rawQuery.getInt(columnIndexOrThrow13)));
                contentValues5.put(str17, Integer.valueOf(rawQuery.getInt(columnIndexOrThrow14)));
                contentValues5.put("saved_timestamp", Long.valueOf(rawQuery.getLong(columnIndexOrThrow15)));
                String asString3 = contentValues5.getAsString("id");
                if (hashMap4.containsKey(asString3)) {
                    contentValues5.put(str16, (Integer) 0);
                }
                agma.c(hashMap4, asString3, contentValues5);
                str13 = str16;
                str11 = str17;
            } finally {
            }
        }
        rawQuery.close();
        for (ContentValues contentValues6 : hashMap4.values()) {
            sQLiteDatabase.insertOrThrow("video_listsV13", null, contentValues6);
        }
        sQLiteDatabase.execSQL("DROP TABLE video_lists");
    }
}
