package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.SponsorshipsRenderers;
/* compiled from: PG */
/* renamed from: ygs  reason: default package */
/* loaded from: classes4.dex */
public final class ygs extends ajsl {
    public final View a;
    public final ViewGroup b;
    private final YouTubeTextView c;
    private final akbm d;
    private final YouTubeTextView e;
    private final akbm f;
    private final Context g;
    private final aafo h;
    private final ajmy i;
    private final ygx j;

    public ygs(akbn akbnVar, aafo aafoVar, ajmy ajmyVar, Context context, ygo ygoVar, ViewGroup viewGroup) {
        this.g = context;
        this.h = aafoVar;
        this.i = ajmyVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.sponsorships_celebration_layout, viewGroup, false);
        this.a = inflate;
        ygx ygxVar = new ygx(context, ajmyVar, R.layout.sponsorships_header_layout_celebration, (ViewGroup) inflate.findViewById(R.id.header_view));
        this.j = ygxVar;
        YouTubeTextView youTubeTextView = (YouTubeTextView) inflate.findViewById(R.id.primary_button);
        this.c = youTubeTextView;
        akbm a = akbnVar.a(youTubeTextView);
        this.d = a;
        YouTubeTextView youTubeTextView2 = (YouTubeTextView) inflate.findViewById(R.id.secondary_button);
        this.e = youTubeTextView2;
        akbm a2 = akbnVar.a(youTubeTextView2);
        this.f = a2;
        this.b = (ViewGroup) inflate.findViewById(R.id.content);
        a.d = new ygq(ygoVar, 1);
        a2.d = new ygq(ygoVar);
        ((ViewGroup) inflate.findViewById(R.id.header_view)).addView(ygxVar.a);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        apoj apojVar;
        apoj apojVar2;
        auye auyeVar = (auye) obj;
        acti actiVar = ajrsVar.a;
        akbm akbmVar = this.d;
        aunb aunbVar = auyeVar.c;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        auyh auyhVar = null;
        if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
            aunb aunbVar2 = auyeVar.c;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            apojVar = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apojVar = null;
        }
        akbmVar.b(apojVar, actiVar);
        akbm akbmVar2 = this.f;
        aunb aunbVar3 = auyeVar.d;
        if (aunbVar3 == null) {
            aunbVar3 = aunb.a;
        }
        if (aunbVar3.qn(ButtonRendererOuterClass.buttonRenderer)) {
            aunb aunbVar4 = auyeVar.d;
            if (aunbVar4 == null) {
                aunbVar4 = aunb.a;
            }
            apojVar2 = (apoj) aunbVar4.qm(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apojVar2 = null;
        }
        akbmVar2.b(apojVar2, actiVar);
        ygx ygxVar = this.j;
        aunb aunbVar5 = auyeVar.b;
        if (aunbVar5 == null) {
            aunbVar5 = aunb.a;
        }
        if (aunbVar5.qn(SponsorshipsRenderers.sponsorshipsHeaderRenderer)) {
            aunb aunbVar6 = auyeVar.b;
            if (aunbVar6 == null) {
                aunbVar6 = aunb.a;
            }
            auyhVar = (auyh) aunbVar6.qm(SponsorshipsRenderers.sponsorshipsHeaderRenderer);
        }
        ygxVar.d(auyhVar);
        for (aunb aunbVar7 : auyeVar.e) {
            if (aunbVar7.qn(SponsorshipsRenderers.sponsorshipsListTileRenderer)) {
                xzy xzyVar = new xzy(this.h);
                final yhb yhbVar = new yhb(this.g, xzyVar, this.i, this.b);
                yhbVar.oK(ajrsVar, (auyk) aunbVar7.qm(SponsorshipsRenderers.sponsorshipsListTileRenderer));
                this.b.addView(yhbVar.a);
                xzyVar.f(new xzx(new Runnable() { // from class: ygr
                    @Override // java.lang.Runnable
                    public final void run() {
                        ygs.this.b.removeView(yhbVar.a);
                    }
                }));
            }
        }
        ViewGroup viewGroup = this.b;
        zag.o(viewGroup, viewGroup.getChildCount() > 0);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((auye) obj).f.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.b.removeAllViews();
    }
}
