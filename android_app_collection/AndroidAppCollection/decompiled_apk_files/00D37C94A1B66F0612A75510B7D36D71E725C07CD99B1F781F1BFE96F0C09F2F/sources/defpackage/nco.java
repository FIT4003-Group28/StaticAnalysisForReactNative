package defpackage;

import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nco  reason: default package */
/* loaded from: classes3.dex */
public final class nco {
    public final View a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public final ImageView g;
    public final TextView h;
    public final View i;
    final /* synthetic */ ncp j;
    private frf k;
    private final TypedValue l;
    private final boolean m;

    public nco(ncp ncpVar, int i) {
        this.j = ncpVar;
        Drawable drawable = null;
        View inflate = View.inflate(ncpVar.a, i, null);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.title);
        this.d = (TextView) inflate.findViewById(R.id.channel_name);
        this.c = (TextView) inflate.findViewById(R.id.duration);
        this.f = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.i = inflate.findViewById(R.id.contextual_menu_anchor);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.channel_thumbnail);
        this.g = imageView;
        this.e = (TextView) inflate.findViewById(R.id.description);
        TextView textView = (TextView) inflate.findViewById(R.id.call_to_action);
        this.h = textView;
        TypedValue typedValue = new TypedValue();
        this.l = typedValue;
        boolean resolveAttribute = ncpVar.a.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        this.m = resolveAttribute;
        frf frfVar = new frf(resolveAttribute ? akf.a(ncpVar.a, typedValue.resourceId) : drawable, zhn.j(ncpVar.a, R.attr.adSeparator1).orElse(0), ncpVar.b.getDimensionPixelSize(R.dimen.line_separator_height));
        this.k = frfVar;
        zav.c(inflate, frfVar);
        inflate.setOnClickListener(new ncn(this, 1));
        imageView.setOnClickListener(new ncn(this));
        textView.setOnClickListener(new ncn(this, 2));
    }

    public final frf a(int i) {
        frf frfVar = new frf(this.m ? akf.a(this.j.a, this.l.resourceId) : null, zhn.j(this.j.a, R.attr.adSeparator1).orElse(0), i);
        this.k = frfVar;
        zav.c(this.a, frfVar);
        return this.k;
    }
}
