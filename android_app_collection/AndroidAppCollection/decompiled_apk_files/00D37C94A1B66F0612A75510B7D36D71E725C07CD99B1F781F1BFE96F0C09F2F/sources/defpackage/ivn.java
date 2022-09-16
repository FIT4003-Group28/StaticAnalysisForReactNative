package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ivn  reason: default package */
/* loaded from: classes3.dex */
public final class ivn implements adlt, ynl {
    public final azqb a;
    public final adma b;
    public final admj c;
    public akff d;
    private final adij e;
    private final Activity f;
    private final emo g;
    private final azqb h;

    public ivn(admj admjVar, adij adijVar, Activity activity, emo emoVar, azqb azqbVar, adma admaVar, azqb azqbVar2) {
        this.c = admjVar;
        this.e = adijVar;
        activity.getClass();
        this.f = activity;
        this.g = emoVar;
        this.a = azqbVar;
        this.b = admaVar;
        azqbVar2.getClass();
        this.h = azqbVar2;
    }

    @Override // defpackage.adlt
    public final adij a() {
        return this.e;
    }

    @Override // defpackage.adlt
    public final admj b() {
        return this.c;
    }

    @Override // defpackage.adlt
    public final void c() {
        ((akfd) this.h.get()).m(this.d);
    }

    @Override // defpackage.adlt
    public final void d(Runnable runnable) {
        ylr.c();
        admj admjVar = this.c;
        if (admjVar.g) {
            this.b.b(admjVar.h);
            runnable.run();
            return;
        }
        ivm ivmVar = new ivm(this, runnable);
        Resources resources = this.f.getResources();
        akfe l = ((akfd) this.h.get()).l();
        l.c = resources.getText(R.string.cast_icon_mealbar_title);
        l.d = resources.getText(R.string.cast_icon_mealbar_sub_title);
        l.m = ivmVar;
        akfe d = l.a(resources.getText(R.string.cast_icon_mealbar_watch_on_tv_text), new View.OnClickListener() { // from class: ivl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ivn ivnVar = ivn.this;
                ((MediaRouteButton) ivnVar.a.get()).performClick();
                ivnVar.b.a(ivnVar.c.h);
            }
        }).c(resources.getText(R.string.cast_icon_mealbar_dismiss_text), ija.a).d(2131232133);
        d.h(false);
        ((akfd) this.h.get()).n(d.e());
    }

    @Override // defpackage.adlt
    public final boolean e() {
        return !this.g.j() && !this.g.l() && !this.g.h();
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                adgp adgpVar = (adgp) obj;
                if (!adgpVar.a() || !adgpVar.b()) {
                    return null;
                }
                c();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{adgp.class};
    }
}
