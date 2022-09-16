package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aiso  reason: default package */
/* loaded from: classes2.dex */
public class aiso implements ajbz {
    final /* synthetic */ aisq a;

    public aiso(aisq aisqVar) {
        this.a = aisqVar;
    }

    @Override // defpackage.ajbz
    public CharSequence a() {
        return ajsb.a(this.a.b.getResources(), alp.a(), R.string.MOD_HIDDEN_FROM_MAP_WARNING_DESCRIPTION, this.a.c.b().a().b().c().c(""));
    }

    @Override // defpackage.ajbz
    public aiom b() {
        return aiom.INFO;
    }

    @Override // defpackage.ajbz
    @dzsi
    public CharSequence c() {
        return this.a.b.getResources().getString(R.string.MOD_HIDDEN_FROM_MAP_WARNING_FIX_ACTION);
    }

    @Override // defpackage.ajbz
    public Boolean d() {
        return false;
    }

    @Override // defpackage.ajbz
    public cqkl e() {
        aisp aispVar = this.a.a;
        final airr airrVar = (airr) aispVar;
        if (airrVar.aX()) {
            aink ainkVar = airrVar.aU;
            dbsk.s(ainkVar);
            if (ainkVar.a().a()) {
                aihe<aimj, aiig> aiheVar = airrVar.av;
                aink ainkVar2 = airrVar.aU;
                dbsk.s(ainkVar2);
                aiig g = aiij.g(ainkVar2.a().b(), new eapd(airrVar.ad.b()));
                dbsg<btlu> dbsgVar = airrVar.aS;
                dbsk.s(dbsgVar);
                aiheVar.a(g, dbsgVar);
                fd fdVar = (fd) aispVar;
                ff J = fdVar.J();
                Resources Rn = fdVar.Rn();
                alp a = alp.a();
                aink ainkVar3 = airrVar.aU;
                dbsk.s(ainkVar3);
                airr.br(J, ajsb.a(Rn, a, R.string.UNHIDDEN_FROM_MAP_TOAST, ainkVar3.a().b().b().c("")), fdVar.Rp(R.string.UNDO), new View.OnClickListener(airrVar) { // from class: airi
                    private final airr a;

                    {
                        this.a = airrVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        airr airrVar2 = this.a;
                        aihe<aimj, aiig> aiheVar2 = airrVar2.av;
                        aink ainkVar4 = airrVar2.aU;
                        dbsk.s(ainkVar4);
                        aiig f = aiij.f(ainkVar4.a().b(), new eapd(airrVar2.ad.b()));
                        dbsg<btlu> dbsgVar2 = airrVar2.aS;
                        dbsk.s(dbsgVar2);
                        aiheVar2.a(f, dbsgVar2);
                    }
                });
            }
        }
        return cqkl.a;
    }
}
