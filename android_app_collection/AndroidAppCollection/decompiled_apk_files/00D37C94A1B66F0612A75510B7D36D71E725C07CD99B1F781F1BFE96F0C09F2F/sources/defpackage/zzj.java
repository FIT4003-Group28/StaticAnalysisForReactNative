package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: zzj  reason: default package */
/* loaded from: classes4.dex */
final class zzj extends yo {
    final ImageView t;
    final TextView u;
    final TextView v;
    final TextView w;

    public zzj(View view) {
        super(view);
        this.t = (ImageView) view.findViewById(R.id.image);
        this.u = (TextView) view.findViewById(R.id.domain);
        this.v = (TextView) view.findViewById(R.id.title);
        this.w = (TextView) view.findViewById(R.id.call_to_action);
    }
}
