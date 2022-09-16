package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akay  reason: default package */
/* loaded from: classes.dex */
final class akay {
    public final TextView a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;
    public final View f;

    public akay(View view) {
        this.a = (TextView) view.findViewById(R.id.list_item_text);
        this.b = (ImageView) view.findViewById(R.id.list_item_icon_primary);
        this.c = (TextView) view.findViewById(R.id.list_item_text_secondary);
        this.d = (TextView) view.findViewById(R.id.list_item_text_secondary_separator);
        this.e = (ImageView) view.findViewById(R.id.list_item_icon_secondary);
        this.f = view;
    }
}
