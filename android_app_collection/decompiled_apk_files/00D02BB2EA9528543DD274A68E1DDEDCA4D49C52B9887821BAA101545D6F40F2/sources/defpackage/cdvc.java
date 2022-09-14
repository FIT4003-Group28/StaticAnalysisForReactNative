package defpackage;

import android.net.Uri;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdvc  reason: default package */
/* loaded from: classes4.dex */
public final class cdvc extends cdve {
    public final WebImageView s;
    public final dzve<Uri, dztc> t;
    private final View u;
    private final cebc v;
    private cduz w;
    private final ViewGroup x;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cdvc(android.view.ViewGroup r4, defpackage.cebd r5, defpackage.ilo r6, defpackage.dzve<? super android.net.Uri, defpackage.dztc> r7) {
        /*
            r3 = this;
            java.lang.String r0 = "logger"
            defpackage.dzvx.c(r5, r0)
            java.lang.String r0 = "placemark"
            defpackage.dzvx.c(r6, r0)
            java.lang.String r0 = "onEdit"
            defpackage.dzvx.c(r7, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131624242(0x7f0e0132, float:1.8875658E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r4, r2)
        */
        //  java.lang.String r1 = "LayoutInflater.from(pare…*attachToRoot=*/false\n  )"
        /*
            defpackage.dzvx.b(r0, r1)
            r3.<init>(r0)
            r3.x = r4
            r3.t = r7
            android.view.View r4 = r3.a
            r7 = 2131428015(0x7f0b02af, float:1.8477663E38)
            android.view.View r4 = r4.findViewById(r7)
            com.google.android.apps.gmm.base.views.webimageview.WebImageView r4 = (com.google.android.apps.gmm.base.views.webimageview.WebImageView) r4
            r3.s = r4
            cebc r4 = r5.a(r4)
            ddho r7 = defpackage.dtyd.J
            r4.d(r7, r6)
            android.view.View r4 = r3.a
            r7 = 2131427574(0x7f0b00f6, float:1.8476768E38)
            android.view.View r4 = r4.findViewById(r7)
            r3.u = r4
            cebc r4 = r5.a(r4)
            ddho r5 = defpackage.dtyd.I
            r4.d(r5, r6)
            r3.v = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdvc.<init>(android.view.ViewGroup, cebd, ilo, dzve):void");
    }

    public final void C(WebImageView webImageView) {
        jic jicVar;
        dzvx.c(webImageView, "$this$load");
        ViewGroup viewGroup = this.x;
        Size size = new Size(Integer.MIN_VALUE, (viewGroup.getHeight() - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom());
        cduz cduzVar = this.w;
        if (cduzVar != null) {
            Uri parse = Uri.parse(jfv.a(cduzVar.b.toString()).a(cduzVar.b.toString(), -1, size.getHeight(), ImageView.ScaleType.FIT_CENTER));
            dzvx.b(parse, "Uri.parse(\n        Image…ENTER\n          )\n      )");
            jicVar = cdyq.a(parse, size);
        } else {
            jicVar = null;
        }
        webImageView.o(jicVar);
    }

    @Override // defpackage.cdve
    public final void D(cduu cduuVar) {
        dzvx.c(cduuVar, "item");
        if (!(cduuVar instanceof cduz)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        cduz cduzVar = (cduz) cduuVar;
        View view = this.u;
        dzvx.b(view, "editButton");
        view.setVisibility(true != cduzVar.a ? 8 : 0);
        this.v.b(new cdva(cduzVar, this));
        this.w = cduzVar;
        ViewGroup viewGroup = this.x;
        if (!od.ae(viewGroup) || viewGroup.isLayoutRequested()) {
            viewGroup.addOnLayoutChangeListener(new cdvb(this));
            return;
        }
        WebImageView webImageView = this.s;
        dzvx.b(webImageView, "image");
        C(webImageView);
    }
}
