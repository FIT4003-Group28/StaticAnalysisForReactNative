package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jwp  reason: default package */
/* loaded from: classes3.dex */
public final class jwp {
    public final ajmy a;
    public final ftb b;
    public final Context c;
    public final LinearLayout d;
    public final YouTubeTextView e;
    public final TextView f;
    public final ImageView g;
    public final DurationBadgeView h;
    public final View i;
    public auaz j;
    public boolean k;

    public jwp(View view, ajmy ajmyVar, Context context, ftb ftbVar) {
        view.getClass();
        this.a = ajmyVar;
        this.b = ftbVar;
        this.e = (YouTubeTextView) view.findViewById(R.id.video_title);
        this.f = (TextView) view.findViewById(R.id.byline);
        this.g = (ImageView) view.findViewById(R.id.thumbnail);
        this.h = (DurationBadgeView) view.findViewById(R.id.duration);
        this.i = view.findViewById(R.id.touch_area);
        this.d = (LinearLayout) view.findViewById(R.id.top_badges_container);
        this.c = zhn.n(context, null, 2132083882);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(View.OnClickListener onClickListener) {
        this.i.setOnClickListener(onClickListener);
        zag.o(this.i, onClickListener != null);
    }
}
