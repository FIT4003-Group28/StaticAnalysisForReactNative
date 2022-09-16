package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afrc  reason: default package */
/* loaded from: classes.dex */
public final class afrc extends yo {
    public final TextView t;
    public final TextView u;
    public final afqv v;
    public final afqy w;

    public afrc(View view, afqv afqvVar, afqy afqyVar) {
        super(view);
        this.t = (TextView) view.findViewById(R.id.location_search_item_title);
        this.u = (TextView) view.findViewById(R.id.location_search_item_subtitle);
        this.v = afqvVar;
        this.w = afqyVar;
    }
}
