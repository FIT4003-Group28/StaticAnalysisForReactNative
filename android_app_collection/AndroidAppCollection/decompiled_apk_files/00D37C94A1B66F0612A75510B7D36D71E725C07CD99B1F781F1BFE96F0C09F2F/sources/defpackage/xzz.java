package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
/* compiled from: PG */
/* renamed from: xzz  reason: default package */
/* loaded from: classes4.dex */
public final class xzz implements ajru {
    public final View a;
    private final akbn b;
    private final LayoutInflater c;
    private final TextView d;
    private final TextView e;
    private final ViewGroup f;

    public xzz(Context context, akbn akbnVar, ViewGroup viewGroup) {
        this.b = akbnVar;
        LayoutInflater from = LayoutInflater.from(context);
        this.c = from;
        View inflate = from.inflate(R.layout.offer_group_layout, viewGroup, false);
        this.a = inflate;
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = (TextView) inflate.findViewById(R.id.subtitle);
        this.f = (ViewGroup) inflate.findViewById(R.id.offers_container);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    /* renamed from: d */
    public final void oK(ajrs ajrsVar, avlp avlpVar) {
        TextView textView = this.d;
        arag aragVar = avlpVar.b;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = this.e;
        arag aragVar2 = avlpVar.c;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        for (aunb aunbVar : avlpVar.d) {
            if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
                TextView textView3 = (TextView) this.c.inflate(R.layout.offer_button, this.f, false);
                this.b.a(textView3).b((apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer), ajrsVar.a);
                this.f.addView(textView3);
            }
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.f.removeAllViews();
    }
}
