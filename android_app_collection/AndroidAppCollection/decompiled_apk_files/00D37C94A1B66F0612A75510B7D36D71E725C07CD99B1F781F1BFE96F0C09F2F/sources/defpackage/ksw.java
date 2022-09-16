package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ksw  reason: default package */
/* loaded from: classes3.dex */
public final class ksw extends nd {
    final /* synthetic */ ktb a;
    private final int b;

    public ksw(ktb ktbVar, int i) {
        this.a = ktbVar;
        this.b = i;
    }

    @Override // defpackage.nd
    public final void b(Rect rect, View view, RecyclerView recyclerView, yl ylVar) {
        int c = recyclerView.c(view);
        rect.setEmpty();
        if (c == 0) {
            rect.right = this.b;
            rect.bottom = this.a.w() ? this.b : 0;
        } else if (c == 1) {
            if (this.a.w()) {
                rect.top = this.b;
                rect.right = this.b;
                return;
            }
            rect.left = this.b;
            rect.bottom = this.b;
        } else if (c != 2) {
            if (c != 3) {
                return;
            }
            rect.left = this.b;
            rect.top = this.b;
        } else {
            if (this.a.w()) {
                rect.bottom = this.b;
            } else {
                rect.top = this.b;
            }
            rect.left = this.b;
        }
    }
}
