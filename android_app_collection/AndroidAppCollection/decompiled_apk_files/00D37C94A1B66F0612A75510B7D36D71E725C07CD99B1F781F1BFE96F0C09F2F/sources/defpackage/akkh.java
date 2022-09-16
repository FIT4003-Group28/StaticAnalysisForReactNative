package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akkh  reason: default package */
/* loaded from: classes.dex */
final class akkh extends nd {
    private final int a;

    public akkh(Context context) {
        this.a = context.getResources().getDimensionPixelSize(R.dimen.share_target_container_padding);
    }

    @Override // defpackage.nd
    public final void b(Rect rect, View view, RecyclerView recyclerView, yl ylVar) {
        rect.top = this.a;
        if (recyclerView.c(view) == ylVar.a() - 1) {
            rect.bottom = this.a;
        }
    }
}
