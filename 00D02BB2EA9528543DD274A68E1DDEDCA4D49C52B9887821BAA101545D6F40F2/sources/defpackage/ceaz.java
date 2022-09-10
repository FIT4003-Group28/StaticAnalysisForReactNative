package defpackage;

import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ceaz  reason: default package */
/* loaded from: classes4.dex */
final class ceaz extends cdve {
    private final ImageView s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ceaz(android.view.ViewGroup r4) {
        /*
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131624243(0x7f0e0133, float:1.887566E38)
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
        */
        //  java.lang.String r0 = "LayoutInflater.from(pare…attachToRoot=*/ false\n  )"
        /*
            defpackage.dzvx.b(r4, r0)
            r3.<init>(r4)
            android.view.View r4 = r3.a
            r0 = 2131428014(0x7f0b02ae, float:1.847766E38)
            android.view.View r4 = r4.findViewById(r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.s = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceaz.<init>(android.view.ViewGroup):void");
    }

    @Override // defpackage.cdve
    public final void D(cduu cduuVar) {
        dzvx.c(cduuVar, "item");
        if (!(cduuVar instanceof cdvd)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        ImageView imageView = this.s;
        bvlo a = bvlo.a();
        ImageView imageView2 = this.s;
        dzvx.b(imageView2, "illy");
        cdvd cdvdVar = (cdvd) cduuVar;
        imageView.setImageDrawable(a.b(imageView2.getResources(), R.raw.photo_posts_zero_state, bvlw.a));
    }
}
