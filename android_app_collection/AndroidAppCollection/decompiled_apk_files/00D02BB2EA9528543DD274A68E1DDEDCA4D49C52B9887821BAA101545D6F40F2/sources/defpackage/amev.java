package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: amev  reason: default package */
/* loaded from: classes.dex */
final class amev extends cif {
    final /* synthetic */ ckqk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amev(ImageView imageView, ckqk ckqkVar) {
        super(imageView);
        this.c = ckqkVar;
    }

    @Override // defpackage.cig, defpackage.chz, defpackage.cij
    public final void k(Drawable drawable) {
        super.k(drawable);
        ckqe ckqeVar = (ckqe) this.c;
        ckqeVar.a.a(ckqeVar.b);
        ckqeVar.b.setTag(ckqg.e, Boolean.TRUE);
        ckqeVar.b.c = eapd.a();
        ckqg ckqgVar = ckqeVar.b;
        if (ckqgVar.g == ckqc.FIFE_GOOD_QUALITY || ckqgVar.g == ckqc.FIFE_LOWER_QUALITY || ckqgVar.g == ckqc.FIFE_LOW_QUALITY) {
            if (eapd.a().x(ckqg.d.e(eaow.c(10L)))) {
                return;
            }
            ckqg.d = eapd.a();
            cjqy tr = ((cjqz) btsr.a(cjqz.class)).tr();
            cjsx i = cjsy.i();
            i.b(ddda.cG);
            tr.k(i.a());
            cjta b = cjtd.b();
            b.d = dtxs.b;
            btvo rp = ((btvq) btsr.a(btvq.class)).rp();
            ((bvjq) btsr.a(bvjq.class)).rB();
            if (!rp.getImageQualityParameters().a) {
                b.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
            }
            ((cjqr) btsr.a(cjqr.class)).tp().g().d(b.a());
        }
    }
}
