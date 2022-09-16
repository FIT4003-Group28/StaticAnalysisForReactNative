package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: wcc  reason: default package */
/* loaded from: classes4.dex */
public final class wcc extends yo {
    public static final /* synthetic */ int u = 0;
    public final TextView t;

    public wcc(View view) {
        super(view);
        this.t = (TextView) view.findViewById(R.id.dropdown_item_label);
    }

    public wcc(TextView textView) {
        super(textView);
        this.t = textView;
    }
}
