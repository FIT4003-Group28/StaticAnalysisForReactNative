package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mny  reason: default package */
/* loaded from: classes3.dex */
public final class mny extends mnu {
    public final dt h;
    public final ajxz i;
    private final LinearLayout j;
    private final ImageView k;
    private final TextView l;
    private final moh m;

    public mny(Context context, dt dtVar, ajyc ajycVar, ajmy ajmyVar, aafo aafoVar, gts gtsVar, ajxz ajxzVar) {
        super(context, ajycVar, ajmyVar, aafoVar, gtsVar, R.layout.reel_item_avatar_circle_many_style, R.id.reel_item_channel_avatar);
        this.h = dtVar;
        this.i = ajxzVar;
        this.j = (LinearLayout) this.f.findViewById(R.id.reel_item_container);
        ImageView imageView = (ImageView) this.f.findViewById(R.id.reel_item_channel_avatar);
        this.k = imageView;
        this.l = (TextView) this.f.findViewById(R.id.reel_item_title);
        this.m = new moh(context, imageView, ajmyVar, this.g, 0.5625d);
    }

    @Override // defpackage.mnu, defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        d(ajrsVar, (ReelItemRendererOuterClass$ReelItemRenderer) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mnu
    public final void f(ajrs ajrsVar, final ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        avhn avhnVar;
        super.d(ajrsVar, reelItemRendererOuterClass$ReelItemRenderer);
        int intValue = ((Integer) ajrsVar.d("width", -1)).intValue();
        if (intValue != -1) {
            this.j.getLayoutParams().width = intValue;
        }
        moh mohVar = this.m;
        arag aragVar = null;
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 32) != 0) {
            avhnVar = reelItemRendererOuterClass$ReelItemRenderer.g;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = null;
        }
        mohVar.a(avhnVar, false);
        TextView textView = this.l;
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 4) != 0 && (aragVar = reelItemRendererOuterClass$ReelItemRenderer.d) == null) {
            aragVar = arag.a;
        }
        textView.setText(ajgl.b(aragVar));
        this.l.setContentDescription(moi.f(reelItemRendererOuterClass$ReelItemRenderer));
        ates atesVar = reelItemRendererOuterClass$ReelItemRenderer.n;
        if (atesVar == null) {
            atesVar = ates.a;
        }
        if ((atesVar.b & 1) != 0) {
            this.f.setOnLongClickListener(new View.OnLongClickListener() { // from class: mnx
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    mny mnyVar = mny.this;
                    ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer2 = reelItemRendererOuterClass$ReelItemRenderer;
                    HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", reelItemRendererOuterClass$ReelItemRenderer2);
                    dt dtVar = mnyVar.h;
                    ates atesVar2 = reelItemRendererOuterClass$ReelItemRenderer2.n;
                    if (atesVar2 == null) {
                        atesVar2 = ates.a;
                    }
                    atep atepVar = atesVar2.c;
                    if (atepVar == null) {
                        atepVar = atep.a;
                    }
                    akbc.c(dtVar, atepVar, mnyVar.d, mnyVar.i, hashMap);
                    return true;
                }
            });
        }
    }

    @Override // defpackage.mnu, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.c.e(this.k);
        this.f.setOnLongClickListener(null);
    }
}
