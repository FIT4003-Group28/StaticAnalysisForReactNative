package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: zyy  reason: default package */
/* loaded from: classes4.dex */
final class zyy extends yo {
    final ImageView t;
    final TextView u;
    final TextView v;
    final TextView w;

    public zyy(View view) {
        super(view);
        this.t = (ImageView) view.findViewById(R.id.image);
        this.u = (TextView) view.findViewById(R.id.subscriber_count);
        this.v = (TextView) view.findViewById(R.id.channel_name);
        this.w = (TextView) view.findViewById(R.id.custom_text);
    }
}
