package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.LiveFullscreenConfirmRendererOuterClass;
/* compiled from: PG */
/* renamed from: acag  reason: default package */
/* loaded from: classes.dex */
final class acag implements afzf {
    final /* synthetic */ abzi a;
    final /* synthetic */ acay b;

    public acag(acay acayVar, abzi abziVar) {
        this.b = acayVar;
        this.a = abziVar;
    }

    private final void d(final int i, final aqft aqftVar, final asug asugVar) {
        Handler handler = this.b.n;
        final abzi abziVar = this.a;
        handler.post(new Runnable() { // from class: acae
            @Override // java.lang.Runnable
            public final void run() {
                abzi.this.d(i, aqftVar, asugVar);
            }
        });
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        cew cewVar;
        zep.d("Cannot load GetBroadcastSetupResponse from InnerTube.", cffVar);
        if (cffVar == null || (cewVar = cffVar.b) == null || cewVar.a != 403) {
            abxa.b().n(3, 1, cffVar);
            d(1, null, null);
            return;
        }
        abxa.b().n(3, 2, cffVar);
        d(4, null, null);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        aqft aqftVar;
        asug asugVar;
        int i;
        aunb aunbVar;
        aunb aunbVar2;
        aunb aunbVar3;
        final arsp arspVar = (arsp) obj;
        if (arspVar != null) {
            this.b.a.D(new acte(arspVar.g.I()));
        }
        aopu<arsl> aopuVar = arspVar.f;
        if (!aopuVar.isEmpty()) {
            for (arsl arslVar : aopuVar) {
                if ((arslVar.b & 1) != 0) {
                    asue asueVar = arslVar.c;
                    if (asueVar == null) {
                        asueVar = asue.a;
                    }
                    int x = akzj.x(asueVar.d);
                    if (x == 0) {
                        x = 1;
                    }
                    int i2 = asueVar.b;
                    if (i2 == 5) {
                        ajgl.b((arag) asueVar.c).toString();
                    } else if (i2 == 6) {
                        if (!((aunb) asueVar.c).qn(ConfirmDialogRendererOuterClass.confirmDialogRenderer)) {
                            if (asueVar.b == 6) {
                                aunbVar = (aunb) asueVar.c;
                            } else {
                                aunbVar = aunb.a;
                            }
                            if (aunbVar.qn(LiveFullscreenConfirmRendererOuterClass.liveFullscreenConfirmRenderer)) {
                                if (asueVar.b == 6) {
                                    aunbVar2 = (aunb) asueVar.c;
                                } else {
                                    aunbVar2 = aunb.a;
                                }
                                i = x;
                                asugVar = (asug) aunbVar2.qm(LiveFullscreenConfirmRendererOuterClass.liveFullscreenConfirmRenderer);
                                aqftVar = null;
                            }
                        } else {
                            if (asueVar.b == 6) {
                                aunbVar3 = (aunb) asueVar.c;
                            } else {
                                aunbVar3 = aunb.a;
                            }
                            aqftVar = (aqft) aunbVar3.qm(ConfirmDialogRendererOuterClass.confirmDialogRenderer);
                            i = x;
                            asugVar = null;
                        }
                    }
                    aqftVar = null;
                    i = x;
                    asugVar = null;
                } else {
                    aqftVar = null;
                    asugVar = null;
                    i = 1;
                }
                if (i != 2 && i != 14) {
                    if (i == 4) {
                        i = 4;
                    }
                }
                abxa.b().n(3, acay.o(i), null);
                d(acay.p(i), aqftVar, asugVar);
                return;
            }
        }
        if (arspVar != null) {
            arsm arsmVar = arspVar.e;
            if (arsmVar == null) {
                arsmVar = arsm.a;
            }
            atgp atgpVar = arsmVar.b;
            if (atgpVar == null) {
                atgpVar = atgp.a;
            }
            if ((atgpVar.b & 1) != 0) {
                atgq atgqVar = atgpVar.c;
                if (atgqVar == null) {
                    atgqVar = atgq.a;
                }
                if (atgqVar != null && (atgqVar.b & 1) != 0) {
                    atha athaVar = atgqVar.c;
                    if (athaVar == null) {
                        athaVar = atha.a;
                    }
                    atgv atgvVar = athaVar.g;
                    if (atgvVar == null) {
                        atgvVar = atgv.a;
                    }
                    apoj apojVar = atgvVar.c;
                    if (apojVar == null) {
                        apojVar = apoj.a;
                    }
                    if (apojVar != null && (apojVar.b & 256) != 0) {
                        Handler handler = this.b.n;
                        final abzi abziVar = this.a;
                        handler.post(new Runnable() { // from class: acaf
                            @Override // java.lang.Runnable
                            public final void run() {
                                abzi.this.c(arspVar);
                            }
                        });
                        return;
                    }
                }
            }
        }
        abxa.b().n(3, 1, null);
        d(1, null, null);
    }
}
