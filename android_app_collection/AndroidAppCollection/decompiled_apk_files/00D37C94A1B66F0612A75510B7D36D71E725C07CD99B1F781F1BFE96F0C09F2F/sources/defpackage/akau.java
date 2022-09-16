package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akau  reason: default package */
/* loaded from: classes.dex */
final class akau {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final ImageView d;

    public akau(View view) {
        this.a = (TextView) view.findViewById(R.id.list_item_text);
        this.b = (TextView) view.findViewById(R.id.list_item_secondary_text);
        this.c = (ImageView) view.findViewById(R.id.list_item_icon_primary);
        this.d = (ImageView) view.findViewById(R.id.list_item_icon_secondary);
    }
}
