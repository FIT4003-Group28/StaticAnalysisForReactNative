package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: agly  reason: default package */
/* loaded from: classes.dex */
final class agly implements ymu {
    private final HashMap a = new HashMap();

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.ymu
    public final void a(SQLiteDatabase sQLiteDatabase) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        String str8 = "media_status";
        String str9 = "last_refresh_timestamp";
        String str10 = "last_playback_timestamp";
        String str11 = "size";
        String str12 = "owner";
        String str13 = "author";
        sQLiteDatabase2.execSQL("CREATE TABLE playlistsV2 (id TEXT PRMARY KEY,offline_playlist_data_proto BLOB,placeholder INTEGER,channel_id TEXT,size INTEGER,preferred_stream_quality INTEGER,saved_timestamp INTEGER)");
        String c = ymr.c("playlists", agll.a);
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 22);
        String str14 = "SELECT ";
        sb.append(str14);
        sb.append(c);
        sb.append(" FROM playlists");
        Cursor rawQuery = sQLiteDatabase2.rawQuery(sb.toString(), null);
        while (true) {
            try {
                str = "title";
                str2 = "saved_timestamp";
                str3 = str8;
                if (!rawQuery.moveToNext()) {
                    break;
                }
                ContentValues contentValues = new ContentValues();
                String str15 = str9;
                String string = rawQuery.getString(rawQuery.getColumnIndex("id"));
                String str16 = str10;
                String string2 = rawQuery.getString(rawQuery.getColumnIndex(str13));
                String str17 = str12;
                String h = ymr.h(rawQuery, rawQuery.getColumnIndex(str13));
                String str18 = str13;
                aopa createBuilder = atqe.a.createBuilder();
                createBuilder.copyOnWrite();
                String str19 = str14;
                atqe atqeVar = (atqe) createBuilder.instance;
                h.getClass();
                atqeVar.b |= 1;
                atqeVar.c = h;
                createBuilder.copyOnWrite();
                atqe atqeVar2 = (atqe) createBuilder.instance;
                h.getClass();
                atqeVar2.b |= 4;
                atqeVar2.e = h;
                avhn avhnVar = avhn.a;
                createBuilder.copyOnWrite();
                atqe atqeVar3 = (atqe) createBuilder.instance;
                avhnVar.getClass();
                atqeVar3.d = avhnVar;
                atqeVar3.b |= 2;
                atqe atqeVar4 = (atqe) createBuilder.mo39build();
                aopa createBuilder2 = atrp.a.createBuilder();
                String h2 = ymr.h(rawQuery, rawQuery.getColumnIndex("id"));
                createBuilder2.copyOnWrite();
                String str20 = str11;
                atrp atrpVar = (atrp) createBuilder2.instance;
                h2.getClass();
                atrpVar.b |= 1;
                atrpVar.c = h2;
                String h3 = ymr.h(rawQuery, rawQuery.getColumnIndex(str));
                createBuilder2.copyOnWrite();
                atrp atrpVar2 = (atrp) createBuilder2.instance;
                h3.getClass();
                atrpVar2.b |= 8;
                atrpVar2.g = h3;
                createBuilder2.copyOnWrite();
                atrp atrpVar3 = (atrp) createBuilder2.instance;
                atrpVar3.b |= 32;
                atrpVar3.i = rawQuery.getLong(rawQuery.getColumnIndex("updated_date")) / 1000;
                avhn avhnVar2 = avhn.a;
                createBuilder2.copyOnWrite();
                atrp atrpVar4 = (atrp) createBuilder2.instance;
                avhnVar2.getClass();
                atrpVar4.d = avhnVar2;
                atrpVar4.b |= 2;
                String h4 = ymr.h(rawQuery, rawQuery.getColumnIndex("content_uri"));
                createBuilder2.copyOnWrite();
                atrp atrpVar5 = (atrp) createBuilder2.instance;
                h4.getClass();
                atrpVar5.b |= 16;
                atrpVar5.h = h4;
                aopa createBuilder3 = atqf.a.createBuilder();
                createBuilder3.copyOnWrite();
                atqf atqfVar = (atqf) createBuilder3.instance;
                atqeVar4.getClass();
                atqfVar.c = atqeVar4;
                atqfVar.b |= 1;
                createBuilder2.copyOnWrite();
                atrp atrpVar6 = (atrp) createBuilder2.instance;
                atqf atqfVar2 = (atqf) createBuilder3.mo39build();
                atqfVar2.getClass();
                atrpVar6.e = atqfVar2;
                atrpVar6.b |= 4;
                atrp atrpVar7 = (atrp) createBuilder2.mo39build();
                HashMap hashMap = this.a;
                atqf atqfVar3 = atrpVar7.e;
                if (atqfVar3 == null) {
                    atqfVar3 = atqf.a;
                }
                hashMap.put(h, atqfVar3);
                if (string == null || string2 == null || atrpVar7 == null) {
                    str7 = str20;
                    contentValues = null;
                } else {
                    contentValues.put("id", string);
                    contentValues.put("channel_id", string2);
                    contentValues.put("offline_playlist_data_proto", atrpVar7.toByteArray());
                    contentValues.put("placeholder", Boolean.valueOf(ymr.g(rawQuery, rawQuery.getColumnIndex("placeholder"), false)));
                    contentValues.put(str2, Long.valueOf(rawQuery.getLong(rawQuery.getColumnIndex(str2))));
                    contentValues.put("preferred_stream_quality", Integer.valueOf(rawQuery.getInt(rawQuery.getColumnIndex("preferred_stream_quality"))));
                    str7 = str20;
                    contentValues.put(str7, Integer.valueOf(rawQuery.getInt(rawQuery.getColumnIndex(str7))));
                }
                if (contentValues != null) {
                    sQLiteDatabase.insertOrThrow("playlistsV2", null, contentValues);
                    str11 = str7;
                    sQLiteDatabase2 = sQLiteDatabase;
                    str8 = str3;
                    str9 = str15;
                    str10 = str16;
                    str12 = str17;
                    str14 = str19;
                    str13 = str18;
                } else {
                    str11 = str7;
                    str8 = str3;
                    str9 = str15;
                    str10 = str16;
                    str12 = str17;
                    str14 = str19;
                    str13 = str18;
                    sQLiteDatabase2 = sQLiteDatabase;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        String str21 = str9;
        String str22 = str10;
        String str23 = str12;
        SQLiteDatabase sQLiteDatabase3 = sQLiteDatabase2;
        rawQuery.close();
        sQLiteDatabase3.execSQL("DROP TABLE playlists");
        sQLiteDatabase3.execSQL("CREATE TABLE videosV2 (id TEXT PRIMARY KEY,offline_video_data_proto BLOB,deleted INTEGER,channel_id TEXT,refresh_token TEXT,saved_timestamp INTEGER,last_refresh_timestamp INTEGER,last_playback_timestamp INTEGER,media_status INTEGER,preferred_stream_quality INTEGER,player_response_proto BLOB)");
        String c2 = ymr.c("videos", aglo.a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(c2).length() + 19);
        sb2.append(str14);
        sb2.append(c2);
        sb2.append(" FROM videos");
        rawQuery = sQLiteDatabase3.rawQuery(sb2.toString(), null);
        while (rawQuery.moveToNext()) {
            try {
                ContentValues contentValues2 = new ContentValues();
                String string3 = rawQuery.getString(rawQuery.getColumnIndex("id"));
                String str24 = str23;
                String string4 = rawQuery.getString(rawQuery.getColumnIndex(str24));
                aopa createBuilder4 = atsl.a.createBuilder();
                String h5 = ymr.h(rawQuery, rawQuery.getColumnIndex("id"));
                createBuilder4.copyOnWrite();
                atsl atslVar = (atsl) createBuilder4.instance;
                h5.getClass();
                atslVar.b |= 1;
                atslVar.c = h5;
                String h6 = ymr.h(rawQuery, rawQuery.getColumnIndex(str));
                createBuilder4.copyOnWrite();
                atsl atslVar2 = (atsl) createBuilder4.instance;
                h6.getClass();
                atslVar2.b |= 8;
                atslVar2.f = h6;
                arag g = ajgl.g(ymr.h(rawQuery, rawQuery.getColumnIndex("description")));
                createBuilder4.copyOnWrite();
                atsl atslVar3 = (atsl) createBuilder4.instance;
                g.getClass();
                atslVar3.k = g;
                atslVar3.b |= 512;
                String str25 = str2;
                String i = zgh.i(rawQuery.getInt(rawQuery.getColumnIndex("duration")));
                createBuilder4.copyOnWrite();
                atsl atslVar4 = (atsl) createBuilder4.instance;
                i.getClass();
                atslVar4.b |= 16;
                atslVar4.g = i;
                String valueOf = String.valueOf(rawQuery.getLong(rawQuery.getColumnIndex("likes_count")));
                createBuilder4.copyOnWrite();
                atsl atslVar5 = (atsl) createBuilder4.instance;
                valueOf.getClass();
                atslVar5.b |= 2048;
                atslVar5.m = valueOf;
                String valueOf2 = String.valueOf(rawQuery.getLong(rawQuery.getColumnIndex("dislikes_count")));
                createBuilder4.copyOnWrite();
                atsl atslVar6 = (atsl) createBuilder4.instance;
                valueOf2.getClass();
                atslVar6.b |= 4096;
                atslVar6.n = valueOf2;
                createBuilder4.copyOnWrite();
                atsl atslVar7 = (atsl) createBuilder4.instance;
                String str26 = str;
                atslVar7.b |= 32;
                atslVar7.h = rawQuery.getLong(rawQuery.getColumnIndex("upload_date")) / 1000;
                avhn avhnVar3 = avhn.a;
                createBuilder4.copyOnWrite();
                atsl atslVar8 = (atsl) createBuilder4.instance;
                avhnVar3.getClass();
                atslVar8.d = avhnVar3;
                atslVar8.b |= 2;
                String h7 = ymr.h(rawQuery, rawQuery.getColumnIndex("watch_uri"));
                createBuilder4.copyOnWrite();
                atsl atslVar9 = (atsl) createBuilder4.instance;
                h7.getClass();
                atslVar9.b |= 256;
                atslVar9.j = h7;
                aopa createBuilder5 = atqe.a.createBuilder();
                String h8 = ymr.h(rawQuery, rawQuery.getColumnIndex(str24));
                createBuilder5.copyOnWrite();
                atqe atqeVar5 = (atqe) createBuilder5.instance;
                h8.getClass();
                atqeVar5.b |= 1;
                atqeVar5.c = h8;
                String h9 = ymr.h(rawQuery, rawQuery.getColumnIndex("owner_display_name"));
                createBuilder5.copyOnWrite();
                atqe atqeVar6 = (atqe) createBuilder5.instance;
                h9.getClass();
                atqeVar6.b |= 4;
                atqeVar6.e = h9;
                avhn avhnVar4 = avhn.a;
                createBuilder5.copyOnWrite();
                atqe atqeVar7 = (atqe) createBuilder5.instance;
                avhnVar4.getClass();
                atqeVar7.d = avhnVar4;
                atqeVar7.b |= 2;
                atqe atqeVar8 = (atqe) createBuilder5.mo39build();
                aopa createBuilder6 = atqf.a.createBuilder();
                createBuilder6.copyOnWrite();
                atqf atqfVar4 = (atqf) createBuilder6.instance;
                atqeVar8.getClass();
                atqfVar4.c = atqeVar8;
                atqfVar4.b |= 1;
                createBuilder4.copyOnWrite();
                atsl atslVar10 = (atsl) createBuilder4.instance;
                atqf atqfVar5 = (atqf) createBuilder6.mo39build();
                atqfVar5.getClass();
                atslVar10.e = atqfVar5;
                atslVar10.b |= 4;
                HashMap hashMap2 = this.a;
                atqf atqfVar6 = ((atsl) createBuilder4.instance).e;
                if (atqfVar6 == null) {
                    atqfVar6 = atqf.a;
                }
                atqe atqeVar9 = atqfVar6.c;
                if (atqeVar9 == null) {
                    atqeVar9 = atqe.a;
                }
                String str27 = atqeVar9.c;
                atqf atqfVar7 = ((atsl) createBuilder4.instance).e;
                if (atqfVar7 == null) {
                    atqfVar7 = atqf.a;
                }
                hashMap2.put(str27, atqfVar7);
                long j = rawQuery.getLong(rawQuery.getColumnIndex("view_count"));
                createBuilder4.copyOnWrite();
                atsl atslVar11 = (atsl) createBuilder4.instance;
                atslVar11.b |= 64;
                atslVar11.i = j;
                String valueOf3 = String.valueOf(j);
                createBuilder4.copyOnWrite();
                atsl atslVar12 = (atsl) createBuilder4.instance;
                valueOf3.getClass();
                atslVar12.b |= 1024;
                atslVar12.l = valueOf3;
                atsl atslVar13 = (atsl) createBuilder4.mo39build();
                if (string3 == null || string4 == null || atslVar13 == null) {
                    str4 = str3;
                    str5 = str21;
                    str6 = str22;
                    contentValues2 = null;
                } else {
                    contentValues2.put("id", string3);
                    contentValues2.put("channel_id", string4);
                    contentValues2.put("offline_video_data_proto", atslVar13.toByteArray());
                    contentValues2.put("deleted", Boolean.valueOf(TextUtils.equals(rawQuery.getString(rawQuery.getColumnIndex("state")), "OFFLINE_DELETED")));
                    str6 = str22;
                    contentValues2.put(str6, Long.valueOf(rawQuery.getLong(rawQuery.getColumnIndex(str6))));
                    contentValues2.put(str25, Long.valueOf(rawQuery.getLong(rawQuery.getColumnIndex(str25))));
                    str5 = str21;
                    contentValues2.put(str5, Long.valueOf(rawQuery.getLong(rawQuery.getColumnIndex(str5))));
                    str4 = str3;
                    contentValues2.put(str4, Integer.valueOf(rawQuery.getInt(rawQuery.getColumnIndex(str4))));
                    contentValues2.put("preferred_stream_quality", Integer.valueOf(rawQuery.getInt(rawQuery.getColumnIndex("preferred_stream_quality"))));
                    contentValues2.put("player_response_proto", rawQuery.getBlob(rawQuery.getColumnIndex("player_response_proto")));
                    contentValues2.put("refresh_token", rawQuery.getString(rawQuery.getColumnIndex("refresh_token")));
                }
                if (contentValues2 != null) {
                    sQLiteDatabase3.insertOrThrow("videosV2", null, contentValues2);
                }
                str22 = str6;
                str21 = str5;
                str3 = str4;
                str2 = str25;
                str = str26;
                str23 = str24;
            } finally {
                rawQuery.close();
            }
        }
        rawQuery.close();
        sQLiteDatabase3.execSQL("DROP TABLE videos");
        sQLiteDatabase3.execSQL("CREATE TABLE channels (id TEXT PRMARY KEY,offline_channel_data_proto BLOB)");
        for (Map.Entry entry : this.a.entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("id", (String) entry.getKey());
            contentValues3.put("offline_channel_data_proto", ((atqf) entry.getValue()).toByteArray());
            sQLiteDatabase3.insertOrThrow("channels", null, contentValues3);
        }
    }
}
