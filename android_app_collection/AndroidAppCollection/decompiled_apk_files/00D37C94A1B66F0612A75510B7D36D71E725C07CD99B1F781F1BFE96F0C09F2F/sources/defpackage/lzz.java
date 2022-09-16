package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lzz  reason: default package */
/* loaded from: classes3.dex */
final class lzz {
    public final ajmy a;
    public final DisplayMetrics b;
    public final View c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;

    public lzz(ViewGroup viewGroup, Context context, ajmy ajmyVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.companion_item, viewGroup, false);
        this.c = inflate;
        this.d = (ImageView) inflate.findViewById(R.id.image);
        this.e = (TextView) inflate.findViewById(R.id.description);
        this.f = (TextView) inflate.findViewById(R.id.subtitle);
        this.g = (TextView) inflate.findViewById(R.id.side_description);
        this.h = (TextView) inflate.findViewById(R.id.side_subtitle);
        this.a = ajmyVar;
        this.b = context.getResources().getDisplayMetrics();
    }
}
