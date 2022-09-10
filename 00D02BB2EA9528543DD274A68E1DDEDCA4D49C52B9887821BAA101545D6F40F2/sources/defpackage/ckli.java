package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: ckli  reason: default package */
/* loaded from: classes4.dex */
final class ckli extends abp {
    final /* synthetic */ cklj a;

    public ckli(cklj ckljVar) {
        this.a = ckljVar;
    }

    final int a(int i) {
        cklj ckljVar = this.a;
        return (i * ckljVar.b) / ckljVar.a;
    }

    @Override // defpackage.abp
    public final void b(Rect rect, View view, RecyclerView recyclerView, aci aciVar) {
        int c = this.a.c(recyclerView.Z(view));
        if (c == -1) {
            return;
        }
        if (c == -2) {
            rect.left = -recyclerView.getPaddingLeft();
            rect.right = -recyclerView.getPaddingRight();
            return;
        }
        int i = c % this.a.a;
        int a = a(i);
        int a2 = this.a.b - a(i + 1);
        if (!cjxu.d(recyclerView)) {
            rect.left = a;
            rect.right = a2;
        } else {
            rect.right = a;
            rect.left = a2;
        }
        rect.bottom = this.a.b;
    }
}
