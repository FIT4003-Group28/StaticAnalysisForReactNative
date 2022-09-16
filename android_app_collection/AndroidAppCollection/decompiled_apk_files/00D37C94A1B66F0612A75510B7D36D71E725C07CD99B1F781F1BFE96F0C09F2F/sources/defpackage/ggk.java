package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.Pair;
/* compiled from: PG */
/* renamed from: ggk  reason: default package */
/* loaded from: classes3.dex */
public final class ggk extends yel {
    public final fqd a;
    public niw b;
    public ezf c;
    public final fqb d;
    private final Activity h;
    private final fyy i;
    private Object j;
    private final gcc k;

    public ggk(Activity activity, axnm axnmVar, acth acthVar, fqd fqdVar, fyy fyyVar, gcc gccVar, aacz aaczVar) {
        super(activity, axnmVar, acthVar);
        this.h = activity;
        this.a = fqdVar;
        this.i = fyyVar;
        this.d = new fqb() { // from class: ggj
            @Override // defpackage.fqb
            public final void g(Configuration configuration) {
                ggk.this.c();
            }
        };
        this.k = gccVar;
        asxj asxjVar = aaczVar.b().e;
        if (!(asxjVar == null ? asxj.a : asxjVar).ce) {
            axnmVar.get();
        }
    }

    private final void f() {
        Object obj = this.j;
        if (obj == null) {
            return;
        }
        this.k.d(obj);
        this.j = null;
    }

    @Override // defpackage.yel
    public final void a() {
        super.a();
        f();
        ezv.q(this.h, true);
        ezv.p(this.h, true);
        this.i.m(3);
    }

    @Override // defpackage.yel
    public final void b(Object obj, Pair pair) {
        niw niwVar = this.b;
        if (niwVar != null) {
            niwVar.f();
        }
        if (pair != null && ((String) pair.first).equals("overlay_lock_orientation")) {
            if (!pair.second.equals(true)) {
                f();
            } else if (this.j == null) {
                this.j = this.k.c(1);
            }
        }
        this.i.h(3);
        super.b(obj, pair);
        ezv.q(this.h, false);
        ezv.p(this.h, false);
    }
}
