package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.CarouselItemRendererOuterClass;
/* compiled from: PG */
/* renamed from: ktp  reason: default package */
/* loaded from: classes3.dex */
public final class ktp implements ajru {
    public final ggk a;
    private final Context b;
    private final akbn c;
    private final acth d;
    private final ajsa e;
    private final ajws f;
    private final aafo g;
    private final View h;
    private final ViewGroup i;
    private final TextView j;
    private akbm k;

    public ktp(Context context, ajsa ajsaVar, ggk ggkVar, akbn akbnVar, acth acthVar, ajws ajwsVar, aafo aafoVar) {
        this.b = context;
        this.a = ggkVar;
        this.c = akbnVar;
        this.e = ajsaVar;
        this.d = acthVar;
        this.f = ajwsVar;
        this.g = aafoVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.full_screen_overlay_layout, (ViewGroup) null, false);
        this.h = inflate;
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.j = (TextView) inflate.findViewById(R.id.dismiss_button);
        this.i = (ViewGroup) inflate.findViewById(R.id.overlay_content);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.h;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        aunb aunbVar;
        aunb aunbVar2;
        ajru ajruVar;
        arbg arbgVar = (arbg) obj;
        this.i.removeAllViews();
        if ((arbgVar.b & 1) != 0) {
            aunb aunbVar3 = arbgVar.e;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            if (aunbVar3.qn(CarouselItemRendererOuterClass.carouselItemRenderer)) {
                ajws ajwsVar = this.f;
                aunb aunbVar4 = arbgVar.e;
                if (aunbVar4 == null) {
                    aunbVar4 = aunb.a;
                }
                Object a = ajwsVar.a(aunbVar4.qm(CarouselItemRendererOuterClass.carouselItemRenderer));
                View view = null;
                if (a != null && (ajruVar = (ajru) akel.i(this.e, a, this.i).f()) != null) {
                    View a2 = ajruVar.a();
                    ajrs f = akel.f(a2);
                    if (f == null) {
                        f = new ajrs();
                        akel.l(a2, f);
                    }
                    f.h();
                    f.a(this.d.oi());
                    ajruVar.oK(f, a);
                    view = ajruVar.a();
                }
                this.i.addView(view);
                if (arbgVar.f.size() > 0) {
                    aafx.c(this.g, arbgVar.f, arbgVar);
                }
            }
        }
        acti actiVar = ajrsVar.a;
        if (arbgVar.c == 14) {
            aunbVar = (aunb) arbgVar.d;
        } else {
            aunbVar = aunb.a;
        }
        if (!aunbVar.qn(ButtonRendererOuterClass.buttonRenderer) || zdg.e(this.b)) {
            zag.o(this.j, false);
            return;
        }
        if (arbgVar.c == 14) {
            aunbVar2 = (aunb) arbgVar.d;
        } else {
            aunbVar2 = aunb.a;
        }
        apoj apojVar = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
        if (this.k == null) {
            akbm a3 = this.c.a(this.j);
            this.k = a3;
            a3.d = new akbi() { // from class: kto
                @Override // defpackage.akbi
                public final void oL(aopc aopcVar) {
                    ktp.this.a.a();
                }
            };
        }
        this.k.b(apojVar, actiVar);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        View childAt = this.i.getChildCount() > 0 ? this.i.getChildAt(0) : null;
        if (childAt != null) {
            this.i.removeView(childAt);
            akel.j(childAt, this.e);
            this.e.b(childAt);
        }
    }
}
