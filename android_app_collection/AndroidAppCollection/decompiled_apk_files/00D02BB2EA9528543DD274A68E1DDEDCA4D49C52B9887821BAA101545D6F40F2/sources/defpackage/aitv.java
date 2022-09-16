package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aitv  reason: default package */
/* loaded from: classes2.dex */
public class aitv implements aipv {
    public ahwg a;
    public boolean b;
    private final Resources c;
    private final aito d;
    private final ajsc e;
    private final cqat f;

    public aitv(ahwg ahwgVar, boolean z, Resources resources, aito aitoVar, ajsc ajscVar, cqat cqatVar) {
        this.a = ahwgVar;
        this.b = z;
        this.c = resources;
        this.d = aitoVar;
        this.e = ajscVar;
        this.f = cqatVar;
    }

    @Override // defpackage.aipv
    public CharSequence a() {
        if (this.a.i()) {
            return this.c.getString(R.string.PERSISTENT_DURATION);
        }
        ajsc ajscVar = this.e;
        ahwg ahwgVar = this.a;
        cqat cqatVar = this.f;
        if (ahwgVar.i()) {
            return ajscVar.a.getString(R.string.PERSISTENT_DURATION);
        }
        dbsg<eaow> o = ahwgVar.o(new eapd(cqatVar.b()));
        return !o.a() ? "" : ajscVar.b(o.b().b, 1);
    }

    @Override // defpackage.aipv
    public Boolean b() {
        return Boolean.valueOf(!this.b);
    }

    @Override // defpackage.aipv
    public cqkl c() {
        aink ainkVar;
        aito aitoVar = this.d;
        airr airrVar = (airr) aitoVar;
        if (airrVar.ba && airrVar.aS != null && (ainkVar = airrVar.aU) != null && !ainkVar.j().isEmpty()) {
            if (airrVar.aU.y()) {
                iii iiiVar = new iii();
                fd fdVar = (fd) aitoVar;
                Resources Rn = fdVar.Rn();
                alp a = alp.a();
                aink ainkVar2 = airrVar.aU;
                dbsk.s(ainkVar2);
                iiiVar.b = ajsb.a(Rn, a, R.string.READ_ONLY_FAMILY_LINK_EXPLANATION, ainkVar2.a().b().b());
                iiiVar.d(fdVar.Rn().getString(17039370), null, null);
                gga ggaVar = ((ges) aitoVar).aE;
                dbsk.s(ggaVar);
                iiiVar.a(ggaVar, airrVar.a).k();
            } else {
                ajei ajeiVar = airrVar.g;
                dbsg<btlu> dbsgVar = airrVar.aS;
                dbsk.s(dbsgVar);
                aink ainkVar3 = airrVar.aU;
                dbsk.s(ainkVar3);
                ajeiVar.b(dbsgVar.f(), ainkVar3);
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.aipv
    public cqkl d() {
        aito aitoVar = this.d;
        final airr airrVar = (airr) aitoVar;
        if (airrVar.aX()) {
            dbsg<btlu> dbsgVar = airrVar.aS;
            dbsk.s(dbsgVar);
            if (dbsgVar.a()) {
                aink ainkVar = airrVar.aU;
                dbsk.s(ainkVar);
                if (ainkVar.u().a()) {
                    aink ainkVar2 = airrVar.aU;
                    dbsk.s(ainkVar2);
                    final ff J = ((fd) aitoVar).J();
                    ajsu ajsuVar = airrVar.au;
                    dbsg<btlu> dbsgVar2 = airrVar.aS;
                    dbsk.s(dbsgVar2);
                    btlu b = dbsgVar2.b();
                    dqzv a = ainkVar2.u().b().a();
                    dwdb bZ = dwdc.b.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dwdc dwdcVar = (dwdc) bZ.b;
                    a.getClass();
                    dwdcVar.c();
                    dwdcVar.a.add(a);
                    ajsuVar.f.a(new aihq(new eapd(ajsuVar.e.b()), a, true), dbsg.i(b));
                    final deig d = deig.d();
                    ajsuVar.a.a().e = b;
                    ajsuVar.a.c().a(bZ.bK(), new ajsr(ajsuVar, a, b, d), bvrj.UI_THREAD);
                    d.Pk(new Runnable(airrVar, d, J) { // from class: airf
                        private final airr a;
                        private final dehn b;
                        private final Activity c;

                        {
                            this.a = airrVar;
                            this.b = d;
                            this.c = J;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            airr airrVar2 = this.a;
                            dehn dehnVar = this.b;
                            Activity activity = this.c;
                            int intValue = ((Integer) deha.s(dehnVar)).intValue();
                            if (intValue == 1) {
                                airr.br(activity, activity.getString(R.string.UPDATE_SHARES_OPERATION_FAILED), null, null);
                            } else if (intValue != 2) {
                            } else {
                                airr.br(activity, activity.getString(R.string.SHARE_ACL_CANCELLED_BUT_NON_EMPTY_CONTINUED_ACLS_TOAST), activity.getString(R.string.ACTION_MANAGE_LOCATION_SHARING_SETTINGS), new View.OnClickListener(airrVar2) { // from class: airb
                                    private final airr a;

                                    {
                                        this.a = airrVar2;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        airr airrVar3 = this.a;
                                        ahyd ahydVar = airrVar3.ap;
                                        dbsg<btlu> dbsgVar3 = airrVar3.aS;
                                        dbsk.s(dbsgVar3);
                                        ahydVar.a(dbsgVar3.b());
                                    }
                                });
                            }
                        }
                    }, airrVar.aQ);
                }
            }
        }
        return cqkl.a;
    }
}
