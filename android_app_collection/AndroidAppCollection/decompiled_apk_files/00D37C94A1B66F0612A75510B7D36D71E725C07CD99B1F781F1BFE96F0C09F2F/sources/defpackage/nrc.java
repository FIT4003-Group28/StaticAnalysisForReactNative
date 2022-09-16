package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.app.watch.engagementpanel.LinearScrollToItemLayoutManager;
import com.google.protos.youtube.api.innertube.ElementsSectionListFooterRendererOuterClass;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nrc  reason: default package */
/* loaded from: classes3.dex */
public final class nrc extends ajwe {
    final /* synthetic */ nrd a;

    public nrc(nrd nrdVar) {
        this.a = nrdVar;
    }

    @Override // defpackage.ajwe, defpackage.akae
    public final void c(aakw aakwVar, boolean z) {
        LinearScrollToItemLayoutManager linearScrollToItemLayoutManager;
        int bk;
        int bl;
        if (z) {
            auqh auqhVar = aakwVar.a;
            RecyclerView recyclerView = this.a.i;
            if (recyclerView != null && (linearScrollToItemLayoutManager = (LinearScrollToItemLayoutManager) recyclerView.n) != null) {
                boolean z2 = true;
                linearScrollToItemLayoutManager.ac(((auqhVar.c & 16384) == 0 || (bl = awwc.bl(auqhVar.o)) == 0 || bl != 3) ? false : true);
                if ((auqhVar.c & 65536) == 0 || (bk = awwc.bk(auqhVar.q)) == 0 || bk != 3) {
                    z2 = false;
                }
                linearScrollToItemLayoutManager.bB(z2);
            }
            nrb nrbVar = this.a.g;
            if (nrbVar == null || (auqhVar.c & 32) == 0) {
                return;
            }
            aunb aunbVar = auqhVar.k;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (!aunbVar.qn(ElementsSectionListFooterRendererOuterClass.elementsSectionListFooterRenderer)) {
                return;
            }
            aunb aunbVar2 = auqhVar.k;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            nrbVar.D((aqti) aunbVar2.qm(ElementsSectionListFooterRendererOuterClass.elementsSectionListFooterRenderer));
        }
    }
}
