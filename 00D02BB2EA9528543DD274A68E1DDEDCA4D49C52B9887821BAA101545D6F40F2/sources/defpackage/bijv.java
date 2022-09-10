package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bijv  reason: default package */
/* loaded from: classes3.dex */
public class bijv implements bijc {
    public final cklf a;
    private final bije b;
    private final gga c;
    @dzsi
    private jht d;

    public bijv(bije bijeVar, gga ggaVar, cklf cklfVar) {
        this.b = bijeVar;
        this.a = cklfVar;
        this.c = ggaVar;
    }

    private final boolean e() {
        return this.b.j().intValue() > 0;
    }

    private final boolean f() {
        return this.b.k().intValue() > 0;
    }

    @Override // defpackage.bijc
    public String a() {
        int i;
        if (!e() || !f()) {
            i = e() ? R.plurals.PERSONAL_GMAIL_RESERVATIONS_TITLE : R.plurals.PERSONAL_CALENDAR_EVENTS_TITLE;
        } else {
            i = R.plurals.PERSONAL_GMAIL_RESERVATIONS_AND_CALENDAR_EVENTS_TITLE;
        }
        return this.c.getResources().getQuantityString(i, this.b.j().intValue() + this.b.k().intValue());
    }

    @Override // defpackage.bijc
    public String b() {
        return this.c.getResources().getQuantityString(R.plurals.PERSONAL_RESERVATIONS_SUBTITLE, this.b.j().intValue() + this.b.k().intValue());
    }

    @Override // defpackage.bijc
    public jht c() {
        if (this.d == null) {
            jhu h = jhv.h();
            jhm jhmVar = new jhm();
            jhmVar.a = this.c.getString(R.string.LEARN_MORE);
            jhmVar.l = R.string.LEARN_MORE;
            h.d(jhmVar.c());
            jhi jhiVar = (jhi) h;
            jhiVar.b = new jhr(this) { // from class: biju
                private final bijv a;

                {
                    this.a = this;
                }

                @Override // defpackage.jhr
                public final void a(int i) {
                    bijv bijvVar = this.a;
                    if (i == R.string.LEARN_MORE) {
                        bijvVar.a.a("find_reservations");
                    }
                }
            };
            jhiVar.e = this.c.getString(R.string.LEARN_MORE_ACCESSIBILITY_OVERFLOW_MENU);
            this.d = h.b();
        }
        return this.d;
    }

    @Override // defpackage.bijc
    public Boolean d() {
        boolean z = true;
        if (!e() && !f()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
