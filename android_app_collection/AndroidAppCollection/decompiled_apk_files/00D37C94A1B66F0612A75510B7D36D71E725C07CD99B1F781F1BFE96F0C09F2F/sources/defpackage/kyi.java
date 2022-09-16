package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.RefinementChipRendererOuterClass;
import com.google.protos.youtube.api.innertube.RichListHeaderRendererOuterClass;
import com.google.protos.youtube.api.innertube.VideoCardRendererOuterClass;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: kyi  reason: default package */
/* loaded from: classes3.dex */
public final class kyi extends ajsl {
    private final CardView a;
    private final LinearLayout b;
    private final LinearLayout c;
    private final azqb d;
    private final kzh e;
    private final int f;
    private final int g;
    private ajru h;
    private final ArrayList i = new ArrayList();
    private final kyn j;

    public kyi(Activity activity, kyn kynVar, azqb azqbVar, kzh kzhVar, ViewGroup viewGroup) {
        LayoutInflater from = LayoutInflater.from(activity);
        from.getClass();
        this.j = kynVar;
        this.d = azqbVar;
        this.e = kzhVar;
        this.f = activity.getResources().getDimensionPixelSize(R.dimen.preview_card_refinement_chip_header_margin);
        this.g = activity.getResources().getDimensionPixelSize(R.dimen.preview_card_refinement_chip_header_bottom_margin);
        CardView cardView = (CardView) from.inflate(R.layout.preview_card, viewGroup, false);
        this.a = cardView;
        this.b = (LinearLayout) cardView.findViewById(R.id.card_layout);
        this.c = (LinearLayout) cardView.findViewById(R.id.preview_videos);
    }

    private final void f(View view) {
        view.setId(R.id.header);
        View findViewById = this.b.findViewById(R.id.header);
        if (findViewById != null) {
            this.b.removeView(findViewById);
        }
        this.b.addView(view, 0);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        augp augpVar = (augp) obj;
        aunb aunbVar = augpVar.b;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(RichListHeaderRendererOuterClass.richListHeaderRenderer)) {
            kyo kyoVar = (kyo) this.d.get();
            this.h = kyoVar;
            aunb aunbVar2 = augpVar.b;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            kyoVar.oK(ajrsVar, (auob) aunbVar2.qm(RichListHeaderRendererOuterClass.richListHeaderRenderer));
            f(kyoVar.a);
        } else {
            aunb aunbVar3 = augpVar.b;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            if (aunbVar3.qn(RefinementChipRendererOuterClass.refinementChipRenderer)) {
                kym b = this.j.b(null);
                this.h = b;
                aunb aunbVar4 = augpVar.b;
                if (aunbVar4 == null) {
                    aunbVar4 = aunb.a;
                }
                b.oK(ajrsVar, (aumj) aunbVar4.qm(RefinementChipRendererOuterClass.refinementChipRenderer));
                CardView cardView = b.a;
                f(cardView);
                ecp ecpVar = new ecp(14);
                int i = this.f;
                zgd.u(cardView, ecpVar, zgd.b(zgd.s(-1, -2), zgd.m(i, i, i, this.g)), ViewGroup.MarginLayoutParams.class);
            }
        }
        this.c.removeAllViews();
        this.i.clear();
        for (int i2 = 0; i2 < augpVar.c.size(); i2++) {
            aunb aunbVar5 = (aunb) augpVar.c.get(i2);
            if (aunbVar5.qn(VideoCardRendererOuterClass.videoCardRenderer)) {
                kzg b2 = this.e.b(this.c);
                this.i.add(b2);
                b2.oK(ajrsVar, (avxc) aunbVar5.qm(VideoCardRendererOuterClass.videoCardRenderer));
                this.c.addView(b2.a());
            }
        }
        aunb aunbVar6 = augpVar.b;
        if (aunbVar6 == null) {
            aunbVar6 = aunb.a;
        }
        if (aunbVar6.qn(RichListHeaderRendererOuterClass.richListHeaderRenderer)) {
            View findViewById = this.a.findViewById(R.id.header);
            this.c.measure(0, 0);
            zgd.t(findViewById, zgd.r(this.c.getMeasuredWidth()), ViewGroup.LayoutParams.class);
        }
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((augp) obj).d.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        ajru ajruVar = this.h;
        if (ajruVar != null) {
            ajruVar.qZ(ajsaVar);
        }
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ajru) arrayList.get(i)).qZ(ajsaVar);
        }
    }
}
