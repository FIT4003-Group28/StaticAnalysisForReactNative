package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: aaae  reason: default package */
/* loaded from: classes.dex */
final class aaae extends nd {
    final /* synthetic */ aaag a;

    public aaae(aaag aaagVar) {
        this.a = aaagVar;
    }

    @Override // defpackage.nd
    public final void b(Rect rect, View view, RecyclerView recyclerView, yl ylVar) {
        if (recyclerView.c(view) > 0) {
            rect.top = this.a.b.getResources().getDimensionPixelSize(R.dimen.card_drawer_watch_next_spacing);
        }
    }
}
