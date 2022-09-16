package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akfy  reason: default package */
/* loaded from: classes.dex */
public final class akfy {
    public int a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public View.OnClickListener e;
    public CharSequence f;
    public View.OnClickListener g;
    public int h;
    public boolean i;
    public aklb j;
    public aklb k;
    private final View l;
    private int m;

    public akfy(View view) {
        this.l = view;
    }

    private static final void c(TextView textView, aklb aklbVar) {
        if (aklbVar == null) {
            return;
        }
        Resources resources = textView.getResources();
        textView.setTextColor(aklbVar.a);
        int i = aklbVar.b;
        zag.k(textView, i == 0 ? null : resources.getDrawable(i));
    }

    private static final void d(View view, View.OnClickListener onClickListener, akfl akflVar) {
        view.setOnClickListener(new akfx(onClickListener, akflVar));
    }

    public final akfl a() {
        akfl akflVar;
        View inflate = View.inflate(this.l.getContext(), R.layout.tooltip_content_view, null);
        TextView textView = (TextView) inflate.findViewById(R.id.tooltip_title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tooltip_description);
        TextView textView3 = (TextView) inflate.findViewById(R.id.action_button);
        TextView textView4 = (TextView) inflate.findViewById(R.id.dismiss_button);
        c(textView3, this.j);
        c(textView4, this.k);
        zag.m(textView, this.b);
        zag.m(textView2, this.c);
        zag.m(textView3, this.d);
        zag.m(textView4, this.f);
        zag.k(textView3, textView3.getBackground());
        zag.k(textView4, textView4.getBackground());
        if (textView.getVisibility() == 8) {
            zgd.t(textView2, zgd.p(0), ViewGroup.MarginLayoutParams.class);
        }
        if (this.i) {
            akflVar = new akfl(inflate, this.a, this.l, this.m, this.h);
        } else {
            akflVar = new akfl(inflate, this.a, this.l, this.m);
        }
        d(textView3, this.e, akflVar);
        d(textView4, this.g, akflVar);
        return akflVar;
    }

    public final void b() {
        this.m = 2;
    }
}
