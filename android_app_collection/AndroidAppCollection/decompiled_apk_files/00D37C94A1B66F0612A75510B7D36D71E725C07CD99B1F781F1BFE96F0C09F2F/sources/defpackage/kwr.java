package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kwr  reason: default package */
/* loaded from: classes3.dex */
public final class kwr {
    public final ImageView a;
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public final View e;
    public akhl f;
    final /* synthetic */ kws g;

    public kwr(kws kwsVar, View view) {
        this.g = kwsVar;
        this.e = view;
        this.a = (ImageView) view.findViewById(R.id.search_type_icon);
        this.b = (TextView) view.findViewById(R.id.text);
        this.c = (ImageView) view.findViewById(R.id.edit_suggestion);
        this.d = (ImageView) view.findViewById(R.id.thumbnail);
    }
}
