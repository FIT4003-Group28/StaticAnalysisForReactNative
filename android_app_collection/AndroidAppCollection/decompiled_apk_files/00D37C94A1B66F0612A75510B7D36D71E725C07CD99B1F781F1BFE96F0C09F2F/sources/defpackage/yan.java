package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.TvfilmOffersRendererOuterClass;
/* compiled from: PG */
/* renamed from: yan  reason: default package */
/* loaded from: classes4.dex */
public final class yan implements ajru {
    public final ViewGroup a;
    private final yaa b;
    private final xzf c;
    private final xzd d;

    public yan(Context context, yaa yaaVar, xzf xzfVar, ViewGroup viewGroup, xzd xzdVar) {
        this.b = yaaVar;
        this.c = xzfVar;
        this.d = xzdVar;
        this.a = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.tvfilm_offers_layout, viewGroup, false);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        avlq avlqVar = (avlq) obj;
        this.a.removeAllViews();
        for (aunb aunbVar : avlqVar.b) {
            if (aunbVar.qn(TvfilmOffersRendererOuterClass.offerGroupRenderer)) {
                yaa yaaVar = this.b;
                ViewGroup viewGroup = this.a;
                Context context = (Context) yaaVar.a.get();
                context.getClass();
                akbn akbnVar = (akbn) yaaVar.b.get();
                akbnVar.getClass();
                viewGroup.getClass();
                xzz xzzVar = new xzz(context, akbnVar, viewGroup);
                xzzVar.oK(ajrsVar, (avlp) aunbVar.qm(TvfilmOffersRendererOuterClass.offerGroupRenderer));
                this.a.addView(xzzVar.a);
            }
        }
        aunb aunbVar2 = avlqVar.c;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        if (aunbVar2.qn(TvfilmOffersRendererOuterClass.couponRenderer)) {
            xzf xzfVar = this.c;
            xzd xzdVar = this.d;
            ViewGroup viewGroup2 = this.a;
            Context context2 = (Context) xzfVar.a.get();
            context2.getClass();
            viewGroup2.getClass();
            xze xzeVar = new xze(context2, xzdVar, viewGroup2);
            aunb aunbVar3 = avlqVar.c;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            xzeVar.f((avlo) aunbVar3.qm(TvfilmOffersRendererOuterClass.couponRenderer));
            this.a.addView(xzeVar.b);
        }
        this.a.setOnTouchListener(new View.OnTouchListener() { // from class: yam
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                yan.this.a.requestFocus();
                return false;
            }
        });
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
