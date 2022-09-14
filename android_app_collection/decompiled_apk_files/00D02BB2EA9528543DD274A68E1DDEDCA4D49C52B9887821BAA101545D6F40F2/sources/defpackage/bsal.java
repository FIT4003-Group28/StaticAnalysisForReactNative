package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bsal  reason: default package */
/* loaded from: classes4.dex */
public class bsal implements izv {
    public final bsak a;
    @dzsi
    private bsha b;
    private final bsjm c;
    private Boolean d;

    public bsal(dzsj<bshe> dzsjVar, dzsj<bsiq> dzsjVar2, dzsj<bsim> dzsjVar3, dzsj<bsjd> dzsjVar4, dzsj<bshj> dzsjVar5, dzsj<bshp> dzsjVar6, dzsj<bsht> dzsjVar7, dzsj<bsiw> dzsjVar8, dzsj<bsii> dzsjVar9, dzsj<bshy> dzsjVar10, dzsj<bshc> dzsjVar11, @dzsi bsid bsidVar, btvo btvoVar, bsjm bsjmVar, int i, bsak bsakVar) {
        this.c = bsjmVar;
        this.a = bsakVar;
        Boolean bool = true;
        this.d = bool;
        if (i == 1) {
            this.b = dzsjVar2.a();
        } else if (i == 5) {
            bshv bshvVar = new bshv(this) { // from class: bsab
                private final bsal a;

                {
                    this.a = this;
                }

                @Override // defpackage.bshv
                public final void a(cjqm cjqmVar) {
                    this.a.a(cjqmVar);
                }
            };
            Activity activity = (Activity) ((dxjd) dzsjVar.a().a).a;
            bshe.b(activity);
            this.b = new bshd(activity, bshvVar);
            this.d = false;
        } else if (i == 7) {
            this.b = dzsjVar3.a();
        } else if (i == 10) {
            this.b = dzsjVar10.a();
        } else if (i == 20) {
            this.b = dzsjVar8.a();
        } else if (i != 23) {
            if (i == 25) {
                bshj a = dzsjVar5.a();
                bshh bshhVar = new bshh(this) { // from class: bsag
                    private final bsal a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.bshh
                    public final void a(cjqm cjqmVar) {
                        this.a.a(cjqmVar);
                    }
                };
                Runnable runnable = new Runnable(this) { // from class: bsah
                    private final bsal a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b();
                    }
                };
                Activity activity2 = (Activity) ((dxjd) a.a).a;
                bshj.b(activity2, 1);
                gga a2 = a.b.a();
                bshj.b(a2, 2);
                cqhn a3 = a.c.a();
                bshj.b(a3, 3);
                brdi a4 = a.d.a();
                bshj.b(a4, 4);
                this.b = new bshi(activity2, a2, a3, a4, bshhVar, runnable, true);
                this.d = false;
            } else if (i == 31) {
                this.b = bsidVar;
            } else if (i == 33) {
                this.d = false;
                bsaf bsafVar = new bsaf(this);
                Activity activity3 = (Activity) ((dxjd) dzsjVar7.a().a).a;
                bsht.a(activity3);
                this.b = new bshs(activity3, bsafVar);
            } else if (i == 42) {
                bshv bshvVar2 = new bshv(this) { // from class: bsai
                    private final bsal a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.bshv
                    public final void a(cjqm cjqmVar) {
                        this.a.a(cjqmVar);
                    }
                };
                Activity activity4 = (Activity) ((dxjd) dzsjVar11.a().a).a;
                bshc.b(activity4);
                this.b = new bshb(activity4, bshvVar2);
            } else if (i == 17) {
                bsjd a5 = dzsjVar4.a();
                bsac bsacVar = new bsac(this);
                Resources a6 = a5.a.a();
                bsjd.b(a6, 1);
                cqhn a7 = a5.b.a();
                bsjd.b(a7, 2);
                this.b = new bsjc(a6, a7, bsacVar);
                this.d = false;
            } else if (i == 18) {
                this.b = dzsjVar9.a();
            }
        } else if (bool.booleanValue()) {
            this.b = dzsjVar6.a().a();
        } else {
            bsad bsadVar = new bsad(this);
            bsae bsaeVar = new bsae(bsakVar);
            bshm bshmVar = bshm.LIST;
            Activity activity5 = (Activity) ((dxjd) dzsjVar6.a().a).a;
            bshp.b(activity5, 1);
            bshp.b(bshmVar, 4);
            this.b = new bsho(activity5, bsadVar, bsaeVar, bshmVar);
        }
        bsha bshaVar = this.b;
        if (bshaVar != null) {
            bshaVar.m(bsjmVar);
        }
    }

    @Override // defpackage.izv
    public cqkl a(cjqm cjqmVar) {
        bsha bshaVar = this.b;
        dbsk.s(bshaVar);
        bshaVar.n(this.c);
        this.a.aQ(this.c, cjqmVar);
        return cqkl.a;
    }

    @Override // defpackage.izv
    public cqkl b() {
        this.a.aR();
        return cqkl.a;
    }

    @Override // defpackage.izv
    public void c(cqiv cqivVar) {
        bsha bshaVar = this.b;
        dbsk.s(bshaVar);
        bshaVar.u(cqivVar);
    }

    @Override // defpackage.izv
    public Boolean d() {
        return this.d;
    }

    @Override // defpackage.izv
    @dzsi
    public jib e() {
        if (this.b instanceof bsid) {
            jhz a = jhz.a();
            bsha bshaVar = this.b;
            dbsk.s(bshaVar);
            a.a = bshaVar.h().toString();
            a.A = false;
            a.i = cqrt.g(2131232205, ibm.t());
            a.o = cjtd.a(dtxp.k);
            a.j = cqrt.l(R.string.ACCESSIBILITY_CLOSE_MENU);
            a.f(new View.OnClickListener(this) { // from class: bsaj
                private final bsal a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.a.aR();
                }
            });
            return a.b();
        }
        return null;
    }

    public void f(boolean z) {
        bsha bshaVar = this.b;
        if (bshaVar instanceof bsid) {
            ((bsid) bshaVar).d(true);
        }
    }
}
