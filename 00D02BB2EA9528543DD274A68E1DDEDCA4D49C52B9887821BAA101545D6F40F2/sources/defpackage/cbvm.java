package defpackage;

import android.view.View;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cbvm  reason: default package */
/* loaded from: classes4.dex */
public class cbvm implements cbvk, crzp {
    private final cbuu a;
    private final cbvr b;
    private final jib c;
    private cbto d;

    public cbvm(cbrx cbrxVar, cbss cbssVar, final gga ggaVar, cbuw cbuwVar, cbvt cbvtVar, Executor executor, cqhn cqhnVar) {
        cbuw.a(cbrxVar, 1);
        cbuw.a(cbssVar, 2);
        Executor a = cbuwVar.a.a();
        cbuw.a(a, 3);
        cbvd a2 = cbuwVar.b.a();
        cbuw.a(a2, 4);
        cqhn a3 = cbuwVar.c.a();
        cbuw.a(a3, 5);
        this.a = new cbuv(cbrxVar, cbssVar, a, a2, a3);
        this.b = new cbvs(cbrxVar);
        jhz a4 = jhz.a();
        a4.a = ggaVar.getString(cbru.PLACE_TOPIC_FEEDBACK_PAGE_TITLE);
        a4.f(new View.OnClickListener(ggaVar) { // from class: cbvl
            private final gga a;

            {
                this.a = ggaVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.onBackPressed();
            }
        });
        this.c = a4.b();
        cbsb cbsbVar = (cbsb) cbssVar;
        this.d = cbsbVar.b.l();
        cbsbVar.b.e(this, executor);
    }

    @Override // defpackage.crzp
    public void On(crzm<cbto> crzmVar) {
        this.d = crzmVar.l();
        cqkx.p(this);
    }

    @Override // defpackage.cbvk
    public jib b() {
        return this.c;
    }

    @Override // defpackage.cbvk
    public cbuu c() {
        return this.a;
    }

    @Override // defpackage.cbvk
    public cbvr d() {
        return this.b;
    }

    @Override // defpackage.cbvk
    public Boolean e() {
        cbto cbtoVar = this.d;
        if (cbtoVar == null) {
            return false;
        }
        for (cbtn cbtnVar : cbtoVar.a) {
            int a = cbtm.a(cbtnVar.d);
            if (a != 0 && a == 2) {
                return true;
            }
        }
        return false;
    }
}
