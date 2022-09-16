package defpackage;

import android.view.View;
import com.facebook.yoga.YogaFlexDirection;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController;
import java.lang.ref.WeakReference;
import java.util.List;
/* compiled from: PG */
/* renamed from: fhp  reason: default package */
/* loaded from: classes3.dex */
public final class fhp extends cyr {
    @dfs(a = 6)
    List a;
    @dfs(a = 13)
    axnm b;
    @dfs(a = 13)
    tda c;
    @dfs(a = 13)
    YogaFlexDirection d;
    @dfs(a = 13)
    awmt e;
    @dfs(a = 13)
    awmt f;
    @dfs(a = 14)
    private final fhn g;

    public fhp() {
        super("ActiveState");
        this.g = new fhn();
    }

    @Override // defpackage.czb, defpackage.dap
    public final Object K(daq daqVar, Object obj) {
        Object obj2;
        ActiveStateScrollSelectionController activeStateScrollSelectionController;
        Object obj3;
        ActiveStateScrollSelectionController activeStateScrollSelectionController2;
        int i = daqVar.b;
        if (i == -1932591986) {
            dbb dbbVar = daqVar.a;
            cyv cyvVar = (cyv) daqVar.c[0];
            View view = ((dbl) obj).a;
            tdz tdzVar = ((fhp) dbbVar).c.u;
            if (tdzVar != null && (obj2 = tdzVar.f) != null && (activeStateScrollSelectionController = ((fhk) obj2).a) != null) {
                activeStateScrollSelectionController.n(view);
            }
            return null;
        } else if (i == -1048037474) {
            N((cyv) daqVar.c[0], (dao) obj);
            return null;
        } else if (i != 1803022739) {
            return null;
        } else {
            dbb dbbVar2 = daqVar.a;
            cyv cyvVar2 = (cyv) daqVar.c[0];
            View view2 = ((dev) obj).a;
            fhp fhpVar = (fhp) dbbVar2;
            tda tdaVar = fhpVar.c;
            fhr fhrVar = fhpVar.g.a;
            tdz tdzVar2 = tdaVar.u;
            if (tdzVar2 != null && (obj3 = tdzVar2.f) != null && (activeStateScrollSelectionController2 = ((fhk) obj3).a) != null) {
                activeStateScrollSelectionController2.i(view2, fhrVar);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void M(cyv cyvVar) {
        dcz dczVar = new dcz();
        axnm axnmVar = this.b;
        awmt awmtVar = this.f;
        awmt awmtVar2 = this.e;
        tda tdaVar = this.c;
        new WeakReference(cyvVar);
        dczVar.a = new fhr(axnmVar, tdaVar.r, awmtVar, awmtVar2);
        Object obj = dczVar.a;
        if (obj != null) {
            this.g.a = (fhr) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void X(ddl ddlVar, ddl ddlVar2) {
        ((fhn) ddlVar2).a = ((fhn) ddlVar).a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean ac() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final cyr b(cyv cyvVar) {
        ddf ddfVar;
        List<cyr> list = this.a;
        YogaFlexDirection yogaFlexDirection = this.d;
        YogaFlexDirection yogaFlexDirection2 = YogaFlexDirection.COLUMN;
        int ordinal = yogaFlexDirection.ordinal();
        if (ordinal == 0) {
            ddfVar = cyl.a(cyvVar);
        } else if (ordinal == 1) {
            cyk a = cyl.a(cyvVar);
            a.j();
            ddfVar = a;
        } else if (ordinal == 2) {
            ddfVar = ddg.a(cyvVar);
        } else if (ordinal == 3) {
            ddf a2 = ddg.a(cyvVar);
            a2.h();
            ddfVar = a2;
        } else {
            String valueOf = String.valueOf(yogaFlexDirection);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        ddfVar.R(H(fhp.class, cyvVar, 1803022739, new Object[]{cyvVar}));
        ddfVar.K(H(fhp.class, cyvVar, -1932591986, new Object[]{cyvVar}));
        if (list != null) {
            for (cyr cyrVar : list) {
                ddfVar.g(cyrVar.j());
            }
        }
        return ddfVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final ddl m() {
        return this.g;
    }
}
