package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.subtitles.model.AutoValue_SubtitleTrack;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aglj  reason: default package */
/* loaded from: classes.dex */
public final class aglj {
    private static final attl n = attl.SD;
    public final agpj a;
    public final agme b;
    public final aglb c;
    public final agmu d;
    protected final agmk e;
    protected final agmg f;
    public final agku g;
    public final agkz h;
    public final agkw i;
    protected final snc j;
    public final List k = new ArrayList();
    public final agmr l;
    public final agmk m;

    public aglj(agpj agpjVar, agme agmeVar, aglb aglbVar, agmu agmuVar, agmk agmkVar, agmk agmkVar2, agmg agmgVar, agku agkuVar, agkz agkzVar, agkw agkwVar, agmr agmrVar, snc sncVar, byte[] bArr) {
        this.a = agpjVar;
        this.b = agmeVar;
        this.c = aglbVar;
        this.d = agmuVar;
        this.m = agmkVar;
        this.e = agmkVar2;
        this.f = agmgVar;
        this.g = agkuVar;
        this.h = agkzVar;
        this.i = agkwVar;
        this.j = sncVar;
        this.l = agmrVar;
    }

    private final synchronized void aj(agqo agqoVar) {
        if (agqoVar.c) {
            return;
        }
        this.m.y(agqoVar.f());
        ak(agqoVar);
        if (!this.d.l(agqoVar.f())) {
            return;
        }
        N(agqoVar.f());
        this.d.g(agqoVar);
    }

    private final synchronized void ak(agqo agqoVar) {
        int i;
        if (agqoVar.c) {
            return;
        }
        for (String str : this.l.g(agqoVar.f())) {
            List<agqo> f = this.e.f(str);
            Iterator it = f.iterator();
            int i2 = 1;
            boolean z = false;
            while (it.hasNext()) {
                if (((agqo) it.next()).f().equals(agqoVar.f())) {
                    it.remove();
                    z = true;
                }
            }
            if (z) {
                Cursor query = this.e.a.a().query("final_video_list_video_ids", agmh.a, "video_list_id = ?", new String[]{str}, null, null, "index_in_video_list ASC", null);
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    arrayList.add(query.getString(query.getColumnIndexOrThrow("video_id")));
                }
                query.close();
                agqq b = this.e.b(str);
                if (b != null) {
                    int i3 = b.c;
                    agqq agqqVar = new agqq(b, f.size());
                    this.e.i(agqqVar);
                    agmk agmkVar = this.e;
                    agqe agqeVar = i3 == 2 ? agqe.METADATA_ONLY : agqe.ACTIVE;
                    attl d = this.e.d(str);
                    Cursor query2 = this.e.a.a().query("video_listsV13", new String[]{"offline_audio_quality"}, "id = ?", new String[]{str}, null, null, null, null);
                    if (query2.moveToNext()) {
                        int av = akel.av(query2.getInt(0));
                        if (av != 0) {
                            i2 = av;
                        }
                        query2.close();
                        i = i2;
                    } else {
                        query2.close();
                        i = 1;
                    }
                    agmkVar.n(agqqVar, f, agqeVar, d, i, this.e.a(str), this.e.k(str));
                    if (!arrayList.isEmpty()) {
                        arrayList.removeAll(Collections.singleton(agqoVar.f()));
                        this.e.h(agqqVar, arrayList);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (agqo agqoVar2 : f) {
                        arrayList2.add(agqoVar2.f());
                    }
                    int m = this.e.m(str);
                    if (i3 == 2) {
                        arrayList = null;
                    }
                    this.l.s(agqqVar, arrayList2, arrayList, m);
                }
            }
        }
    }

    private final boolean al(String str) {
        zgh.m(str);
        return this.d.m(str);
    }

    public final void A(String str, agqe agqeVar) {
        if (this.i.b(str)) {
            this.i.b.a().execSQL("UPDATE ad_videos SET status = ? WHERE ad_video_id = ?", new Object[]{Integer.valueOf(agqeVar.q), str});
        }
    }

    public final void B(Set set, String str) {
        Set<String> hashSet;
        Cursor query = this.h.b.a().query("ads", new String[]{"ad_video_id"}, "original_video_id=? AND ad_video_id IS NOT NULL AND ad_break_id LIKE ?", new String[]{str, ".CONTENT_INTERSTITIAL.%"}, null, null, null, null);
        try {
            if (query.getCount() <= 0) {
                hashSet = Collections.emptySet();
            } else {
                hashSet = new HashSet();
                while (query.moveToNext()) {
                    hashSet.add(query.getString(0));
                }
            }
            HashSet<String> hashSet2 = new HashSet(set);
            hashSet2.removeAll(hashSet);
            hashSet.removeAll(set);
            SQLiteDatabase k = k();
            k.beginTransaction();
            try {
                for (String str2 : hashSet) {
                    this.h.b.a().delete("ads", "original_video_id=? AND ad_video_id=? AND ad_break_id LIKE ?", new String[]{str, str2, ".CONTENT_INTERSTITIAL.%"});
                    if (this.h.b(str2) == 0 && !al(str2)) {
                        M(str2, false);
                    }
                }
                for (String str3 : hashSet2) {
                    agkz agkzVar = this.h;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("original_video_id", str);
                    String valueOf = String.valueOf(str3);
                    contentValues.put("ad_break_id", valueOf.length() != 0 ? ".CONTENT_INTERSTITIAL.".concat(valueOf) : new String(".CONTENT_INTERSTITIAL."));
                    contentValues.put("ad_video_id", str3);
                    agkzVar.b.a().insert("ads", null, contentValues);
                }
                k.setTransactionSuccessful();
            } finally {
                k.endTransaction();
            }
        } finally {
            query.close();
        }
    }

    public final synchronized boolean C(String str) {
        return L(str) != null;
    }

    public final synchronized boolean D(String str, int i) {
        agqe agqeVar;
        zgh.m(str);
        SQLiteDatabase k = k();
        k.beginTransaction();
        try {
            boolean j = this.e.j(str);
            agqo d = this.d.d(str);
            if (d != null) {
                if (i != 1) {
                    this.m.y(str);
                    if (!j) {
                        ak(d);
                    }
                    if (this.m.B(str)) {
                        agqeVar = agqe.DELETED;
                    } else {
                        agqeVar = j ? agqe.METADATA_ONLY : null;
                    }
                    if (agqeVar != null) {
                        agmu agmuVar = this.d;
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("media_status", Integer.valueOf(agqeVar.q));
                        contentValues.putNull("player_response_proto");
                        contentValues.putNull("refresh_token");
                        contentValues.putNull("saved_timestamp");
                        contentValues.putNull("streams_timestamp");
                        contentValues.putNull("last_refresh_timestamp");
                        contentValues.putNull("last_playback_timestamp");
                        contentValues.putNull("video_added_timestamp");
                        long update = agmuVar.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
                        if (update != 1) {
                            StringBuilder sb = new StringBuilder(73);
                            sb.append("Update video offline_playability_state affected ");
                            sb.append(update);
                            sb.append(" rows");
                            throw new SQLException(sb.toString());
                        }
                    } else {
                        aj(d);
                    }
                } else {
                    aj(d);
                }
            }
            if (!h(str)) {
                M(str, false);
            }
            if (!this.m.A(str)) {
                if (j) {
                    agmz c = this.l.c();
                    synchronized (c.k) {
                        str.getClass();
                        synchronized (c.k) {
                            zgh.m(str);
                            c.e.remove(str);
                            agmx agmxVar = (agmx) c.b.get(str);
                            if (agmxVar != null) {
                                agmxVar.g();
                                c.l.b(agmxVar);
                            }
                        }
                        agmx agmxVar2 = (agmx) c.b.get(str);
                        if (agmxVar2 != null) {
                            agmxVar2.j(agqe.METADATA_ONLY);
                        }
                    }
                } else {
                    this.l.m(str);
                }
            }
            if (this.l.f().isEmpty()) {
                for (agii agiiVar : this.k) {
                    agio agioVar = agiiVar.a;
                    agioVar.e.a(agioVar.I);
                }
            }
            k.setTransactionSuccessful();
            k.endTransaction();
        } catch (SQLException e) {
            zep.d("[Offline] Error deleting video", e);
            k.endTransaction();
            return false;
        }
        return true;
    }

    public final synchronized boolean E(String str) {
        return P(str);
    }

    public final boolean F(String str, List list) {
        zgh.m(str);
        list.getClass();
        SQLiteDatabase k = k();
        k.beginTransaction();
        try {
            if (!this.d.m(str)) {
                k.endTransaction();
                return false;
            }
            SQLiteDatabase a = this.g.a.a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("adbreaks", zgt.g(aftn.k(list).toString()));
            contentValues.put("original_video_id", str);
            a.insert("adbreaks", null, contentValues);
            k.setTransactionSuccessful();
            k.endTransaction();
            return true;
        } catch (Throwable th) {
            k.endTransaction();
            throw th;
        }
    }

    public final synchronized boolean G(String str, PlayerResponseModel playerResponseModel, long j, boolean z, aanz aanzVar) {
        playerResponseModel.getClass();
        agmx p = this.l.p(str);
        if (p == null) {
            return false;
        }
        try {
            PlayerResponseModel l = playerResponseModel.l(aanzVar);
            this.d.f(l);
            long a = z ? j : p.a();
            this.d.k(str, l, a, j);
            p.k(l, a, j);
            for (agii agiiVar : this.k) {
                atse u = l.u();
                if (u != null) {
                    long j2 = u.f;
                    long r = ((agvq) agiiVar.a.d.get()).r(agiiVar.a.I);
                    if (j2 > 0 && (r == 0 || j2 < r)) {
                        agio agioVar = agiiVar.a;
                        agioVar.e.f(agioVar.I, j2);
                    }
                    ((agpp) agiiVar.a.m.get()).a();
                }
            }
            return true;
        } catch (SQLException e) {
            zep.d("[Offline] Error inserting player response", e);
            return false;
        }
    }

    public final boolean H(agqo agqoVar) {
        try {
            this.d.j(agqoVar);
            agmz c = this.l.c();
            synchronized (c.k) {
                agmx agmxVar = (agmx) c.b.get(agqoVar.f());
                if (agmxVar != null) {
                    agmxVar.l(agqoVar);
                }
            }
            return true;
        } catch (SQLException e) {
            zep.d("[Offline] Error updating single video", e);
            return false;
        }
    }

    public final synchronized boolean I(String str, WatchNextResponseModel watchNextResponseModel) {
        zgh.m(str);
        try {
            agmu agmuVar = this.d;
            ContentValues contentValues = new ContentValues();
            contentValues.put("watch_next_proto", watchNextResponseModel.a.toByteArray());
            int update = agmuVar.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
            if (update != 1) {
                StringBuilder sb = new StringBuilder(49);
                sb.append("Update video watch next affected ");
                sb.append(update);
                sb.append(" rows");
                throw new SQLException(sb.toString());
            }
        } catch (SQLException e) {
            zep.d("[Offline] Error inserting watch next response", e);
            return false;
        }
        return true;
    }

    public final agqm J(String str, agke agkeVar) {
        zgh.m(str);
        agml b = this.l.b(str);
        if (b == null) {
            return null;
        }
        return b.h(agkeVar);
    }

    public final void K(String str) {
        zgh.m(str);
        try {
            agmu agmuVar = this.d;
            ContentValues contentValues = new ContentValues();
            contentValues.putNull("player_response_proto");
            contentValues.putNull("refresh_token");
            contentValues.putNull("last_refresh_timestamp");
            contentValues.putNull("streams_timestamp");
            long update = agmuVar.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
            if (update == 1) {
                agmz c = this.l.c();
                synchronized (c.k) {
                    zgh.m(str);
                    agmx agmxVar = (agmx) c.b.get(str);
                    if (agmxVar != null) {
                        agmxVar.f();
                    }
                }
                return;
            }
            StringBuilder sb = new StringBuilder(47);
            sb.append("Update video affected ");
            sb.append(update);
            sb.append(" rows");
            throw new SQLException(sb.toString());
        } catch (SQLException e) {
            zep.d("[Offline] Error updating single video", e);
        }
    }

    public final synchronized List L(String str) {
        List list;
        zgh.m(str);
        SQLiteDatabase k = k();
        k.beginTransaction();
        try {
            agmk agmkVar = this.m;
            agqf t = agmkVar.t(str);
            long delete = agmkVar.a.a().delete("playlistsV13", "id = ?", new String[]{str});
            if (delete != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Delete playlist affected ");
                sb.append(delete);
                sb.append(" rows");
                throw new SQLException(sb.toString());
            }
            if (t == null) {
                list = amuk.q();
            } else {
                for (agls aglsVar : agmkVar.d) {
                    aglsVar.a(t);
                }
                String str2 = t.a;
                List w = agmkVar.w(str2);
                agmkVar.a.a().delete("playlist_video", "playlist_id = ?", new String[]{str2});
                for (agls aglsVar2 : agmkVar.d) {
                    aglsVar2.b(w);
                }
                list = w;
            }
            k.setTransactionSuccessful();
            k.endTransaction();
        } catch (SQLException e) {
            zep.d("[Offline] Error deleting playlist", e);
            k.endTransaction();
            return null;
        }
        return list;
    }

    public final synchronized void M(String str, boolean z) {
        zgh.m(str);
        try {
            this.b.c(str, z);
            this.l.l(str);
        } catch (SQLException e) {
            zep.d("[Offline] Error deleting streams", e);
        }
    }

    public final void N(String str) {
        str.getClass();
        try {
            this.f.a(str);
        } catch (SQLException e) {
            zep.d("[Offline] Error deleting subtitle tracks", e);
        }
    }

    public final void O(agqa agqaVar) {
        try {
            this.c.c(agqaVar);
        } catch (SQLException e) {
            zep.d("[Offline] Error inserting channel", e);
        }
    }

    public final synchronized boolean P(String str) {
        zgh.m(str);
        agmx p = this.l.p(str);
        if (p == null || this.l.c().h(str) || p.b() == agqe.DELETED) {
            return false;
        }
        try {
            this.m.z(str);
            this.l.h(str);
            return true;
        } catch (SQLException e) {
            zep.d("[Offline] Error inserting existing video as single video", e);
            return false;
        }
    }

    public final void Q(SubtitleTrack subtitleTrack) {
        try {
            SQLiteDatabase a = this.f.b.a();
            zgh.m(((AutoValue_SubtitleTrack) subtitleTrack).c);
            ContentValues contentValues = new ContentValues();
            contentValues.put("video_id", ((AutoValue_SubtitleTrack) subtitleTrack).b);
            contentValues.put("language_code", ((AutoValue_SubtitleTrack) subtitleTrack).a);
            contentValues.put("subtitles_path", ((AutoValue_SubtitleTrack) subtitleTrack).c);
            contentValues.put("track_vss_id", ((AutoValue_SubtitleTrack) subtitleTrack).d);
            contentValues.put("user_visible_track_name", subtitleTrack.toString());
            if (a.insert("subtitles_v5", null, contentValues) != -1) {
                return;
            }
            throw new SQLException("Error inserting subtitle track");
        } catch (SQLException e) {
            zep.d("[Offline] Error inserting subtitle tracks", e);
        }
    }

    public final synchronized void R(String str, agqe agqeVar, attl attlVar, String str2, int i, byte[] bArr) {
        zgh.m(str);
        agqeVar.getClass();
        if (this.l.p(str) != null) {
            return;
        }
        agqo c = c(str);
        if (c == null) {
            return;
        }
        try {
            this.d.i(str, agqeVar);
            agmu agmuVar = this.d;
            int a = ahdp.a(attlVar, 360);
            ContentValues contentValues = new ContentValues();
            contentValues.put("preferred_stream_quality", Integer.valueOf(a));
            long update = agmuVar.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
            if (update == 1) {
                agmu agmuVar2 = this.d;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("audio_track_id", str2);
                long update2 = agmuVar2.a.a().update("videosV2", contentValues2, "id = ?", new String[]{str});
                if (update2 == 1) {
                    long a2 = this.d.a(str);
                    if (a2 == 0) {
                        a2 = this.j.c();
                        this.d.h(str, a2);
                    }
                    this.l.t(c, attlVar, i, bArr, agqeVar, agqn.OFFLINE_IMMEDIATELY, a2);
                    return;
                }
                StringBuilder sb = new StringBuilder(56);
                sb.append("Update audio track id affected ");
                sb.append(update2);
                sb.append(" rows");
                throw new SQLException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(72);
            sb2.append("Update video preferred_stream_quality affected ");
            sb2.append(update);
            sb2.append(" rows");
            throw new SQLException(sb2.toString());
        } catch (SQLException e) {
            zep.d("[Offline] Error undeleting video", e);
        }
    }

    public final void S(agqa agqaVar) {
        try {
            this.c.d(agqaVar);
        } catch (SQLException e) {
            zep.d("[Offline] Error updating channel", e);
        }
    }

    public final synchronized void T(String str, long j) {
        zgh.m(str);
        agmx p = this.l.p(str);
        if (p == null) {
            return;
        }
        try {
            agmu agmuVar = this.d;
            ContentValues contentValues = new ContentValues();
            contentValues.put("last_playback_position_timestamp", Long.valueOf(j));
            long update = agmuVar.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
            if (update == 1) {
                p.h(j);
                return;
            }
            StringBuilder sb = new StringBuilder(81);
            sb.append("Update video last_playback_position_in_seconds affected ");
            sb.append(update);
            sb.append(" rows");
            throw new SQLException(sb.toString());
        } catch (SQLException e) {
            zep.d("[Offline] Error updating last playback position timestamp", e);
        }
    }

    public final synchronized void U(String str, long j) {
        zgh.m(str);
        agmx p = this.l.p(str);
        if (p == null) {
            return;
        }
        try {
            agmu agmuVar = this.d;
            ContentValues contentValues = new ContentValues();
            contentValues.put("last_playback_timestamp", Long.valueOf(j));
            long update = agmuVar.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
            if (update == 1) {
                p.i(j);
                return;
            }
            StringBuilder sb = new StringBuilder(71);
            sb.append("Update video last_playback_timestamp affected ");
            sb.append(update);
            sb.append(" rows");
            throw new SQLException(sb.toString());
        } catch (SQLException e) {
            zep.d("[Offline] Error updating last playback timestamp", e);
        }
    }

    public final synchronized void V(String str, agqe agqeVar) {
        zgh.m(str);
        agqeVar.getClass();
        agmx p = this.l.p(str);
        if (p == null || p.b() == agqeVar) {
            return;
        }
        try {
            this.d.i(str, agqeVar);
            p.j(agqeVar);
            agmz c = this.l.c();
            synchronized (c.k) {
                for (String str2 : c.c(str)) {
                    agmv i = c.i(str2);
                    if (i != null) {
                        synchronized (i.c.k) {
                            i.b = null;
                        }
                    }
                }
            }
        } catch (SQLException e) {
            zep.d("[Offline] Error updating media status", e);
        }
    }

    public final synchronized void W(String str, agqz agqzVar) {
        zgh.m(str);
        agqzVar.getClass();
        agmx p = this.l.p(str);
        if (p == null) {
            return;
        }
        synchronized (p.g.k) {
            p.d = agqzVar;
            p.f = null;
        }
    }

    public final void X(String str) {
        zgh.m(str);
        agmv o = this.l.o(str);
        if (o == null) {
            return;
        }
        try {
            agmk agmkVar = this.m;
            ContentValues contentValues = new ContentValues();
            contentValues.put("playlist_client_last_invalidation_timestamp", (Long) 0L);
            long update = agmkVar.a.a().update("playlistsV13", contentValues, "id = ?", new String[]{str});
            if (update == 1) {
                synchronized (o.c.k) {
                    o.b = null;
                }
                return;
            }
            StringBuilder sb = new StringBuilder(71);
            sb.append("Update playlist client invalidation timestamp ");
            sb.append(update);
            sb.append(" rows");
            throw new SQLException(sb.toString());
        } catch (SQLException e) {
            zep.d("[Offline] Error updating playlist client invalidation timestamp", e);
        }
    }

    public final synchronized void Y(String str, int i, String str2) {
        zgh.m(str);
        agml b = this.l.b(str);
        if (b == null) {
            return;
        }
        agql b2 = b.b(i);
        if (b2 == null) {
            return;
        }
        agqk d = b2.d();
        d.e = str2;
        ai(d.a());
    }

    public final void Z(String str, agqn agqnVar) {
        agqn agqnVar2;
        zgh.m(str);
        agqnVar.getClass();
        agmx p = this.l.p(str);
        if (p != null) {
            synchronized (p.g.k) {
                agqnVar2 = p.e;
            }
            if (agqnVar2 == agqnVar) {
                return;
            }
            try {
                agmu agmuVar = this.d;
                ContentValues contentValues = new ContentValues();
                contentValues.put("stream_transfer_condition", Integer.valueOf(agqnVar.g));
                long update = agmuVar.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
                if (update == 1) {
                    synchronized (p.g.k) {
                        p.e = agqnVar;
                        p.f = null;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder(73);
                sb.append("Update video stream transfer condition affected ");
                sb.append(update);
                sb.append(" rows");
                throw new SQLException(sb.toString());
            } catch (SQLException e) {
                zep.d("[Offline] Error updating stream transfer condition", e);
            }
        }
    }

    public final long a(String str) {
        return this.d.a(str);
    }

    public final void aa(String str, long j) {
        zgh.m(str);
        agmx p = this.l.p(str);
        if (p == null) {
            return;
        }
        try {
            this.d.h(str, j);
            synchronized (p.g.k) {
                p.c = j;
                p.f = null;
            }
        } catch (SQLException e) {
            zep.d("[Offline] Error updating video added timestamp", e);
        }
    }

    public final synchronized boolean ab(agqf agqfVar, attl attlVar, int i, int i2, byte[] bArr, long j, int i3) {
        try {
            agmk agmkVar = this.m;
            int a = ahdp.a(attlVar, 360);
            ContentValues s = agmk.s(agqfVar, agmkVar.c);
            s.put("preferred_stream_quality", Integer.valueOf(a));
            s.put("offline_audio_quality", Integer.valueOf(i - 1));
            s.put("offline_source_ve_type", Integer.valueOf(i2));
            if (bArr != null) {
                s.put("player_response_tracking_params", bArr);
            }
            s.put("playlist_added_timestamp_millis", Long.valueOf(j));
            s.put("playlist_offline_request_source", Integer.valueOf(i3 - 1));
            s.put("playlist_client_last_invalidation_timestamp", (Long) 0L);
            agmkVar.a.a().insertOrThrow("playlistsV13", null, s);
            int size = this.l.d().size();
            this.l.r(agqfVar, new ArrayList(), attlVar, i2, j, this.m.r(agqfVar.a), i3);
            if (size == 0 && this.l.d().size() == 1) {
                for (agii agiiVar : this.k) {
                    agio agioVar = agiiVar.a;
                    agioVar.f.e(agioVar.I);
                }
            }
        } catch (SQLException e) {
            zep.d("[Offline] Error inserting playlist", e);
            return false;
        }
        return true;
    }

    public final synchronized boolean ac(agqo agqoVar, attl attlVar, String str, int i, agqn agqnVar, int i2, byte[] bArr, agqe agqeVar) {
        return ad(agqoVar, attlVar, str, i, agqnVar, i2, bArr, agqeVar);
    }

    public final synchronized boolean ad(agqo agqoVar, attl attlVar, String str, int i, agqn agqnVar, int i2, byte[] bArr, agqe agqeVar) {
        SQLiteDatabase k = k();
        k.beginTransaction();
        long c = this.j.c();
        try {
            this.d.n(agqoVar, agqeVar, agqnVar, ahdp.a(attlVar, 360), str, i, i2, c, bArr);
            this.m.z(agqoVar.f());
            k.setTransactionSuccessful();
            k.endTransaction();
            this.l.t(agqoVar, attlVar, i2, bArr, agqeVar, agqnVar, c);
            this.l.h(agqoVar.f());
        } catch (SQLException e) {
            zep.d("[Offline] Error inserting single video or playlist video into database", e);
            k.endTransaction();
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b4, code lost:
        if (r7.c(r6) == defpackage.agqe.METADATA_ONLY) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ae(defpackage.agqf r28, java.util.List r29, defpackage.attl r30, int r31, java.util.Set r32, defpackage.agqn r33, int r34, byte[] r35) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aglj.ae(agqf, java.util.List, attl, int, java.util.Set, agqn, int, byte[]):boolean");
    }

    public final synchronized void af(String str, int i) {
        zgh.m(str);
        agml b = this.l.b(str);
        if (b == null) {
            return;
        }
        try {
            agme agmeVar = this.b;
            long delete = agmeVar.c.a().delete("streams", "video_id = ? AND itag = ?", new String[]{str, Integer.toString(i)});
            if (delete != 1) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Delete stream affected ");
                sb.append(delete);
                sb.append(" rows");
                throw new SQLException(sb.toString());
            }
            agmeVar.d.b.a().delete("hashes", "video_id = ? AND itag = ?", new String[]{str, String.valueOf(i)});
            b.e(i);
            if (b.c() != null || b.a() != null) {
                return;
            }
            this.l.l(str);
        } catch (SQLException e) {
            zep.d("[Offline] Error deleting stream", e);
        }
    }

    public final synchronized void ag(agql agqlVar) {
        try {
            agme agmeVar = this.b;
            agmeVar.c.a().insertOrThrow("streams", null, agmeVar.a(agqlVar));
            this.l.j(agqlVar);
        } catch (SQLiteConstraintException unused) {
            zep.b("[Offline] Failed insert due to constraint failure, attempting update");
            ai(agqlVar);
        } catch (SQLException e) {
            zep.d("[Offline] Error inserting stream", e);
        }
    }

    public final synchronized void ah(String str, int i, long j) {
        zgh.m(str);
        agml b = this.l.b(str);
        if (b == null) {
            return;
        }
        agql b2 = b.b(i);
        if (b2 != null && j >= b2.d) {
            agqk d = b2.d();
            d.c(j);
            ai(d.a());
        }
    }

    public final synchronized void ai(agql agqlVar) {
        try {
            agme agmeVar = this.b;
            long update = agmeVar.c.a().update("streams", agmeVar.a(agqlVar), "video_id = ? AND itag = ?", new String[]{agqlVar.g(), Integer.toString(agqlVar.a())});
            if (update == 1) {
                agmr agmrVar = this.l;
                agml a = agmrVar.c().a(agqlVar.g());
                if (a == null) {
                    zep.l("Stream to be updated was missing from cache. Inserting instead.");
                    agmrVar.j(agqlVar);
                    return;
                }
                for (agin aginVar : agmrVar.f) {
                    a.d();
                }
                a.g(agqlVar);
                agmrVar.c().g(agqlVar);
                return;
            }
            StringBuilder sb = new StringBuilder(66);
            sb.append("Update stream bytes_transferred affected ");
            sb.append(update);
            sb.append(" rows");
            throw new SQLException(sb.toString());
        } catch (SQLException e) {
            zep.d("[Offline] Error updating stream", e);
        }
    }

    public final agqa b(String str) {
        zgh.m(str);
        return this.c.b(str);
    }

    public final agqo c(String str) {
        zgh.m(str);
        return this.d.d(str);
    }

    public final attl d(String str) {
        zgh.m(str);
        attl b = ahdp.b(this.m.p(str));
        return b == attl.UNKNOWN_FORMAT_TYPE ? n : b;
    }

    public final attl e(String str) {
        int i;
        zgh.m(str);
        Cursor query = this.d.a.a().query("videosV2", new String[]{"preferred_stream_quality"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                i = query.getInt(0);
            } else {
                query.close();
                i = -1;
            }
            attl b = ahdp.b(i);
            return b == attl.UNKNOWN_FORMAT_TYPE ? n : b;
        } finally {
            query.close();
        }
    }

    public final List f() {
        return this.m.u();
    }

    public final List g(String str) {
        zgh.m(str);
        Cursor query = this.f.b.a().query("subtitles_v5", agmg.a, "video_id = ?", new String[]{str}, null, null, null, null);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("video_id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("language_code");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("subtitles_path");
            int columnIndex = query.getColumnIndex("track_vss_id");
            int columnIndex2 = query.getColumnIndex("user_visible_track_name");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                String string = query.getString(columnIndexOrThrow2);
                String string2 = query.getString(columnIndexOrThrow);
                String string3 = query.getString(columnIndexOrThrow3);
                String string4 = query.getString(columnIndex);
                String string5 = query.getString(columnIndex2);
                string2.getClass();
                string3.getClass();
                aiyg m = SubtitleTrack.m();
                m.e(string);
                m.j(string2);
                m.k(string4);
                m.i("");
                m.b = string5;
                m.f("");
                m.h("");
                m.b(0);
                m.g("");
                m.c(true);
                m.a = string3;
                arrayList.add(m.a());
            }
            return arrayList;
        } finally {
            query.close();
        }
    }

    public final boolean h(String str) {
        zgh.m(str);
        return this.h.b(str) > 0;
    }

    public final byte[] i(String str) {
        zgh.m(str);
        Cursor query = this.d.a.a().query("videosV2", new String[]{"player_response_tracking_params"}, "id = ?", new String[]{str}, null, null, null, null);
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

    public final int j(String str) {
        zgh.m(str);
        agqh n2 = n(str);
        if (n2 == null) {
            return 0;
        }
        return n2.d;
    }

    public final SQLiteDatabase k() {
        return this.l.a();
    }

    public final Pair l(String str) {
        SQLiteDatabase k = k();
        k.beginTransaction();
        try {
            zgh.m(str);
            agqf t = this.m.t(str);
            if (t == null) {
                return null;
            }
            zgh.m(str);
            List w = this.m.w(str);
            k.setTransactionSuccessful();
            return new Pair(t, w);
        } catch (SQLException unused) {
            return null;
        } finally {
            k.endTransaction();
        }
    }

    public final PlayerResponseModel m(String str) {
        PlayerResponseModel playerResponseModel;
        zgh.m(str);
        agmx p = this.l.p(str);
        if (p == null) {
            return null;
        }
        synchronized (p.g.k) {
            playerResponseModel = p.a;
        }
        return playerResponseModel;
    }

    public final agqh n(String str) {
        zgh.m(str);
        agmv o = this.l.o(str);
        if (o != null) {
            return o.b();
        }
        return null;
    }

    public final agqs o(String str) {
        zgh.m(str);
        agmy q = this.l.q(str);
        if (q != null) {
            return q.a();
        }
        return null;
    }

    public final agqv p(String str) {
        zgh.m(str);
        agmx p = this.l.p(str);
        if (p == null) {
            return null;
        }
        return p.e();
    }

    public final synchronized List q(String str) {
        ArrayList arrayList;
        zgh.m(str);
        arrayList = new ArrayList();
        Cursor rawQuery = this.m.a.a().rawQuery("SELECT video_id FROM playlist_video WHERE playlist_id = ? ORDER BY index_in_playlist ASC", new String[]{str});
        ArrayList<String> arrayList2 = new ArrayList();
        while (rawQuery.moveToNext()) {
            arrayList2.add(rawQuery.getString(0));
        }
        rawQuery.close();
        for (String str2 : arrayList2) {
            agqv p = p(str2);
            if (p != null && p.E()) {
                V(str2, agqe.ACTIVE);
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public final List r() {
        ArrayList arrayList;
        agmz c = this.l.c();
        synchronized (c.k) {
            arrayList = new ArrayList();
            Iterator it = c.l.iterator();
            while (it.hasNext()) {
                arrayList.add(((agmx) it.next()).e());
            }
        }
        return arrayList;
    }

    public final List s() {
        return this.l.f();
    }

    public final Set t(String str) {
        zgh.m(str);
        return this.l.c().c(str);
    }

    public final void u(String str, Set set) {
        Set<String> hashSet;
        Set<String> hashSet2;
        str.getClass();
        set.getClass();
        SQLiteDatabase k = k();
        k.beginTransaction();
        try {
            Cursor query = this.h.b.a().query("ads", new String[]{"ad_video_id"}, "original_video_id=? AND ad_video_id IS NOT NULL AND ad_break_id NOT LIKE ?", new String[]{str, ".CONTENT_INTERSTITIAL.%"}, null, null, null, null);
            if (query.getCount() <= 0) {
                hashSet = Collections.emptySet();
            } else {
                hashSet = new HashSet();
                while (query.moveToNext()) {
                    hashSet.add(query.getString(0));
                }
            }
            query.close();
            for (String str2 : hashSet) {
                if (this.h.b(str2) <= 1) {
                    this.i.b.a().delete("ad_videos", "ad_video_id=?", new String[]{str2});
                    if (!al(str2)) {
                        M(str2, set.contains(str2));
                    }
                }
            }
            Cursor query2 = this.h.b.a().query("ads", new String[]{"ad_intro_video_id"}, "original_video_id=? AND ad_intro_video_id IS NOT NULL AND ad_break_id NOT LIKE ?", new String[]{str, ".CONTENT_INTERSTITIAL.%"}, null, null, null, null);
            if (query2.getCount() <= 0) {
                hashSet2 = amyg.a;
            } else {
                hashSet2 = new HashSet();
                while (query2.moveToNext()) {
                    hashSet2.add(query2.getString(0));
                }
            }
            query2.close();
            for (String str3 : hashSet2) {
                if (this.h.a("SELECT COUNT(DISTINCT ad_video_id) FROM ads WHERE ad_intro_video_id=?", new String[]{str3}) <= 1 && !al(str3)) {
                    M(str3, set.contains(str3));
                }
            }
            this.h.b.a().delete("ads", "original_video_id=? AND ad_break_id NOT LIKE ?", new String[]{str, ".CONTENT_INTERSTITIAL.%"});
            this.g.a.a().delete("adbreaks", "original_video_id=?", new String[]{str});
            k.setTransactionSuccessful();
        } finally {
            k.endTransaction();
        }
    }

    public final void v(String str) {
        u(str, amyg.a);
        B(amyg.a, str);
    }

    public final void w(agqo agqoVar) {
        if (agqoVar.c) {
            return;
        }
        try {
            this.f.a(agqoVar.f());
            this.d.g(agqoVar);
        } catch (SQLException e) {
            zep.d("[Offline] Error cleaning up video", e);
        }
    }

    public final void x(String str) {
        agmx p = this.l.p(str);
        if (p != null) {
            agqo c = c(str);
            if (c != null) {
                p.l(c);
            } else {
                this.l.m(str);
            }
        }
    }

    public final void y() {
        agmr agmrVar = this.l;
        agmrVar.a.execute(new agmn(agmrVar));
    }

    public final synchronized void z(String str) {
        PlayerResponseModel playerResponseModel;
        long j;
        zgh.m(str);
        agmx p = this.l.p(str);
        if (p == null) {
            return;
        }
        Cursor query = this.d.a.a().query("videosV2", new String[]{"player_response_proto"}, "id = ?", new String[]{str}, null, null, null, null);
        if (query.moveToNext()) {
            query.getClass();
            PlayerResponseModel d = agpr.d(query, query.getColumnIndexOrThrow("player_response_proto"));
            query.close();
            playerResponseModel = d;
        } else {
            query.close();
            playerResponseModel = null;
        }
        if (playerResponseModel == null) {
            return;
        }
        long a = p.a();
        synchronized (p.g.k) {
            j = p.b;
        }
        this.d.f(playerResponseModel);
        this.d.k(str, playerResponseModel, a, j);
        p.k(playerResponseModel, a, j);
    }
}
