package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.IntConsumer;
/* compiled from: PG */
/* renamed from: wek  reason: default package */
/* loaded from: classes4.dex */
public final class wek implements ajru {
    public final View a;
    public aarw b;
    public boolean c;
    private final acti d;
    private final TextView e;
    private final TextView f;
    private final ImageView g;
    private final ajnj h;

    public wek(Context context, ajmr ajmrVar, acti actiVar, wfe wfeVar) {
        this.d = actiVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.account_item, (ViewGroup) null);
        this.a = inflate;
        final TextView textView = (TextView) inflate.findViewById(R.id.name);
        this.e = textView;
        final TextView textView2 = (TextView) inflate.findViewById(R.id.byline);
        this.f = textView2;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.g = imageView;
        this.h = new ajnj(ajmrVar, imageView);
        inflate.setOnClickListener(new weh(this, wfeVar));
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new wei(this));
        zhn.l(context, R.attr.ytTextAppearanceBody2a).ifPresent(new IntConsumer() { // from class: weg
            @Override // j$.util.function.IntConsumer
            public final void accept(int i) {
                TextView textView3 = textView;
                TextView textView4 = textView2;
                kz.s(textView3, i);
                kz.s(textView4, i);
            }

            @Override // j$.util.function.IntConsumer
            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return intConsumer.getClass();
            }
        });
        Optional h = zhn.h(context, R.attr.accountSwitcherNameTextColor);
        textView.getClass();
        h.ifPresent(new wel(textView, 1));
        Optional h2 = zhn.h(context, R.attr.accountSwitcherBylineTextColor);
        textView2.getClass();
        h2.ifPresent(new wel(textView2, 1));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        aarw aarwVar = (aarw) obj;
        this.c = false;
        if (aarwVar.q() != null) {
            this.d.u(new acte(aarwVar.q()), null);
        }
        this.e.setText(aarwVar.a());
        Spanned b = aarwVar.b();
        if (!TextUtils.isEmpty(b)) {
            this.f.setText(b);
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
        this.h.j(aarwVar.c());
        this.e.setSelected(aarwVar.o());
        if (aarwVar.o()) {
            this.a.requestFocus();
        }
        boolean z = aarwVar.a.i;
        boolean z2 = !z;
        this.a.setEnabled(z2);
        this.e.setEnabled(z2);
        this.f.setEnabled(z2);
        this.g.setAlpha(true != z ? 1.0f : 0.6f);
        this.b = aarwVar;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
