package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wxi  reason: default package */
/* loaded from: classes4.dex */
public final class wxi extends cyr {
    @dfs(a = 13)
    aoxy a;
    @dfs(a = 13)
    tjv b;
    @dfs(a = 10)
    cyr c;
    @dfs(a = 13)
    tcu d;

    public wxi() {
        super("ActiveViewDisplayContainerType");
    }

    @Override // defpackage.czb, defpackage.dap
    public final Object K(daq daqVar, Object obj) {
        int i = daqVar.b;
        if (i == -1782007764) {
            dbb dbbVar = daqVar.a;
            cyv cyvVar = (cyv) daqVar.c[0];
            View view = ((dbl) obj).a;
            wxi wxiVar = (wxi) dbbVar;
            wxiVar.b.d(wxiVar.a.f);
            return null;
        } else if (i == -1048037474) {
            N((cyv) daqVar.c[0], (dao) obj);
            return null;
        } else if (i != 1749548209) {
            return null;
        } else {
            dbb dbbVar2 = daqVar.a;
            cyv cyvVar2 = (cyv) daqVar.c[0];
            View view2 = ((dev) obj).a;
            wxi wxiVar2 = (wxi) dbbVar2;
            tcu tcuVar = wxiVar2.d;
            tjv tjvVar = wxiVar2.b;
            aoxy aoxyVar = wxiVar2.a;
            tjvVar.b(aoxyVar.f, view2, new wxk(tcuVar, aoxyVar));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final cyr b(cyv cyvVar) {
        cyr cyrVar = this.c;
        dfa a = dfb.a(cyvVar);
        a.e(cyrVar);
        a.R(H(wxi.class, cyvVar, 1749548209, new Object[]{cyvVar}));
        a.K(H(wxi.class, cyvVar, -1782007764, new Object[]{cyvVar}));
        return a.a();
    }

    @Override // defpackage.cyr
    public final /* bridge */ /* synthetic */ cyr j() {
        wxi wxiVar = (wxi) super.j();
        cyr cyrVar = wxiVar.c;
        wxiVar.c = cyrVar != null ? cyrVar.j() : null;
        return wxiVar;
    }
}
