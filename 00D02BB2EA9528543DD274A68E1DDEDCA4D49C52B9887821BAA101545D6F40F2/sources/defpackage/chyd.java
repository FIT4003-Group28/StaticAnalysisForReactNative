package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: chyd  reason: default package */
/* loaded from: classes4.dex */
final class chyd extends abp {
    final /* synthetic */ int a;
    final /* synthetic */ chyf b;
    final /* synthetic */ int c;

    public chyd(int i, chyf chyfVar, int i2) {
        this.a = i;
        this.b = chyfVar;
        this.c = i2;
    }

    @Override // defpackage.abp
    public final void b(Rect rect, View view, RecyclerView recyclerView, aci aciVar) {
        int i = this.a;
        if (this.b.k(view)) {
            i = this.c;
        }
        rect.set(0, 0, 0, i);
    }
}
