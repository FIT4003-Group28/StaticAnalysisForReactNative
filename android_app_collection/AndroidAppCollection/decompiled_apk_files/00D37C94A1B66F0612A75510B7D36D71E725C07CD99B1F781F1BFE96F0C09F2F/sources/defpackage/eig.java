package defpackage;

import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: eig  reason: default package */
/* loaded from: classes3.dex */
public final class eig {
    public final azqb a;
    public final azqb b;
    public final dt c;
    public final axnm d;
    public final axnm e;
    public final azqb f;
    public final aacz g;

    public eig(dt dtVar, azqb azqbVar, azqb azqbVar2, axnm axnmVar, aacz aaczVar, axnm axnmVar2, azqb azqbVar3, ayor ayorVar) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = dtVar;
        this.g = aaczVar;
        this.d = axnmVar;
        this.e = axnmVar2;
        this.f = azqbVar3;
        if (eog.aw(aaczVar)) {
            ((eil) axnmVar2.get()).c.B().X(ayorVar).I(efx.g).as(new ayqb() { // from class: eif
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    eig eigVar = eig.this;
                    Boolean bool = (Boolean) obj;
                    ehh ehhVar = (ehh) eigVar.d.get();
                    egw b = ehhVar.b();
                    if (!ehhVar.j() || b.k != 0) {
                        if (ehhVar.j() || b.m != 0) {
                            return;
                        }
                        ylx.m(ehhVar.c(new egf(2)), new dzl(6));
                        akfe d = akff.d();
                        d.c = eigVar.c.getString(R.string.turn_on_bedtime_reminder_title);
                        d.d = eigVar.c.getString(R.string.update_bedtime_reminder_text);
                        akfe a = d.c(eigVar.c.getString(R.string.update_bedtime_reminder_no_thanks), null).a(eigVar.c.getString(R.string.turn_on_bedtime_reminder_update_reminder), new eie(eigVar));
                        a.h(false);
                        ((fun) eigVar.a.get()).i(a.d(2131230955).e());
                        return;
                    }
                    ylx.m(ehhVar.c(new egf(3)), new dzl(6));
                    akfe d2 = akff.d();
                    d2.c = eigVar.c.getString(R.string.update_bedtime_reminder_title);
                    d2.d = eigVar.c.getString(R.string.update_bedtime_reminder_text);
                    akfe a2 = d2.c(eigVar.c.getString(R.string.update_bedtime_reminder_no_thanks), null).a(eigVar.c.getString(R.string.update_bedtime_reminder_update_reminder), eigVar.a());
                    a2.h(false);
                    ((fun) eigVar.a.get()).i(a2.d(2131230955).e());
                }
            });
        }
        if (!eog.av(aaczVar)) {
            azqbVar.get();
            azqbVar2.get();
            axnmVar.get();
            axnmVar2.get();
            azqbVar3.get();
        }
    }

    public final View.OnClickListener a() {
        return new eie(this, 1);
    }
}
