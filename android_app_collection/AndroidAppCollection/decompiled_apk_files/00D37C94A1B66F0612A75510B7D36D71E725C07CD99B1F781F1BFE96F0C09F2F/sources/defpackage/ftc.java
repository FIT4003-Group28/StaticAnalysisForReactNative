package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ftc  reason: default package */
/* loaded from: classes3.dex */
public final class ftc extends fsz {
    private final int a;

    public ftc(View view, int i) {
        super(view);
        this.a = i;
    }

    private static void f(TextView textView, int i) {
        textView.setTextColor(gw.a(textView.getResources(), i, textView.getContext().getTheme()));
    }

    private static void g(TextView textView, int i) {
        textView.setTextColor(zhn.j(textView.getContext(), i).orElse(0));
    }

    public final void a(apmk apmkVar) {
        arag aragVar;
        ViewStub viewStub = this.d;
        View view = this.f;
        if (apmkVar == null) {
            if (viewStub != null) {
                viewStub.setVisibility(8);
            }
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        View c = c();
        c.setVisibility(0);
        TextView textView = (TextView) c.findViewById(R.id.ypc_badge_icon);
        TextView textView2 = (TextView) c.findViewById(R.id.ypc_badge_label);
        TextView textView3 = (TextView) c.findViewById(R.id.ypc_badge_discount);
        TextView textView4 = (TextView) c.findViewById(R.id.ypc_badge_text);
        int i = apmkVar.b;
        arag aragVar2 = null;
        if ((i & 4) != 0) {
            if ((8 & i) != 0) {
                aragVar = apmkVar.f;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            zag.m(textView3, ajgl.b(aragVar));
            if ((apmkVar.b & 4) != 0 && (aragVar2 = apmkVar.e) == null) {
                aragVar2 = arag.a;
            }
            zag.m(textView4, ajgl.b(aragVar2));
            zag.o(textView, false);
            zag.o(textView2, false);
        } else {
            zag.m(textView, apmkVar.c);
            if ((apmkVar.b & 2) != 0 && (aragVar2 = apmkVar.d) == null) {
                aragVar2 = arag.a;
            }
            zag.m(textView2, ajgl.b(aragVar2));
            zag.o(textView3, false);
            zag.o(textView4, false);
        }
        int i2 = this.a;
        if (i2 == 0) {
            kz.s(textView, R.style.StandaloneBadgesLight);
            textView.setBackgroundResource(R.drawable.standalone_badge_light_background);
            f(textView3, R.color.yt_grey1);
            f(textView4, R.color.yt_grey1);
            textView3.setBackgroundResource(R.drawable.standalone_badge_dark_background);
            textView4.setBackgroundResource(R.drawable.standalone_badge_dark_background);
            kz.s(textView2, 2132083718);
        } else if (i2 == 2) {
            kz.s(textView, R.style.StandaloneBadges);
            textView.setBackgroundResource(R.drawable.standalone_badge_red_background);
            g(textView3, R.attr.ytTextSecondary);
            g(textView4, R.attr.ytBrandRed);
            textView3.setBackgroundResource(R.drawable.standalone_badge_red_background);
            textView4.setBackgroundResource(R.drawable.standalone_badge_red_background);
            kz.s(textView2, 2132083718);
        } else {
            kz.s(textView, R.style.StandaloneBadges);
            textView.setBackground(b(textView.getContext()));
            g(textView3, R.attr.ytTextSecondary);
            g(textView4, R.attr.ytTextSecondary);
            textView3.setBackground(b(textView3.getContext()));
            textView4.setBackground(b(textView4.getContext()));
            kz.s(textView2, 2132083717);
        }
        if ((apmkVar.b & 32) == 0) {
            return;
        }
        apml apmlVar = apmkVar.g;
        if (apmlVar == null) {
            apmlVar = apml.a;
        }
        int s = akzj.s(apmlVar.b);
        if (s == 0 || s != 2) {
            return;
        }
        f(textView4, R.color.quantum_vanillagreen600);
    }

    public ftc(ViewStub viewStub, int i) {
        super(viewStub);
        this.a = i;
    }
}
