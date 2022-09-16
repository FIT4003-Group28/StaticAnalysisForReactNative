package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akde  reason: default package */
/* loaded from: classes.dex */
public final class akde implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ akdg a;
    private final WeakReference b;

    public akde(akdg akdgVar, RecyclerView recyclerView) {
        this.a = akdgVar;
        this.b = new WeakReference(recyclerView);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        RecyclerView recyclerView = (RecyclerView) this.b.get();
        if (recyclerView != null) {
            this.a.c(recyclerView);
            return true;
        }
        return true;
    }
}
