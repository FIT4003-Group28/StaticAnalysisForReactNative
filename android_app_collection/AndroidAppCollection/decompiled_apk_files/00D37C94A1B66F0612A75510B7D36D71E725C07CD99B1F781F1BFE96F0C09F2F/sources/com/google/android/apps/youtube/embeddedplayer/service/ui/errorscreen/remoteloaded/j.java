package com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded;

import android.os.Handler;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.aa;
import j$.util.Optional;
import j$.util.function.Consumer;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class j implements c {
    public final b a;
    public final aafo b;
    private final Optional c;
    private auad d;

    public j(b bVar, Optional optional, aafo aafoVar) {
        this.a = bVar;
        this.c = optional;
        this.b = aafoVar;
    }

    private final Spanned c(arag aragVar) {
        Optional empty;
        if (this.b != null) {
            final aafs a = aaft.a(true);
            empty = Optional.of(new ajgf() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.g
                @Override // defpackage.ajgf
                public final ClickableSpan a(apzg apzgVar) {
                    return a.a(j.this.b, null, apzgVar);
                }
            });
        } else {
            empty = Optional.empty();
        }
        if (empty.isPresent()) {
            return ajgl.c(aragVar, (ajgf) empty.get());
        }
        return ajgl.s(null, aragVar, 0, null, null);
    }

    private final void d(Runnable runnable) {
        if (this.c.isPresent()) {
            ((Handler) this.c.get()).post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.c
    public final void a() {
        d(new h(this.a, 1));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.c
    public final void b(asaa asaaVar, boolean z, Optional optional) {
        auad auadVar;
        auad auadVar2;
        b bVar = this.a;
        bVar.b = "";
        boolean z2 = false;
        bVar.c = false;
        bVar.a = null;
        bVar.e = null;
        arzz arzzVar = asaaVar.g;
        if (arzzVar == null) {
            arzzVar = arzz.a;
        }
        if (arzzVar.b == 58356580) {
            auadVar = (auad) arzzVar.c;
        } else {
            auadVar = auad.a;
        }
        if ((auadVar.b & 8) != 0) {
            aqvb.k("Watch-on-YouTube button is filled. Setting canRetry to false", new Object[0]);
            this.a.c = false;
        } else {
            this.a.c = z;
        }
        optional.ifPresent(new Consumer() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.i
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                aa aaVar = (aa) obj;
                b bVar2 = j.this.a;
                aaVar.getClass();
                bVar2.e = new f(aaVar);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return consumer.getClass();
            }
        });
        arzz arzzVar2 = asaaVar.g;
        if (arzzVar2 == null) {
            arzzVar2 = arzz.a;
        }
        if (arzzVar2.b == 58356580) {
            arzz arzzVar3 = asaaVar.g;
            if (arzzVar3 == null) {
                arzzVar3 = arzz.a;
            }
            if (arzzVar3.b == 58356580) {
                auadVar2 = (auad) arzzVar3.c;
            } else {
                auadVar2 = auad.a;
            }
            this.d = auadVar2;
            if (auadVar2 != null) {
                b bVar2 = this.a;
                arag aragVar = auadVar2.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                bVar2.b = c(aragVar);
                auad auadVar3 = this.d;
                if (auadVar3 != null) {
                    apok apokVar = auadVar3.e;
                    if (apokVar == null) {
                        apokVar = apok.a;
                    }
                    if ((apokVar.b & 1) != 0) {
                        apok apokVar2 = this.d.e;
                        if (apokVar2 == null) {
                            apokVar2 = apok.a;
                        }
                        apoj apojVar = apokVar2.c;
                        if (apojVar == null) {
                            apojVar = apoj.a;
                        }
                        if ((apojVar.b & 32768) != 0) {
                            arag aragVar2 = apojVar.i;
                            if (aragVar2 == null) {
                                aragVar2 = arag.a;
                            }
                            if ((aragVar2.b & 1) != 0) {
                                b bVar3 = this.a;
                                arag aragVar3 = apojVar.i;
                                if (aragVar3 == null) {
                                    aragVar3 = arag.a;
                                }
                                if (1 == (aragVar3.b & 1)) {
                                    z2 = true;
                                }
                                aqxo.p(z2);
                                arag aragVar4 = apojVar.i;
                                if (aragVar4 == null) {
                                    aragVar4 = arag.a;
                                }
                                String str = aragVar4.d;
                                apzg apzgVar = apojVar.p;
                                if (apzgVar == null) {
                                    apzgVar = apzg.a;
                                }
                                aopc aopcVar = (aopc) arai.a.createBuilder();
                                aopcVar.copyOnWrite();
                                arai araiVar = (arai) aopcVar.instance;
                                str.getClass();
                                araiVar.b = 1 | araiVar.b;
                                araiVar.c = str;
                                aopcVar.copyOnWrite();
                                arai araiVar2 = (arai) aopcVar.instance;
                                apzgVar.getClass();
                                araiVar2.m = apzgVar;
                                araiVar2.b |= 512;
                                aopc aopcVar2 = (aopc) arag.a.createBuilder();
                                aopcVar2.ch((arai) aopcVar.mo39build());
                                bVar3.a = c((arag) aopcVar2.mo39build());
                            }
                        }
                        aqvb.l("Error UI not filled with link to YouTube app", new Object[0]);
                    }
                }
            }
        } else {
            this.a.b = asaaVar.d;
        }
        d(new h(this.a));
    }
}
