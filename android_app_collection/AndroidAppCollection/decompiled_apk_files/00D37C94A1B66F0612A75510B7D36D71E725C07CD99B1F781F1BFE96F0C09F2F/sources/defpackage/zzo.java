package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: zzo  reason: default package */
/* loaded from: classes4.dex */
final class zzo extends nd {
    final /* synthetic */ Context a;

    public zzo(Context context) {
        this.a = context;
    }

    @Override // defpackage.nd
    public final void b(Rect rect, View view, RecyclerView recyclerView, yl ylVar) {
        if (recyclerView.c(view) > 0) {
            rect.top = this.a.getResources().getDimensionPixelSize(R.dimen.card_drawer_fs_spacing);
        }
    }
}
