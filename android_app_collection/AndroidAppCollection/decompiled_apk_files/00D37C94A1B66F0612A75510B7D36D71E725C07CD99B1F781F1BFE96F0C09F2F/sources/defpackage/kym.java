package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.youtube.R;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: kym  reason: default package */
/* loaded from: classes3.dex */
public final class kym extends ajsl {
    public final CardView a;
    private final Activity b;
    private final TextView c;
    private final ajrp d;
    private final ajxz e;
    private final float f;

    public kym(Activity activity, aafo aafoVar, ajxz ajxzVar, ViewGroup viewGroup) {
        this.b = activity;
        float dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.refinement_chip_elevation_size);
        this.f = dimensionPixelSize;
        this.e = ajxzVar;
        CardView cardView = (CardView) LayoutInflater.from(activity).inflate(R.layout.refinement_chip, viewGroup, false);
        this.a = cardView;
        aec.h(cardView.e, dimensionPixelSize);
        TextView textView = (TextView) cardView.findViewById(R.id.text);
        textView.getClass();
        this.c = textView;
        this.d = new ajrp(aafoVar, cardView);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        arag aragVar;
        aumj aumjVar = (aumj) obj;
        ajrp ajrpVar = this.d;
        acti actiVar = ajrsVar.a;
        if ((aumjVar.b & 4) != 0) {
            apzgVar = aumjVar.d;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
        aumk aumkVar = aumjVar.f;
        if (aumkVar == null) {
            aumkVar = aumk.a;
        }
        int bx = awwc.bx(aumkVar.b);
        if (bx == 0 || bx != 2) {
            this.c.setMaxWidth(this.b.getResources().getDimensionPixelSize(R.dimen.preview_card_refinement_chip_max_width));
        } else {
            this.c.setMaxWidth(this.b.getResources().getDimensionPixelSize(R.dimen.refinement_chip_normal_max_width));
        }
        if ((aumjVar.b & 8) == 0) {
            kz.t(this.c, 0, 0);
        } else {
            Activity activity = this.b;
            ajxz ajxzVar = this.e;
            arhs arhsVar = aumjVar.e;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            Drawable a = akf.a(activity, ajxzVar.a(b));
            a.setTint(ake.d(this.b, R.color.quantum_vanillablue500));
            kz.u(this.c, a, null, null);
        }
        TextView textView = this.c;
        if ((aumjVar.b & 1) != 0) {
            aragVar = aumjVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        this.c.getBackground().setAlpha(PrivateKeyType.INVALID);
        this.a.d();
        this.c.setCompoundDrawablePadding(6);
        this.c.setPadding(this.b.getResources().getDimensionPixelSize(R.dimen.refinement_chip_text_left_padding), this.b.getResources().getDimensionPixelSize(R.dimen.refinement_chip_text_top_bottom_padding), this.b.getResources().getDimensionPixelSize(R.dimen.refinement_chip_text_right_padding), this.b.getResources().getDimensionPixelSize(R.dimen.refinement_chip_text_top_bottom_padding));
        this.c.getLayoutParams().height = this.b.getResources().getDimensionPixelSize(R.dimen.refinement_chip_height);
        if (Build.VERSION.SDK_INT >= 23) {
            this.c.setForeground(null);
        }
        this.c.setIncludeFontPadding(false);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aumj) obj).g.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.d.c();
    }
}
