package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gfk  reason: default package */
/* loaded from: classes3.dex */
public final class gfk extends nd {
    final /* synthetic */ View a;
    final /* synthetic */ int b;
    final /* synthetic */ gfm c;

    public gfk(gfm gfmVar, View view, int i) {
        this.c = gfmVar;
        this.a = view;
        this.b = i;
    }

    @Override // defpackage.nd
    public final void b(Rect rect, View view, final RecyclerView recyclerView, yl ylVar) {
        super.b(rect, view, recyclerView, ylVar);
        View view2 = this.a;
        if (view != view2) {
            return;
        }
        rect.bottom = (int) ((-this.b) * (1.0f - gfm.e(view2, this.c.g)));
        gfm gfmVar = this.c;
        if (gfmVar.o != null || gfmVar.m <= this.a.getY()) {
            return;
        }
        gfm gfmVar2 = this.c;
        final int i = this.b;
        final View view3 = this.a;
        gfmVar2.o = new Runnable() { // from class: gfj
            @Override // java.lang.Runnable
            public final void run() {
                gfk gfkVar = gfk.this;
                int i2 = i;
                View view4 = view3;
                RecyclerView recyclerView2 = recyclerView;
                gfm gfmVar3 = gfkVar.c;
                if (gfmVar3.o != null) {
                    gfmVar3.o = null;
                    int e = (int) (i2 * gfm.e(view4, gfmVar3.g));
                    recyclerView2.scrollBy(0, e - gfkVar.c.n);
                    gfkVar.c.n = e;
                }
            }
        };
        recyclerView.post(this.c.o);
    }
}
