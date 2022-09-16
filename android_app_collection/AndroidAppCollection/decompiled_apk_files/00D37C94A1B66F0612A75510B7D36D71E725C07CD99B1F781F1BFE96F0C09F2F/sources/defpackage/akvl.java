package defpackage;
/* compiled from: PG */
/* renamed from: akvl  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class akvl implements amqo {
    public final /* synthetic */ akvm a;
    private final /* synthetic */ int b;

    public /* synthetic */ akvl(akvm akvmVar) {
        this.a = akvmVar;
    }

    public /* synthetic */ akvl(akvm akvmVar, int i) {
        this.b = i;
        this.a = akvmVar;
    }

    @Override // defpackage.amqo
    public final Object get() {
        int i = this.b;
        if (i == 0) {
            vpg e = this.a.a.e("/client_streamz/youtube/offline/stream_verification", vpf.c("verify_type"), vpf.c("verify_result"), vpf.c("verify_strategy"), vpf.c("playback_exception_type"));
            e.c();
            return e;
        } else if (i == 1) {
            vpg e2 = this.a.a.e("/client_streamz/youtube/search/suggest/error_count", vpf.c("suggest_error"), vpf.c("error_source"));
            e2.c();
            return e2;
        } else if (i == 2) {
            vpg e3 = this.a.a.e("/client_streamz/youtube/offline_privacy_migration", vpf.c("migration_location"), vpf.c("migration_state"));
            e3.c();
            return e3;
        } else if (i == 3) {
            vpg e4 = this.a.a.e("/client_streamz/youtube/notifications/invalidation_count", vpf.c("invalidation_event"));
            e4.c();
            return e4;
        } else {
            vpg e5 = this.a.a.e("/client_streamz/youtube/notifications/background_data_count", vpf.c("background_data_event"));
            e5.c();
            return e5;
        }
    }
}
