package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: cdyk  reason: default package */
/* loaded from: classes4.dex */
public final class cdyk extends abp {
    final /* synthetic */ int a;
    final /* synthetic */ int b;

    public cdyk(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.abp
    public final void b(Rect rect, View view, RecyclerView recyclerView, aci aciVar) {
        dzvx.c(rect, "outRect");
        dzvx.c(view, "view");
        dzvx.c(aciVar, "state");
        cdyj cdyjVar = new cdyj(this);
        int Z = recyclerView.Z(view) % this.b;
        int b = cdyjVar.b(Z);
        int b2 = this.a - cdyjVar.b(Z + 1);
        if (!cjxu.d(recyclerView)) {
            rect.left = b;
            rect.right = b2;
        } else {
            rect.right = b;
            rect.left = b2;
        }
        rect.bottom = this.a;
    }
}
