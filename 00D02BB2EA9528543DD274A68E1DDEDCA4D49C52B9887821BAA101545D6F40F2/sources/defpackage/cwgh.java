package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cwgh  reason: default package */
/* loaded from: classes5.dex */
final class cwgh<AccountT> {
    public static cwic a(cwdc cwdcVar) {
        cwib g = cwic.g();
        g.e(cwdcVar.a());
        g.d(cwdcVar.b());
        g.f(cwdcVar.c());
        g.g(cwdcVar.e());
        g.h(cwdcVar.d());
        return g.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final dcdc<cwic> b(Context context, final cvze cvzeVar, cwii cwiiVar, dccx dccxVar, cwiv cwivVar) {
        cwic i;
        final cvzg a = cvzeVar.a();
        final cvyu b = cvzeVar.b().b();
        cwdc cwdcVar = null;
        if (!cwhw.a(context)) {
            i = null;
        } else {
            cwib g = cwic.g();
            g.e(R.id.og_ai_add_another_account);
            Drawable b2 = sl.b(context, R.drawable.quantum_gm_ic_person_add_vd_theme_24);
            dbsk.s(b2);
            g.d(b2);
            g.f(context.getString(R.string.og_add_another_account));
            g.g(new View.OnClickListener(b, a) { // from class: cwhx
                private final cvub a;
                private final cvzg b;

                {
                    this.a = b;
                    this.b = a;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.a(view, this.b.e());
                }
            });
            g.h(90141);
            i = g.i();
        }
        if (cwhw.a(context)) {
            cwdb l = cwdc.l();
            l.d(R.id.og_ai_manage_accounts);
            Drawable b3 = sl.b(context, R.drawable.quantum_gm_ic_manage_accounts_vd_theme_24);
            dbsk.s(b3);
            l.c(b3);
            l.e(context.getString(R.string.og_manage_accounts));
            l.f(new View.OnClickListener(cvzeVar) { // from class: cvzy
                private final cvze a;

                {
                    this.a = cvzeVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cvze cvzeVar2 = this.a;
                    cvzeVar2.b().c().a(view, cvzeVar2.a().e());
                }
            });
            l.g(90142);
            cwdcVar = l.a();
        }
        cwdc cwdcVar2 = cwdcVar;
        if (i != null) {
            dccxVar.g(d(i, 11, cwiiVar, cwivVar));
        }
        if (cwdcVar2 != null) {
            dccxVar.g(c(cwdcVar2, 12, context, cvzeVar, cwiiVar, dccxVar, cwivVar));
        }
        return dccxVar.f();
    }

    public static final cwic c(cwdc cwdcVar, int i, Context context, cvze cvzeVar, cwii cwiiVar, dccx dccxVar, cwiv cwivVar) {
        return d(a(cwdcVar), i, cwiiVar, cwivVar);
    }

    private static final cwic d(cwic cwicVar, int i, cwii cwiiVar, cwiv cwivVar) {
        cwiw cwiwVar = new cwiw(cwicVar.e());
        cwiwVar.b(cwivVar, i);
        cwiwVar.c = cwiiVar.a();
        cwiwVar.d = cwiiVar.b();
        return cwicVar.h(cwiwVar.a());
    }
}
