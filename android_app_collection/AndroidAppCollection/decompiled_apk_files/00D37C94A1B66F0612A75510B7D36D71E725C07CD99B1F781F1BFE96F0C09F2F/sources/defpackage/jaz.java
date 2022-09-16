package defpackage;

import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: jaz  reason: default package */
/* loaded from: classes3.dex */
public final class jaz extends jas {
    private final aagi a;
    private final Executor b;
    private aypg c;
    private awka d;

    public jaz(aagi aagiVar, Executor executor) {
        this.a = aagiVar;
        this.b = executor;
    }

    @Override // defpackage.jaw
    public final void d() {
        this.c = this.a.c().g(awka.class).X(azpj.b(this.b)).I(ikb.t).V(iyw.d).k(awka.class).as(new ayqb() { // from class: jay
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                jaz.this.f((awka) obj);
            }
        });
    }

    @Override // defpackage.jaw
    public final void e() {
        aypg aypgVar = this.c;
        if (aypgVar != null && !aypgVar.e()) {
            ayqi.c((AtomicReference) this.c);
            this.c = null;
        }
        this.d = null;
    }

    public final void f(awka awkaVar) {
        HashSet f;
        awkaVar.getClass();
        awka awkaVar2 = this.d;
        if (awkaVar2 == null) {
            f = amyv.e();
        } else {
            f = amyv.f(awkaVar2.getDownloads());
        }
        HashSet f2 = amyv.f(awkaVar.getDownloads());
        amys c = amyv.c(f2, f);
        amys c2 = amyv.c(f, f2);
        this.d = awkaVar;
        amzs it = ((amyq) c).iterator();
        while (it.hasNext()) {
            awkb awkbVar = (awkb) it.next();
            if (awkbVar.b == 1) {
                final String g = aakj.g((String) awkbVar.c);
                super.b(new jbg() { // from class: jaq
                    @Override // defpackage.jbg
                    public final void a(Object obj) {
                        ((jav) obj).a(g);
                    }
                });
            }
        }
        amzs it2 = ((amyq) c2).iterator();
        while (it2.hasNext()) {
            awkb awkbVar2 = (awkb) it2.next();
            if (awkbVar2.b == 1) {
                aakj.g((String) awkbVar2.c);
                super.b(new jbg() { // from class: jar
                    @Override // defpackage.jbg
                    public final void a(Object obj) {
                        ((jav) obj).b();
                    }
                });
            }
        }
    }
}
