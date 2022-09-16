package defpackage;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: akkc  reason: default package */
/* loaded from: classes.dex */
final class akkc extends jo {
    final /* synthetic */ akki b;

    public akkc(akki akkiVar) {
        this.b = akkiVar;
    }

    @Override // defpackage.jo
    public final void d(View view, mh mhVar) {
        super.d(view, mhVar);
        RecyclerView recyclerView = this.b.ak;
        if (Build.VERSION.SDK_INT >= 22) {
            mhVar.b.setTraversalAfter(recyclerView);
        }
    }
}
