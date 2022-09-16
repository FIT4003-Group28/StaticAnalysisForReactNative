package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahcv  reason: default package */
/* loaded from: classes.dex */
final class ahcv {
    public final TextView a;
    public final TextView b;

    public ahcv(View view) {
        TextView textView = (TextView) view.findViewById(R.id.stream_quality);
        textView.getClass();
        this.a = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.stream_size);
        textView2.getClass();
        this.b = textView2;
    }
}
