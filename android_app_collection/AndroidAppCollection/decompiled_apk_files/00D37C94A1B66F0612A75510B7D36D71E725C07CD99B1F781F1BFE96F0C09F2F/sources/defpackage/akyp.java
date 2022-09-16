package defpackage;
/* compiled from: PG */
/* renamed from: akyp  reason: default package */
/* loaded from: classes.dex */
public final class akyp implements ankb {
    final /* synthetic */ alfd a;
    final /* synthetic */ afvm b;
    final /* synthetic */ akys c;

    public akyp(akys akysVar, alfd alfdVar, afvm afvmVar) {
        this.c = akysVar;
        this.a = alfdVar;
        this.b = afvmVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        this.c.h.b("Failed to add normal job.", th);
        zep.f("UploadEngine", "Failed to add normal job.", th);
        this.c.i.g(this.a.b, this.b.d(), avug.UPLOAD_CREATION_FAILURE_REASON_JOB_CREATION_FAILED);
        ((alci) this.c.l.get()).A(this.a.b);
        this.c.j.c(this.a.b);
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        alcw alcwVar = (alcw) obj;
    }
}
