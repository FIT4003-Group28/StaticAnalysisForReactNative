package defpackage;
/* compiled from: PG */
/* renamed from: algz  reason: default package */
/* loaded from: classes.dex */
final class algz implements ankb {
    final /* synthetic */ String a;
    final /* synthetic */ algt b;
    final /* synthetic */ algr c;
    final /* synthetic */ alhb d;
    final /* synthetic */ long e;
    final /* synthetic */ boolean f;
    final /* synthetic */ String g;
    final /* synthetic */ ankt h;
    final /* synthetic */ alhc i;

    public algz(alhc alhcVar, String str, algt algtVar, algr algrVar, alhb alhbVar, long j, boolean z, String str2, ankt anktVar) {
        this.i = alhcVar;
        this.a = str;
        this.b = algtVar;
        this.c = algrVar;
        this.d = alhbVar;
        this.e = j;
        this.f = z;
        this.g = str2;
        this.h = anktVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        alcw alcwVar;
        if (this.h.isCancelled()) {
            String.valueOf(this.g).concat(" interrupted because the Future was cancelled");
            return;
        }
        if (this.c.a()) {
            try {
                alcwVar = this.i.d.b(this.a);
            } catch (akzq e) {
                this.i.e.b("Unexeptected missing job while evaluating interruption.", e);
                zep.f("UploadTaskController", "Unexeptected missing job while evaluating interruption.", e);
                alcwVar = null;
            }
            if (alcwVar != null && alcwVar.s && !alcwVar.t) {
                String.valueOf(this.g).concat(" interrupted because the Future was interrupted.");
                return;
            }
        }
        this.i.f(this.a, this.b.m(th, this.a, this.i.d, !this.f), this.b, this.c, this.d, this.e, this.f, this.g);
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.i.f(this.a, (akzs) obj, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
