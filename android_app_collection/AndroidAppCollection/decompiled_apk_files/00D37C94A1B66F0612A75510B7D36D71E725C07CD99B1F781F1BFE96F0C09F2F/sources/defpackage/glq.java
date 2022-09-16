package defpackage;

import com.google.protos.youtube.api.innertube.HorizontalListRendererOuterClass;
import com.google.protos.youtube.api.innertube.ItemSectionRendererOuterClass;
/* compiled from: PG */
/* renamed from: glq  reason: default package */
/* loaded from: classes3.dex */
final class glq implements ajxc {
    private final int a;
    private final odd b;
    private final glm c;

    public glq(odd oddVar, glm glmVar) {
        this.a = oddVar.b();
        this.b = oddVar;
        this.c = glmVar;
    }

    @Override // defpackage.ajxc
    public final void a(ajga ajgaVar) {
        arha arhaVar;
        avwm avwmVar;
        aslq aslqVar;
        if (this.a == this.b.b()) {
            auna a = ajgaVar.a();
            aoob aoobVar = null;
            aumw aumwVar = a != null ? (aumw) a.qm(aumw.b) : null;
            if (aumwVar == null) {
                return;
            }
            aunb aunbVar = aumwVar.c;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (aunbVar.qn(HorizontalListRendererOuterClass.horizontalListRenderer)) {
                aunb aunbVar2 = aumwVar.c;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                arhaVar = (arha) aunbVar2.qm(HorizontalListRendererOuterClass.horizontalListRenderer);
            } else {
                arhaVar = null;
            }
            if (arhaVar != null) {
                odd oddVar = this.b;
                if (oddVar instanceof odc) {
                    ((odc) oddVar).i(arhaVar.c);
                    glm glmVar = this.c;
                    if ((arhaVar.b & 512) != 0) {
                        aoobVar = arhaVar.g;
                    }
                    glmVar.a(aoobVar);
                    return;
                }
            }
            aunb aunbVar3 = aumwVar.c;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            if (aunbVar3.qn(avwo.a)) {
                aunb aunbVar4 = aumwVar.c;
                if (aunbVar4 == null) {
                    aunbVar4 = aunb.a;
                }
                avwmVar = (avwm) aunbVar4.qm(avwo.a);
            } else {
                avwmVar = null;
            }
            if (avwmVar != null) {
                odd oddVar2 = this.b;
                if (oddVar2 instanceof odg) {
                    ((odg) oddVar2).i(avwmVar.c);
                    glm glmVar2 = this.c;
                    if ((avwmVar.b & 256) != 0) {
                        aoobVar = avwmVar.j;
                    }
                    glmVar2.a(aoobVar);
                    return;
                }
            }
            aunb aunbVar5 = aumwVar.c;
            if (aunbVar5 == null) {
                aunbVar5 = aunb.a;
            }
            if (aunbVar5.qn(ItemSectionRendererOuterClass.itemSectionRenderer)) {
                aunb aunbVar6 = aumwVar.c;
                if (aunbVar6 == null) {
                    aunbVar6 = aunb.a;
                }
                aslqVar = (aslq) aunbVar6.qm(ItemSectionRendererOuterClass.itemSectionRenderer);
            } else {
                aslqVar = null;
            }
            if (aslqVar == null) {
                return;
            }
            odd oddVar3 = this.b;
            if (!(oddVar3 instanceof odh)) {
                return;
            }
            odh odhVar = (odh) oddVar3;
            aopu aopuVar = aslqVar.e;
            if (!aopuVar.isEmpty()) {
                odhVar.H(mem.l);
                aopc aopcVar = (aopc) aslq.a.createBuilder();
                aopcVar.cj(aopuVar);
                odhVar.nm(new aakq((aslq) aopcVar.mo39build()));
                odhVar.a++;
            }
            glm glmVar3 = this.c;
            if ((aslqVar.c & 1024) != 0) {
                aoobVar = aslqVar.m;
            }
            glmVar3.a(aoobVar);
        }
    }
}
