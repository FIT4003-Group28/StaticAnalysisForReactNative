package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: abjb  reason: default package */
/* loaded from: classes.dex */
public final class abjb {
    public final abqe a;
    public final abpy b;
    public final abqr c;
    public final ViewGroup d;
    public final acti e;
    public abqd f;
    public abow g;
    public abqq h;
    private final abpl i;
    private final abpx j;
    private abkq k;
    private abko l;

    public abjb(abpl abplVar, abqe abqeVar, abpy abpyVar, abqr abqrVar, abpx abpxVar, ViewGroup viewGroup, acti actiVar) {
        this.i = abplVar;
        this.a = abqeVar;
        this.b = abpyVar;
        this.c = abqrVar;
        this.j = abpxVar;
        this.d = viewGroup;
        this.e = actiVar;
    }

    public final abko a() {
        if (this.l == null) {
            this.l = this.j.a(this.d, false, this.e);
        }
        return this.l;
    }

    public final abkq b() {
        if (this.k == null) {
            abpl abplVar = this.i;
            ViewGroup viewGroup = this.d;
            Context context = (Context) abplVar.a.get();
            context.getClass();
            ajyi ajyiVar = (ajyi) abplVar.b.get();
            ajyiVar.getClass();
            ajsg ajsgVar = (ajsg) abplVar.c.get();
            ajsgVar.getClass();
            acth acthVar = (acth) abplVar.d.get();
            acthVar.getClass();
            swq swqVar = (swq) abplVar.e.get();
            swqVar.getClass();
            ((teb) abplVar.f.get()).getClass();
            ajjr ajjrVar = (ajjr) abplVar.g.get();
            ajjrVar.getClass();
            tdu tduVar = (tdu) abplVar.h.get();
            tduVar.getClass();
            azqb azqbVar = abplVar.i;
            abjy abjyVar = (abjy) abplVar.j.get();
            abjyVar.getClass();
            this.k = new abpk(context, ajyiVar, ajsgVar, acthVar, swqVar, ajjrVar, tduVar, azqbVar, abjyVar, viewGroup);
        }
        return this.k;
    }
}
