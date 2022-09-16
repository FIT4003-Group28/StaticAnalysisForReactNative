package defpackage;

import android.os.Handler;
import android.view.View;
import com.facebook.yoga.YogaFlexDirection;
import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: fie  reason: default package */
/* loaded from: classes3.dex */
public final class fie extends cyr {
    public static final /* synthetic */ int w = 0;
    @dfs(a = 6)
    List a;
    @dfs(a = 13)
    axnm b;
    @dfs(a = 13)
    YogaFlexDirection c;
    @dfs(a = 13)
    awmt d;
    @dfs(a = 13)
    awmt e;
    @dfs(a = 10)
    cyr f;
    @dfs(a = 13)
    axnm g;
    @dfs(a = 13)
    Handler v;
    @dfs(a = 14)
    private fid x;

    public fie() {
        super("InlinePlayback");
        this.x = new fid();
    }

    @Override // defpackage.czb, defpackage.dap
    public final Object K(daq daqVar, Object obj) {
        int i = daqVar.b;
        if (i == -1932591986) {
            dbb dbbVar = daqVar.a;
            cyv cyvVar = (cyv) daqVar.c[0];
            View view = ((dbl) obj).a;
            fie fieVar = (fie) dbbVar;
            axnm axnmVar = fieVar.g;
            fid fidVar = fieVar.x;
            fij fijVar = fidVar.c;
            fidVar.a.b = false;
            ((ScrollSelectionController) axnmVar.get()).n(view);
            return null;
        } else if (i == -1048037474) {
            N((cyv) daqVar.c[0], (dao) obj);
            return null;
        } else if (i != 1803022739) {
            return null;
        } else {
            dbb dbbVar2 = daqVar.a;
            View view2 = ((dev) obj).a;
            fie fieVar2 = (fie) dbbVar2;
            axnm axnmVar2 = fieVar2.b;
            axnm axnmVar3 = fieVar2.g;
            awmt awmtVar = fieVar2.d;
            awmt awmtVar2 = fieVar2.e;
            fid fidVar2 = fieVar2.x;
            fij fijVar2 = fidVar2.c;
            fidVar2.a.b = true;
            fijVar2.c(new WeakReference((cyv) daqVar.c[0]));
            ((ScrollSelectionController) axnmVar3.get()).i(view2, fijVar2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void M(cyv cyvVar) {
        dcz dczVar = new dcz();
        dcz dczVar2 = new dcz();
        dcz dczVar3 = new dcz();
        axnm axnmVar = this.b;
        awmt awmtVar = this.d;
        awmt awmtVar2 = this.e;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        fio fioVar = new fio();
        dczVar.a = atomicBoolean;
        dczVar2.a = fioVar;
        dczVar3.a = new fij(new WeakReference(cyvVar), axnmVar, awmtVar, awmtVar2, fioVar, atomicBoolean);
        Object obj = dczVar.a;
        if (obj != null) {
            this.x.b = (AtomicBoolean) obj;
        }
        Object obj2 = dczVar2.a;
        if (obj2 != null) {
            this.x.a = (fio) obj2;
        }
        Object obj3 = dczVar3.a;
        if (obj3 != null) {
            this.x.c = (fij) obj3;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void X(ddl ddlVar, ddl ddlVar2) {
        fid fidVar = (fid) ddlVar;
        fid fidVar2 = (fid) ddlVar2;
        fidVar2.a = fidVar.a;
        fidVar2.b = fidVar.b;
        fidVar2.c = fidVar.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean ac() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final aflw at(cyv cyvVar, aflw aflwVar) {
        aflw h = aflw.h(aflwVar);
        fid fidVar = this.x;
        fij fijVar = fidVar.c;
        fio fioVar = fidVar.a;
        fijVar.c(new WeakReference(cyvVar));
        h.g(fio.class, fioVar);
        return h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final cyr b(cyv cyvVar) {
        ddf ddfVar;
        Handler handler = this.v;
        cyr cyrVar = this.f;
        List<cyr> list = this.a;
        YogaFlexDirection yogaFlexDirection = this.c;
        fid fidVar = this.x;
        final fio fioVar = fidVar.a;
        fij fijVar = fidVar.c;
        final AtomicBoolean atomicBoolean = fidVar.b;
        fijVar.c(new WeakReference(cyvVar));
        handler.post(new Runnable() { // from class: fih
            @Override // java.lang.Runnable
            public final void run() {
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                fio fioVar2 = fioVar;
                if (!atomicBoolean2.get()) {
                    fioVar2.a(false);
                }
            }
        });
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
        ddfVar.R(H(fie.class, cyvVar, 1803022739, new Object[]{cyvVar}));
        ddfVar.K(H(fie.class, cyvVar, -1932591986, new Object[]{cyvVar}));
        ddfVar.g(cyrVar.j());
        for (cyr cyrVar2 : list) {
            ddfVar.g(cyrVar2.j());
        }
        ddfVar.p(true != atomicBoolean.get() ? 1.0f : 0.0f);
        return ddfVar.a();
    }

    @Override // defpackage.cyr
    public final /* bridge */ /* synthetic */ cyr j() {
        fie fieVar = (fie) super.j();
        cyr cyrVar = fieVar.f;
        fieVar.f = cyrVar != null ? cyrVar.j() : null;
        fieVar.x = new fid();
        return fieVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final ddl m() {
        return this.x;
    }
}
