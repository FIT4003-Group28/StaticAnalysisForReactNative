package defpackage;

import android.content.Context;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdyv  reason: default package */
/* loaded from: classes4.dex */
public final class cdyv extends cdyp {
    public static ds t;
    public static ds u;
    private static final cdyt z = new cdyt();
    public final dzve<cdvk, dztc> s;
    private final cebc v;
    private final WebImageView w;
    private final TextView x;
    private final ChangeBounds y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cdyv(android.view.ViewGroup r4, defpackage.dzve<? super defpackage.cdvk, defpackage.dztc> r5, defpackage.cebd r6, defpackage.ilo r7) {
        /*
            r3 = this;
            java.lang.String r0 = "logger"
            defpackage.dzvx.c(r6, r0)
            java.lang.String r0 = "placemark"
            defpackage.dzvx.c(r7, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131624247(0x7f0e0137, float:1.8875668E38)
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
        */
        //  java.lang.String r0 = "LayoutInflater.from(pare…*attachToRoot=*/false\n  )"
        /*
            defpackage.dzvx.b(r4, r0)
            r3.<init>(r4)
            r3.s = r5
            android.view.View r4 = r3.a
            cebc r4 = r6.a(r4)
            ddho r5 = defpackage.dtyd.L
            r4.d(r5, r7)
            r3.v = r4
            android.view.View r4 = r3.a
            r5 = 2131428015(0x7f0b02af, float:1.8477663E38)
            android.view.View r4 = r4.findViewById(r5)
            com.google.android.apps.gmm.base.views.webimageview.WebImageView r4 = (com.google.android.apps.gmm.base.views.webimageview.WebImageView) r4
            r3.w = r4
            android.view.View r4 = r3.a
            r5 = 2131428457(0x7f0b0469, float:1.847856E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.x = r4
            android.transition.ChangeBounds r4 = new android.transition.ChangeBounds
            r4.<init>()
            android.view.animation.AccelerateInterpolator r5 = new android.view.animation.AccelerateInterpolator
            r6 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r6)
            r4.setInterpolator(r5)
            r5 = 100
            r4.setDuration(r5)
            r3.y = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdyv.<init>(android.view.ViewGroup, dzve, cebd, ilo):void");
    }

    @Override // defpackage.cdyp
    public final void C(cdyl cdylVar, Object obj) {
        dzsx a;
        ds dsVar;
        dzvx.c(cdylVar, "item");
        if (!(cdylVar instanceof cdvk)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (obj != cdvf.a) {
            WebImageView webImageView = this.w;
            Uri uri = ((cdvk) cdylVar).b;
            dzvx.c(uri, "$this$webImageViewProperties");
            webImageView.o(cdyq.a(uri, null));
        }
        TextView textView = this.x;
        dzvx.b(textView, "ordinalBadge");
        cdvk cdvkVar = (cdvk) cdylVar;
        textView.setText(String.valueOf(cdvkVar.a()));
        this.v.b(new cdyu(this, cdylVar));
        View view = this.a;
        if (cdvkVar.b()) {
            a = dzsz.a(Integer.valueOf((int) R.string.photo_posts_media_selected_description), Integer.valueOf(cdvkVar.a()));
        } else {
            a = dzsz.a(Integer.valueOf((int) R.string.photo_posts_media_unselected_description), Integer.valueOf(d()));
        }
        view.setContentDescription(view.getContext().getString(((Number) a.a).intValue(), Integer.valueOf(((Number) a.b).intValue())));
        od.c(view, new cdvh(true != cdvkVar.b() ? R.string.photo_posts_media_select_action : R.string.photo_posts_media_deselect_action));
        if (!(view instanceof ConstraintLayout)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        TransitionManager.beginDelayedTransition((ViewGroup) view, this.y);
        Context context = this.a.getContext();
        dzvx.b(context, "itemView.context");
        if (cdvkVar.b()) {
            dsVar = u;
            if (dsVar == null) {
                dsVar = cdyt.a(context, R.layout.photo_post_gallery_media_selected);
                u = dsVar;
            }
        } else {
            dsVar = t;
            if (dsVar == null) {
                dsVar = cdyt.a(context, R.layout.photo_post_gallery_media);
                t = dsVar;
            }
        }
        dsVar.d((ConstraintLayout) view);
    }
}
