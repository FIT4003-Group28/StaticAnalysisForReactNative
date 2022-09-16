package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: agmu  reason: default package */
/* loaded from: classes.dex */
public final class agmu {
    public final agli a;
    public final snc b;
    private final azqb c;
    private final aglb d;
    private final List e = new ArrayList();

    public agmu(agli agliVar, azqb azqbVar, snc sncVar, aglb aglbVar) {
        this.a = agliVar;
        this.c = azqbVar;
        this.b = sncVar;
        this.d = aglbVar;
    }

    static ContentValues b(agqo agqoVar) {
        ContentValues contentValues = new ContentValues();
        if (agqoVar != null) {
            contentValues.put("id", agqoVar.f());
            contentValues.put("offline_video_data_proto", agqoVar.e.toByteArray());
            contentValues.put("deleted", Boolean.valueOf(agqoVar.c));
            agqa agqaVar = agqoVar.a;
            if (agqaVar != null) {
                contentValues.put("channel_id", agqaVar.a);
            }
        }
        return contentValues;
    }

    public final long a(String str) {
        Cursor query = this.a.a().query("videosV2", new String[]{"video_added_timestamp"}, "id = ?", new String[]{str}, null, null, null, null);
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

    public final agqe c(String str) {
        Cursor rawQuery = this.a.a().rawQuery("SELECT media_status FROM videosV2 WHERE id = ?", new String[]{str});
        try {
            if (rawQuery.moveToNext()) {
                return agqe.a(rawQuery.getInt(0));
            }
            rawQuery.close();
            return null;
        } finally {
            rawQuery.close();
        }
    }

    public final agqo d(String str) {
        Cursor query = this.a.a().query("videosV2", agmt.a, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (!query.moveToNext()) {
                query.close();
                return null;
            }
            agpj agpjVar = (agpj) this.c.get();
            aglb aglbVar = this.d;
            query.getClass();
            agpjVar.getClass();
            return agks.b(query, agpjVar, aglbVar, query.getColumnIndexOrThrow("id"), query.getColumnIndexOrThrow("offline_video_data_proto"), query.getColumnIndexOrThrow("deleted"), query.getColumnIndexOrThrow("channel_id"), query.getColumnIndex("video_id"));
        } finally {
            query.close();
        }
    }

    public final void e(agms agmsVar) {
        this.e.add(agmsVar);
    }

    public final void f(PlayerResponseModel playerResponseModel) {
        aalc aalcVar;
        String B = playerResponseModel.B();
        agqo d = d(B);
        if (d != null && (aalcVar = d.b) != null && !aalcVar.a.isEmpty()) {
            aalc d2 = ((agpj) this.c.get()).d(B, aalcVar);
            if (!d2.a.isEmpty()) {
                playerResponseModel.D(d2);
            }
        }
        playerResponseModel.D(((agpj) this.c.get()).d(B, playerResponseModel.b()));
    }

    public final void g(agqo agqoVar) {
        long delete = this.a.a().delete("videosV2", "id = ?", new String[]{agqoVar.f()});
        if (delete != 1) {
            StringBuilder sb = new StringBuilder(47);
            sb.append("Delete video affected ");
            sb.append(delete);
            sb.append(" rows");
            throw new SQLException(sb.toString());
        }
        for (agms agmsVar : this.e) {
            agmsVar.a(agqoVar);
        }
    }

    public final void h(String str, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("video_added_timestamp", Long.valueOf(j));
        long update = this.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
        if (update == 1) {
            return;
        }
        StringBuilder sb = new StringBuilder(69);
        sb.append("Update video video_added_timestamp affected ");
        sb.append(update);
        sb.append(" rows");
        throw new SQLException(sb.toString());
    }

    public final void i(String str, agqe agqeVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("media_status", Integer.valueOf(agqeVar.q));
        long update = this.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
        if (update == 1) {
            return;
        }
        StringBuilder sb = new StringBuilder(60);
        sb.append("Update video media status affected ");
        sb.append(update);
        sb.append(" rows");
        throw new SQLException(sb.toString());
    }

    public final void j(agqo agqoVar) {
        ContentValues b = b(agqoVar);
        b.put("metadata_timestamp", Long.valueOf(this.b.c()));
        long update = this.a.a().update("videosV2", b, "id = ?", new String[]{agqoVar.f()});
        if (update == 1) {
            return;
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append("Update video affected ");
        sb.append(update);
        sb.append(" rows");
        throw new SQLException(sb.toString());
    }

    public final void k(String str, PlayerResponseModel playerResponseModel, long j, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("player_response_proto", playerResponseModel.K());
        atse u = playerResponseModel.u();
        String str2 = null;
        if (u != null && (u.b & 1) != 0) {
            str2 = u.e;
        }
        if (str2 != null) {
            contentValues.put("refresh_token", str2);
        } else {
            contentValues.putNull("refresh_token");
        }
        contentValues.put("saved_timestamp", Long.valueOf(j));
        contentValues.put("last_refresh_timestamp", Long.valueOf(j2));
        contentValues.put("streams_timestamp", Long.valueOf(this.b.c()));
        long update = this.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
        if (update == 1) {
            return;
        }
        StringBuilder sb = new StringBuilder(69);
        sb.append("Update video player_response_proto affected ");
        sb.append(update);
        sb.append(" rows");
        throw new SQLException(sb.toString());
    }

    public final boolean l(String str) {
        return ymr.a(this.a.a(), "videosV2", "id = ?", new String[]{str}) > 0;
    }

    public final boolean m(String str) {
        return ymr.a(this.a.a(), "videosV2", "id = ? AND media_status != ?", new String[]{str, Integer.toString(agqe.DELETED.q)}) > 0;
    }

    public final void n(agqo agqoVar, agqe agqeVar, agqn agqnVar, int i, String str, int i2, int i3, long j, byte[] bArr) {
        ContentValues b = b(agqoVar);
        b.put("metadata_timestamp", Long.valueOf(this.b.c()));
        b.put("media_status", Integer.valueOf(agqeVar.q));
        b.put("stream_transfer_condition", Integer.valueOf(agqnVar.g));
        b.put("preferred_stream_quality", Integer.valueOf(i));
        b.put("offline_audio_quality", Integer.valueOf(i2 - 1));
        b.put("video_added_timestamp", Long.valueOf(j));
        b.put("offline_source_ve_type", Integer.valueOf(i3));
        if (str != null) {
            b.put("audio_track_id", str);
        }
        if (bArr != null) {
            b.put("player_response_tracking_params", bArr);
        }
        this.a.a().insertOrThrow("videosV2", null, b);
    }
}
