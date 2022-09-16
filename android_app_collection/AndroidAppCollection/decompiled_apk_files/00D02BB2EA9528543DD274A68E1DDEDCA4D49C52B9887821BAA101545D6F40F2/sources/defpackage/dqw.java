package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: dqw  reason: default package */
/* loaded from: classes6.dex */
public final class dqw {
    public final Activity a;
    public final ahjq b;
    public final bvsl c;
    public final cqat d;
    public final ajsc e;
    public final View f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final View j;
    public final ImageView k;
    public final TextView l;
    public final TextView m;
    public final View n;
    public final View o;
    public final drd p;
    public boolean q = false;

    public dqw(Activity activity, ahjq ahjqVar, dkn dknVar, bvsl bvslVar, cqat cqatVar, ajsc ajscVar, dre dreVar) {
        this.a = activity;
        this.b = ahjqVar;
        this.c = bvslVar;
        this.d = cqatVar;
        this.e = ajscVar;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.location_sharing_card_layout, (ViewGroup) null);
        this.f = inflate;
        this.g = (TextView) inflate.findViewById(R.id.title);
        this.h = (TextView) inflate.findViewById(R.id.subtitle);
        View findViewById = inflate.findViewById(R.id.primary_button);
        this.i = (TextView) inflate.findViewById(R.id.person_distance);
        this.j = inflate.findViewById(R.id.person_battery_container);
        this.k = (ImageView) inflate.findViewById(R.id.person_battery_icon);
        this.l = (TextView) inflate.findViewById(R.id.person_battery_text);
        this.m = (TextView) inflate.findViewById(R.id.person_status);
        this.n = inflate.findViewById(R.id.person_separator_1);
        this.o = inflate.findViewById(R.id.person_separator_2);
        this.p = dreVar.a(findViewById);
        dknVar.a(inflate, cjtd.a(dtxj.bL));
    }
}
