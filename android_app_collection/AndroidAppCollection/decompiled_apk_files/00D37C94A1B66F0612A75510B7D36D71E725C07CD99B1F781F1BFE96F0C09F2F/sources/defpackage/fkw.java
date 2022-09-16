package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
/* compiled from: PG */
/* renamed from: fkw  reason: default package */
/* loaded from: classes3.dex */
public final class fkw extends ajsl {
    public final oet a;
    public final View b;
    public final gkb c;
    private final ajmy d;
    private final ImageView e;
    private final YouTubeTextView f;
    private final YouTubeTextView g;
    private final ImageView h;
    private final YouTubeTextView i;
    private final YouTubeTextView j;
    private final YouTubeButton k;
    private final akbj l;
    private final YouTubeButton m;
    private final akbj n;

    public fkw(Context context, akbk akbkVar, ajmy ajmyVar, oet oetVar, ViewGroup viewGroup, gkb gkbVar) {
        this.d = ajmyVar;
        this.a = oetVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.donation_post_transaction, viewGroup, false);
        this.b = inflate;
        this.e = (ImageView) inflate.findViewById(R.id.donation_post_header_icon);
        this.f = (YouTubeTextView) inflate.findViewById(R.id.donation_post_thanks);
        this.g = (YouTubeTextView) inflate.findViewById(R.id.donation_post_additional_info);
        this.h = (ImageView) inflate.findViewById(R.id.donation_post_creator_thumbnail);
        this.i = (YouTubeTextView) inflate.findViewById(R.id.donation_post_creator_message_title);
        this.j = (YouTubeTextView) inflate.findViewById(R.id.donation_post_creator_message_description);
        YouTubeButton youTubeButton = (YouTubeButton) inflate.findViewById(R.id.donation_post_done_button);
        this.k = youTubeButton;
        this.l = akbkVar.a(youTubeButton);
        YouTubeButton youTubeButton2 = (YouTubeButton) inflate.findViewById(R.id.donation_post_share_button);
        this.m = youTubeButton2;
        this.n = akbkVar.a(youTubeButton2);
        this.c = gkbVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        avhn avhnVar;
        aqna aqnaVar = (aqna) obj;
        acti actiVar = ajrsVar.a;
        ajmy ajmyVar = this.d;
        ImageView imageView = this.e;
        if ((aqnaVar.b & 1) != 0) {
            avhnVar = aqnaVar.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = null;
        }
        ajmyVar.h(imageView, avhnVar);
        YouTubeTextView youTubeTextView = this.f;
        arag aragVar = aqnaVar.d;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.m(youTubeTextView, ajgl.b(aragVar));
        YouTubeTextView youTubeTextView2 = this.g;
        arag aragVar2 = aqnaVar.e;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        zag.m(youTubeTextView2, ajgl.b(aragVar2));
        ajmy ajmyVar2 = this.d;
        ImageView imageView2 = this.h;
        aqmz aqmzVar = aqnaVar.f;
        if (aqmzVar == null) {
            aqmzVar = aqmz.a;
        }
        avhn avhnVar2 = aqmzVar.c;
        if (avhnVar2 == null) {
            avhnVar2 = avhn.a;
        }
        ajmt a = ajmu.a();
        a.b(2131232301);
        ajmyVar2.k(imageView2, avhnVar2, a.a());
        YouTubeTextView youTubeTextView3 = this.i;
        aqmz aqmzVar2 = aqnaVar.f;
        if (aqmzVar2 == null) {
            aqmzVar2 = aqmz.a;
        }
        arag aragVar3 = aqmzVar2.d;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        zag.m(youTubeTextView3, ajgl.b(aragVar3));
        YouTubeTextView youTubeTextView4 = this.j;
        aqmz aqmzVar3 = aqnaVar.f;
        if (aqmzVar3 == null) {
            aqmzVar3 = aqmz.a;
        }
        arag aragVar4 = aqmzVar3.e;
        if (aragVar4 == null) {
            aragVar4 = arag.a;
        }
        zag.m(youTubeTextView4, ajgl.b(aragVar4));
        if ((aqnaVar.b & 16) == 0) {
            this.k.setVisibility(8);
        } else {
            aunb aunbVar = aqnaVar.g;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            apoj apojVar = (apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer);
            this.l.b(apojVar, actiVar);
            this.l.d = new akbi() { // from class: fkv
                @Override // defpackage.akbi
                public final void oL(aopc aopcVar) {
                    fkw fkwVar = fkw.this;
                    fkwVar.c.a.dismiss();
                    oeu oeuVar = fkwVar.a.a;
                    if (oeuVar == null) {
                        return;
                    }
                    nml nmlVar = ((DefaultWatchPanelViewController) oeuVar).e;
                    nmlVar.o(ejw.r, false);
                    nmlVar.o(ejw.s, false);
                }
            };
            YouTubeButton youTubeButton = this.k;
            arag aragVar5 = apojVar.i;
            if (aragVar5 == null) {
                aragVar5 = arag.a;
            }
            zag.m(youTubeButton, ajgl.b(aragVar5));
            YouTubeButton youTubeButton2 = this.k;
            zag.k(youTubeButton2, youTubeButton2.getBackground());
        }
        if ((aqnaVar.b & 32) != 0) {
            aunb aunbVar2 = aqnaVar.h;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            apoj apojVar2 = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
            this.n.b(apojVar2, actiVar);
            YouTubeButton youTubeButton3 = this.m;
            arag aragVar6 = apojVar2.i;
            if (aragVar6 == null) {
                aragVar6 = arag.a;
            }
            zag.m(youTubeButton3, ajgl.b(aragVar6));
            YouTubeButton youTubeButton4 = this.m;
            zag.k(youTubeButton4, youTubeButton4.getBackground());
            return;
        }
        this.m.setVisibility(8);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqna) obj).i.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
