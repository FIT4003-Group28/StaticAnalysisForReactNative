package defpackage;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: sfc  reason: default package */
/* loaded from: classes7.dex */
public class sfc {
    public final cjtd a;
    public final cjtd b;
    public rzp c;
    private final eeu d;
    private final Context e;
    private final rzn f;
    private final sex g;
    private final axwq h;
    private final qjk i;
    private final ckcw j;
    private final String k;

    public sfc(Application application, eeu eeuVar, rzn rznVar, sey seyVar, axwq axwqVar, qjk qjkVar, ckcw ckcwVar, String str, @dzsi ddho ddhoVar, @dzsi ddho ddhoVar2, rzp rzpVar) {
        cjtd cjtdVar;
        this.e = application;
        this.d = eeuVar;
        this.f = rznVar;
        this.h = axwqVar;
        this.i = qjkVar;
        this.j = ckcwVar;
        this.g = seyVar.a(rzpVar);
        this.c = rzpVar;
        this.k = str;
        if (ddhoVar2 != null) {
            cjtdVar = cjtd.a(ddhoVar2);
        } else {
            cjtdVar = cjtd.b;
        }
        this.b = cjtdVar;
        this.a = ddhoVar != null ? cjtd.a(ddhoVar) : cjtd.b;
    }

    public final cqkl a(rzo rzoVar) {
        rzp h = this.c.h(rzoVar);
        rzp rzpVar = this.c;
        this.c = rzp.j(rzpVar.a(), rzpVar.b(), rzpVar.c(), rzpVar.d(), true, false, rzpVar.g());
        if (this.d.b()) {
            if (h != null) {
                this.f.c(h);
            } else {
                this.g.a();
            }
        }
        return cqkl.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final rzo b() {
        return sht.t(this.i.f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return this.c.e();
    }

    public final cqkl d() {
        this.g.a();
        if (!this.c.a().isEmpty()) {
            Context context = this.e;
            Toast.makeText(context, context.getString(R.string.COMMUTE_SETUP_EXIT_MESSAGE), 0).show();
        }
        return cqkl.a;
    }

    public final jhz e() {
        jhz a = jhz.a();
        a.a = this.k;
        a.i = null;
        a.j = null;
        a.f(null);
        a.B = 1;
        a.C = 2;
        a.x = false;
        return a;
    }

    public final void f() {
        ((ckcn) this.j.a(ckeo.g)).a();
        this.h.s(null);
    }

    public final boolean g() {
        return this.c.f();
    }
}
