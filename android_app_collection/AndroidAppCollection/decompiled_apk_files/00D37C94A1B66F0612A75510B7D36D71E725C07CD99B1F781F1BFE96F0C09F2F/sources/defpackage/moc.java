package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
/* compiled from: PG */
/* renamed from: moc  reason: default package */
/* loaded from: classes3.dex */
final class moc extends moa {
    public moc(Context context, dt dtVar, ajyc ajycVar, ajmy ajmyVar, aafo aafoVar, gts gtsVar, ajxz ajxzVar, aadd aaddVar) {
        super(context, dtVar, ajycVar, ajmyVar, aafoVar, gtsVar, ajxzVar, R.layout.reel_item_shorts_style_video, 0.6d, aaddVar);
    }

    @Override // defpackage.moa, defpackage.mnu, defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        d(ajrsVar, (ReelItemRendererOuterClass$ReelItemRenderer) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.moa, defpackage.mnu
    public final void f(ajrs ajrsVar, ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        super.f(ajrsVar, reelItemRendererOuterClass$ReelItemRenderer);
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 64) != 0) {
            TextView textView = this.h;
            arag aragVar = reelItemRendererOuterClass$ReelItemRenderer.h;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            textView.setText(ajgl.b(aragVar));
        }
    }

    @Override // defpackage.moa
    protected final void h(int i) {
        this.f.setPaddingRelative(0, 0, 0, 0);
    }
}
