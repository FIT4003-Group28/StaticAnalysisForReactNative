package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crdd  reason: default package */
/* loaded from: classes5.dex */
public final class crdd implements crbb {
    final /* synthetic */ crde a;

    public crdd(crde crdeVar) {
        this.a = crdeVar;
    }

    @Override // defpackage.crbb
    public final void a(crbc crbcVar) {
        bvrj.UI_THREAD.c();
        cree creeVar = this.a.f;
        if (creeVar != null) {
            creeVar.b(crbcVar.d());
        }
        crde crdeVar = this.a;
        crdeVar.d.f(crdeVar.g.b());
    }

    @Override // defpackage.crbb
    public final void b(crbc crbcVar) {
        bvrj.UI_THREAD.c();
        synchronized (this.a.b) {
            this.a.b.h();
            crde crdeVar = this.a;
            cree creeVar = crdeVar.f;
            if (creeVar != null) {
                if (crdeVar.h) {
                    creeVar.a(cred.CANCELLED);
                } else {
                    int f = crbcVar.f();
                    int i = f - 1;
                    if (f == 0) {
                        throw null;
                    }
                    if (i == 3) {
                        this.a.f.a(cred.FINISHED_NON_AUDIO);
                    } else {
                        this.a.f.a(cred.FINISHED_AUDIO);
                    }
                }
            }
        }
    }
}
