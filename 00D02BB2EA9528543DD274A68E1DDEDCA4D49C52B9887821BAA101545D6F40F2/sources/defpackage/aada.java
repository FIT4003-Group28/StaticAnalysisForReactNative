package defpackage;

import android.app.Activity;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aada  reason: default package */
/* loaded from: classes2.dex */
public final class aada {
    public final Activity a;
    public final aaar b;
    public final View c;
    @dzsi
    dafk d;
    private final efg g;
    private final aacw h;
    private final aacy i;
    private final View j;
    private final View k;
    public int f = 2;
    public boolean e = true;

    public aada(Activity activity, efg efgVar, aacy aacyVar, aaar aaarVar, aacw aacwVar, View view, View view2, View view3) {
        this.a = activity;
        this.g = efgVar;
        this.i = aacyVar;
        this.b = aaarVar;
        this.h = aacwVar;
        this.j = view;
        this.c = view2;
        this.k = view3;
    }

    private final egj d(ges gesVar) {
        egj egjVar = new egj(gesVar);
        egjVar.ag(this.c);
        egjVar.w(null);
        if (this.h.L().booleanValue()) {
            egjVar.W(this.h);
            egjVar.O(jjn.FULLY_EXPANDED);
        } else {
            egjVar.G(this.j, 6);
        }
        return egjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ges gesVar) {
        this.f = 2;
        aaaz aaazVar = (aaaz) this.i;
        if (aaazVar.a != null) {
            aacw aacwVar = aaazVar.i().as;
            dbsk.s(aacwVar);
            aadi aadiVar = aacwVar.e;
            aadiVar.a = false;
            cqkx.p(aadiVar);
            aabi aabiVar = aaazVar.i().at;
            dbsk.s(aabiVar);
            aabiVar.b(false);
        }
        this.h.o(true);
        egj d = d(gesVar);
        d.ai(jjn.HIDDEN);
        d.ak(jkc.j, jkc.j);
        d.R(this.k);
        this.g.a(d.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ges gesVar) {
        this.f = 1;
        c();
        aaaz aaazVar = (aaaz) this.i;
        if (aaazVar.a != null) {
            aacw aacwVar = aaazVar.i().as;
            dbsk.s(aacwVar);
            aadi aadiVar = aacwVar.e;
            aadiVar.a = true;
            cqkx.p(aadiVar);
            aabi aabiVar = aaazVar.i().at;
            dbsk.s(aabiVar);
            aabiVar.b(true);
        }
        this.h.o(false);
        egj d = d(gesVar);
        d.ai(jjn.FULLY_EXPANDED);
        d.ak(jkc.q, jkc.q);
        this.g.a(d.a());
    }

    public final void c() {
        dafk dafkVar = this.d;
        if (dafkVar != null) {
            dafkVar.d();
            this.d = null;
        }
    }
}
