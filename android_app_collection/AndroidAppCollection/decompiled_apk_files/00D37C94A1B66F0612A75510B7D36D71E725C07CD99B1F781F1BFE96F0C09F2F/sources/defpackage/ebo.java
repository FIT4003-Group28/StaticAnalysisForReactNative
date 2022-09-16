package defpackage;

import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.SurveyRenderer;
/* compiled from: PG */
/* renamed from: ebo  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ebo implements ylw {
    public final /* synthetic */ ebp a;
    private final /* synthetic */ int b;

    public /* synthetic */ ebo(ebp ebpVar) {
        this.a = ebpVar;
    }

    public /* synthetic */ ebo(ebp ebpVar, int i) {
        this.b = i;
        this.a = ebpVar;
    }

    @Override // defpackage.ylw, defpackage.zdt
    public final void a(Object obj) {
        aqtb aqtbVar;
        aqtb aqtbVar2;
        aunb aunbVar = null;
        aqtb aqtbVar3 = null;
        if (this.b == 0) {
            ebp ebpVar = this.a;
            asdw asdwVar = (asdw) obj;
            if ((asdwVar.b & 2) != 0 && (aunbVar = asdwVar.d) == null) {
                aunbVar = aunb.a;
            }
            avdv avdvVar = (avdv) ajjh.l(aunbVar, SurveyRenderer.surveyTriggerRenderer);
            if (avdvVar == null || (avdvVar.b & 16) == 0 || ebpVar.an.g() != ezx.WATCH_WHILE_MAXIMIZED) {
                return;
            }
            HatsController hatsController = ebpVar.al;
            avdu avduVar = avdvVar.c;
            if (avduVar == null) {
                avduVar = avdu.a;
            }
            hatsController.k(avduVar);
            return;
        }
        ebp ebpVar2 = this.a;
        artr artrVar = (artr) obj;
        ebpVar2.aG();
        ebpVar2.as = artrVar.g;
        ((acsx) ebpVar2.ar).D(new acte(artrVar.f.I()));
        aunb aunbVar2 = artrVar.c;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        if (aunbVar2.qn(ElementRendererOuterClass.elementRenderer)) {
            aunb aunbVar3 = artrVar.c;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            aqtbVar = (aqtb) aunbVar3.qm(ElementRendererOuterClass.elementRenderer);
        } else {
            aqtbVar = null;
        }
        if (aqtbVar != null) {
            ajin ajinVar = ebpVar2.ag;
            aunb aunbVar4 = artrVar.c;
            if (aunbVar4 == null) {
                aunbVar4 = aunb.a;
            }
            ebpVar2.ap.add(ajhh.a((aqtb) aunbVar4.qm(ElementRendererOuterClass.elementRenderer)));
        }
        aunb aunbVar5 = artrVar.e;
        if (aunbVar5 == null) {
            aunbVar5 = aunb.a;
        }
        if (aunbVar5.qn(ElementRendererOuterClass.elementRenderer)) {
            aunb aunbVar6 = artrVar.e;
            if (aunbVar6 == null) {
                aunbVar6 = aunb.a;
            }
            aqtbVar2 = (aqtb) aunbVar6.qm(ElementRendererOuterClass.elementRenderer);
        } else {
            aqtbVar2 = null;
        }
        if (aqtbVar2 != null) {
            ajin ajinVar2 = ebpVar2.ag;
            aunb aunbVar7 = artrVar.e;
            if (aunbVar7 == null) {
                aunbVar7 = aunb.a;
            }
            ebpVar2.ap.add(ajhh.a((aqtb) aunbVar7.qm(ElementRendererOuterClass.elementRenderer)));
        }
        aunb aunbVar8 = artrVar.d;
        if (aunbVar8 == null) {
            aunbVar8 = aunb.a;
        }
        if (aunbVar8.qn(ElementRendererOuterClass.elementRenderer)) {
            aunb aunbVar9 = artrVar.d;
            if (aunbVar9 == null) {
                aunbVar9 = aunb.a;
            }
            aqtbVar3 = (aqtb) aunbVar9.qm(ElementRendererOuterClass.elementRenderer);
        }
        if (aqtbVar3 == null) {
            return;
        }
        ajin ajinVar3 = ebpVar2.ag;
        aunb aunbVar10 = artrVar.d;
        if (aunbVar10 == null) {
            aunbVar10 = aunb.a;
        }
        ebpVar2.ap.add(ajhh.a((aqtb) aunbVar10.qm(ElementRendererOuterClass.elementRenderer)));
    }
}
