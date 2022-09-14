package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cvzv  reason: default package */
/* loaded from: classes5.dex */
public final class cvzv<AccountT> {
    private static final dclu<cwda> c = dclu.f(cwda.INCOGNITO, cwda.CUSTOM);
    private static final dclu<cwda> d = dclu.f(cwda.INCOGNITO, cwda.PRIVACY_ADVISOR, cwda.SETTINGS, cwda.HELP_AND_FEEDBACK);
    public boolean a;
    public boolean b;
    private final cvze<AccountT> e;
    private final cwii f;
    private final dtgb g;
    private final Context h;

    public cvzv(Context context, cvze<AccountT> cvzeVar, cwii cwiiVar, dtgb dtgbVar) {
        this.h = context;
        this.e = cvzeVar;
        this.f = cwiiVar;
        this.g = dtgbVar;
    }

    private final cwdc b(cwiv<AccountT> cwivVar, cwdc cwdcVar) {
        cwiw cwiwVar = new cwiw(cwdcVar.e());
        cwiwVar.b(cwivVar, 43);
        cwiwVar.c = this.f.a();
        cwiwVar.d = this.f.b();
        View.OnClickListener a = cwiwVar.a();
        cwdb k = cwdcVar.k();
        k.f(a);
        return k.a();
    }

    private static dcdc<cwdc> c(List<cwdc> list, dclu<cwda> dcluVar) {
        return dcdc.w(new cvzu(dcluVar), list);
    }

    public final dcdc<dcdc<cwdc>> a() {
        ArrayList arrayList;
        cwiv<AccountT> cwivVar = new cwiv<>(this.e.e(), this.g, this.e.a());
        if (this.b || !this.e.c().e().a()) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList();
            dcdc<cwea> b = this.e.c().e().b().b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                cwea cweaVar = b.get(i);
                cwdb l = cwdc.l();
                l.d(cweaVar.a());
                l.c(cweaVar.b());
                l.e(cweaVar.c());
                l.g(90541);
                l.f(cweaVar.d());
                cwde cwdeVar = (cwde) l;
                cwdeVar.a = cweaVar.e();
                cwdeVar.b = cweaVar.f();
                arrayList.add(b(cwivVar, l.a()));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        dcdc<cwdc> f = this.e.c().f();
        int size2 = f.size();
        for (int i2 = 0; i2 < size2; i2++) {
            cwdc cwdcVar = f.get(i2);
            dbsk.l(true ^ cwdcVar.j().equals(cwda.CUSTOM));
            arrayList2.add(b(cwivVar, cwdcVar));
        }
        cwdc cwdcVar2 = null;
        if (!this.a) {
            Context context = this.h;
            final cvze<AccountT> cvzeVar = this.e;
            final dtgb dtgbVar = this.g;
            cwii cwiiVar = this.f;
            dbsg<cwef> a = cvzeVar.c().a();
            if (a.a()) {
                dbsk.s(dtgbVar);
                final cvzn f2 = cvzeVar.g().f();
                dbsk.s(f2);
                cwdb l2 = cwdc.l();
                l2.d(R.id.og_ai_turn_on_incognito);
                l2.e(context.getString(a.b().a()));
                l2.c(a.b().e(context));
                l2.g(90143);
                cwiw cwiwVar = new cwiw(new View.OnClickListener(cvzeVar, dtgbVar, f2) { // from class: cwaa
                    private final cvze a;
                    private final dtgb b;
                    private final cvzn c;

                    {
                        this.a = cvzeVar;
                        this.b = dtgbVar;
                        this.c = f2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        cvze cvzeVar2 = this.a;
                        dtgb dtgbVar2 = this.b;
                        cvzn cvznVar = this.c;
                        cwjw e = cvzeVar2.e();
                        dsqp dsqpVar = (dsqp) dtgbVar2.cu(5);
                        dsqpVar.bC(dtgbVar2);
                        dtga dtgaVar = (dtga) dsqpVar;
                        if (dtgaVar.c) {
                            dtgaVar.bF();
                            dtgaVar.c = false;
                        }
                        dtgb dtgbVar3 = (dtgb) dtgaVar.b;
                        dtgb dtgbVar4 = dtgb.g;
                        dtgbVar3.b = 6;
                        dtgbVar3.a |= 1;
                        e.b(dtgaVar.bK());
                        cvznVar.a(true);
                    }
                });
                cwiwVar.c = cwiiVar.a();
                cwiwVar.d = cwiiVar.b();
                l2.f(cwiwVar.a());
                l2.b(cwda.INCOGNITO);
                cwdcVar2 = l2.a();
            }
        }
        if (cwdcVar2 != null) {
            (true != arrayList.isEmpty() ? arrayList : arrayList2).add(cwdcVar2);
        }
        dccx dccxVar = new dccx();
        if (!arrayList.isEmpty()) {
            dccxVar.g(c(arrayList, c));
        }
        if (!arrayList2.isEmpty()) {
            dccxVar.g(c(arrayList2, d));
        }
        return dccxVar.f();
    }
}
