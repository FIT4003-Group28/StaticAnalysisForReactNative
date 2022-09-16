package defpackage;

import android.text.TextUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;
/* compiled from: PG */
/* renamed from: akhv  reason: default package */
/* loaded from: classes.dex */
public final class akhv implements akgm, akgs {
    public final akid a;
    public final Semaphore b;
    public akvm c;
    public acvh d;
    private final yqw e;
    private final snc f;

    public akhv(yqw yqwVar, akid akidVar, snc sncVar) {
        yqwVar.getClass();
        this.e = yqwVar;
        this.a = akidVar;
        this.f = sncVar;
        this.b = new Semaphore(4, true);
    }

    @Override // defpackage.akgm
    public final void a(akvm akvmVar) {
        throw null;
    }

    public final akhe b(akhr akhrVar) {
        int i;
        int d;
        ankt b;
        if (!akhrVar.b()) {
            if (!TextUtils.isEmpty(null)) {
                return new akgq().d();
            }
            try {
                this.b.acquire();
                akic a = akhrVar.a();
                a.c = this.d;
                snc sncVar = this.f;
                i = 0;
                d = sncVar != null ? (int) sncVar.d() : 0;
                b = this.e.b(a);
                b.qY(new Runnable() { // from class: akhu
                    @Override // java.lang.Runnable
                    public final void run() {
                        akhv.this.b.release();
                    }
                }, anjk.a);
            } catch (InterruptedException unused) {
            }
            try {
                akhh akhhVar = (akhh) ((cfb) b.get()).a;
                akhhVar.j(apwt.s(akhrVar));
                if (akhhVar == null) {
                    String valueOf = String.valueOf(akhrVar.d);
                    apwt.t(valueOf.length() != 0 ? "Suggest returned a null response for query: ".concat(valueOf) : new String("Suggest returned a null response for query: "));
                    return null;
                }
                snc sncVar2 = this.f;
                if (sncVar2 != null) {
                    i = (int) sncVar2.d();
                }
                akhhVar.a(this.c);
                akhe d2 = akhhVar.d();
                if (d2 != null) {
                    d2.f = akhhVar.oj();
                    apwt.w(d2);
                    d2.d = i - d;
                }
                if (this.a != null && akhrVar.d.isEmpty()) {
                    this.a.e(akhhVar);
                }
                return d2;
            } catch (InterruptedException unused2) {
                b.cancel(true);
            } catch (CancellationException e) {
                e = e;
                apwt.u("Suggest task error", e);
                return null;
            } catch (ExecutionException e2) {
                e = e2;
                apwt.u("Suggest task error", e);
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.akgs
    public final acvh c() {
        return this.d;
    }

    public final boolean d(akhr akhrVar) {
        if (!akhrVar.b()) {
            return false;
        }
        akic a = akhrVar.a();
        a.c = this.d;
        a.b = true;
        try {
            if (((akhh) ((cfb) this.e.b(a).get()).a) == null) {
                return false;
            }
            akid akidVar = this.a;
            if (akidVar != null) {
                akidVar.d();
            }
            return true;
        } catch (InterruptedException | CancellationException unused) {
            return false;
        } catch (ExecutionException e) {
            apwt.u("Suggest deletion task threw an exception", e);
            return false;
        }
    }
}
