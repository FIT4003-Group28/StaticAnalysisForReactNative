package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akda  reason: default package */
/* loaded from: classes.dex */
public final class akda implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ tes a;
    final /* synthetic */ RecyclerView b;
    private boolean c = true;

    public akda(tes tesVar, RecyclerView recyclerView) {
        this.a = tesVar;
        this.b = recyclerView;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (!this.c || !this.a.c()) {
            return;
        }
        this.c = false;
        this.b.post(new Runnable() { // from class: akcz
            @Override // java.lang.Runnable
            public final void run() {
                akda akdaVar = akda.this;
                akdaVar.b.getViewTreeObserver().removeOnDrawListener(akdaVar);
            }
        });
        this.a.b(this.b, 0, this.b.getHeight());
    }
}
