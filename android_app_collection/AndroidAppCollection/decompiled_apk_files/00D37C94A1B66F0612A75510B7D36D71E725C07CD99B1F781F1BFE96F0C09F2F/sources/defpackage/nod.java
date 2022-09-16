package defpackage;

import com.google.android.apps.youtube.app.watch.engagementpanel.LinearScrollToItemLayoutManager;
import com.google.protos.youtube.api.innertube.ElementsSectionListFooterRendererOuterClass;
/* compiled from: PG */
/* renamed from: nod  reason: default package */
/* loaded from: classes3.dex */
final class nod extends ajwe {
    final /* synthetic */ noe a;

    public nod(noe noeVar) {
        this.a = noeVar;
    }

    @Override // defpackage.ajwe, defpackage.akae
    public final void c(aakw aakwVar, boolean z) {
        int bk;
        int bl;
        if (z) {
            noe noeVar = this.a;
            auqh auqhVar = aakwVar.a;
            LinearScrollToItemLayoutManager linearScrollToItemLayoutManager = noeVar.j;
            if (linearScrollToItemLayoutManager != null) {
                boolean z2 = true;
                linearScrollToItemLayoutManager.ac(((auqhVar.c & 16384) == 0 || (bl = awwc.bl(auqhVar.o)) == 0 || bl != 3) ? false : true);
                if ((auqhVar.c & 65536) == 0 || (bk = awwc.bk(auqhVar.q)) == 0 || bk != 3) {
                    z2 = false;
                }
                linearScrollToItemLayoutManager.bB(z2);
            }
            noe noeVar2 = this.a;
            auqh auqhVar2 = aakwVar.a;
            if (noeVar2.i != null) {
                return;
            }
            aunb aunbVar = auqhVar2.k;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (!aunbVar.qn(ElementsSectionListFooterRendererOuterClass.elementsSectionListFooterRenderer)) {
                return;
            }
            nlv nlvVar = noeVar2.d;
            acti actiVar = noeVar2.a;
            asjj asjjVar = noeVar2.c;
            nny nnyVar = new nny(noeVar2);
            aunb aunbVar2 = auqhVar2.k;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            noeVar2.i = nlvVar.a(actiVar, asjjVar, nnyVar, (aqti) aunbVar2.qm(ElementsSectionListFooterRendererOuterClass.elementsSectionListFooterRenderer));
            nlw nlwVar = noeVar2.i;
            noeVar2.g(nlwVar);
            noeVar2.e.addView(nlwVar.a());
            nlwVar.h();
        }
    }
}
