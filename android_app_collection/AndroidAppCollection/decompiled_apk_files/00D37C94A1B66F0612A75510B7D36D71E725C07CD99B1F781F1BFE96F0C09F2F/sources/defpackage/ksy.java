package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ksy  reason: default package */
/* loaded from: classes3.dex */
final class ksy extends yo {
    final yzo t;
    final ImageView u;
    final View v;
    final ImageView w;

    public ksy(View view, yzo yzoVar) {
        super(view);
        this.t = yzoVar;
        this.u = (ImageView) view.findViewById(R.id.image);
        this.v = view.findViewById(R.id.scrim);
        this.w = (ImageView) view.findViewById(R.id.logo);
    }
}
