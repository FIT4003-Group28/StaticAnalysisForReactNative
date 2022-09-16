package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mfn  reason: default package */
/* loaded from: classes3.dex */
final class mfn {
    public final View a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final akbj e;
    public final TextView f;
    public final akbj g;
    public final ImageView h;
    public final ImageView i;
    public final ajmy j;
    public final int k;
    final /* synthetic */ mfo l;

    public mfn(mfo mfoVar, View view, ajmy ajmyVar, int i) {
        this.l = mfoVar;
        this.a = view;
        this.j = ajmyVar;
        this.k = i;
        this.b = (TextView) view.findViewById(R.id.title);
        this.c = (TextView) view.findViewById(R.id.body_text);
        TextView textView = (TextView) view.findViewById(R.id.button);
        this.d = textView;
        this.e = mfoVar.d.a(textView);
        TextView textView2 = (TextView) view.findViewById(R.id.secondary_button);
        this.f = textView2;
        this.g = mfoVar.d.a(textView2);
        this.h = (ImageView) view.findViewById(R.id.icon);
        this.i = (ImageView) view.findViewById(R.id.thumbnail);
    }

    public final void a() {
        b(this.l.a.getResources().getDimensionPixelSize(R.dimen.background_promo_default_body_text_top_padding));
        c(this.l.a.getResources().getDimensionPixelSize(mfo.f(this.l.a)));
    }

    public final void b(int i) {
        TextView textView = this.c;
        textView.setPadding(textView.getPaddingLeft(), i, this.c.getPaddingRight(), this.c.getPaddingBottom());
    }

    public final void c(int i) {
        View view = this.a;
        view.setPadding(view.getPaddingLeft(), this.a.getPaddingTop(), this.a.getPaddingRight(), i);
    }
}
