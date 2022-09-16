package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: cjvc  reason: default package */
/* loaded from: classes.dex */
public final class cjvc implements cjqq {
    public final cjqy a;
    public final cjuy b;
    private final cqat c;
    private final dzsj<duxm> d;
    @dzsi
    private cjsa g;
    private final cjun f = new cjun();
    private final dbty<cjqp> e = dbud.a(new dbty(this) { // from class: cjvb
        private final cjvc a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            cjvc cjvcVar = this.a;
            cjsz cjszVar = new cjsz(dtxy.a);
            cjqp m = cjvcVar.m(cjvcVar.a.r(cjszVar), cjszVar, true);
            cjvcVar.b.a(m);
            return m;
        }
    });

    public cjvc(cqat cqatVar, cjuy cjuyVar, dzsj<duxm> dzsjVar, cjqy cjqyVar) {
        this.a = cjqyVar;
        this.c = cqatVar;
        this.b = cjuyVar;
        this.d = dzsjVar;
    }

    @dzsi
    private static cjqp n(View view) {
        return (cjqp) view.getTag(R.id.page_logging_context);
    }

    @Override // defpackage.cjqj
    public final List<cjsa> a() {
        dccx dccxVar = new dccx();
        cjsa cjsaVar = this.g;
        if (cjsaVar != null) {
            dccxVar.g(cjsaVar);
        }
        synchronized (this) {
            dccxVar.i(this.f.b());
        }
        return dccxVar.f();
    }

    @Override // defpackage.cjqj
    public final void b(@dzsi cjsa cjsaVar) {
        this.g = cjsaVar;
    }

    @Override // defpackage.cjqj
    @dzsi
    public final cjsa c() {
        return this.g;
    }

    @Override // defpackage.cjqj
    @dzsi
    public final cjsa d() {
        synchronized (this) {
            if (this.f.a()) {
                return null;
            }
            return this.f.e();
        }
    }

    @Override // defpackage.cjqq
    public final cjqp e(cjrc cjrcVar, cjtg cjtgVar) {
        return m(cjrcVar, cjtgVar, false);
    }

    @Override // defpackage.cjqq
    public final cjqp f(View view) {
        cjqp n;
        cjqp n2 = n(view);
        if (n2 != null) {
            return n2;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if ((parent instanceof ViewGroup) && (n = n((ViewGroup) parent)) != null) {
                return n;
            }
        }
        return g();
    }

    @Override // defpackage.cjqq
    public final cjqp g() {
        return this.e.a();
    }

    @Override // defpackage.cjqq
    public final void h(View view) {
        cjqp cjqpVar = (cjqp) view.getTag(R.id.page_logging_context);
        if (cjqpVar != null) {
            cjqpVar.j();
        }
        view.setTag(R.id.page_logging_context, null);
    }

    @Override // defpackage.cjqq
    public final void i(cjqp cjqpVar, View view) {
        cjqpVar.i();
        view.setTag(R.id.page_logging_context, cjqpVar);
    }

    @Override // defpackage.cjqq
    public final cjqp j(cjtg cjtgVar) {
        dbsk.s(cjtgVar);
        cjrc r = this.a.r(cjtgVar);
        cjsa cjsaVar = new cjsa(r, null, null, cjtgVar);
        synchronized (this) {
            this.f.c(cjsaVar);
        }
        return e(r, cjtgVar);
    }

    @Override // defpackage.cjqq
    public final cjqp k(cjtg cjtgVar, @dzsi cjtg cjtgVar2) {
        synchronized (this) {
            cjsa f = this.f.f(cjtgVar2);
            if (f != null) {
                while (!this.f.a() && this.f.d() != f) {
                }
            }
        }
        return j(cjtgVar);
    }

    @Override // defpackage.cjqq
    public final void l(cjqp cjqpVar) {
        cjtg cjtgVar;
        synchronized (this) {
            cjsa f = this.f.f(cjqpVar.b());
            cjtgVar = null;
            if (f != null) {
                while (true) {
                    if (this.f.a()) {
                        break;
                    } else if (f.equals(this.f.d())) {
                        if (!this.f.a()) {
                            cjtgVar = this.f.d().d;
                        }
                    }
                }
            }
        }
        cjqpVar.h();
        cjqpVar.f();
        if (cjtgVar != null) {
            j(cjtgVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cjqp m(cjrc cjrcVar, cjtg cjtgVar, boolean z) {
        return new cjva(this, cjtgVar, cjrcVar, this.a, this.c, this.b, this.d, z);
    }
}
