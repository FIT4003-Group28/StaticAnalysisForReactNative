package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: auk  reason: default package */
/* loaded from: classes2.dex */
public final class auk extends abp {
    public Drawable a;
    public int b;
    public boolean c = true;
    public final /* synthetic */ aup d;

    public auk(aup aupVar) {
        this.d = aupVar;
    }

    private final boolean a(View view, RecyclerView recyclerView) {
        acl V = recyclerView.V(view);
        if (!(V instanceof ave) || !((ave) V).v) {
            return false;
        }
        boolean z = this.c;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        acl V2 = recyclerView.V(recyclerView.getChildAt(indexOfChild + 1));
        return (V2 instanceof ave) && ((ave) V2).u;
    }

    @Override // defpackage.abp
    public final void b(Rect rect, View view, RecyclerView recyclerView, aci aciVar) {
        if (a(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }

    @Override // defpackage.abp
    public final void k(Canvas canvas, RecyclerView recyclerView) {
        if (this.a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (a(childAt, recyclerView)) {
                int y = ((int) childAt.getY()) + childAt.getHeight();
                this.a.setBounds(0, y, width, this.b + y);
                this.a.draw(canvas);
            }
        }
    }
}
