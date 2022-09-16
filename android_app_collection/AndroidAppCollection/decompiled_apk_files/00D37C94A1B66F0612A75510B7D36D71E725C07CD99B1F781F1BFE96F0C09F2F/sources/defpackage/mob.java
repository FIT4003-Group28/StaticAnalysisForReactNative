package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.WrappingTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
/* compiled from: PG */
/* renamed from: mob  reason: default package */
/* loaded from: classes3.dex */
final class mob extends mnu {
    private final RelativeLayout h;
    private final ImageView i;
    private final TextView j;
    private final TextView k;
    private final WrappingTextView l;
    private final View m;

    public mob(Context context, ajyc ajycVar, ajmy ajmyVar, aafo aafoVar, gts gtsVar) {
        super(context, ajycVar, ajmyVar, aafoVar, gtsVar, R.layout.reel_item_avatar_circle_style, R.id.reel_item_channel_avatar);
        this.h = (RelativeLayout) this.f.findViewById(R.id.reel_item_container);
        this.i = (ImageView) this.f.findViewById(R.id.reel_item_channel_avatar);
        this.j = (TextView) this.f.findViewById(R.id.reel_item_title);
        this.k = (TextView) this.f.findViewById(R.id.reel_item_header);
        this.l = (WrappingTextView) this.f.findViewById(R.id.reel_item_sub_text);
        this.m = this.f.findViewById(R.id.reel_item_contextual_menu_anchor);
        this.f.setBackgroundDrawable(new frf(zhn.j(context, R.attr.ytSeparator).orElse(0), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height)));
    }

    @Override // defpackage.mnu, defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        d(ajrsVar, (ReelItemRendererOuterClass$ReelItemRenderer) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mnu
    public final void f(ajrs ajrsVar, ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        atep atepVar;
        avhn avhnVar;
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        super.d(ajrsVar, reelItemRendererOuterClass$ReelItemRenderer);
        ajyc ajycVar = this.b;
        View view = this.f;
        View view2 = this.m;
        ates atesVar = reelItemRendererOuterClass$ReelItemRenderer.n;
        if (atesVar == null) {
            atesVar = ates.a;
        }
        arag aragVar4 = null;
        if ((atesVar.b & 1) != 0) {
            ates atesVar2 = reelItemRendererOuterClass$ReelItemRenderer.n;
            if (atesVar2 == null) {
                atesVar2 = ates.a;
            }
            atepVar = atesVar2.c;
            if (atepVar == null) {
                atepVar = atep.a;
            }
        } else {
            atepVar = null;
        }
        ajycVar.e(view, view2, atepVar, reelItemRendererOuterClass$ReelItemRenderer, ajrsVar.a);
        ajmy ajmyVar = this.c;
        ImageView imageView = this.i;
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 32) != 0) {
            avhnVar = reelItemRendererOuterClass$ReelItemRenderer.g;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = null;
        }
        ajmyVar.k(imageView, avhnVar, this.g);
        this.h.setContentDescription(moi.f(reelItemRendererOuterClass$ReelItemRenderer));
        TextView textView = this.j;
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 2) != 0) {
            aragVar = reelItemRendererOuterClass$ReelItemRenderer.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = this.k;
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 4) != 0) {
            aragVar2 = reelItemRendererOuterClass$ReelItemRenderer.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        textView2.setText(ajgl.b(aragVar2));
        amuf f = amuk.f();
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 8) != 0) {
            aragVar3 = reelItemRendererOuterClass$ReelItemRenderer.e;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        Spanned b = ajgl.b(aragVar3);
        if (b != null) {
            f.h(etk.j(b));
        }
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 256) != 0 && (aragVar4 = reelItemRendererOuterClass$ReelItemRenderer.i) == null) {
            aragVar4 = arag.a;
        }
        Spanned b2 = ajgl.b(aragVar4);
        if (b2 != null) {
            f.h(etk.j(b2));
        }
        this.l.a(f.g());
    }

    @Override // defpackage.mnu, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.c.e(this.i);
    }
}
