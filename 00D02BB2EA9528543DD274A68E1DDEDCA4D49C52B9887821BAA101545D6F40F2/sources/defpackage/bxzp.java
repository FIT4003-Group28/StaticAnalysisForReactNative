package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bxzp  reason: default package */
/* loaded from: classes4.dex */
public final class bxzp extends cqqw {
    final /* synthetic */ bxzq a;

    public bxzp(bxzq bxzqVar) {
        this.a = bxzqVar;
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
        if (i == 1) {
            this.a.e.a().b();
        }
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        boolean z = !canScrollVertically;
        bxzq bxzqVar = this.a;
        if (z != bxzqVar.g) {
            View findViewById = bxzqVar.a.findViewById(R.id.zero_suggest_drop_shadow);
            if (findViewById != null) {
                findViewById.setVisibility(true != canScrollVertically ? 4 : 0);
            }
            this.a.g = z;
        }
    }
}
