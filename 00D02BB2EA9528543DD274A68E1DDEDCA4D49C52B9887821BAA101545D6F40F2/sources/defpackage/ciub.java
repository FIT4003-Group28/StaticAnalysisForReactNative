package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ciub  reason: default package */
/* loaded from: classes4.dex */
public class ciub implements city, crzp {
    public final cish a;
    public final chrw b;
    private final cqsn c;
    private final dcdc<citj> d;
    private final cayf e;
    private final caxn f;
    private dcdc<cisf> g = dcdc.e();
    private final chsf h;
    private final View.OnAttachStateChangeListener i;

    public ciub(Executor executor, citl citlVar, caxn caxnVar, cish cishVar, final chsf chsfVar, btvo btvoVar, bvpe bvpeVar, chva chvaVar, final chrx chrxVar, cayf cayfVar, crzm<chuh> crzmVar, chrw chrwVar, View.OnAttachStateChangeListener onAttachStateChangeListener) {
        this.e = cayfVar;
        this.f = caxnVar;
        this.a = cishVar;
        this.h = chsfVar;
        this.b = chrwVar;
        this.c = new cqvf(chvaVar.e);
        dccx F = dcdc.F();
        dhpt dhptVar = chsfVar.b.getContributionsPageParameters().h;
        dhptVar = dhptVar == null ? dhpt.w : dhptVar;
        dcdc z = dcbg.b(dhptVar.f.isEmpty() ? chsf.a : dcdc.r(dhptVar.f)).s(chsb.a).o(dbss.NOT_NULL).o(chsc.a).o(new dbsl(chsfVar) { // from class: chsd
            private final chsf a;

            {
                this.a = chsfVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return this.a.e() || !((drrx) obj).equals(drrx.MODERATE_EDIT);
            }
        }).o(new dbsl(chsfVar) { // from class: chse
            private final chsf a;

            {
                this.a = chsfVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                drrx drrxVar = (drrx) obj;
                dhpt dhptVar2 = this.a.b.getContributionsPageParameters().h;
                if (dhptVar2 == null) {
                    dhptVar2 = dhpt.w;
                }
                return dhptVar2.e || !drrxVar.equals(drrx.LIST);
            }
        }).z();
        int size = z.size();
        for (int i = 0; i < size; i++) {
            F.g(chtq.q((drrx) z.get(i)));
        }
        dcdc f = F.f();
        this.d = dcbg.b(f).s(new dbrn(chrxVar) { // from class: citz
            private final chrx a;

            {
                this.a = chrxVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                chrx chrxVar2 = this.a;
                chtq chtqVar = (chtq) obj;
                citl.a(chrxVar2, 1);
                citl.a(chtqVar, 2);
                return new citk(chrxVar2, chtqVar);
            }
        }).z();
        this.i = onAttachStateChangeListener;
        int size2 = f.size();
        for (int i2 = 0; i2 < size2; i2++) {
            chrxVar.e((chtq) f.get(i2));
        }
        if (chsfVar.a() || chsfVar.c()) {
            chrxVar.e(chtq.d());
        }
        crzmVar.e(this, executor);
    }

    @Override // defpackage.crzp
    public void On(crzm<chuh> crzmVar) {
        if (crzmVar == null) {
            return;
        }
        final chuh l = crzmVar.l();
        dbsk.s(l);
        this.g = dcbg.b(l.b).s(new dbrn(this, l) { // from class: ciua
            private final ciub a;
            private final chuh b;

            {
                this.a = this;
                this.b = l;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                ciub ciubVar = this.a;
                chug chugVar = (chug) obj;
                boolean equals = this.b.c.equals(chugVar.b);
                cish cishVar = ciubVar.a;
                chrw chrwVar = ciubVar.b;
                Activity activity = (Activity) ((dxjd) cishVar.a).a;
                cish.a(activity, 1);
                cish.a(chugVar, 2);
                cish.a(chrwVar, 4);
                return new cisg(activity, chugVar, equals, chrwVar);
            }
        }).z();
    }

    @Override // defpackage.city
    public cqsn b() {
        return this.c;
    }

    @Override // defpackage.city
    public dcdc<citj> c() {
        return this.d;
    }

    @Override // defpackage.city
    public dcdc<cisf> d() {
        return this.g;
    }

    @Override // defpackage.city
    public Boolean e() {
        return Boolean.valueOf(this.f.a);
    }

    public boolean equals(@dzsi Object obj) {
        return (obj instanceof ciub) && this.c.equals(((ciub) obj).c);
    }

    @Override // defpackage.city
    public View.OnAttachStateChangeListener f() {
        return this.i;
    }

    public int hashCode() {
        return city.class.hashCode();
    }

    @Override // defpackage.caye
    public cayf x() {
        return this.e;
    }
}
