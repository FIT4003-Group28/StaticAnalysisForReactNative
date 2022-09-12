package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: citw  reason: default package */
/* loaded from: classes4.dex */
final class citw extends abp {
    final /* synthetic */ int a;
    final /* synthetic */ int b;

    public citw(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.abp
    public final void b(Rect rect, View view, RecyclerView recyclerView, aci aciVar) {
        abg abgVar = recyclerView.k;
        if (abgVar == null) {
            return;
        }
        int Z = recyclerView.Z(view);
        if (Z == 0) {
            if (bvox.a(view)) {
                rect.right = this.a;
            } else {
                rect.left = this.a;
            }
        } else if (Z != abgVar.c() - 1) {
        } else {
            if (bvox.a(view)) {
                rect.left = this.b;
            } else {
                rect.right = this.b;
            }
        }
    }
}
