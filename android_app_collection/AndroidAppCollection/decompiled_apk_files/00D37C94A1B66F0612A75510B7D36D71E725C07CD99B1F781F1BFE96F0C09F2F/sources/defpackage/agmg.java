package defpackage;
/* compiled from: PG */
/* renamed from: agmg  reason: default package */
/* loaded from: classes.dex */
public final class agmg {
    static final String[] a = {"video_id", "language_code", "subtitles_path", "track_vss_id", "user_visible_track_name"};
    public final agli b;

    public agmg(agli agliVar) {
        this.b = agliVar;
    }

    public final void a(String str) {
        this.b.a().delete("subtitles_v5", "video_id = ?", new String[]{str});
    }
}
