package com.google.android.apps.youtube.app.extensions.arcamera.faceviewer;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FaceViewerPresenter implements ajru, f, nqj {
    private final Activity a;
    private final nml b;
    private final gfu c;
    private final ViewGroup d;
    private shs e;
    private final gpn f;
    private final gpk g;

    public FaceViewerPresenter(Context context, nml nmlVar, gfu gfuVar, gpo gpoVar, gpk gpkVar) {
        this.b = nmlVar;
        this.c = gfuVar;
        akkm akkmVar = (akkm) gpoVar.a.get();
        akkmVar.getClass();
        this.f = new gpn(akkmVar);
        this.g = gpkVar;
        this.a = zew.B(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    @Override // defpackage.nqj
    public final void g(nmc nmcVar) {
        aqvq l;
        auqh auqhVar;
        auqh auqhVar2;
        if (this.e != null) {
            if (nmcVar != null && (l = nmcVar.l()) != null && (l.c & 16) != 0) {
                aqvo aqvoVar = l.g;
                if (aqvoVar == null) {
                    aqvoVar = aqvo.a;
                }
                if (aqvoVar.b == 49399797) {
                    aqvo aqvoVar2 = l.g;
                    if (aqvoVar2 == null) {
                        aqvoVar2 = aqvo.a;
                    }
                    if (aqvoVar2.b == 49399797) {
                        auqhVar = (auqh) aqvoVar2.c;
                    } else {
                        auqhVar = auqh.a;
                    }
                    if (auqhVar.d.size() != 0) {
                        aqvo aqvoVar3 = l.g;
                        if (aqvoVar3 == null) {
                            aqvoVar3 = aqvo.a;
                        }
                        if (aqvoVar3.b == 49399797) {
                            auqhVar2 = (auqh) aqvoVar3.c;
                        } else {
                            auqhVar2 = auqh.a;
                        }
                        for (auqk auqkVar : auqhVar2.d) {
                            if ((auqkVar.e & 262144) == 0) {
                                if ((auqkVar.b & 16) != 0) {
                                    aslq aslqVar = auqkVar.j;
                                    if (aslqVar == null) {
                                        aslqVar = aslq.a;
                                    }
                                    for (aslt asltVar : aslqVar.e) {
                                        if ((asltVar.j & 512) != 0) {
                                        }
                                    }
                                    continue;
                                }
                            }
                            this.e.d.e();
                            return;
                        }
                    }
                }
            }
            this.e.d.a();
        }
    }

    @Override // defpackage.f, defpackage.g
    public final void kG(apy apyVar) {
        shs shsVar = this.e;
        if (shsVar != null) {
            shsVar.d.e();
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nv(apy apyVar) {
        shs shsVar = this.e;
        if (shsVar != null) {
            shsVar.d.a();
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        aqxm aqxmVar = (aqxm) obj;
        Activity activity = this.a;
        if (activity instanceof apy) {
            ((apy) activity).getLifecycle().c(this);
        }
        this.b.g().a(this);
        gpk gpkVar = this.g;
        gpn gpnVar = this.f;
        Context context = gpkVar.a;
        ScheduledExecutorService scheduledExecutorService = gpkVar.b;
        final shs shsVar = new shs(context, new skh(context, scheduledExecutorService), gpnVar, scheduledExecutorService, scheduledExecutorService, context.getMainExecutor(), new slg(context, 1), new aoik(null), new gpl(ajrsVar.a));
        this.e = shsVar;
        aopa createBuilder = anvy.a.createBuilder();
        aopa createBuilder2 = anvv.a.createBuilder();
        aopu aopuVar = aqxmVar.b;
        createBuilder2.copyOnWrite();
        anvv anvvVar = (anvv) createBuilder2.instance;
        aopu aopuVar2 = anvvVar.b;
        if (!aopuVar2.c()) {
            anvvVar.b = aopi.mutableCopy(aopuVar2);
        }
        aonk.addAll((Iterable) aopuVar, (List) anvvVar.b);
        createBuilder.copyOnWrite();
        anvy anvyVar = (anvy) createBuilder.instance;
        anvv anvvVar2 = (anvv) createBuilder2.mo39build();
        anvvVar2.getClass();
        anvyVar.d = anvvVar2;
        anvyVar.c = 6;
        aopa createBuilder3 = anvx.a.createBuilder();
        String str = aqxmVar.d;
        createBuilder3.copyOnWrite();
        anvx anvxVar = (anvx) createBuilder3.instance;
        str.getClass();
        anvxVar.b |= 1;
        anvxVar.c = str;
        awfh awfhVar = aqxmVar.c;
        if (awfhVar == null) {
            awfhVar = awfh.a;
        }
        createBuilder3.copyOnWrite();
        anvx anvxVar2 = (anvx) createBuilder3.instance;
        awfhVar.getClass();
        anvxVar2.d = awfhVar;
        final int i = 2;
        anvxVar2.b |= 2;
        createBuilder.copyOnWrite();
        anvy anvyVar2 = (anvy) createBuilder.instance;
        anvx anvxVar3 = (anvx) createBuilder3.mo39build();
        anvxVar3.getClass();
        anvyVar2.f = anvxVar3;
        anvyVar2.e = 5;
        int b = aqxo.b(aqxmVar.e);
        if (b == 0) {
            b = 1;
        }
        gfs gfsVar = gfs.LIGHT;
        int i2 = b + (-1) != 2 ? 3 : 2;
        createBuilder.copyOnWrite();
        anvy anvyVar3 = (anvy) createBuilder.instance;
        anvyVar3.h = i2 - 1;
        anvyVar3.b |= 32;
        createBuilder.copyOnWrite();
        anvy anvyVar4 = (anvy) createBuilder.instance;
        anvyVar4.b |= 8;
        anvyVar4.g = "Base Experience";
        if (!aqxmVar.f.isEmpty()) {
            String str2 = aqxmVar.f;
            createBuilder.copyOnWrite();
            anvy anvyVar5 = (anvy) createBuilder.instance;
            str2.getClass();
            anvyVar5.b |= 128;
            anvyVar5.i = str2;
        }
        final anvy anvyVar6 = (anvy) createBuilder.mo39build();
        if (this.c.a().ordinal() != 1) {
            i = 1;
        }
        anlz.A(anii.h(shsVar.k, new ampg() { // from class: shq
            @Override // defpackage.ampg
            public final Object apply(Object obj2) {
                anvv anvvVar3;
                shs shsVar2 = shs.this;
                anvy anvyVar7 = anvyVar6;
                int i3 = i;
                Executor executor = shsVar2.j;
                Executor executor2 = shsVar2.i;
                Executor executor3 = shsVar2.h;
                skr skrVar = new skr(shsVar2.l, new skv(anvyVar7, i3), executor, executor2, executor3, (CronetEngine) obj2);
                for (skq skqVar : shsVar2.b) {
                    skqVar.c(skrVar);
                }
                if (!skrVar.a.a()) {
                    shsVar2.e.a();
                }
                sie sieVar = skrVar.e.a;
                anvl a = anvm.a();
                int i4 = anvyVar7.c;
                if (i4 == 1) {
                    a.copyOnWrite();
                    ((anvm) a.instance).h((String) anvyVar7.d);
                } else if (i4 == 6) {
                    aopa createBuilder4 = anvi.a.createBuilder();
                    if (anvyVar7.c == 6) {
                        anvvVar3 = (anvv) anvyVar7.d;
                    } else {
                        anvvVar3 = anvv.a;
                    }
                    aopu aopuVar3 = anvvVar3.b;
                    createBuilder4.copyOnWrite();
                    anvi anviVar = (anvi) createBuilder4.instance;
                    aopu aopuVar4 = anviVar.b;
                    if (!aopuVar4.c()) {
                        anviVar.b = aopi.mutableCopy(aopuVar4);
                    }
                    aonk.addAll((Iterable) aopuVar3, (List) anviVar.b);
                    a.copyOnWrite();
                    ((anvm) a.instance).g((anvi) createBuilder4.mo39build());
                }
                skr skrVar2 = sieVar.c;
                if (skrVar2 != null) {
                    anvh anvhVar = ((sif) skrVar2.e.b()).a;
                    a.copyOnWrite();
                    ((anvm) a.instance).f(anvhVar);
                }
                sht shtVar = sieVar.b;
                aopa g = sieVar.g();
                anvm anvmVar = (anvm) a.mo39build();
                g.copyOnWrite();
                anvu anvuVar = (anvu) g.instance;
                anvu anvuVar2 = anvu.a;
                anvmVar.getClass();
                anvuVar.d = anvmVar;
                anvuVar.c = 2;
                shtVar.a(g);
                return null;
            }
        }, shsVar.j), new sle(1), shsVar.h);
        this.d.removeAllViews();
        this.d.addView(this.e.c, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        Activity activity = this.a;
        if (activity instanceof apy) {
            ((apy) activity).getLifecycle().e(this);
        }
        this.b.g().b(this);
        shs shsVar = this.e;
        if (shsVar != null) {
            shsVar.d.a();
            shs shsVar2 = this.e;
            for (skq skqVar : shsVar2.b) {
                skqVar.b();
            }
            shsVar2.b.clear();
            shsVar2.c = null;
            this.e = null;
        }
    }
}
