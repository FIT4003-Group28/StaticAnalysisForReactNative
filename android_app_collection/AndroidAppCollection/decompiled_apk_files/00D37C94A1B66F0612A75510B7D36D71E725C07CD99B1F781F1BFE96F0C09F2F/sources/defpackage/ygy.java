package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
/* compiled from: PG */
/* renamed from: ygy  reason: default package */
/* loaded from: classes4.dex */
public final class ygy implements ajru {
    private final aafo a;
    private final ajmy b;
    private final LinearLayout c;
    private final YouTubeTextView d;
    private final YouTubeTextView e;
    private final ImageView f;
    private final View g;
    private final View h;
    private final YouTubeTextView i;
    private final akbm j;
    private final YouTubeTextView k;
    private final akbm l;

    public ygy(Context context, aafo aafoVar, ajmy ajmyVar, akbn akbnVar, ViewGroup viewGroup) {
        this.a = aafoVar;
        this.b = ajmyVar;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.sponsorships_heading_layout, viewGroup, false);
        this.c = linearLayout;
        this.d = (YouTubeTextView) linearLayout.findViewById(R.id.title);
        this.e = (YouTubeTextView) linearLayout.findViewById(R.id.subtitle);
        this.f = (ImageView) linearLayout.findViewById(R.id.icon);
        this.g = linearLayout.findViewById(R.id.top_spacer);
        this.h = linearLayout.findViewById(R.id.title_spacer);
        YouTubeTextView youTubeTextView = (YouTubeTextView) linearLayout.findViewById(R.id.end_button);
        this.i = youTubeTextView;
        this.j = akbnVar.a(youTubeTextView);
        YouTubeTextView youTubeTextView2 = (YouTubeTextView) linearLayout.findViewById(R.id.bottom_button);
        this.k = youTubeTextView2;
        this.l = akbnVar.a(youTubeTextView2);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        auyi auyiVar = (auyi) obj;
        acti actiVar = ajrsVar.a;
        arag aragVar2 = null;
        if (auyiVar.h) {
            LinearLayout linearLayout = this.c;
            linearLayout.setBackgroundColor(zhn.d(linearLayout.getContext(), R.attr.ytGeneralBackgroundB));
        } else {
            this.c.setBackground(null);
        }
        YouTubeTextView youTubeTextView = this.d;
        boolean z = true;
        if ((auyiVar.b & 1) != 0) {
            aragVar = auyiVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(youTubeTextView, aafv.a(aragVar, this.a, false));
        YouTubeTextView youTubeTextView2 = this.e;
        if ((auyiVar.b & 4) != 0 && (aragVar2 = auyiVar.e) == null) {
            aragVar2 = arag.a;
        }
        zag.m(youTubeTextView2, aafv.a(aragVar2, this.a, false));
        if ((auyiVar.b & 2) == 0) {
            zag.o(this.f, false);
        } else {
            zag.o(this.f, true);
            ajmy ajmyVar = this.b;
            ImageView imageView = this.f;
            avhn avhnVar = auyiVar.d;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.h(imageView, avhnVar);
        }
        zag.o(this.g, auyiVar.i);
        zag.o(this.h, (this.e.getVisibility() == 0 || this.f.getVisibility() == 0) && this.d.getVisibility() == 0);
        zag.o(this.i, (auyiVar.b & 8) != 0);
        akbm akbmVar = this.j;
        aunb aunbVar = auyiVar.f;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        akbmVar.b((apoj) ajjh.l(aunbVar, ButtonRendererOuterClass.buttonRenderer), actiVar);
        YouTubeTextView youTubeTextView3 = this.k;
        if ((auyiVar.b & 16) == 0) {
            z = false;
        }
        zag.o(youTubeTextView3, z);
        akbm akbmVar2 = this.l;
        aunb aunbVar2 = auyiVar.g;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        akbmVar2.b((apoj) ajjh.l(aunbVar2, ButtonRendererOuterClass.buttonRenderer), actiVar);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
