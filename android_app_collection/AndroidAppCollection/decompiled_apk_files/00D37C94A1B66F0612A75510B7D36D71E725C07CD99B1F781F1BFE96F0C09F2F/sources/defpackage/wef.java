package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.Supplier;
/* compiled from: PG */
/* renamed from: wef  reason: default package */
/* loaded from: classes4.dex */
public final class wef implements ajru {
    public aarx a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final Resources e;
    private final yzj f;

    public wef(Context context, yzj yzjVar, wff wffVar) {
        this.f = yzjVar;
        LayoutInflater from = LayoutInflater.from(context);
        View inflate = from.inflate(R.layout.account_item, (ViewGroup) null);
        this.b = inflate;
        this.e = from.getContext().getResources();
        final TextView textView = (TextView) inflate.findViewById(R.id.name);
        this.c = textView;
        final TextView textView2 = (TextView) inflate.findViewById(R.id.byline);
        this.d = textView2;
        Drawable a = akf.a(context, R.drawable.account_switcher_alert);
        a.getClass();
        Drawable mutate = a.mutate();
        Optional h = zhn.h(context, R.attr.ytTextPrimary);
        textView.getClass();
        textView.setTextColor((ColorStateList) h.orElseGet(new Supplier() { // from class: wec
            @Override // j$.util.function.Supplier
            /* renamed from: get */
            public final Object mo515get() {
                return textView.getTextColors();
            }
        }));
        Optional h2 = zhn.h(context, R.attr.ytTextSecondary);
        textView2.getClass();
        textView2.setTextColor((ColorStateList) h2.orElseGet(new Supplier() { // from class: wec
            @Override // j$.util.function.Supplier
            /* renamed from: get */
            public final Object mo515get() {
                return textView2.getTextColors();
            }
        }));
        mutate.setTint(zhn.j(context, R.attr.ytIconInactive).orElse(-7829368));
        mutate.setTintMode(PorterDuff.Mode.SRC_IN);
        ((ImageView) inflate.findViewById(R.id.thumbnail)).setImageDrawable(mutate);
        inflate.setOnClickListener(new wed(this, wffVar));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        String string;
        aarx aarxVar = (aarx) obj;
        this.a = aarxVar;
        if (!aarxVar.b()) {
            Throwable th = aarxVar.b;
            if (th != null) {
                string = this.f.b(th);
            } else {
                string = this.e.getString(R.string.account_switcher_error_general_title);
            }
            this.c.setText(string);
            this.d.setText(this.e.getString(R.string.account_switcher_error_general_byline));
            return;
        }
        this.c.setText(this.e.getString(R.string.account_switcher_error_credentials_title));
        this.d.setText(this.e.getString(R.string.account_switcher_error_credentials_byline));
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
