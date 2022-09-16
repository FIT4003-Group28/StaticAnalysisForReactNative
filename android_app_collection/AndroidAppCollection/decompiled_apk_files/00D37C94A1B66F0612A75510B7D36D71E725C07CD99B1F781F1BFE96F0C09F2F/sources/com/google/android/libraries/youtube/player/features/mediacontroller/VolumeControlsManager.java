package com.google.android.libraries.youtube.player.features.mediacontroller;

import android.app.Activity;
import com.google.android.libraries.youtube.player.features.mediacontroller.VolumeControlsManager;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class VolumeControlsManager implements f {
    public final axnm a;
    public final Activity b;
    private final aynx c;
    private aypg d;

    public VolumeControlsManager(axnm axnmVar, ajad ajadVar, Activity activity) {
        this.a = axnmVar;
        this.c = ajadVar.a;
        this.b = activity;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void lc(apy apyVar) {
        this.d = this.c.Z(new ayqb() { // from class: ahxr
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                VolumeControlsManager volumeControlsManager = VolumeControlsManager.this;
                ajac ajacVar = ajac.STARTED;
                int ordinal = ((ajac) obj).ordinal();
                if (ordinal == 0) {
                    ip.d(volumeControlsManager.b, ((iz) volumeControlsManager.a.get()).c);
                } else if (ordinal != 1) {
                } else {
                    ip.d(volumeControlsManager.b, null);
                }
            }
        });
        this.b.setVolumeControlStream(3);
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        aypg aypgVar = this.d;
        if (aypgVar != null) {
            azof.f((AtomicReference) aypgVar);
            this.d = null;
        }
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
