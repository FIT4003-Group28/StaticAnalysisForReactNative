package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.mdx.model.AppStatus;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: adql  reason: default package */
/* loaded from: classes.dex */
public final class adql extends ados {
    public static final String k = zep.a("MDX.DialRecoverer");
    public final adas l;
    public ankt m;
    private final Executor n;
    private final ankw o;

    public adql(bhd bhdVar, bgo bgoVar, adgc adgcVar, yrj yrjVar, adas adasVar, yni yniVar, Executor executor, ankw ankwVar) {
        super(bhdVar, bgoVar, adgcVar, yrjVar, yniVar, 3, true);
        this.l = adasVar;
        this.n = executor;
        this.o = ankwVar;
    }

    @Override // defpackage.ados
    protected final void a() {
        ankt anktVar = this.m;
        if (anktVar != null) {
            anktVar.cancel(true);
            this.m = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ados
    public final void b(final bhc bhcVar) {
        if (adgl.i(bhcVar)) {
            final Uri f = adid.f(bhcVar.q);
            if (f == null) {
                zep.m(k, "dial app uri is null");
                return;
            }
            ankt anktVar = this.m;
            if (anktVar != null) {
                anktVar.cancel(true);
                zep.h(k, "cancelling running app status task and retrying");
            }
            ankt qp = this.o.qp(new Callable() { // from class: adqk
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    adql adqlVar = adql.this;
                    return adqlVar.l.a(f);
                }
            });
            this.m = qp;
            ylx.k(qp, this.n, new ylv() { // from class: adqi
                @Override // defpackage.zdt
                /* renamed from: b */
                public final void a(Throwable th) {
                    adql adqlVar = adql.this;
                    zep.f(adql.k, "DIAL Error.", th);
                    adqlVar.h();
                    adqlVar.m = null;
                }
            }, new ylw() { // from class: adqj
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    adql adqlVar = adql.this;
                    bhc bhcVar2 = bhcVar;
                    int a = ((AppStatus) obj).a();
                    if (a == -2) {
                        adqlVar.h();
                    } else if (a == -1) {
                        zep.m(adql.k, "DIAL screen found but app is not found");
                        adqlVar.g();
                    } else if (a == 0) {
                        zep.m(adql.k, "DIAL screen found but app is installable");
                        adqlVar.g();
                    } else if (a == 1) {
                        adqlVar.c(bhcVar2);
                    } else if (a == 2) {
                        adqlVar.g();
                    } else {
                        aqxo.z(false, "invalid status");
                    }
                    adqlVar.m = null;
                }
            });
            return;
        }
        zep.m(k, "Non DIAL route was passed in for recovery.");
    }
}
