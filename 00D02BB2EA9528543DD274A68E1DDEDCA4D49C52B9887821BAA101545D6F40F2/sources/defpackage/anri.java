package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: anri  reason: default package */
/* loaded from: classes2.dex */
public class anri {
    public final cqss a;
    public final cqss b;
    public final apkr c;

    public anri(apkr apkrVar) {
        this(((anpi) anro.f()).d, ((anpi) anro.f()).d, apkrVar);
    }

    public anri(cqss cqssVar, cqss cqssVar2, apkr apkrVar) {
        this.a = cqssVar;
        this.b = cqssVar2;
        this.c = apkrVar;
    }

    public final izx a(final anrg anrgVar, anrr anrrVar) {
        return new ivd(cqrt.h(2131231586, this.a), cqrt.l(R.string.I_AM_HERE_BUTTON), this.b, new ivc(this, anrgVar) { // from class: anqy
            private final anri a;
            private final anrg b;

            {
                this.a = this;
                this.b = anrgVar;
            }

            @Override // defpackage.ivc
            public final void a(cjqm cjqmVar) {
                anri anriVar = this.a;
                anrg anrgVar2 = this.b;
                if (!anriVar.c.b(new anrh())) {
                    return;
                }
                anrgVar2.a();
            }
        }, anrrVar.R(dtyi.av));
    }

    public final izx b(final anrg anrgVar, anrr anrrVar) {
        cjta b = cjtd.b();
        b.b = anrrVar.w();
        b.d = dtyi.ae;
        dbsg<String> v = anrrVar.v();
        if (v.a()) {
            b.g(v.b());
        }
        return new ivd(cqrt.h(2131231586, this.a), cqrt.l(R.string.YES_BUTTON), this.b, new ivc(this, anrgVar) { // from class: anqz
            private final anri a;
            private final anrg b;

            {
                this.a = this;
                this.b = anrgVar;
            }

            @Override // defpackage.ivc
            public final void a(cjqm cjqmVar) {
                anri anriVar = this.a;
                anrg anrgVar2 = this.b;
                if (!anriVar.c.b(new anrh())) {
                    return;
                }
                anrgVar2.a();
            }
        }, b.a());
    }

    public final izx c(anrr anrrVar) {
        return d(anrrVar, true != anrrVar.e() ? R.string.MAPS_ACTIVITY_EDIT_PLACE : R.string.MAPS_ACTIVITY_ADD_VISIT);
    }

    public final ivd d(final anrr anrrVar, int i) {
        anrrVar.c();
        if (true != anrrVar.e()) {
            i = R.string.MAPS_ACTIVITY_EDIT_PLACE;
        }
        return new ivd(cqrt.h(2131231583, this.a), cqrt.l(i), this.b, new ivc(anrrVar) { // from class: anrd
            private final anrr a;

            {
                this.a = anrrVar;
            }

            @Override // defpackage.ivc
            public final void a(cjqm cjqmVar) {
                this.a.y();
            }
        }, anrrVar.R(dtyi.bE));
    }

    public final izx e(final anry anryVar) {
        return new ivd(cqrt.h(2131231715, this.a), cqrt.l(R.string.MAPS_ACTIVITY_PLACE_DETAILS), this.b, new ivc(anryVar) { // from class: anrf
            private final anry a;

            {
                this.a = anryVar;
            }

            @Override // defpackage.ivc
            public final void a(cjqm cjqmVar) {
                this.a.Z();
            }
        }, anryVar.R(dtyi.bD));
    }
}
