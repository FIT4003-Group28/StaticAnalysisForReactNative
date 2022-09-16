package defpackage;

import android.content.Context;
import android.text.Spannable;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ajeh  reason: default package */
/* loaded from: classes2.dex */
public class ajeh implements ajee {
    private final dqzv a;
    private final dbsg<Profile> b;
    private final ajwd c;
    private final bvsx d;
    private final ajeg e;
    private final Context f;
    private final cqat g;

    public ajeh(dqzv dqzvVar, dbsg<Profile> dbsgVar, Context context, cqat cqatVar, bvsx bvsxVar, cqhn cqhnVar, ajeg ajegVar) {
        this.a = dqzvVar;
        this.d = bvsxVar;
        this.e = ajegVar;
        this.f = context;
        this.b = dbsgVar;
        this.g = cqatVar;
        ajwd ajwdVar = new ajwd(context, cqatVar, true, cqhnVar, dqzvVar.b == 1, null, new ajve(dtxu.fL, dtxu.fQ, dtxu.fN, dtxu.fK, dtxu.fP));
        this.c = ajwdVar;
        ajwdVar.u(dqzvVar);
    }

    @Override // defpackage.ajee
    public ajwa a() {
        return this.c;
    }

    @Override // defpackage.ajee
    public CharSequence b() {
        if (!this.b.a() || !this.b.b().c().a()) {
            return this.f.getResources().getString(R.string.MOD_UPDATE_SHARE_LOCATION);
        }
        if (!this.b.b().e().a()) {
            return this.f.getResources().getString(R.string.MOD_UPDATE_SHARE_LOCATION_SHARING_WITH_TARGET_TITLE, this.b.b().c().b());
        }
        bvsv a = this.d.a(this.b.b().e().b());
        a.n();
        Spannable c = a.c();
        bvsu b = this.d.b(this.f.getResources().getString(R.string.MOD_UPDATE_SHARE_LOCATION_SHARING_WITH_EMAIL_TITLE));
        b.a(this.b.b().c().b(), c);
        return b.c();
    }

    @Override // defpackage.ajee
    public cqkl c() {
        dqzv bK;
        if (this.c.r().booleanValue()) {
            ajeg ajegVar = this.e;
            dqzv dqzvVar = this.a;
            ajdz ajdzVar = (ajdz) ajegVar;
            ajdzVar.ao = ajdzVar.q();
            ajhu ajhuVar = ajdzVar.am;
            dbsk.s(ajhuVar);
            btlu btluVar = ajdzVar.ai;
            dcdc f = dcdc.f(dqzvVar);
            ajfp ajfpVar = (ajfp) ajhuVar;
            if (ajfpVar.d != 0) {
                bvoo.h("cancelShares called when state is %d", Integer.valueOf(ajfpVar.d));
            } else {
                ajfpVar.b = new ArrayList(f);
                ajfpVar.e = btluVar.d;
                ajfpVar.d = 1;
                ajfpVar.d(btluVar);
            }
        } else {
            ajeg ajegVar2 = this.e;
            if (this.c.c().booleanValue()) {
                dqzv dqzvVar2 = this.a;
                dsqp dsqpVar = (dsqp) dqzvVar2.cu(5);
                dsqpVar.bC(dqzvVar2);
                dqzo dqzoVar = (dqzo) dsqpVar;
                if (dqzoVar.c) {
                    dqzoVar.bF();
                    dqzoVar.c = false;
                }
                dqzv dqzvVar3 = (dqzv) dqzoVar.b;
                dqzv dqzvVar4 = dqzv.h;
                dqzvVar3.a &= -17;
                dqzvVar3.f = 0L;
                dqzv dqzvVar5 = (dqzv) dqzoVar.b;
                dqzvVar5.d = 1;
                dqzvVar5.a |= 4;
                bK = dqzoVar.bK();
            } else {
                long g = eaow.e(this.g.b()).j(eaow.c(this.c.o())).g();
                dqzv dqzvVar6 = this.a;
                dsqp dsqpVar2 = (dsqp) dqzvVar6.cu(5);
                dsqpVar2.bC(dqzvVar6);
                dqzo dqzoVar2 = (dqzo) dsqpVar2;
                if (dqzoVar2.c) {
                    dqzoVar2.bF();
                    dqzoVar2.c = false;
                }
                dqzv dqzvVar7 = (dqzv) dqzoVar2.b;
                dqzv dqzvVar8 = dqzv.h;
                dqzvVar7.a |= 16;
                dqzvVar7.f = g;
                dqzv dqzvVar9 = (dqzv) dqzoVar2.b;
                dqzvVar9.d = 2;
                dqzvVar9.a |= 4;
                bK = dqzoVar2.bK();
            }
            ajdz ajdzVar2 = (ajdz) ajegVar2;
            ajdzVar2.ao = ajdzVar2.q();
            ajik ajikVar = ajdzVar2.al;
            dbsk.s(ajikVar);
            btlu btluVar2 = ajdzVar2.ai;
            ajhp ajhpVar = (ajhp) ajikVar;
            if (ajhpVar.b != 0) {
                bvoo.h("updateShare called when state is %d", Integer.valueOf(ajhpVar.b));
            } else {
                ajhpVar.c = bK;
                ajhpVar.d = btluVar2.d;
                ajhpVar.b = 1;
                ajhpVar.d(btluVar2);
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.ajee
    public cqkl d() {
        ((ajdz) this.e).aJ();
        return cqkl.a;
    }
}
