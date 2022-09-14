package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cdwt  reason: default package */
/* loaded from: classes4.dex */
final class cdwt implements View.OnLayoutChangeListener {
    private final aai a = new aai();
    private final RecyclerView b;
    private final int c;

    public cdwt(RecyclerView recyclerView) {
        this.b = recyclerView;
        this.c = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.photo_posts_media_small_mode_threshold);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.f(i4 - i2 < this.c ? null : this.b);
    }
}
