package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: yeu  reason: default package */
/* loaded from: classes4.dex */
public final class yeu extends ajsl {
    final ImageView a;
    final TextView b;
    final TextView c;
    final TextView d;
    final TextView e;
    final TextView f;
    final ImageView g;
    private final ajmy h;
    private final aafo i;
    private final ajxz j;
    private final ViewGroup k;
    private final CardView l;
    private final FixedAspectRatioFrameLayout m;
    private final akbm n;
    private final akbm o;
    private final yzo p;
    private final View q;

    public yeu(Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, akbn akbnVar, ViewGroup viewGroup) {
        this.h = ajmyVar;
        this.i = aafoVar;
        this.j = ajxzVar;
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.subscription_product_upsell_offer_card, viewGroup, false);
        this.k = viewGroup2;
        CardView cardView = (CardView) viewGroup2.findViewById(R.id.card_view);
        this.l = cardView;
        FixedAspectRatioFrameLayout fixedAspectRatioFrameLayout = (FixedAspectRatioFrameLayout) cardView.findViewById(R.id.header_container);
        this.m = fixedAspectRatioFrameLayout;
        this.a = (ImageView) fixedAspectRatioFrameLayout.findViewById(R.id.header_image);
        View findViewById = fixedAspectRatioFrameLayout.findViewById(R.id.header_scrim);
        this.q = findViewById;
        this.g = (ImageView) fixedAspectRatioFrameLayout.findViewById(R.id.logo);
        this.b = (TextView) cardView.findViewById(R.id.title);
        this.c = (TextView) cardView.findViewById(R.id.description);
        this.d = (TextView) cardView.findViewById(R.id.additional_info);
        TextView textView = (TextView) cardView.findViewById(R.id.primary_button);
        this.e = textView;
        TextView textView2 = (TextView) cardView.findViewById(R.id.secondary_button);
        this.f = textView2;
        this.n = akbnVar.a(textView);
        this.o = akbnVar.a(textView2);
        this.p = zdk.d(findViewById);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.k;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013f  */
    @Override // defpackage.ajsl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(defpackage.ajrs r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yeu.d(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((avbt) obj).l.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
