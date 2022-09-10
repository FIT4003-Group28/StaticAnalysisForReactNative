package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: brge  reason: default package */
/* loaded from: classes4.dex */
public class brge implements brgq {
    public final brgd a;
    private final Activity b;
    private final brgl c;
    private String d;

    public brge(Activity activity, brgd brgdVar, brgk brgkVar, brdi brdiVar, brda brdaVar, dehq dehqVar, cqhn cqhnVar) {
        dbsk.l(true);
        this.b = activity;
        this.a = brgdVar;
        brcy c = brdiVar.c();
        if (c == null) {
            if (!brdiVar.b().isEmpty()) {
                c = brdiVar.b().get(0);
            } else {
                c = brdi.f();
                brdiVar.g(c);
            }
        }
        this.d = brdl.a(brdaVar, c).a;
        this.c = new brgl(this.d, brdiVar, brdaVar, dehqVar, brgkVar, cqhnVar);
    }

    public void a() {
        this.c.a(this.d);
    }

    @Override // defpackage.brgq
    public jib b() {
        Activity activity = this.b;
        jhz e = jib.g(activity, activity.getString(R.string.EV_PROFILE_OVERVIEW_TITLE)).e();
        e.f(new View.OnClickListener(this) { // from class: brgc
            private final brge a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((brct) this.a.a).a.aT();
            }
        });
        e.o = cjtd.a(dtxo.ar);
        e.j = cqrt.l(R.string.BACK_BUTTON);
        e.x = false;
        return e.b();
    }

    @Override // defpackage.brgq
    public brgu c() {
        return this.c;
    }
}
