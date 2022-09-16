package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lzf  reason: default package */
/* loaded from: classes3.dex */
public final class lzf implements wkd {
    private final Activity a;
    private View b;
    private ImageView c;
    private View d;
    private RatingBar e;
    private RatingBar f;
    private ImageView g;

    public lzf(Activity activity, ajmy ajmyVar, xiw xiwVar, wxc wxcVar) {
        this.a = activity;
        ajmyVar.getClass();
        xiwVar.getClass();
        wxcVar.getClass();
    }

    private final void i(View view) {
        if (view != null) {
            zag.g(view, R.id.app_promotion_companion_card_stub, R.id.app_promotion_companion_card).setVisibility(8);
        }
        if (this.b != null) {
            this.c.setImageDrawable(null);
            this.e.setVisibility(8);
            this.f.setVisibility(8);
            this.g.setVisibility(4);
            this.g.setImageDrawable(null);
            this.b.setVisibility(8);
        }
    }

    @Override // defpackage.wke
    public final void a() {
    }

    public final void b(Bitmap bitmap) {
        this.c.setImageBitmap(bitmap);
    }

    public final void c(Bitmap bitmap) {
        this.g.setImageBitmap(bitmap);
        this.g.setVisibility(bitmap != null ? 0 : 8);
    }

    @Override // defpackage.wke
    public final void d(View view, ajrs ajrsVar) {
        View view2 = this.b;
        if (view2 == null || view2.getParent() != view) {
            i(view);
            this.b = zag.g(view, R.id.app_promotion_companion_card_stub, R.id.app_promotion_companion_card);
            yit.c(this.a, new lze(this));
            yit.c(this.a, new lze(this, 1));
            this.c = (ImageView) this.b.findViewById(R.id.app_thumbnail);
            TextView textView = (TextView) this.b.findViewById(R.id.app_name);
            this.e = (RatingBar) this.b.findViewById(R.id.rating_gray);
            this.f = (RatingBar) this.b.findViewById(R.id.rating_white);
            this.g = (ImageView) this.b.findViewById(R.id.rating_image);
            TextView textView2 = (TextView) this.b.findViewById(R.id.app_price);
            this.d = this.b.findViewById(R.id.action_button);
            TextView textView3 = (TextView) this.b.findViewById(R.id.ad_cta_button_text);
            this.d.setOnClickListener(new ija(9));
        }
        throw null;
    }

    @Override // defpackage.wke
    public final void e(View view) {
        i(view);
        this.b = null;
    }

    @Override // defpackage.wke
    public final void f() {
    }

    @Override // defpackage.wkd
    public final boolean g(String str, PlayerResponseModel playerResponseModel, asit asitVar) {
        asaj asajVar = playerResponseModel != null ? playerResponseModel.a : null;
        if (asajVar != null) {
            atzu atzuVar = asajVar.A;
            if (atzuVar == null) {
                atzuVar = atzu.a;
            }
            int i = atzuVar.b;
        }
        return false;
    }

    @Override // defpackage.wke
    public final void h(wxo wxoVar) {
    }
}
