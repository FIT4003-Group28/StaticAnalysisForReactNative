package defpackage;

import android.text.Layout;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.protos.youtube.api.innertube.ImageCarouselEditorRendererOuterClass;
/* compiled from: PG */
/* renamed from: xue  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xue implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ xuz a;
    private final /* synthetic */ int b;

    public /* synthetic */ xue(xuz xuzVar) {
        this.a = xuzVar;
    }

    public /* synthetic */ xue(xuz xuzVar, int i) {
        this.b = i;
        this.a = xuzVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        TextView textView;
        if (this.b != 0) {
            xuz xuzVar = this.a;
            if (!xuzVar.aR() || (textView = xuzVar.aR) == null) {
                return;
            }
            textView.getViewTreeObserver().removeOnGlobalLayoutListener(xuzVar.bg);
            Layout layout = xuzVar.aR.getLayout();
            if (layout == null || layout.getLineCount() != 1 || layout.getEllipsisCount(0) <= 0) {
                zag.o(xuzVar.aR, true);
                return;
            } else {
                zag.o(xuzVar.aR, false);
                return;
            }
        }
        xuz xuzVar2 = this.a;
        if (xuzVar2.be != null || !xuzVar2.bf || xuzVar2.aE.getWidth() == 0) {
            return;
        }
        xwy xwyVar = xuzVar2.ao;
        aunb aunbVar = xuzVar2.az.G;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        arie arieVar = (arie) aunbVar.qm(ImageCarouselEditorRendererOuterClass.imageCarouselEditorRenderer);
        int width = xuzVar2.aE.getWidth();
        xrl xrlVar = (xrl) xwyVar.a.get();
        xrlVar.getClass();
        aafo aafoVar = (aafo) xwyVar.b.get();
        aafoVar.getClass();
        xqj xqjVar = (xqj) xwyVar.c.get();
        xqjVar.getClass();
        arieVar.getClass();
        xuzVar2.be = new xwx(xrlVar, aafoVar, xqjVar, arieVar, (int) (width * 0.65f));
        xuzVar2.ba.ad(xuzVar2.be);
        xuzVar2.aE.getViewTreeObserver().removeOnGlobalLayoutListener(xuzVar2.bh);
    }
}
