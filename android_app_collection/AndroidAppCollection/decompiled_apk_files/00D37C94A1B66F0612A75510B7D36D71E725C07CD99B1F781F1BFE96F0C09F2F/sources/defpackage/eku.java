package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eku  reason: default package */
/* loaded from: classes3.dex */
public final class eku {
    public final View a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public final fmg e;
    public final fny f;
    public final ejj g;
    public final akbm h;
    public final TextView i;
    public final View j;
    final /* synthetic */ ekx k;

    public eku(ekx ekxVar, View view) {
        this.k = ekxVar;
        this.a = view;
        this.b = (TextView) view.findViewById(R.id.channel_title);
        this.c = (TextView) view.findViewById(R.id.channel_subtitle);
        this.d = (ImageView) view.findViewById(R.id.profile_editor_icon);
        TextView textView = (TextView) view.findViewById(R.id.subscribe_button);
        this.i = textView;
        View findViewById = view.findViewById(R.id.subscription_notification_view);
        this.j = findViewById;
        TextView textView2 = (TextView) view.findViewById(R.id.sponsor_button);
        TextView textView3 = (TextView) view.findViewById(R.id.purchase_button);
        fny a = ekxVar.k.a(findViewById);
        this.f = a;
        this.e = ekxVar.j.a(textView, a);
        akbm akbmVar = null;
        this.g = textView2 == null ? null : ekxVar.l.a(textView2);
        this.h = textView3 != null ? ekxVar.p.a(textView3) : akbmVar;
    }
}
