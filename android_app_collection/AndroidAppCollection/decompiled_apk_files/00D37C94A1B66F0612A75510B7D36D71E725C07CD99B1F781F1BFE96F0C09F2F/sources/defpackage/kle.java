package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kle  reason: default package */
/* loaded from: classes3.dex */
public final class kle {
    public final ajxz a;
    public final Context b;
    public final View c;
    public final ImageView d;
    public final TextView e;
    public final akbj f;
    public final acti g;
    public final aafo h;
    public final akfb i;
    public final int j;

    public kle(Context context, acti actiVar, aafo aafoVar, ajxz ajxzVar, akfb akfbVar, akbk akbkVar, ViewGroup viewGroup) {
        this.b = context;
        this.g = actiVar;
        this.a = ajxzVar;
        this.h = aafoVar;
        this.i = akfbVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.fullscreen_engagement_action_bar_button, viewGroup, false);
        this.c = inflate;
        this.d = (ImageView) inflate.findViewById(R.id.button_icon);
        this.e = (TextView) inflate.findViewById(R.id.button_text);
        this.f = akbkVar.a(inflate);
        this.j = zhn.j(context, R.attr.ytOverlayIconActiveOther).orElse(0);
    }
}
