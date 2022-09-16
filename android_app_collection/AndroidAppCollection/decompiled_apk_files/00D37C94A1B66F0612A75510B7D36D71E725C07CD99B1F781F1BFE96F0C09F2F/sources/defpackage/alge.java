package defpackage;

import android.util.Pair;
/* compiled from: PG */
/* renamed from: alge  reason: default package */
/* loaded from: classes.dex */
final class alge implements alax {
    final /* synthetic */ algg a;

    public alge(algg alggVar) {
        this.a = alggVar;
    }

    @Override // defpackage.alax
    public final void a(String str, String str2, augw augwVar) {
        algg alggVar = this.a;
        synchronized (alggVar.h) {
            if (str2 != null) {
                if (alggVar.h.containsKey(str2)) {
                    alggVar.g.d((String) ((Pair) alggVar.h.get(str2)).first, augwVar);
                }
            }
        }
    }

    @Override // defpackage.alax
    public final /* synthetic */ void b(String str, String str2, avhj avhjVar) {
    }

    @Override // defpackage.alax
    public final /* synthetic */ void c(String str, String str2, avtl avtlVar) {
    }

    @Override // defpackage.alax
    public final void d(String str, String str2, avvd avvdVar) {
        algg alggVar = this.a;
        synchronized (alggVar.h) {
            if (str2 != null) {
                if (alggVar.h.containsKey(str2)) {
                    try {
                        alggVar.e.a((String) ((Pair) alggVar.h.get(str2)).first, new algf(alggVar.f, avvdVar));
                    } catch (akzq e) {
                        alggVar.c.b("UploadFeedbackTask JobStorageException", e);
                    }
                }
            }
        }
    }

    @Override // defpackage.alax
    public final void e(String str) {
        algg alggVar = this.a;
        if (str == null) {
            return;
        }
        alggVar.s(str, alggVar.d.e());
    }

    @Override // defpackage.alax
    public final void f(String str, Exception exc) {
        algg alggVar = this.a;
        alggVar.c.b("Polling finished with error.", exc);
        if (str == null) {
            return;
        }
        alggVar.s(str, alggVar.d.c(avun.UPLOAD_PROCESSOR_FAILURE_REASON_INNERTUBE_FAILED));
    }

    @Override // defpackage.alax
    public final /* synthetic */ void g() {
    }
}
