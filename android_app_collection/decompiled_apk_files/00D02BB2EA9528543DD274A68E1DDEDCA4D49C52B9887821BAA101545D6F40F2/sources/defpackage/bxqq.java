package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bxqq  reason: default package */
/* loaded from: classes4.dex */
public final class bxqq extends cqqw {
    final /* synthetic */ bxqr a;

    public bxqq(bxqr bxqrVar) {
        this.a = bxqrVar;
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
        if (i == 1) {
            this.a.a.a().b();
        }
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        boolean z = !canScrollVertically;
        bxqr bxqrVar = this.a;
        if (z != bxqrVar.c) {
            View findViewById = bxqrVar.b.findViewById(R.id.typed_suggest_drop_shadow);
            if (findViewById != null) {
                findViewById.setVisibility(true != canScrollVertically ? 4 : 0);
            }
            this.a.c = z;
        }
    }
}
