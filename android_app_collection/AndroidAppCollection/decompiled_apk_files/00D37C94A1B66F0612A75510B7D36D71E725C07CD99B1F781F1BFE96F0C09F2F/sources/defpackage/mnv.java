package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
/* compiled from: PG */
/* renamed from: mnv  reason: default package */
/* loaded from: classes3.dex */
final class mnv extends mnu {
    private final ImageView h;
    private final TextView i;
    private final View j;
    private final RelativeLayout k;
    private final TextView l;
    private final moh m;

    public mnv(Context context, ajyc ajycVar, ajmy ajmyVar, aafo aafoVar, gts gtsVar) {
        super(context, ajycVar, ajmyVar, aafoVar, gtsVar, R.layout.reel_item_channel_grid_style, 0);
        ImageView imageView = (ImageView) this.f.findViewById(R.id.reel_item_video_avatar);
        this.h = imageView;
        imageView.setImageDrawable(new ColorDrawable(zhn.j(context, R.attr.ytIcon1).orElse(0)));
        this.j = this.f.findViewById(R.id.reel_item_contextual_menu_anchor);
        this.i = (TextView) this.f.findViewById(R.id.reel_item_title);
        this.k = (RelativeLayout) this.f.findViewById(R.id.reel_item_container);
        this.l = (TextView) this.f.findViewById(R.id.reel_item_video_view_count);
        this.m = new moh(context, imageView, ajmyVar, null, 0.5625d);
    }

    @Override // defpackage.mnu, defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        d(ajrsVar, (ReelItemRendererOuterClass$ReelItemRenderer) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mnu
    public final void f(ajrs ajrsVar, ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        atep atepVar;
        arag aragVar;
        super.d(ajrsVar, reelItemRendererOuterClass$ReelItemRenderer);
        ajyc ajycVar = this.b;
        View view = this.f;
        View view2 = this.j;
        ates atesVar = reelItemRendererOuterClass$ReelItemRenderer.n;
        if (atesVar == null) {
            atesVar = ates.a;
        }
        boolean z = true;
        arag aragVar2 = null;
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
        ajycVar.e(view, view2, atepVar, ajrsVar.c("sectionListController"), ajrsVar.a);
        moh mohVar = this.m;
        avhn avhnVar = reelItemRendererOuterClass$ReelItemRenderer.f;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        mohVar.a(avhnVar, true);
        this.k.setContentDescription(moi.f(reelItemRendererOuterClass$ReelItemRenderer));
        TextView textView = this.i;
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 4) != 0) {
            aragVar = reelItemRendererOuterClass$ReelItemRenderer.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = this.l;
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 64) != 0 && (aragVar2 = reelItemRendererOuterClass$ReelItemRenderer.h) == null) {
            aragVar2 = arag.a;
        }
        textView2.setText(ajgl.b(aragVar2));
        TextView textView3 = this.l;
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 64) == 0) {
            z = false;
        }
        zag.o(textView3, z);
    }

    @Override // defpackage.mnu, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.h.setImageBitmap(null);
    }
}
