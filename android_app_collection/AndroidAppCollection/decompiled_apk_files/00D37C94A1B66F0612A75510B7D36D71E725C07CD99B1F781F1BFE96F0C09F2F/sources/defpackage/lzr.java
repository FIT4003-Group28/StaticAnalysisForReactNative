package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.RippleDrawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CompanionSponsoredButtonRendererOuterClass;
/* compiled from: PG */
/* renamed from: lzr  reason: default package */
/* loaded from: classes3.dex */
public final class lzr implements lzt {
    public final aafo a;
    public final wxc b;
    public wzi c;
    public aqdm d;
    private final ajmy e;
    private final acti f;
    private final Context g;
    private final lzw h;
    private final ajgj i;
    private View j;
    private View k;
    private ImageView l;
    private TextView m;
    private View n;
    private View o;

    public lzr(ajmy ajmyVar, aafo aafoVar, acti actiVar, wxc wxcVar, Context context) {
        ajmyVar.getClass();
        this.e = ajmyVar;
        aafoVar.getClass();
        this.a = aafoVar;
        actiVar.getClass();
        this.f = actiVar;
        wxcVar.getClass();
        this.b = wxcVar;
        this.g = context;
        new yzh(context);
        this.h = new lzw(ajmyVar, wxcVar, aafoVar, actiVar);
        ajgi a = ajgj.a();
        a.a = context;
        a.c = new ajve(aafoVar);
        this.i = a.a();
    }

    @Override // defpackage.lzt
    public final /* bridge */ /* synthetic */ void a(View view, Object obj) {
        arag aragVar;
        arag aragVar2;
        aqdm aqdmVar = (aqdm) obj;
        if (aqdmVar == null) {
            return;
        }
        View g = zag.g(view, R.id.compact_companion_extension_stub, R.id.compact_companion_extension);
        this.j = g;
        this.m = (TextView) g.findViewById(R.id.tagline);
        this.l = (ImageView) this.j.findViewById(R.id.primary_icon);
        this.n = this.j.findViewById(R.id.horizontal_rule);
        this.o = this.j.findViewById(R.id.sub_details_button);
        this.k = this.j.findViewById(R.id.unclickable_space);
        this.j.setOnClickListener(new lzq(this));
        this.k.setOnClickListener(ija.g);
        aqfg aqfgVar = null;
        this.c = new wzi(this.j, null);
        this.d = aqdmVar;
        this.f.u(new acte(this.d.h), null);
        aafo aafoVar = this.a;
        aqdm aqdmVar2 = this.d;
        aafx.c(aafoVar, aqdmVar2.i, aqdmVar2);
        aopa mo52toBuilder = this.d.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        ((aqdm) mo52toBuilder.instance).i = aqdm.emptyProtobufList();
        aqdm aqdmVar3 = (aqdm) mo52toBuilder.mo39build();
        this.d = aqdmVar3;
        ajmy ajmyVar = this.e;
        ImageView imageView = this.l;
        avhn avhnVar = aqdmVar3.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.h(imageView, avhnVar);
        TextView textView = this.m;
        aqdm aqdmVar4 = this.d;
        if ((aqdmVar4.b & 2) != 0) {
            aragVar = aqdmVar4.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.d(aragVar, this.i));
        aqdm aqdmVar5 = this.d;
        int i = aqdmVar5.b;
        boolean z = true;
        boolean z2 = (i & 16) != 0;
        if ((i & 2) != 0) {
            aragVar2 = aqdmVar5.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        if (aragVar2 != null && aragVar2.c.size() != 0) {
            for (arai araiVar : aragVar2.c) {
                if (araiVar != null && (araiVar.b & 512) != 0) {
                    break;
                }
            }
        }
        z = false;
        this.m.setMovementMethod((!z || z2) ? null : LinkMovementMethod.getInstance());
        this.j.setClickable(z2);
        View view2 = this.j;
        view2.setBackground(yzh.g(view2.getBackground(), this.d.e, PorterDuff.Mode.SRC));
        if (z2) {
            this.j.setBackground(new RippleDrawable(zhn.f(this.g, R.attr.colorControlHighlight), this.j.getBackground(), null));
        }
        View view3 = this.n;
        view3.setBackground(yzh.g(view3.getBackground(), this.d.f, PorterDuff.Mode.SRC));
        this.k.setClickable(this.d.k);
        this.j.setVisibility(0);
        if ((aqdmVar.b & 128) == 0) {
            return;
        }
        lzw lzwVar = this.h;
        View view4 = this.o;
        aunb aunbVar = aqdmVar.j;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar != null && aunbVar.qn(CompanionSponsoredButtonRendererOuterClass.sponsoredButtonRenderer)) {
            aqfgVar = (aqfg) aunbVar.qm(CompanionSponsoredButtonRendererOuterClass.sponsoredButtonRenderer);
        }
        lzwVar.a(view4, aqfgVar);
    }

    @Override // defpackage.lzt
    public final void b() {
        this.b.b(this.d);
        View view = this.j;
        if (view != null) {
            view.setVisibility(8);
            this.c.c();
            this.k.setClickable(false);
        }
        this.h.b();
        this.j = null;
        this.d = null;
    }
}
