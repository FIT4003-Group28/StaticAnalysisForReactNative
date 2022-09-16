package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mpm  reason: default package */
/* loaded from: classes3.dex */
final class mpm {
    public final View a;
    public final aafo b;
    public final ImageView c;
    public final ImageView d;
    public final ajmy e;
    public final ajyc f;
    public final View g;
    public final View h;
    public final View i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final ktz m;
    public auvo n;
    public CharSequence o;
    public fmk p;
    public ggm q;

    public mpm(Context context, ajmy ajmyVar, aafo aafoVar, ajyc ajycVar, kua kuaVar) {
        aafoVar.getClass();
        this.b = aafoVar;
        this.e = ajmyVar;
        this.f = ajycVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.show_item, (ViewGroup) null);
        this.a = inflate;
        this.c = (ImageView) inflate.findViewById(R.id.thumbnail);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.channel_avatar);
        this.d = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new mpl(this));
        }
        this.g = inflate.findViewById(R.id.contextual_menu_anchor);
        this.j = (TextView) inflate.findViewById(R.id.title);
        this.k = (TextView) inflate.findViewById(R.id.short_byline);
        this.l = (TextView) inflate.findViewById(R.id.long_byline);
        this.m = kuaVar.a((ViewStub) inflate.findViewById(R.id.bottom_title_standalone_red_badge));
        this.i = inflate.findViewById(R.id.bottom_panel_overlay);
        this.h = inflate.findViewById(R.id.resume_playback_overlay);
    }
}
