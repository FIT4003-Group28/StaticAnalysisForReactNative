package com.google.android.apps.youtube.app.common.ui.pip;

import android.app.Activity;
import android.os.Build;
import com.google.android.apps.youtube.app.common.ui.pip.PipObserver;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class PipObserver implements f {
    public final azpm a;
    private final aypg b;

    public PipObserver(Activity activity, azpx azpxVar) {
        this.a = azpm.aI((Build.VERSION.SDK_INT < 26 || !activity.isInPictureInPictureMode()) ? gdm.NOT_IN_PIP : gdm.IN_PIP);
        this.b = azpxVar.as(new ayqb() { // from class: gdl
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                PipObserver pipObserver = PipObserver.this;
                if (!((Boolean) obj).booleanValue()) {
                    if (pipObserver.a.aJ() != gdm.IN_PIP) {
                        return;
                    }
                    pipObserver.a.c(gdm.EXITING_PIP);
                } else if (pipObserver.a.aJ() == gdm.IN_PIP) {
                } else {
                    pipObserver.a.c(gdm.IN_PIP);
                }
            }
        });
    }

    @Override // defpackage.f, defpackage.g
    public final void kG(apy apyVar) {
        if (this.a.aJ() == gdm.EXITING_PIP) {
            this.a.c(gdm.NOT_IN_PIP);
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        this.a.sm();
        ayqi.c((AtomicReference) this.b);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
