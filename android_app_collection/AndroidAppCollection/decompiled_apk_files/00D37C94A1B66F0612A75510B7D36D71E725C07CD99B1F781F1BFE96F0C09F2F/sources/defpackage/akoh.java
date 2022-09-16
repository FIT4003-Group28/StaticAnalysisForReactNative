package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akoh  reason: default package */
/* loaded from: classes.dex */
public final class akoh implements ajru {
    private final aafo a;
    private final acti b;
    private final View c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final View g;
    private final akbj h;
    private final Runnable i;

    public akoh(Context context, aafo aafoVar, ajsk ajskVar, acti actiVar, akog akogVar, Runnable runnable) {
        argj argjVar;
        this.b = actiVar;
        this.i = runnable;
        this.a = aafoVar;
        View inflate = View.inflate(context, R.layout.community_post_section, null);
        this.c = inflate;
        akpk.g(inflate);
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = (TextView) inflate.findViewById(R.id.subtitle);
        TextView textView = (TextView) inflate.findViewById(R.id.post_button);
        this.f = textView;
        View findViewById = inflate.findViewById(R.id.tooltip_anchor);
        this.g = findViewById;
        this.h = new akbj(aafoVar, ajskVar, textView);
        zag.k(textView, textView.getBackground());
        akkq akkqVar = (akkq) akogVar;
        avmr avmrVar = akkqVar.a.f;
        if ((avmrVar == null ? avmr.a : avmrVar).b == 102716411) {
            akko akkoVar = akkqVar.b;
            avmr avmrVar2 = akkqVar.a.f;
            avmrVar2 = avmrVar2 == null ? avmr.a : avmrVar2;
            if (avmrVar2.b == 102716411) {
                argjVar = (argj) avmrVar2.c;
            } else {
                argjVar = argj.a;
            }
            aklx aklxVar = (aklx) akkoVar;
            aklxVar.p = argjVar;
            aklxVar.q = findViewById;
            aklxVar.c();
        }
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        avms avmsVar = (avms) obj;
        this.c.setVisibility(0);
        apok apokVar = avmsVar.e;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 1) == 0) {
            this.c.setVisibility(8);
            return;
        }
        TextView textView = this.d;
        arag aragVar3 = null;
        if ((avmsVar.b & 1) != 0) {
            aragVar = avmsVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = this.e;
        if ((avmsVar.b & 2) != 0) {
            aragVar2 = avmsVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        textView2.setText(aafv.a(aragVar2, this.a, false));
        apok apokVar2 = avmsVar.e;
        if (apokVar2 == null) {
            apokVar2 = apok.a;
        }
        apoj apojVar = apokVar2.c;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        TextView textView3 = this.f;
        if ((apojVar.b & 256) != 0 && (aragVar3 = apojVar.i) == null) {
            aragVar3 = arag.a;
        }
        textView3.setText(ajgl.b(aragVar3));
        afw afwVar = new afw(1);
        afwVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.i);
        this.h.a(apojVar, this.b, afwVar);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
