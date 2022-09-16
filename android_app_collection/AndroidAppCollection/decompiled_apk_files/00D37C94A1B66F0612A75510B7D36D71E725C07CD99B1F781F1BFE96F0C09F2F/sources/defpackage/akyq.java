package defpackage;
/* compiled from: PG */
/* renamed from: akyq  reason: default package */
/* loaded from: classes.dex */
public final class akyq implements ankb {
    final /* synthetic */ String a;
    final /* synthetic */ afvm b;
    final /* synthetic */ akys c;
    private final /* synthetic */ int d;

    public akyq(akys akysVar, String str, afvm afvmVar) {
        this.c = akysVar;
        this.a = str;
        this.b = afvmVar;
    }

    public akyq(akys akysVar, String str, afvm afvmVar, int i) {
        this.d = i;
        this.c = akysVar;
        this.a = str;
        this.b = afvmVar;
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (this.d == 0) {
            alcw alcwVar = (alcw) obj;
        } else {
            alcw alcwVar2 = (alcw) obj;
        }
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        if (this.d == 0) {
            this.c.h.b("Failed to add feedback only job.", th);
            zep.f("UploadEngine", "Failed to add feedback only job.", th);
            this.c.i.g(this.a, this.b.d(), avug.UPLOAD_CREATION_FAILURE_REASON_JOB_CREATION_FAILED);
            this.c.j.c(this.a);
            return;
        }
        this.c.h.b("Failed to add reels job.", th);
        zep.f("UploadEngine", "Failed to add reels job.", th);
        this.c.i.g(this.a, this.b.d(), avug.UPLOAD_CREATION_FAILURE_REASON_JOB_CREATION_FAILED);
        this.c.j.c(this.a);
    }
}
