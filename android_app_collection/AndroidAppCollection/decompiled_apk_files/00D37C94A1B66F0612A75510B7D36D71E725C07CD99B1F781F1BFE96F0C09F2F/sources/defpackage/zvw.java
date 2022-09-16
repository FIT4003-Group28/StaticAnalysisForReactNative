package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: zvw  reason: default package */
/* loaded from: classes4.dex */
public final class zvw extends yo {
    public final ImageView t;
    public final TextView u;
    public final TextView v;

    public zvw(View view) {
        super(view);
        this.t = (ImageView) view.findViewById(R.id.album_thumbnail);
        this.u = (TextView) view.findViewById(R.id.album_title);
        this.v = (TextView) view.findViewById(R.id.album_contents_count);
    }
}
