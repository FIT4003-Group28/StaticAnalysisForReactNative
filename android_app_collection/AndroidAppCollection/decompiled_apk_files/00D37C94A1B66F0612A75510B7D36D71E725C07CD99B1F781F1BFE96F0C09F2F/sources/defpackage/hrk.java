package defpackage;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.StickerCatalogRendererOuterClass;
/* compiled from: PG */
/* renamed from: hrk  reason: default package */
/* loaded from: classes3.dex */
public final class hrk extends hte {
    public final ImageView t;
    public final htd u;
    public auzi v;
    public final apy w;
    private final hux y;

    public hrk(View view, htd htdVar, hux huxVar, apy apyVar) {
        super(view);
        this.t = (ImageView) view.findViewById(R.id.image);
        this.u = htdVar;
        this.y = huxVar;
        this.w = apyVar;
    }

    @Override // defpackage.hte
    public final void E() {
        if (!this.x.qn(StickerCatalogRendererOuterClass.stickerRenderer)) {
            throw new IllegalArgumentException("renderer missing");
        }
        this.v = (auzi) this.x.qm(StickerCatalogRendererOuterClass.stickerRenderer);
        ((htf) this.u).g.add(hve.b(this.x));
        ((htf) this.u).t.aK(true);
        hux huxVar = this.y;
        aunb aunbVar = this.x;
        huxVar.a(hve.b(aunbVar), new hrj(this));
    }

    @Override // defpackage.hte
    public final void F() {
        this.t.setImageDrawable(null);
        this.t.setContentDescription(null);
        Uri b = hve.b(this.x);
        hux huxVar = this.y;
        if (huxVar.a.containsKey(b)) {
            yiy yiyVar = (yiy) huxVar.a.get(b);
            if (!yiyVar.e()) {
                yiyVar.d();
            }
        }
        this.u.e(b);
        this.v = null;
    }
}
