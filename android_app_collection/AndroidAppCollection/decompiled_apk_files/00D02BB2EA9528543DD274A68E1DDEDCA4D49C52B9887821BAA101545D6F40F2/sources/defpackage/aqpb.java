package defpackage;

import android.view.View;
import com.google.android.apps.gmm.messaging.common.ConfigurableCurvularLayoutView;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: aqpb  reason: default package */
/* loaded from: classes2.dex */
public class aqpb extends aqcg implements aqow {
    private static final dcqe i = dcqe.c("aqpb");
    public final aqov f;
    public final aqop g;
    public final dxio<apyz> h;
    private final cqhn j;
    private final aqeg<cvav, cvbp> k;
    @dzsi
    private aqea l;
    @dzsi
    private ctyy m;
    @dzsi
    private dbrn<ctyy, Void> n;

    public aqpb(gga ggaVar, cqhn cqhnVar, bvrb bvrbVar, aqeh aqehVar, aqov aqovVar, dxio<aqbo> dxioVar, dxio<apyz> dxioVar2, ges gesVar, aqop aqopVar) {
        super(ggaVar, gesVar, bvrbVar, dxioVar);
        this.j = cqhnVar;
        this.f = aqovVar;
        this.h = dxioVar2;
        this.g = aqopVar;
        this.k = aqehVar.a(gesVar.Z, cvbp.class, aqot.b);
    }

    @Override // defpackage.aqcc
    public Boolean b() {
        return false;
    }

    @Override // defpackage.aqcc
    public cjtd c() {
        return cjtd.a(dtxv.dE);
    }

    @Override // defpackage.aqow
    public aqek<cvbp> d() {
        return this.k.e;
    }

    @Override // defpackage.aqow
    @dzsi
    public aqea e() {
        return this.l;
    }

    @Override // defpackage.aqow
    public cjtd f() {
        return this.g.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aqcg
    public final void i(ctyy ctyyVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aqcg
    public final void j(dcdc<ctyy> dcdcVar) {
        if (dcdcVar.size() != 1 || aqda.d(dcdcVar.get(0)) != this.g.c()) {
            bvoo.h("Unexpected account type onAccountContextsReady", new Object[0]);
            return;
        }
        final ctyy ctyyVar = dcdcVar.get(0);
        this.m = ctyyVar;
        this.k.a(new aqef(this, ctyyVar) { // from class: aqox
            private final aqpb a;
            private final ctyy b;

            {
                this.a = this;
                this.b = ctyyVar;
            }

            @Override // defpackage.aqef
            public final cuvu a(View view) {
                final aqpb aqpbVar = this.a;
                ctyy ctyyVar2 = this.b;
                cvbp cvbpVar = (cvbp) view;
                aqov aqovVar = aqpbVar.f;
                dbsl<cufw> dbslVar = new dbsl(aqpbVar) { // from class: aqoy
                    private final aqpb a;

                    {
                        this.a = aqpbVar;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        cufw cufwVar = (cufw) obj;
                        return cufwVar != null && this.a.g.a(cufwVar);
                    }
                };
                cvau cvauVar = new cvau(aqpbVar) { // from class: aqoz
                    private final aqpb a;

                    {
                        this.a = aqpbVar;
                    }

                    @Override // defpackage.cvau
                    public final void a(ConversationId conversationId) {
                        aqpb aqpbVar2 = this.a;
                        apza i2 = apzc.i();
                        i2.b(conversationId);
                        i2.d(aqpbVar2.g.b());
                        aqpbVar2.h.a().n(i2.e(), false);
                    }
                };
                final aqop aqopVar = aqpbVar.g;
                aqopVar.getClass();
                return aqovVar.a(ctyyVar2, cvbpVar, dbslVar, cvauVar, new mw(aqopVar) { // from class: aqpa
                    private final aqop a;

                    {
                        this.a = aqopVar;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj) {
                        this.a.e((ConfigurableCurvularLayoutView) obj);
                    }
                });
            }
        });
        dbrn<ctyy, Void> dbrnVar = this.n;
        if (dbrnVar == null) {
            return;
        }
        dbrnVar.a(ctyyVar);
    }

    public void m() {
        this.m = null;
        PE(dcdc.f(Integer.valueOf(this.g.c())));
    }

    public void n(@dzsi dbrn<ctyy, Void> dbrnVar) {
        this.n = dbrnVar;
    }

    public void o(@dzsi aqea aqeaVar) {
        this.l = aqeaVar;
        this.a.runOnUiThread(new apzx(this));
    }

    public dbsg<ctyy> p() {
        return dbsg.j(this.m);
    }
}
