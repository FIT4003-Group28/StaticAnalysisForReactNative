package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.Function;
/* compiled from: PG */
/* renamed from: wez  reason: default package */
/* loaded from: classes4.dex */
public final class wez implements ajru {
    private final View a;
    private final TextView b;
    private final ImageView c;

    public wez(Context context, wfh wfhVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.manage_account_item, (ViewGroup) null);
        this.a = inflate;
        inflate.findViewById(R.id.byline).setVisibility(8);
        TextView textView = (TextView) inflate.findViewById(R.id.name);
        this.b = textView;
        this.c = (ImageView) inflate.findViewById(R.id.thumbnail);
        inflate.setOnClickListener(new wew(wfhVar));
        zhn.l(context, R.attr.ytTextAppearanceBody2a).ifPresent(new wev(textView));
        Optional h = zhn.h(context, R.attr.accountSwitcherNameTextColor);
        textView.getClass();
        h.ifPresent(new wel(textView, 2));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        wey weyVar = (wey) obj;
        this.b.setText(R.string.account_switcher_add_account);
        final Context context = this.a.getContext();
        final Drawable drawable = context.getResources().getDrawable(2131232362, null);
        this.c.setImageDrawable((Drawable) zhn.h(context, R.attr.ytTextSecondary).map(new Function() { // from class: weu
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return function.getClass();
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj2) {
                return new yzh(context).c(drawable, (ColorStateList) obj2);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return function.getClass();
            }
        }).orElse(drawable));
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
