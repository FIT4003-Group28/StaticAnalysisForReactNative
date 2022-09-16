package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lam  reason: default package */
/* loaded from: classes3.dex */
final class lam extends lal {
    public lam(Context context, aafo aafoVar, ajmy ajmyVar, akep akepVar, akbn akbnVar, ajxz ajxzVar, fmh fmhVar, fnz fnzVar, akem akemVar, ViewGroup viewGroup) {
        super(context, aafoVar, ajmyVar, akepVar, akbnVar, ajxzVar, fmhVar, fnzVar, akemVar, R.layout.watch_card_rich_header_horizontal_layout, viewGroup);
    }

    @Override // defpackage.lal
    public final void d(awdt awdtVar) {
        apmi apmiVar;
        avhn avhnVar;
        int S;
        awdf[] awdfVarArr = (awdf[]) awdtVar.h.toArray(new awdf[0]);
        arag aragVar = null;
        if (awdfVarArr != null) {
            for (awdf awdfVar : awdfVarArr) {
                if (awdfVar == null) {
                    apmiVar = null;
                } else if (awdfVar.b == 104364901) {
                    apmiVar = (apmi) awdfVar.c;
                } else {
                    apmiVar = apmi.a;
                }
                if (apmiVar != null) {
                    break;
                }
            }
        }
        apmiVar = null;
        if (apmiVar == null || apmiVar.e.isEmpty()) {
            TextView textView = this.b;
            if ((awdtVar.b & 4) != 0 && (aragVar = awdtVar.g) == null) {
                aragVar = arag.a;
            }
            zag.m(textView, ajgl.b(aragVar));
        } else {
            zag.o(this.b, false);
        }
        View findViewById = this.a.findViewById(R.id.avatar_container);
        br brVar = (br) this.d.getLayoutParams();
        br brVar2 = (br) findViewById.getLayoutParams();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        if (awdtVar.c == 5) {
            avhnVar = (avhn) awdtVar.d;
        } else {
            avhnVar = avhn.a;
        }
        if (!akel.A(avhnVar) || (S = awwc.S(awdtVar.m)) == 0 || S != 3) {
            layoutParams.width = this.e.getResources().getDimensionPixelOffset(R.dimen.watch_card_right_avatar_size);
            layoutParams.height = this.e.getResources().getDimensionPixelOffset(R.dimen.watch_card_right_avatar_size);
            brVar2.n = -1;
            brVar2.p = 0;
            brVar.n = 0;
            brVar.m = -1;
            brVar.setMarginStart(0);
        } else {
            layoutParams.width = this.e.getResources().getDimensionPixelOffset(R.dimen.watch_card_left_avatar_size);
            layoutParams.height = this.e.getResources().getDimensionPixelOffset(R.dimen.watch_card_left_avatar_size);
            brVar2.n = 0;
            brVar2.p = -1;
            brVar.n = -1;
            brVar.m = R.id.avatar_container;
            brVar.setMarginStart(this.e.getResources().getDimensionPixelOffset(R.dimen.watch_card_left_avatar_margin));
        }
        if (f(awdtVar)) {
            int l = zew.l(this.e);
            int dimensionPixelOffset = this.e.getResources().getDimensionPixelOffset(R.dimen.watch_card_verified_badge_horizontal_margin);
            TextView textView2 = this.d;
            int marginStart = brVar.getMarginStart();
            textView2.setMaxWidth(((l - (marginStart + marginStart)) - layoutParams.width) - dimensionPixelOffset);
        } else {
            this.d.setMaxWidth(Integer.MAX_VALUE);
        }
        this.c.setLayoutParams(layoutParams);
        findViewById.setLayoutParams(brVar2);
        this.d.setLayoutParams(brVar);
    }
}
