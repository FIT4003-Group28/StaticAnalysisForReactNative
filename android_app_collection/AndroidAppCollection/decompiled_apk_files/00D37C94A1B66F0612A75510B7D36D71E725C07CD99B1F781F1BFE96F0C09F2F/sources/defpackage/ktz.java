package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ktz  reason: default package */
/* loaded from: classes3.dex */
public final class ktz extends fsz {
    private ImageView a;
    private TextView b;
    private TextView c;
    private TextView g;
    private LinearLayout h;
    private final fzs i;
    private final Context j;

    public ktz(ajxz ajxzVar, Context context, View view) {
        super(view);
        this.i = new fzs(context, ajxzVar);
        this.j = context;
    }

    public final void a(apmi apmiVar) {
        View view = this.f;
        if (apmiVar == null) {
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        View c = c();
        c.setVisibility(0);
        this.b = (TextView) c.findViewById(R.id.badge_icon_text);
        this.c = (TextView) c.findViewById(R.id.badge_red_text);
        this.g = (TextView) c.findViewById(R.id.badge_label);
        this.a = (ImageView) c.findViewById(R.id.badge_icon);
        this.h = (LinearLayout) c.findViewById(R.id.badge_icon_and_text);
        zag.m(this.b, apmiVar.c);
        zag.m(this.c, apmiVar.e);
        TextView textView = this.g;
        arag aragVar = apmiVar.f;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar));
        apmj apmjVar = apmiVar.g;
        if (apmjVar == null) {
            apmjVar = apmj.a;
        }
        int n = akpq.n(apmjVar.b);
        if (n == 0 || n != 5) {
            return;
        }
        if ((apmiVar.b & 2) != 0) {
            ImageView imageView = this.a;
            fzs fzsVar = this.i;
            arhs arhsVar = apmiVar.d;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            imageView.setImageResource(fzsVar.a(b));
        }
        zag.o(this.a, (apmiVar.b & 2) != 0);
        this.a.setBackground((apmiVar.b & 1) != 0 ? b(this.j) : null);
        this.h.setBackground((apmiVar.b & 1) != 0 ? b(this.j) : null);
        this.b.setBackground(null);
        if ((apmiVar.b & 1) == 0) {
            int dimensionPixelSize = this.j.getResources().getDimensionPixelSize(R.dimen.standalone_red_badge_premium_icon_size);
            zgd.t(this.a, zgd.b(zgd.m(0, 0, 0, 0), zgd.s(dimensionPixelSize, dimensionPixelSize)), ViewGroup.MarginLayoutParams.class);
            return;
        }
        this.b.setPadding(this.j.getResources().getDimensionPixelSize(R.dimen.standalone_red_badge_premium_icon_text_margin_start_end), 0, this.j.getResources().getDimensionPixelSize(R.dimen.standalone_red_badge_premium_icon_text_margin_start_end), 0);
        this.b.setTextColor(zhn.d(this.j, R.attr.ytTextSecondary));
    }

    public ktz(ajxz ajxzVar, Context context, ViewStub viewStub) {
        super(viewStub);
        this.i = new fzs(context, ajxzVar);
        this.j = context;
    }
}
