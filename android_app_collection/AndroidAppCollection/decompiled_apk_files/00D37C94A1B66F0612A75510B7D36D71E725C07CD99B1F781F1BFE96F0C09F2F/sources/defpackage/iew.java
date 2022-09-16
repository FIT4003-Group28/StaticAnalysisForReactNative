package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: iew  reason: default package */
/* loaded from: classes3.dex */
public final class iew {
    public final TextView a;
    public final TextView b;
    public final ajnj c;
    private final ImageView d;

    public iew(View view, ajmy ajmyVar) {
        ImageView imageView = (ImageView) view.findViewById(R.id.reel_vod_link_thumbnail);
        this.d = imageView;
        this.a = (TextView) view.findViewById(R.id.reel_vod_link_duration);
        this.b = (TextView) view.findViewById(R.id.reel_vod_link_title);
        this.c = new ajnj(ajmyVar, new yyj(), imageView, false);
    }
}
