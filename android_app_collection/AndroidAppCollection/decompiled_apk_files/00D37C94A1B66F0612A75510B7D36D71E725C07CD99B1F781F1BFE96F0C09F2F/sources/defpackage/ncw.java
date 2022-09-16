package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import java.util.List;
/* compiled from: PG */
/* renamed from: ncw  reason: default package */
/* loaded from: classes3.dex */
public final class ncw implements ajru {
    private apaw a;
    private final wxc b;
    private final fjn c;
    private final View d;
    private final View e;
    private final View f;
    private final fjp g;
    private fjm h;
    private fjm i;

    public ncw(Context context, final wxc wxcVar, fjn fjnVar, final aafo aafoVar) {
        this.b = wxcVar;
        this.c = fjnVar;
        this.g = new fjp() { // from class: ncv
            @Override // defpackage.fjp
            public final void a(Object obj, List list) {
                wxc wxcVar2 = wxc.this;
                aafo aafoVar2 = aafoVar;
                if (obj == null || wxcVar2.d(obj)) {
                    return;
                }
                aafx.d(aafoVar2, list, actk.f(obj));
            }
        };
        View inflate = LayoutInflater.from(context).inflate(R.layout.ad_two_button_tray_section, (ViewGroup) null, false);
        this.d = inflate;
        this.e = inflate.findViewById(R.id.start_button);
        this.f = inflate.findViewById(R.id.end_button);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        apaw apawVar = (apaw) obj;
        zag.o(this.d, true);
        aunb aunbVar = apawVar.b;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            if (this.h == null) {
                this.h = this.c.a(this.g, this.e);
            }
            fjm fjmVar = this.h;
            aunb aunbVar2 = apawVar.b;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            fjmVar.c((aoyl) aunbVar2.qm(AdCtaButtonRendererOuterClass.adCtaButtonRenderer));
            zag.o(this.e, true);
        } else {
            zag.o(this.e, false);
        }
        aunb aunbVar3 = apawVar.c;
        if (aunbVar3 == null) {
            aunbVar3 = aunb.a;
        }
        if (aunbVar3.qn(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            if (this.i == null) {
                this.i = this.c.a(this.g, this.f);
            }
            fjm fjmVar2 = this.i;
            aunb aunbVar4 = apawVar.c;
            if (aunbVar4 == null) {
                aunbVar4 = aunb.a;
            }
            fjmVar2.c((aoyl) aunbVar4.qm(AdCtaButtonRendererOuterClass.adCtaButtonRenderer));
            zag.o(this.f, true);
        } else {
            zag.o(this.f, false);
        }
        this.a = apawVar;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.b.b(this.a);
        this.a = null;
    }
}
