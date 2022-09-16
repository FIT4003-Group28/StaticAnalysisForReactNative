package com.google.android.apps.youtube.app.watch.nextgenwatch.ui;

import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.FullscreenExitController;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class FullscreenExitController implements f {
    public boolean a = false;
    public boolean b = false;
    private final ezh c;
    private aypg d;

    public FullscreenExitController(ezh ezhVar) {
        this.c = ezhVar;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        this.a = false;
        aypg aypgVar = this.d;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
            this.d = null;
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.d = this.c.h().aA().as(new ayqb() { // from class: nyy
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                FullscreenExitController fullscreenExitController = FullscreenExitController.this;
                List list = (List) obj;
                boolean z = false;
                ezx ezxVar = (ezx) list.get(0);
                if (((ezx) list.get(1)) == ezx.WATCH_WHILE_FULLSCREEN && (ezxVar == ezx.WATCH_WHILE_MAXIMIZED || ezxVar == ezx.WATCH_WHILE_SLIDING_MAXIMIZED_FULLSCREEN)) {
                    z = true;
                }
                fullscreenExitController.a = z;
            }
        });
    }
}
